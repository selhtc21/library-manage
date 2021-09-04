package fr.htc.tools.types.enums;

public enum OperationType {
	QUITTER(0, "Quitter"),
	EQUATION_SECOND_DEGRE(1, "Equation de second degre"),
	FACTORIEL(2, "Factoriel"),
	PGCD(3, "Plus grand commun diviseur"),
	MAX_TABLEAU(4, "grande valeur d'un tableau"),
	MOYENNE_ECART_TYPE(5, "moyenne_ecart type"),
	PERSON_LIST(6, "Person List"),
	UNKNOWN(7, "Unknown");

	private int id;
	private String title;

	private OperationType(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int IdOf() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public static OperationType valueOf(int id) {
		if (id < 0 || id >= size()) {
			return OperationType.values()[size() -1];
		}
		return OperationType.values()[id];
	}
	
	public static int size() {
		return OperationType.values().length;
	}

}
