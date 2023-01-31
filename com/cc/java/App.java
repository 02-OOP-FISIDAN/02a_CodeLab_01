package com.cc.java;

public class App {
                
    

    public static void main(String[] args) {
    
        String[] Name = { "Konto 1", "Konto 2", "Konto 3" };
        int[][] Stand = {{1, 2, 3},{2, 3, 10, 0}};

        Konto konto = new Konto("Konto ", 10000);
        // output(konto.kontostand);
        output(Name [0]);
        output(konto.getKontostand());
        output(Name [1]);
        output(konto.getKontostand());
        output(Name [2]);
        output(konto.getKontostand());

        Stand[1][3] = konto.kontostand;

        konto.setName(konto.getName() + Stand [0][0]);
        konto.setKontostand(konto.getKontostand() * Stand [1][0]);
        output(Name[0]);
        output(konto.kontostand);
        
        konto.setName(konto.getName() + Stand [0][1]);
        konto.setKontostand(Stand [1][3] * Stand[1][1]);
        // Stand[1][1] = konto.getKontostand();
        output(Name[1]);
        output(konto.kontostand);
       

        konto.setName(konto.getName() + Stand [0][2]);
        konto.setKontostand(Stand [1][3] * 10);
        output(Name[2]);
        output(konto.kontostand);

    }

    public static void output(int kontostand) {
        output("Anfangsbestand Konto " + kontostand);
    }





    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

