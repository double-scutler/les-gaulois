package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee = 0;
	public void donnerTrophees(Gaulois gaulois,Equipement equipement) {
		Trophee trophee = new Trophee(gaulois,equipement);
		assert nbTrophee<200 : "nombre trophee insuffisant";
		trophees[nbTrophee++]=trophee;
		
	}
}
