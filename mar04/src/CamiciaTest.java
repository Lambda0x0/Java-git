public class CamiciaTest {
    
    public static void main(String[] args) { // scorciatoia da tastiera: main+invio
        Camicia miaCamicia = new Camicia(); // dichiaro e creo un oggetto di tipo Camicia
        Camicia tuaCamicia = new Camicia(); // dichiaro e creo un altro oggetto di tipo Camicia
        miaCamicia.camiciaID = 2024; // assegno camiciaID a miaCamicia
        tuaCamicia.camiciaID = miaCamicia.camiciaID; // assegno il valore camiciaID di miaCamicia a camiciaID di tuaCamicia
        miaCamicia.codiceColore = 'R'; // imposto il colore rosso a miaCamicia
        tuaCamicia.quantita = 18; // imposto la quantità di tuaCamicia
        miaCamicia.camiciaID = 2025; // sovrascrivo rigo 6

        miaCamicia.mostraInformazioni(); // stampo le informazioni di miaCamicia
        tuaCamicia.mostraInformazioni(); // stampo le informazioni di tuaCamicia
        // il rigo 7 copia un valore da una memoria all'altra, ma non collega le due variabili in modo dinamico

        char lettera = 'T';
        System.out.println(lettera + 3); // sommo al codice ASCII della 'T' il valore 3
    }

}