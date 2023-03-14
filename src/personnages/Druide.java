package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		// this.forcePotion = forcePotion;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis la druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + '.');
	}

	public String getNom() {
		return nom;
	}

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public int preparerPotion(int effetPotionMin) {
		Random random = new Random();
		do {
			forcePotion = random.nextInt(effetPotionMax);
		} while (forcePotion < effetPotionMin);

		if (forcePotion > 7) {
			System.out.println("j'ai préparé une super potion de force " + forcePotion);

		} else {
			System.out.println(
					"je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
		return forcePotion;

	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()=="Obélix") {
			System.out.println(prendreParole()+"Non, Obélix!... Tu n'auras pas de potion magique!");
			
		} else {
			gaulois.boirePotion(forcePotion);
		}

	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}

	private String prendreParole() {

		return "le druide " + nom + " : ";
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix", 5, 10);
		panoramix.preparerPotion(panoramix.effetPotionMin);
	}
}
