package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        // Erstellen von 3 Konto-Objekten
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        // Ausgabe des Anfangs-Kontostands
        System.out.println("Anfangs-Kontostände:");
        output("Konto1: " + konto1.ausgeben());
        output("Konto2: " + konto2.ausgeben());
        output("Konto3: " + konto3.ausgeben());

        // Änderung des Kontostands
        konto1.verdoppeln();
        konto2.verdreifachen();
        konto3.verzehnfachen();

        // Ausgabe des geänderten Kontostands
        output("\nGeänderte Kontostände:");
        output("Konto1: " + konto1.ausgeben());
        output("Konto2: " + konto2.ausgeben());
        output("Konto3: " + konto3.ausgeben());
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 
}

