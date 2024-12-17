package src.script.valid;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import src.library.Library;
import src.library.ColumnData;
import src.library.ExternalData;
import src.library.Value;
import src.library.IdentValue;
import src.library.util.librarySwitch;


public class LibraryValidator extends librarySwitch<Boolean> {
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	private static final String IDENTREGEX = "^[A-Za-z][A-Za-z0-9_]*$";
	/**
	 * Construire un validateur
	 */
	public LibraryValidator() {}
	
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
	public Boolean caseLibrary(Library object) {
		
		// Nom correct
		this.result.recordIfFailed((object.getName() != null) && (object.getName().matches(IDENTREGEX)),
			object,
			"Le nom de librairie \""+object.getName()+"\" est incorrect.");

		return null;
	}

	@Override
	public Boolean caseColumnData(ColumnData object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean caseExternalData(ExternalData object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean caseValue(Value object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean caseIdentValue(IdentValue object) {
		// TODO Auto-generated method stub
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
