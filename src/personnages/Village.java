package personnages;

public class Village {
	private String nom;
	private Chef chef;
	Gaulois villageois[];
	int nbVillageaois = 0 ;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nom = nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		int i = 0;
		while(villageois[i]!=null) {
			i++;
		}
		villageois[i] = gaulois;
		++nbVillageaois;
	}
	public Gaulois trouverHabitant(int numeroVillageois) {
		return villageois[numeroVillageois-1];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//j'ai pas obtenu de message :/
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.ajouterHabitant(abraracourcix);
		
		Gaulois asterix = new Gaulois("Asterix",8);
	}
	
}
