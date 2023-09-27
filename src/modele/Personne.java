package modele;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private int telephone;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(int id, String nom, String prenom, String adresse, int telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	public void afficher() {
		System.out.println("id : " + id);
		System.out.println("nom : " + nom);
		System.out.println("prenom : " + prenom);
		System.out.println("adresse : " + adresse);
		System.out.println("telephone : " + telephone);
		
	}
	

}
