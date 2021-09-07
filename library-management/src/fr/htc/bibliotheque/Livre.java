package fr.htc.bibliotheque;

public class Livre {



	public String titre; 
	public String auteur;
	public int year_edition; 
	private String cote; 
	
	public  void generateCote() {
		System.out.println("Cote : " +auteur.substring(0, 2));

	}
	
	public Livre(String titre, String auteur,int year_edition) {
		this.titre=titre;
		this.auteur=auteur;
		this.year_edition = year_edition;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", year_edition=" + year_edition + ", cote=" + cote
				+ "]";
	}
}
