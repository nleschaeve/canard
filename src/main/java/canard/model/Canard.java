package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;
import canard.model.vol.VolerAvecDesAiles;

public class Canard {
	private String nom;
	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;
	
	public Canard(String nom) {
		this.nom = nom;
	}
	
	public String nager() {
		return("Tous les canards flottent, même les leurres ! ");
	}
	
	public String afficher() {
		return("Je suis un canard ");
	}
	
	public String effectuerVol() {
		return comportementVol.voler();
	}
	
	public String effectuerCancan() {
		return comportementCancan.cancaner();
	}
	
	public void changerComportementVol(ComportementVol comportementVol) {
		if ("Je vole !".equals(comportementVol.voler())) {
			comportementVol = new NePasVoler();
		} else {
			comportementVol = new VolerAvecDesAiles();
		}
	}
	
	public void changerComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}

	public String getNom() {
		return nom;
	}
}
