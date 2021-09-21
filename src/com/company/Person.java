package com.company;

import java.util.ArrayList;

public class Person { //inkapslade attribut
    private String namn;
    private String pNr;
    private ArrayList<Person> personlista;

    public Person() { //default konstruktor
        this.namn = "NN"; //standard värde anges
        this.pNr = "ej angivet"; //standardvärde anges
        this.personlista = new ArrayList<Person>();
    }

    public Person(String namn, String pNr) { //konstruktorn
        this.namn = namn; //inknappat värde skapas i minnet
        this.pNr = pNr; //inknappat värde skapas i minnet
        this.personlista = new ArrayList<Person>();
    }

    public String getNamn() { //Gör det möjligt att hämta namn utanför klassen
        return namn;
    }

    public void setNamn(String namn) { //Gör det möjligt att ändra namn
        this.namn = namn;
    }

    public String getpNr() { //Gör det möjligt att hämta personnr
        return pNr;
    }

    public void addPerson(Person p) {
        personlista.add(p);
    }

    public void printListan() {
        for (int i = 0; i < personlista.size(); i++) {
            System.out.println(personlista.get(i).toString());
        }
    }

    public int hittaPersonListan(String input) {
        int n = 0;
        for (int i = 0; i < personlista.size(); i++) {
            if (personlista.equals(input) {
                n = personlista.indexOf(input);
            }
        }
        return n;
    }

        public String toString () { //metod som returnerar en formaterad string med text/värden
        String s = String.format("Namn: %s, Personummer: %s", this.namn, this.pNr);
        return s;
    }

}