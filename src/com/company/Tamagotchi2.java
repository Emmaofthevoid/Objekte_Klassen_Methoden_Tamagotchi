package com.company;
//not static
public class Tamagotchi2 {
    int x;
    int y;
    int futter;

    public void bewegen2(String richtung, int schritte) {
        //hier wird er sich bewegen solange er futter dafür hat, da er erst danach checkt ob er genug Futter hat.
        if (richtung.equals("oben")) {
            ++y;
        } else if (richtung.equals("unten")) {
            --y;
        } else if (richtung.equals("links")) {
            --x;
        } else if (richtung.equals("rechts")) {
            ++x;
        }
        schritte--;
        futter--;
    }

    public void weiterFuttern(int weitereFutterei) {
        futter = futter + weitereFutterei;
    }
}
