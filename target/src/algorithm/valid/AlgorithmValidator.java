package src.script.valid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import src.algorithm.Algorithm;
import src.algorithm.Input;
import src.algorithm.Output;


public class AlgorithmValidator extends scriptSwitch<Boolean> {
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public AlgorithmValidator() {}
	
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
	public Boolean caseInput(Input object) {
		// TODO
		return null;
	}

	@Override
	public Boolean caseAlgorithm(Algorithm object) {
		// Contraintes sur Algorithm
			this.result.recordIfFailed(IsNameValid(object.getName()),
					object,
					"Le nom \""+object.getName()+"\" est invalide.");
		return null;
	}
	
	@Override
	public Boolean caseOutput(Output object) {
		
		// Sortie non-reliée
		this.result.recordIfFailed(object.getInternalOutput() != null,
				object,
				"La sortie doit necessairement etre reliée");
		
		return null;
	}
	
	private Boolean IsNameValid(String name) {
		// TODO : Implement regex
		return true;
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
