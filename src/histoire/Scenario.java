package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",20);
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Obélix",4);
		panoramix.parler("je vais aller préparer une petite potion...");
		panoramix.preparerPotion(panoramix.getEffetPotionMin());
		panoramix.booster(obelix);
		obelix.parler("par Bélénos, ce n'est pas juste! ");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		while (minus.getForce() > 0) {
			asterix.frapper(minus,panoramix.getForcePotion());
		}
			
		}
		

	}

