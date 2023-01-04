/**
 * 
 */
package fr.diginamic.factory;

/**
 * @author odrey
 *
 */
public class ObjetConnecte {

	private int limiteVolts;

	public enum TypeObjectConnecte {
		telephonePortable, 
		tablette, 
		enceinteConnecte
	};

	/**
	 * @Constructeur
	 * @param limiteVolts
	 */
	public ObjetConnecte(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	/**
	 * @getters
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/**
	 * @setters
	 * @param limiteVolts the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	};

}
