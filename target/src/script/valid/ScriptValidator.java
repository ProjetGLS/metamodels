package src.script.valid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import src.script.InternalInput;
import src.script.Operation;
import src.script.Output;
import src.script.Script;
import src.script.util.scriptSwitch;


public class ScriptValidator extends scriptSwitch<Boolean> {
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	private static final String IDENTREGEX = "^[A-Za-z][A-Za-z0-9_]*$";
	
	/**
	 * Construire un validateur
	 */
	public ScriptValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			System.out.println("Visiting " + object.getClass().getSimpleName());
			this.doSwitch(object);
		}
		
		return this.result;
	}
	
	@Override
	public Boolean caseScript(Script object) {

		// Nom correct
		this.result.recordIfFailed((object.getName() != null) && (object.getName().matches(IDENTREGEX)),
			object,
			"Le nom de script \""+object.getName()+"\" est incorrect.");
		
		for (Operation op : object.getOperations()) {
			this.doSwitch(op);
		}
		this.doSwitch(object.getOutput());
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Opération.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseOperation(Operation object) {
		// Contraintes sur Operations
		// Verification du nombre d'operandes
		EList<InternalInput> operands = object.getInputs();

		this.result.recordIfFailed(
				object.getArity() == operands.size(),
				object,
				"L'operation " + object.getName() + " n'a pas le bon nombre d'operandes");
		
		this.result.recordIfFailed(!(object.isInfix() && object.getArity() != 2),
				object,
				"Une operation d'arité différente de 2 ne peux être infixe");
	
		this.result.recordIfFailed(!operands.stream().anyMatch(op -> op.getVariable().equals(object.getOutput())),
				object,
				"L'operation a comme entree sa sortie");
		
		return null;
	}
	
	@Override
	public Boolean caseOutput(Output object) {
		
		this.result.recordIfFailed(object.getInternalOutput() != null,
				object,
				"La sortie doit necessairement etre reliée");
		
		return null;
	}
	
	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}

}
