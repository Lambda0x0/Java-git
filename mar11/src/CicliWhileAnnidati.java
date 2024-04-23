public class CicliWhileAnnidati {

	public static void main(String[] args) {
		String nome = "Mario"; // nome da indovinare
		String indovina = ""; // String dove saranno costruiti i tentativi
		long numeroTentativi = 0L;
		char carattereAscii;
		
		// non so quanti tentativi serviranno, inevitabile un while
		while(!indovina.equals(nome.toLowerCase())) { // finchè la parola non è indovinata (toLowerCase() per semplificare e lavorare solo con le minuscole)
			indovina = ""; // prima cosa da fare: resettare la String dei tentativi
			
			// ciclo per costruire i tentativi
			while(indovina.length()<nome.length()) { // solo quando hanno uguale lunghezza posso sperare che siano di uguali di contenuto
				carattereAscii = (char)(Math.random()*26+97); // Math.random(): sorteggio un numero decimale tra 0 incluso e 1 escluso; Math.random()*26: sorteggio un numero decimale tra 0 incluso e 26 escluso; Math.random()*26+97: sorteggio un numero decimale tra 97 e 122 (codici ASCII da "a" a "z")
				// (char) effettua il casting del numero sorteggiato , rimuovendo di conseguenza i decimali
				indovina = indovina + carattereAscii; // concateno il char alla String di prova
			}
			numeroTentativi++;
			
		}
		System.out.println(indovina); // stampo la parola trovata
		System.out.println("Tentativi necessari: " + numeroTentativi);
	}

}
