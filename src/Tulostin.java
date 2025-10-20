public class Tulostin {
    public static void main(String[] args) throws Exception {

        //tulostetaan tervehdys
        System.out.println("Hei olen tulostin ohjelma");
        System.out.print("Ohjelman tekijä: ");

        //luodaan String muuttuja ja tulostetaan se
        String tekija = "Tuomas Talkio";

        System.out.println(tekija);
        
        //Luodaan kaksi int muuttujaa
        double luku1 = 9;
        double luku2 = 3;

        //tulostetaan muuttujien arvo
        System.out.println("Luku1-muuttujan arvo on " + luku1 + ".");

        System.out.println("Luku2-muuttujan arvo on " + luku2 + ".");

        //Luodaan tulo muuttuja
        double tulo = luku1 * luku2;

        //tulostetaan luku muuttujat ja tulo muuttuja
        System.out.println(luku1 + " * " + luku2 + "=" + tulo);

        //Luodaan erotus, summa ja jako muuttujat
        double erotus = luku1 - luku2;
        
        double summa = luku1 + luku2;

        double jako = luku1 / luku2;

        //tulostetaan lasku toimitukset muuttujien avulla
        System.out.println(luku1 + " / " + luku2 + "=" + jako);

        System.out.println(luku1 + " + " + luku2 + "=" + summa);

        System.out.println(luku1 + " - " + luku2 + "=" + erotus);
    }
}