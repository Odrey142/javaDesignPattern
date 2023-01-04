/**
 * 
 */
package fr.diginamic.factory;

import fr.diginamic.factory.ObjetConnecte.TypeObjectConnecte;

/**
 * @author odrey
 *
 */
public class ObjetConnecteFactory {
	public static ObjetConnecte getObjetConnecte(TypeObjectConnecte type, int limiteVolts) {
		if (type.equals(TypeObjectConnecte.telephonePortable)) {
			return new TelephonePortable(limiteVolts);
		}

		else if (type.equals(TypeObjectConnecte.tablette)) {
			return new Tablette(limiteVolts);
		}

		else if (type.equals(TypeObjectConnecte.enceinteConnecte)) {
			return new EnceinteConnectee(limiteVolts);
		}

		else
			return null;

	}
}
