package com.company;

public class MC extends Fordon { //skapar en arvsrelation
    private int kubik; //inkapslar attribut

    public MC() { //default konstruktorn
        this.kubik = 0; //Blir 0 om inget annat anges, superklassens info hämtas också.
    }

    public MC(String märke, String chassinummer, String registreringsnummer, int kubik) { //konstruktor
        super(märke, chassinummer, registreringsnummer); //hämtar in superklassens info

        if (kubik > 0) { //om kubik är större än 0 sätts inmatat värde annars sätts 0
            this.kubik = kubik;
        } else
            this.kubik = 0;

    }

    public int getKubik() { //Gör det möjligt att nå kubik utanför klassen
        return kubik;
    }

    public void setKubik(int kubik) { //gör det möjligt att sätta kubik utanför klassen
        this.kubik = kubik;
    }

    @Override ////skriver över toString i denna klass och använder denna i kombination med huvudklassens tostring (super).
    public String toString() {
        return String.format("%s MC{kubik= %d}", super.toString(), kubik);
    }
}
