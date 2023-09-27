package modele;

public class Journalier extends Personne {
	private  int nombreHeure;
	private double tauxHoraire;
	
	public Journalier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Journalier(int id, String nom, String prenom, String adresse, int telephone, int nombreHeure,
			double tauxHoraire) {
		super(id, nom, prenom, adresse, telephone);
		this.nombreHeure = nombreHeure;
		this.tauxHoraire = tauxHoraire;
	}
	
	public int getNombreHeure() {
		return nombreHeure;
	}

	public void setNombreHeure(int nombreHeure) {
		this.nombreHeure = nombreHeure;
	}

	public double getTauxHoraire() {
		return tauxHoraire;
	}

	public void setTauxHoraire(double tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println("nombre d'heure " + nombreHeure);
		System.out.println("taux horaire " + tauxHoraire);
	}
	
	public double calculerSalaire() {
		double salaire = tauxHoraire*nombreHeure;
		return salaire;
	}

}
