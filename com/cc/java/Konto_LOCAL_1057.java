package com.cc.java;

public class Konto {

    int kontostand = 10000;
    String name;
    // System.out.println(kontostand);

    public Konto(String name, int kontostand) {
        this.name = name;
        this.kontostand = kontostand;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
