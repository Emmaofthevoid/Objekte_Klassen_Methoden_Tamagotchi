package com.company;

public class KlasseTestPokemon {

    String firstEvol;
    String secondEvol;
    String finalEvol;
    int lvl;
    int xpLeft;
    int howManyLvlPointsToEvolve;
    int howManyFights;
    static String specie = "Pokemon";

    public int getLvl () {
        return lvl;
    }
    public int getXpLeft () {
        return xpLeft;
    }

    public int refillXp (int moreXp){
        xpLeft += moreXp;
        return xpLeft;
    }




}
