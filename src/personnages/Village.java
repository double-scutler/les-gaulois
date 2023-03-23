package personnages;

public class Village {
	private String nom;
	private Chef chef;
	Gaulois[] villageois;
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
	
	
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void afficherVillageois() {
		int i=0;
		System.out.println("dans le village de chef "+chef.getNom()+" vivent les légendaires gaulois:");
		while (villageois[i]!=null) {
			System.out.println("- " + villageois[i].getNom());
			++i;
		}
				
		
	}
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// "jai pas eu le résultat attendu :/ "
		//j'ai pas obtenu de message :/
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		// " j'ai obtenu une description de ce gaulois"
		
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
		
	}
	
}
