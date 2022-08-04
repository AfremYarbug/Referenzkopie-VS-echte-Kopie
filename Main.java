package main;

public class Main {

    public static void main(String[] args) {

        // Echte Kopie
        int[] werte = new int[n];
        int[] kopie = werte;

        // Referenzkopie
        int[] werte = new int[n];
        int[] kopie = new int[werte.length]; // Neues Feld der selben laenge

        System.arraycopy(werte, 0, kopie, 0, werte.length); // Inhalt des einen Feldes in das andere Feld Kopieren
      
      
      /*
      // Echte Kopie
        int[] werte = {7 // werte kann nicht verändert werden weil sonst automatisch die kopie verändert werden müsste};
        int[] kopie = werte;

        int ergebnis = kopie[0] * 2;

        System.out.println(ergebnis);
        
        In diesem Fall würde ich so denken: Ich habe ein Blatt Papier und 2 Stifte, 
        mit denen ich darauf malen kann. Wenn ich jetzt beiden Stiften sage worauf sie 
        zu malen haben und der eine etwas darauf malt, wird der andere dieses auch mitkriegen

        System.out.println("---------------------");

        // Referenzkopie
        int[] werte2 = {7 // werte2 kann verändert werden ohne das kopie2 etwas mitbekommt};
        int[] kopie2 = new int[werte2.length];
        kopie2[0] = 7;

        int ergebnis2 = kopie2[0] * 2;

        System.out.println(ergebnis2);
        
        */

    }
}
