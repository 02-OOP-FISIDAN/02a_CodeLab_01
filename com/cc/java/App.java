package com.cc.java;

public class App {
                
    

    public static void main(String[] args) {
    
<<<<<<< HEAD
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
=======
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        output("Konto1: " + konto1.getKontostand());
        output("Konto2: " + konto2.getKontostand());
        output("Konto3: " + konto3.getKontostand());  
        
        System.out.println("-----------------------------");

        konto1.setKontostand(konto1.getKontostand()*2);
        konto2.setKontostand(konto2.getKontostand()*3);
        konto3.setKontostand(konto3.getKontostand()*10);

        output("Konto1: " + konto1.getKontostand());
        output("Konto2: " + konto2.getKontostand());
        output("Konto3: " + konto3.getKontostand());  
    }


    public static void output(String outputStr) {
        System.out.println(outputStr);
    } 
>>>>>>> 53e129e667be4dc5acda78c62ab7860ac195dcc5

}