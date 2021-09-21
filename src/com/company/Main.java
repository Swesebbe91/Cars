package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person personLista = new Person(); //Skapar en lista av personer
        FordonsInnehavare agarList = new FordonsInnehavare(); //Skapar en lista av fordonsinnehavare

        boolean ison = true; //Kör Switchen så länge vilkoret är sant
        //Skapa en meny som löper till menyval 3;
        //1. Lägg till en person
        //2. Lägg till ett bilmärke
        //3. Lägg till en MC
        //4. Skriv ut listan av ägare + fordon
        //5. Avsluta

        while (ison) {
            System.out.printf("Välj ett menyval %n" +
                    "[1] Lägg till en ny person%n" +
                    "[2] se inknappade personer %n" +
                    "[3] Lägg till en bil %n" +
                    "[4] Lägg till en MC %n" +
                    "[5] Skriv ut ägarlistan%n" +
                    "[6] Avsluta%n");
            int input = scan.nextInt(); //Tar emot önskat menyval

            switch (input) { //Väljer menyvalet
                case 1: { //input värde 1 = Knappa in person till personlista
                    System.out.println("Ange ditt namn: ");
                    String name = scan.next();
                    System.out.println("Ange ditt personnummer: ");
                    String personnummer = scan.next();

                    Person p = new Person(name, personnummer); //Skapar en ny person och lägger i objekt p
                    personLista.addPerson(p); //lägger in ovan i personlistan
                    break;
                }

                case 2: { //Input värde 2 = Kör en metod som går igenom personlistan och dess info
                    personLista.printListan(); //Metoden
                    break;
                }

                case 3: { //Adda en bil till ägaren
                    System.out.println("Vem vill du lägga på en bil till?"); //Hitta befientlig ägare
                    String inputString = scan.next(); //Tar emot svaret

                    int svar = (personLista.hittaPersonListan(inputString)); //Finns namnet i listan, metod körs?

                            if (svar == 0){ //Om personen finns i listan, leta rätt index plats att adda på

                                System.out.println("Ange bilmärke: ");
                                String bilmärke = scan.next();
                                System.out.println("Ange chassingnummer: ");
                                String chassingnummer = scan.next();
                                System.out.println("Ange registreringsnummer: ");
                                String registreringsnummer = scan.next();
                                System.out.println("Ange antalet platser");
                                int antalPlatser = scan.nextInt();

                                Bil b = new Bil(bilmärke, chassingnummer, registreringsnummer, antalPlatser);
                                agarList.addFordon(b);
                            }

                        else { //annars ge användaren svaret
                                System.out.println("Tyvärr namnet finns inte i listan");
                             }
                        }

                    break;

                case 4: { //Skapa en mc till ägaren
                    System.out.println("Ange MC märke: ");
                    String bilmärke = scan.next();
                    System.out.println("Ange chassingnummer: ");
                    String chassingnummer = scan.next();
                    System.out.println("Ange registreringsnummer: ");
                    String registreringsnummer = scan.next();
                    System.out.println("Ange antalet kubik");
                    int kubik = scan.nextInt();
                    while (kubik < 0) {
                        System.out.println("Ange kubik över 0: ");
                        kubik = scan.nextInt();
                    }
                    MC k = new MC(bilmärke, chassingnummer, registreringsnummer, kubik);
                    agarList.addFordon(k);
                    break;

                }
                case 5: {
                    agarList.printList(); //Printa ut ägarlista + ägarfordon

                    break;
                }

                case 6: {
                    System.out.println("Du har valt att avsluta programmet, hejdå!");
                    ison = false;
                }
                default:
                    System.out.println("Du matade in en siffra som ej kan nås");
            }






/*
            FordonsInnehavare owner = new FordonsInnehavare("Kalle Svensson", "771122-4455");
            owner.addFordon(new MC("BMW", "123244434", "ABC 123", 125));
            owner.addFordon(new Bil("Fiat", "65678677", "FER 978", 7));
            owner.addFordon(new Bil("Kia", "45678865", "Det 457", 5));
            FordonsInnehavare owner1 = new FordonsInnehavare();
            System.out.println("\n\n");

            owner.printList();
            owner1.addFordon(new Bil("Ford", "ko", "kk", 2));
            owner1.printList();
*/

        }
    }
}