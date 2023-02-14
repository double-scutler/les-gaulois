package personnages;

import java.util.Set;

public class Gaulois {
		private String nom;
		private int force;   // TODO
		private int effetPotion = -1;
		
		public Gaulois(String nom, int force) {
			this.nom = nom;
			this.force = force;
		}

		public int getEffetPotion() {
			return effetPotion;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		
}
