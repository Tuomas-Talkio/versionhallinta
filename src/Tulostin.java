public class Tulostin {
    public static void main(String[] args) throws Exception {

        //tulostetaan tervehdys
        System.out.println("Hei olen tulostin ohjelma");
        System.out.print("Ohjelman tekijä: ");

        //luodaan String muuttuja ja tulostetaan se
        String tekija = "Tuomas Talkio";

        System.out.println(tekija);
        
        //Luodaan kaksi int muuttujaa
        int luku1 = 3;
        int luku2 = 7;

        System.out.println("Luku1-muuttujan arvo on " + luku1 + ".");

        System.out.println("Luku2-muuttujan arvo on " + luku2 + ".");
    }
}