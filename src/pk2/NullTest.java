package pk2;


import com.company.Haeschen;

public class NullTest {
    public static void main(String[] args) {
        String hansiLieblingsPizza = null; //zeigt nirgendwohin , wir können nichts damit tun
        //weil dahinter kein objekt steht
     //   hansiLieblingsPizza.indexOf("a");

        //sobald wir ein Objekt zuweisen ist es kein Problem mehr und geht ganz normal
        hansiLieblingsPizza = " Margherita ( mit 1-2 kleinen Ananas unter dem Käse versteckt)";
        System.out.println(hansiLieblingsPizza);
        System.out.println(hansiLieblingsPizza.toUpperCase());

        String donau = "supercalifragilistoespialidoso";
        System.out.println(donau.indexOf("fragil"));
        

    }
}
