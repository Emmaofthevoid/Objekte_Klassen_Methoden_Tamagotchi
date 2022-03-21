package com.company;

public class Haeschen {
    //diese atributen sind individuell bei jeder Objekt, und man kann sie immer wieder ändern
    String name;
    String farbe;
    //static variablen bleiben immer so, man kann es dann beim aufruf nicht ändern. Eine Hase ist immer ein Leporidae
    static String spezies = "Leporidae";

    public void hoppel(String wohin) {
        System.out.println(name + " hoppelt " + wohin);
    }
    //in statische methode können wir nur auf statischee attribute zugreifen
    // java weiss bei nicht statische attributen ja nicht von welchem objekt oder instanz wir
    // es haben wollen bzw. ob es überhaupt eine gibt
    public static void ausgabeSpezies () {
        System.out.println("lateinische name: " + spezies);

    }
}
