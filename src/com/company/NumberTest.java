package com.company;

public class NumberTest {
    public static void main(String[] args) {
        //Wie komme ich zum jahrzehnt eines alters

        //25 ---> 2; 73,7
        int age = 25;
        int jahrzehnt = age/10;
        System.out.println(jahrzehnt);

        //wie komme ich zur zehner stelle in einer zahl, also bei 137 -> 3
        //zuerst durch 10 damit wir 7 verschwinden lassen - und dann modulo 10 für die aktuell letzte Stelle
        int zehnerstelle = (137/10)%10; //eine int division da beide zahlen ohne kommastelle
        System.out.println(zehnerstelle);
    }
}
