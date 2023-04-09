package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements= new Equipement[2];
	private int nbEquipement=0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.force > 0 : "la force doit etre positive";

	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}

	private String prendreParole() {

		return "le romain " + nom + " : ";
	}

//	public void recevoirCoup(int forceCoup) {
//		assert force > 0 : "la force d'une romain doit etre positive";
//		int force_initiale = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie");
//		} else {
//			parler("j'abandonne...");
//
//		}
//		assert force_initiale > force : "la force du romain doit diminuer";
//
//	}
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		
		case 2:
			System.out.println("Le soldat "+ nom +" est déjà bien protégé !");
			break;
			
			
		case 1:
			if (this.equipements[0]== equipement) {
				System.out.println("Le soldat " +nom+ " possède déjà un "+ equipement.toString()+" !");
				break;
				
			} else {
				extracted(equipement,1);
				break;
			}
			

		default:
			extracted(equipement,0);
			break;
		}
		
	}

	private void extracted(Equipement equipement,int i) {
		equipements[i] = equipement;
		nbEquipement++;
		System.out.println("Le soldat "+nom+" s'équipe avec un "+equipement.toString()+".");
	}
	
//	/////////////////////////////////////////////////////////
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("A�e");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force==0) {
			parler("A�e");
		}else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminu�e
		assert force < oldForce;
		return equipementEjecte;
	}

//////////////////////////////////////////////////////
	private int calculResistanceEquipement(int forceCoup) {
  String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		if(forceCoup>resistanceEquipement) {
			forceCoup -= resistanceEquipement;
		}else {
			forceCoup=0;
		}
		//la force était négative
		return forceCoup;
	}
//
//	////////////////////////////////////////////////////////
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'�quipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	/////////////////////////////////////////////////////

	public static void main(String[] args) {
		Romain romain1 = new Romain("romain1", 8);
		romain1.parler("lessgoo");
		romain1.recevoirCoup(7);
		Romain minus = new Romain("Minus",6);
		Equipement equipement1 = Equipement.CASQUE;
        Equipement equipement2 = Equipement.BOUCLIER;
        System.out.println(equipement1);
        System.out.println(equipement2);
        minus.sEquiper(equipement1);
        minus.sEquiper(equipement1);
        minus.sEquiper(equipement2);
        minus.sEquiper(equipement1);
        

	}

}
