package com.company;

public class HaeschenApp {
    public static void main(String[] args) {
        //statisches atribut bzw Methode kann auch ohne Objekt oder Instanz verwendet werden
        //mit den namen der klasse
        System.out.println(Haeschen.spezies);
        Haeschen rogger = new Haeschen();
        //Zugriff auf Attribut mittels Objekt bzw Instanznamen
        rogger.name = "Rogger Rabit";
        rogger.farbe = "weiß";
        System.out.println(rogger.name + " " + rogger.farbe);
        Haeschen bugs = null;
        //irgendwann später ( 5 ifs und 2 schleifen später)
        bugs = new Haeschen();
        bugs.name = "Bugs Bunny";
        bugs.farbe = "grau";

        //wir testen unser hoppeln methode - ohne haeschen geht nichts
        // Haeschen geht nicht
        bugs.hoppel("nach hinten");
        rogger.hoppel("in the woods");

        //Aufruf statische methode
        Haeschen.ausgabeSpezies();
    }

}

