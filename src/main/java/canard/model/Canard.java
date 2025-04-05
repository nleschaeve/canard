package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

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

	public String getNom() {
		return nom;
	}
}
