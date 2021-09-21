package com.company;

public class Bil extends Fordon { //skapar arvsrelation till fordon

    private int sittPlatser; //Attribut för klassen

    public Bil() { //default konstruktorn som ger sittplatser värdet 5 om inget inknappas av användaren. Hämtar in info från superklassen.
        this.sittPlatser = 5;

    }

    public Bil(String märke, String chassinummer, String registreringsnummer, int sittplatser) { //klassens konstruktor
        super(märke, chassinummer, registreringsnummer); //hämtar in värden som superklassen "fordon"
        if (sittPlatser > 0 && sittPlatser < 10) { //Om inmatningen är under 0 eller över 9 sätts 5 in annars inknappade sittplatser.
            this.sittPlatser = sittplatser;
        } else
            this.sittPlatser = 5;
    }

    public int getSittPlatser() { //gör det möjligt att hämta sittplatser utanför klassen.
        return sittPlatser;
    }

    public void setSittPlatser(int sittPlatser) { //Gör det möjligt att ändra på antalet sittplatser utanför klassen.
        this.sittPlatser = sittPlatser;
    }

    @Override //skriver över toString i denna klass och använder denna i kombination med huvudklassens tostring (super).
    public String toString() {
        return String.format("%s PersonBil{sittPlatser= %s}", super.toString(), sittPlatser);
    }
}
