package fr.htc.bibliotheque;

public class Livre {



	private String titre; 
	private String auteur;
	private int yearEdition; 
	private String cote; 
	public static int nbr = 10;
	private String generateCote() {
		
		return ""+auteur.toUpperCase().substring(0, 2)+ (yearEdition%100)+'-'+nbr++;

	}
	public Livre(String titre, String auteur,int yearEdition) {
		this.titre=titre;
		this.auteur=auteur;
		this.yearEdition = yearEdition;
		this.cote = generateCote();

	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}



	public int getYearEdition() {
		return yearEdition;
	}

	public void setYearEdition(int yearEdition) {
		this.yearEdition = yearEdition;
	}

	public String getCote() {
		return cote;
	}

	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", titre=" + titre + ", yearEdition=" + yearEdition + ",cote=" + cote + "]";
	}

	
}
