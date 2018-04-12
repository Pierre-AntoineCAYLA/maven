package animals;

public enum Deplacer {
//donnes les possibilit�s de d�placements
	COURIR(1, "Courir"), MARCHER(2, "Marcher"), SAUTER(3, "Sauter");

	int code;
	String label;

	Deplacer(int id, String value) {
		code = id;
		label = value;
	}

}
