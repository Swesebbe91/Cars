package com.company;

public abstract class Fordon {
    private String märke; //inkapsling av attribut
    private String chassinummer;
    private String registreringsnummer;

    public Fordon() { //default konstruktor
        this.märke = "okänd";
        this.chassinummer = "Okänd";
        this.registreringsnummer = "okänd";
    }

    public Fordon(String märke, String chassinummer, String registreringsnummer) { //konstruktor med variabler
        this.märke = märke;
        this.chassinummer = chassinummer;
        this.registreringsnummer = registreringsnummer;
    }

    public String getMärke() { //Gör det möjligt att hämta märke utanför klassen
        return märke;
    }

    public void setMärke(String märke) { //Gör det möjligt att ändra märke utanför klassen
        this.märke = märke;
    }

    public String getChassinummer() { //Gör det möjligt att hämta chassinummer utanför klassen
        return chassinummer;
    }

    public void setChassinummer(String chassinummer) { //Gör det möjligt att ändra chassinummer utanför klassen
        this.chassinummer = chassinummer;
    }

    public String getRegistreringsnummer() { //gör det möjligt att hämta registreringsnummer utanför klassen
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) { //Gör det möjligt att ändra registreringsnumret utanför klassen
        this.registreringsnummer = registreringsnummer;
    }

    public String toString() { //En metod som printar en formaterad string med variabler
        return String.format("Märke: %s Registreringsnummer: %s Chassinnummer: %s", märke, registreringsnummer, chassinummer);
    }
}
