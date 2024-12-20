package src.script.valid;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import src.table.Table;
import src.script.Operation;
import src.table.Column;
import src.table.IdentColumn;
import src.table.util.tableSwitch;


public class TableValidator extends tableSwitch<Boolean> {
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	private static final String IDENTREGEX = "^[A-Za-z][A-Za-z0-9_]*$";
	/**
	 * Construire un validateur
	 */
	public TableValidator() {}
	
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
	public Boolean caseTable(Table object) {
		this.result.recordIfFailed((object.getName() != null) && (object.getName().matches(IDENTREGEX)) ,
			object,
		 	"Le nom de table \""+object.getName()+"\" est incorrect.");
		
		// Pas d'UID en dupliqué
		List<String> list = ((List<Column>) object.getColumn()).stream().map(Column::getUid).collect(Collectors.toList());
		Set<String> set = new HashSet<String>(list);

		this.result.recordIfFailed(set.size() == list.size() ,
			object,
		 	"La table "+object.getName()+" a des colonnes qui ont des UIDs en commun.");

		for (Operation op : object.getColumn()) {
			this.doSwitch(op);
		}
		this.doSwitch(object.getIdentColumn());
		
		return null;
	}

	@Override
	public Boolean caseColumn(Column object) {
		// Toutes les UIDs sont différentes : mis en place dans caseTable()

		// Pas de référence en boucle direct
		if (object.getReferences() != null) {
			this.result.recordIfFailed(object.getUid() != object.getReferences().getUid(),
			object,
			"La colonne \""+object.getUid()+"\" se référence elle-même.");
		}
		return null;
	}

	@Override
	public Boolean caseIdentColumn(IdentColumn object) {
		// Rien, à priori
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
