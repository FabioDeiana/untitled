import java.util.Scanner;

public class Main {

    // ESERCIZIO #1 - Metodi

    // Metodo moltiplica: accetta due interi e ritorna il loro prodotto
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    // Metodo concatena: accetta una stringa e un intero e restituisce una stringa che concatena gli elementi
    public static String concatena(String str, int num) {
        return str + num;
    }

    // Metodo inserisciInArray: accetta un array di stringhe di cinque elementi ed una stringa
    // e restituisce un array di sei elementi in cui la stringa passata sia al terzo posto
    // e le stringhe precedentemente in quarta e quinta posizione siano rispettivamente in quinta e sesta
    public static String[] inserisciInArray(String[] array, String stringa) {
        String[] nuovoArray = new String[6];

        // Copia i primi due elementi
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];

        // Inserisce la nuova stringa al terzo posto (indice 2)
        nuovoArray[2] = stringa;

        // Sposta gli elementi dall'indice 2, 3, 4 agli indici 3, 4, 5
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }

    // ESERCIZIO #2 - Input utente e concatenazione

    public static void esercizio2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== ESERCIZIO #2 ===");
        System.out.println("Inserisci tre stringhe:");

        System.out.print("Prima stringa: ");
        String str1 = scanner.nextLine();

        System.out.print("Seconda stringa: ");
        String str2 = scanner.nextLine();

        System.out.print("Terza stringa: ");
        String str3 = scanner.nextLine();

        // Concatenazione in ordine di inserimento
        String concatenazioneNormale = str1 + str2 + str3;

        // Concatenazione in ordine inverso
        String concatenazioneInversa = str3 + str2 + str1;

        System.out.println("\nConcatenazione in ordine di inserimento: " + concatenazioneNormale);
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa);
    }

    // ESERCIZIO #3 - Metodi geometrici

    // Metodo perimetroRettangolo: calcola il perimetro di un rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Metodo pariDispari: restituisce 0 se il numero è pari, 1 se è dispari
    public static int pariDispari(int numero) {
        return numero % 2;
    }

    // Metodo perimetroTriangolo: calcola l'area di un triangolo usando la formula di Erone
    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        // Calcolo del semiperimetro
        double semiperimetro = (lato1 + lato2 + lato3) / 2;

        // Formula di Erone: A = √(s(s-a)(s-b)(s-c))
        double area = Math.sqrt(semiperimetro *
                (semiperimetro - lato1) *
                (semiperimetro - lato2) *
                (semiperimetro - lato3));

        return area;
    }

    public static void esercizio3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== ESERCIZIO #3 ===");

        // Test perimetroRettangolo
        System.out.println("\n--- Calcolo Perimetro Rettangolo ---");
        System.out.print("Inserisci il primo lato del rettangolo: ");
        double latoRett1 = scanner.nextDouble();
        System.out.print("Inserisci il secondo lato del rettangolo: ");
        double latoRett2 = scanner.nextDouble();
        double perimetro = perimetroRettangolo(latoRett1, latoRett2);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        // Test pariDispari
        System.out.println("\n--- Verifica Pari/Dispari ---");
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        int risultato = pariDispari(numero);
        if (risultato == 0) {
            System.out.println("Il numero " + numero + " è PARI (ritorno: " + risultato + ")");
        } else {
            System.out.println("Il numero " + numero + " è DISPARI (ritorno: " + risultato + ")");
        }

        // Test perimetroTriangolo (area con formula di Erone)
        System.out.println("\n--- Calcolo Area Triangolo (Formula di Erone) ---");
        System.out.print("Inserisci il primo lato del triangolo: ");
        double latoTri1 = scanner.nextDouble();
        System.out.print("Inserisci il secondo lato del triangolo: ");
        double latoTri2 = scanner.nextDouble();
        System.out.print("Inserisci il terzo lato del triangolo: ");
        double latoTri3 = scanner.nextDouble();
        double area = perimetroTriangolo(latoTri1, latoTri2, latoTri3);
        System.out.println("L'area del triangolo è: " + area);
    }

    // MAIN - Invoca tutti gli esercizi in sequenza

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   ESERCIZI EPICODE - IntelliJ Java    ║");
        System.out.println("╔════════════════════════════════════════╗\n");

        // ESERCIZIO #1 - Test dei tre metodi
        System.out.println("=== ESERCIZIO #1 ===\n");

        // Test moltiplica
        int prodotto = moltiplica(5, 7);
        System.out.println("Test moltiplica(5, 7): " + prodotto);

        // Test concatena
        String concatenato = concatena("Numero: ", 42);
        System.out.println("Test concatena(\"Numero: \", 42): " + concatenato);

        // Test inserisciInArray
        String[] arrayOriginale = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
        String[] arrayModificato = inserisciInArray(arrayOriginale, "NUOVO");

        System.out.println("\nTest inserisciInArray:");
        System.out.println("Array originale: [" + String.join(", ", arrayOriginale) + "]");
        System.out.print("Array modificato: [");
        for (int i = 0; i < arrayModificato.length; i++) {
            System.out.print(arrayModificato[i]);
            if (i < arrayModificato.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // ESERCIZIO #2
        esercizio2();

        // ESERCIZIO #3
        esercizio3();

        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║      Esercizi completati! 🎉          ║");
        System.out.println("╚════════════════════════════════════════╝");

        scanner.close();
    }
}