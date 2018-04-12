package animal.regime;

import animal.aliment.Aliment;

public abstract class Regime {
	private String regime;

	public Regime(String regime) {
		this.regime = regime;
	}

	public String toString() {
		return this.regime;
	}

	public void manger(Aliment aliment) throws Exception {
		throw new Exception();
	}
}
