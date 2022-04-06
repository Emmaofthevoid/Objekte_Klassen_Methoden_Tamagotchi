package com.company;

public class PokemonApp {
    public static void main(String[] args) {
        KlasseTestPokemon pk1 = new KlasseTestPokemon();
        pk1.firstEvol = "Charmander";
        pk1.secondEvol = "Charmeleon";
        pk1.finalEvol = "Charizard";
        pk1.lvl = 50;

        System.out.println(pk1.getLvl());
        pk1.refillXp(50);
        pk1.xpLeft = 3000;
        System.out.println(pk1.xpLeft);
        System.out.println(pk1.finalEvol);
    }
}
