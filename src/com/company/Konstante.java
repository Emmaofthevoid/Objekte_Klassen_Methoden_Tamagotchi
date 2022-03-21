package com.company;

public class Konstante {
    public static void main(String[] args) {
        //das sind beides Konstanten- mit final können wir Parameter und Variablen als solche deklarieren
        //ihnen kann man maximal 1 mal einen wert zuweisen
        final int geburtsjahr = 1970;
        final int todesjahr;
        System.out.println(geburtsjahr);
        //System.out.println(todesjahr); geht nicht da es noch nicht initialisiert ist
        todesjahr = 2222;
        System.out.println(todesjahr);

     //alternative onhe import
        //ganze name schreiben zb at.campus02.pr1.projekt1.Haeschen;


    }
}
