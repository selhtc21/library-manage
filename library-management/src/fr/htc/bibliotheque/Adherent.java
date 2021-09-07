package fr.htc.bibliotheque;

public class Adherent {
	private String nom;
	private String prenom;
	private int age;
	private String matricule;

	public static int nombre = 100;

	private String generateMatricule() {

		return "" + nom.toUpperCase().charAt(0) + prenom.toUpperCase().charAt(0) + nombre++;

	}

	public Adherent(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.matricule = generateMatricule();

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMatricule() {
		return matricule;
	}

	@Override
	public String toString() {
		return "Adherent [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", matricule=" + matricule + "]";
	}
}
