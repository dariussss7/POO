package com.mycompany.periferic;

class Microfon extends Periferic {
    private int sensibilitate;
    private String tipConectare;
    private boolean esteConferinta;

    // Constructor fără argumente
    public Microfon() {
        super();
        this.sensibilitate = 0;
        this.tipConectare = "Necunoscut";
        this.esteConferinta = false;
    }

    // Constructor cu toate câmpurile
    public Microfon(String marca, String model, double pret, String compatibilitateSO, int sensibilitate, String tipConectare, boolean esteConferinta) {
        super(marca, model, pret, compatibilitateSO);
        this.sensibilitate = sensibilitate;
        this.tipConectare = tipConectare;
        this.esteConferinta = esteConferinta;
    }

    // Constructor de copiere
    public Microfon(Microfon altMicrofon) {
        super(altMicrofon);
        this.sensibilitate = altMicrofon.sensibilitate;
        this.tipConectare = altMicrofon.tipConectare;
        this.esteConferinta = altMicrofon.esteConferinta;
    }

    // Getter și setter pentru fiecare câmp
    public int getSensibilitate() {
        return sensibilitate;
    }

    public void setSensibilitate(int sensibilitate) {
        this.sensibilitate = sensibilitate;
    }

    public String getTipConectare() {
        return tipConectare;
    }

    public void setTipConectare(String tipConectare) {
        this.tipConectare = tipConectare;
    }

    public boolean isEsteConferinta() {
        return esteConferinta;
    }

    public void setEsteConferinta(boolean esteConferinta) {
        this.esteConferinta = esteConferinta;
    }

    @Override
    public String obtineDetalii() {
        return super.toString() + ", Sensibilitate: " + sensibilitate + " dB, Tip conectare: " + tipConectare + ", Pentru conferinte: " + esteConferinta;
    }

    @Override
    public boolean verificaCompatibilitate(String sistemOperare) {
        return compatibilitateSO.contains(sistemOperare);
    }


}
