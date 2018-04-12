package animals;

import animal.aliment.Aliment;
import animal.regime.Regime;
 //donne les propriétés commun à tous les animaux
public abstract class Animal {
	private Deplacer deplacer;
	protected int age;
	protected float poids;
	protected float taille;
	protected String nom;
	protected Regime regime;

//initialiation du constructeur
	public Animal() {
		this.age = 0;
		this.poids = 0.0f;
		this.taille = 0.0f;
		this.nom = "";
	}

	public Deplacer getDeplacer() {
		return this.deplacer;
	}

	public Regime getRegime() {
		return this.regime;
	}

	public void manger(Aliment aliment) throws Exception {
		this.regime.manger(aliment);
	}
}
