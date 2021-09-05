package fr.htc.tools.core;

import java.util.Scanner;

import fr.htc.tools.types.Operation;
import fr.htc.tools.types.enums.OperationType;

public class ToolsLuncher {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = -1;
		do {
			 choice = printMenuAndCatchUserChoice();
			 OperationType opType = OperationType.valueOf(choice);
			 
			 OperationSwitcher.switchTo(opType);
			
		} while (choice != 0);
		scanner.close();
		Operation.scanner.close();
	}

	/**
	 * 
	 * @return
	 */
	private static int printMenuAndCatchUserChoice() {
		System.out.println("\n\n\n\n");
		System.out.println("*****************************************************************");
		System.out.println("Bienvenue à l'application :  Opérations Mathématiques ");
		System.out.println("");
		System.out.println("\t- Equation 2 Deg.                 \t\t\tTapez 1");
		System.out.println("\t- Factoriel                       \t\t\tTapez 2");
		System.out.println("\t- PGCD                            \t\t\tTapez 3");
		System.out.println("\t- grande valeur d'un tableau      \t\t\tTapez 4");
		System.out.println("\t- moyenne_ecart type              \t\t\tTapez 5");
		System.out.println("\t- List of Persons                 \t\t\tTapez 6");
		System.out.println("\t- Quitter                         \t\t\tTapez 0");
		System.out.print("\t\t\tFaites votre choix : ");
		
		int choice = scanner.nextInt();
		System.out.println("*****************************************************************");
		return choice;
	}
}
