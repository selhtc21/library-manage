package fr.htc.bibliotheque;

public class Adherent {
	public String nom;
	public String prenom;
	public int age ;
	public String matricule; 

	public static int nombre = 100;
	
	public void generateMatricule() {
		
		System.out.println("Matricule : " +nom.charAt(0)+prenom.charAt(0)+nombre++);
	}
	
	public  Adherent(String nom, String prenom,int age) {
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	}

	@Override
	public String toString() {
		return "Adherent [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", matricule=" + matricule + "]";
	}
}
