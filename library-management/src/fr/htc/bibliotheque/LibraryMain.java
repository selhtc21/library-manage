package fr.htc.bibliotheque;

import java.util.List;

public class LibraryMain {


	public static void main(String[] args) {

		Livre l = new Livre("Demain est un autre jour ", "Lori Nelson Spielman", 2014);
		System.out.println("Titre : " +l.titre);
		System.out.println("Auteur : " +l.auteur);
		System.out.println("Année d'édition : " +l.year_edition);
		l.generateCote();
		
		System.out.println("---------------------------------");
		
		Adherent a1 = new Adherent("Hollande", "François",65);
		System.out.println("Nom :"+ a1.nom);
		System.out.println("Prenom :"+ a1.prenom);
		System.out.println("Age :"+ a1.age);
		a1.generateMatricule();
		
		System.out.println("---------------------------------");
		
		Adherent a2 = new Adherent("Jean", "Pierre",44);
		System.out.println("Nom :"+ a2.nom);
		System.out.println("Prenom :"+ a2.prenom);
		System.out.println("Age :"+ a2.age);
		a2.generateMatricule();
	}
		
}
