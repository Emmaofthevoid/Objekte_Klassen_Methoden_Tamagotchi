package com.company;

public class TamagotchiApp {
    public static void main(String[] args) {
        Tamagotchi lily = new Tamagotchi();
        lily.x = 6;
        lily.y = 4;
        lily.futter = 5;

        lily.bewegen("links", 5); //wir hoffen darauf, dass es 6 geht aber wird wohl nur 5 sein
        lily.futtern(5);
        lily.bewegen("links", 1);
        lily.bewegen("unten", 4);
        System.out.println(lily.x +" " + lily.y);

    }
}
