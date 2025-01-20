package com.cc.java;

// Klassen Konto
class Konto {

    int kontostand = 10000;

    // Methode zur Verdopplung des Kontostands
    public void verdoppeln(){
        kontostand *= 2;
    }

    // Methode zur Verdreifachung des Kontostands
    public void verdreifachen(){
        kontostand *= 3;
    }

    // Methode zur Verzehnfachung des Kontostands
    public void verzehnfachen(){
        kontostand *= 10;
    }

    // Methode zur Ausgabe des Kontostands
    public void ausgeben(){
        System.out.println("Kontostand: " + kontostand);
    }
}

public class App {
    
    public static void main(String[] args) {
        // Erstellen von 3 Konto-Objekten
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        // Ausgabe des Anfangs-Kontostands
        System.out.println("Anfangs-Kontostände:");
        konto1.ausgeben();
        konto2.ausgeben();
        konto3.ausgeben();

        // Änderung des Kontostands
        konto1.verdoppeln();
        konto2.verdreifachen();
        konto3.verzehnfachen();

        // Ausgabe des geänderten Kontostands
        System.out.println("\nGeänderte Kontostände:");
    }

    // private static void output(String outputStr) {
    //     System.out.println(outputStr);
    // } 

}
   