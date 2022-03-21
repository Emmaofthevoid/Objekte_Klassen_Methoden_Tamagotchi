package com.company;

public class Tamagotchi {
    int x;
    int y;
    int futter;


    public void bewegen(String richtung, int schritten) {
        // hier wird der Tamagotchi sich nicht bewegen wenn er nicht genug Futter hat, also er wird nich einmal anfangen
        if (futter >= schritten) {
            if (richtung.equals("links")) {
                x = x - schritten;
                futter = futter - schritten;
            } else if (richtung.equals("rechts")) {
                x = x + schritten;
                futter = futter - schritten;
            } else if (richtung.equals("oben")) {
                y = y + schritten;
                futter = futter - schritten;
            } else if (richtung.equals("unten")) {
                y = y - schritten;
                futter = futter - schritten;
            }
        }

    }

    public void futtern(int weitereFutter) {
        futter += weitereFutter;
    }
}
