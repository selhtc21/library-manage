package fr.htc.bibliotheque;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LibraryMain {


	public static void main(String[] args) {

        List<Livre> livre = new LinkedList<Livre>();

		Livre livre1 = new Livre("Demain est un autre jour ", "Lori Nelson Spielman", 2014);
		Livre livre2 = new Livre("Les Hauts de Hurlevent ", "Emily Brontë	", 1847);
		Livre livre3 = new Livre("L'Étranger", "Albert Camu", 1887);
		Livre livre4 = new Livre("Voyage au bout de la nuit	", "Louis-Ferdinand Céline", 1932);
		livre.add(livre1);
		livre.add(livre2);
		livre.add(livre3);
		livre.add(livre4);

		List<Adherent> adherent = new LinkedList<Adherent>();
        
		Adherent adherent1 = new Adherent("Hollande", "François",65);	
		Adherent adherent2 = new Adherent("Jean", "Pierre",44);
		adherent.add(adherent1);
		adherent.add(adherent2);

		
		Iterator<Adherent> adherentList = adherent.iterator();
		Iterator<Livre> livreList = livre.iterator();
	
		while (livreList.hasNext()) {
            System.out.println(livreList.next());
            System.out.println("-------------------------------------------");    
        }
		
		while (adherentList.hasNext()) {
            System.out.println(adherentList.next());
        System.out.println("-------------------------------------------"); 

        
		}
	
	}
		
}
