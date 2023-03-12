package personnages;

import java.util.Set;

public class Gaulois {
	private String nom;
	private int force;
	public int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}

	private String prendreParole() {

		return "le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain,int effetPotion) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force*effetPotion) / 3);

	}
	public void boirePotion(int forceDePotion) {
		effetPotion = forceDePotion;
		System.out.println(prendreParole()+"merci Druide, je sens que ma force est " + effetPotion + " fois décuplée. ");
		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		
	}
	

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.parler("yoo it works!");
		Romain romain = new Romain("romain1" , 8);
		asterix.boirePotion(4);
		asterix.frapper(romain,asterix.effetPotion);
	}
}
