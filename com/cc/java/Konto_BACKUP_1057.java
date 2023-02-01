package com.cc.java;

public class Konto {

<<<<<<< HEAD
    int kontostand = 10000;
    String name;
    // System.out.println(kontostand);

    public Konto(String name, int kontostand) {
        this.name = name;
=======
    private int kontostand;    

    public Konto(int kontostand) {
>>>>>>> 53e129e667be4dc5acda78c62ab7860ac195dcc5
        this.kontostand = kontostand;
    }

    public int getKontostand() {
        return kontostand;
    }

<<<<<<< HEAD
    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

=======
    public void setKontostand(int kontostand){
        this.kontostand = kontostand;
    }


    
  
>>>>>>> 53e129e667be4dc5acda78c62ab7860ac195dcc5
}
