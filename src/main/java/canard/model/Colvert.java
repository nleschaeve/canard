package canard.model;

import canard.model.cancan.Cancan;
import canard.model.vol.VolerAvecDesAiles;

public class Colvert extends Canard {
	public Colvert(String nom) {
		super(nom);
		this.comportementVol = new VolerAvecDesAiles();
		this.comportementCancan = new Cancan();
	}
	
	public String afficher() {
		return("Je suis un vrai colvert ");
	}
}
