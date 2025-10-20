public class Tulostin {
    public static void main(String[] args) throws Exception {

        //luodaan tekija muuttuja
        String tekija = "Tuomas Talkio";

        //Luodaan kaksi luku muuttujaa
        double luku1 = 9;
        double luku2 = 3;

        //Luodaan tulo, jako, summa ja erotus laskutoimitus muuttujat
        double tulo = luku1 * luku2;
        double jako = luku1 / luku2;
        double summa = luku1 + luku2;
        double erotus = luku1 - luku2;

        //tulostetaan tervehdys ja tekijan nimi
        System.out.println("Hei olen tulostin ohjelma");
        System.out.println("Ohjelman tekijä: " + tekija);

        //tulostetaan luku muuttujien arvot
        System.out.println("Luku1-muuttujan arvo on " + luku1 + ".");

        System.out.println("Luku2-muuttujan arvo on " + luku2 + ".");

        //tulostetaan lasku toimitukset muuttujien avulla
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);

        System.out.println(luku1 + " / " + luku2 + " = " + jako);

        System.out.println(luku1 + " + " + luku2 + " = " + summa);

        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
    }
}