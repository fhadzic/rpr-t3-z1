package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;

public class Program {

    public static void meni() {

        System.out.println("Dobrodosli u gravni meni: ");

        System.out.println("Molim vas da odaberete jednu od ponudenih opcija:");

        System.out.println("0. Kraj" +  "\n" +
                "1. Dodavanje u imenik" + "\n" +
                "2. Telefonski broj osobe u imeniku" + "\n" +
                "3. Ime osobe u imeniku" + "\n" +
                "4. Telefonski brojevi osoba cije ime pocinje odredenim slovom" + "\n" +
                "5. Abecedno soritiran skup imena i prezimena osoba koje zive u nekom gradu" + "\n" +
                "6. Skup brojeva za osobe iz odredenog grada" + "\n"
        );
    }

    public static void izborBroja() {
        System.out.println("Odaberite jedan od ponudenih vrsta telefonskih brojeva:");
        System.out.println("1) Fiksni broj" + "\n" + "2) Mobilni broj" + "\n" + "3) Medunarodni broj");
    }

    public static void izborGrada() {
        System.out.println("Odaberite broj za ponudeni grad:");
        System.out.println("1) SARAJEVO\n" +
                "2) TRAVNIK\n" +
                "3) ZENICA\n" +
                "4) MOSTAR\n" +
                "5) TUZLA\n" +
                "6) BIHAC\n" +
                "7) GORAZDE\n" +
                "8) ORASJE\n" +
                "9) LIVNO,\n" +
                "10) SIROKI_BRIJEG,\n" +
                "11) BRCKO");
    }

    public static void main(String[] args) {

        Imenik imenik = new Imenik();

        meni();

        int izbor;

        Scanner ulaz = new Scanner(System.in);

        izbor = ulaz.nextInt();

        ulaz.nextLine();

        while (izbor != 0) {

            switch (izbor) {

                case 0:

                    break;

                case 1:

                    System.out.println("Unesite ime i prezime osobe: ");

                    String ime;
                    ime = ulaz.nextLine();

                    izborBroja();

                    int izborUredaja;
                    izborUredaja = ulaz.nextInt();

                    ulaz.nextLine();

                    if (izborUredaja == 1) {

                        int gradID;
                        izborGrada();
                        gradID = ulaz.nextInt();
                        FiksniBroj.Grad grad;
                        if (gradID == 1) {
                            grad = FiksniBroj.Grad.valueOf("SARAJEVO");
                        } else if (gradID == 2) {
                            grad = FiksniBroj.Grad.valueOf("TRAVNIK");
                        } else if (gradID == 3) {
                            grad = FiksniBroj.Grad.valueOf("ZENICA");
                        } else if (gradID == 4) {
                            grad = FiksniBroj.Grad.valueOf("MOSTAR");
                        } else if (gradID == 5) {
                            grad = FiksniBroj.Grad.valueOf("TRAVNIK");
                        } else if (gradID == 6) {
                            grad = FiksniBroj.Grad.valueOf("BIHAC");
                        } else if (gradID == 7) {
                            grad = FiksniBroj.Grad.valueOf("GORAZDE");
                        } else if (gradID == 8) {
                            grad = FiksniBroj.Grad.valueOf("ORASJE");
                        } else if (gradID == 9) {
                            grad = FiksniBroj.Grad.valueOf("LIVNO");
                        } else if (gradID == 10) {
                            grad = FiksniBroj.Grad.valueOf("SIROKI_BRIJEG");
                        } else if (gradID == 11) {
                            grad = FiksniBroj.Grad.valueOf("BRCKO");
                        } else {
                            System.out.println("Uneseni grad nije validan!");
                            break;
                        }

                        String fiksniBroj;
                        System.out.println("Unesite fiksni broj telefona korisnika: ");
                        fiksniBroj = ulaz.nextLine();
                        imenik.dodaj(ime, new FiksniBroj(grad, fiksniBroj));

                    } else if (izborUredaja == 2) {
                        System.out.println("Unesite mobilnu mrezu korisnika: ");

                        int mobilnaMreza;
                        mobilnaMreza = ulaz.nextInt();

                        String mobilni;
                        System.out.println("Unesite mobilni broj telefona korisnika: ");
                        mobilni = ulaz.nextLine();

                        imenik.dodaj(ime, new MobilniBroj(mobilnaMreza, mobilni));

                    } else if (izborUredaja == 3) {

                        System.out.print("Unesite pozivni broj drzave: ");
                        String drzava = ulaz.nextLine();
                        System.out.print("Unesite broj: ");
                        String uneseniBroj = ulaz.nextLine();
                        imenik.dodaj(ime, new MedunarodniBroj(drzava, uneseniBroj));

                    }
                    break;

                case 2:

            }
            izbor = ulaz.nextInt();
        }
    }
}
