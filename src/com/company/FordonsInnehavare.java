package com.company;

    import java.util.ArrayList; //importerar arraylist från javas bibliotek

    public class FordonsInnehavare extends Person { //Skapar en arvsrelation

        private ArrayList<Fordon> fordonsLista; //inkapsla en arraylista

        public FordonsInnehavare() { //default konstruktorn
            this.fordonsLista = new ArrayList<Fordon>(); //skapa en arraylist från klassen fordon super blir default.
        }

        public FordonsInnehavare(String namn, String pNr) { //konstruktor som innehåller två parametrar
            super(namn, pNr); //infon hämtas från huvudklassen "person"
            this.fordonsLista = new ArrayList<Fordon>(); //skapar en arraylist
        }

        public void addFordon(Fordon f) { //Metod som gör det möjligt att adda fordon
            this.fordonsLista.add(f); //fordon objektet addas till listan fordonslista
        }

        public void printList() {
        /* En metod som printar info från huvudklassen
        samt loopar igenom addade fordon som sedan skrivs ut */

            System.out.println("Följande fordon ägs av: " + super.getNamn());

            for (int i = 0; i < fordonsLista.size(); i++) {
                System.out.println(fordonsLista.get(i).toString());


            }
        }


    }
