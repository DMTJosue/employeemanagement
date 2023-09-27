package modele;

public class Employe extends Personne {
	private double salaire;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int id, String nom, String prenom, String adresse, int telephone, double salaire) {
		super(id, nom, prenom, adresse, telephone);
		this.salaire = salaire;
	}


	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println("salaire : " + salaire);
	}
	
	
	
	

}
