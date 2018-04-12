package animal.animals;

import animal.regime.Herbivore;
import animals.Animal;
import animals.Deplacer;

public class Lapin extends Animal {

	Deplacer deplacer;
	//donne les statistique propre au lapin
	public Lapin(int age, float poids, float taille) {
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = "Lapin";
		this.regime = new Herbivore();
	}

	public void LapinDeplacer() {
		this.deplacer = Deplacer.SAUTER;
	}
}
