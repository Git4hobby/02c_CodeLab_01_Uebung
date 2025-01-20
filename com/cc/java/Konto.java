package com.cc.java;

// Klassen Konto
public class Konto {

    private int kontostand;

// consturctor
public Konto(int kontostand){
    this.kontostand = kontostand;
}

//Getter mit Ausgeben
public int ausgeben(){
    return kontostand;
}    
// Setter Kontostand
public void setausgeben(int kontostand){
    this.kontostand = kontostand;
}

// Methode zur Verdopplung des Kontostands
    public void verdoppeln(){
        this.kontostand *= 2;
    }
    // Methode zur Verdreifachung des Kontostands
    public void verdreifachen(){
        this.kontostand *= 3;
    }
    // Methode zur Verzehnfachung des Kontostands
    public void verzehnfachen(){
        this.kontostand *= 10;
    }

}

