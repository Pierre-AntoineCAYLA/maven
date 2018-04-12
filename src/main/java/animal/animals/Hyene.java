package animal.animals;

import animal.regime.Carnivore;
import animals.Animal;
import animals.Deplacer;

public class Hyene extends Animal {

	private Deplacer deplacer;
	//donne les statistique propre à la hyene
	public Hyene(int age, float poids, float taille) {
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = "hyene";
		this.regime = new Carnivore();
	}

	public void HyeneDeplacer() {
		this.deplacer = Deplacer.COURIR;
	}
}
