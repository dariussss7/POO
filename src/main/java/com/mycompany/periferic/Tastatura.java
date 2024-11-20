package com.mycompany.periferic;

class Tastatura extends Periferic {
    private String tipLayout;
    private boolean iluminare;
    private String conectivitate;

    // Constructor fără argumente
    public Tastatura() {
        super();
        this.tipLayout = "Necunoscut";
        this.iluminare = false;
        this.conectivitate = "Necunoscut";
    }

    // Constructor cu toate câmpurile
    public Tastatura(String marca, String model, double pret, String compatibilitateSO, String tipLayout, boolean iluminare, String conectivitate) {
        super(marca, model, pret, compatibilitateSO);
        this.tipLayout = tipLayout;
        this.iluminare = iluminare;
        this.conectivitate = conectivitate;
    }

    // Constructor de copiere
    public Tastatura(Tastatura altaTastatura) {
        super(altaTastatura);
        this.tipLayout = altaTastatura.tipLayout;
        this.iluminare = altaTastatura.iluminare;
        this.conectivitate = altaTastatura.conectivitate;
    }

    // Getter și setter pentru fiecare câmp
    public String getTipLayout() {
        return tipLayout;
    }

    public void setTipLayout(String tipLayout) {
        this.tipLayout = tipLayout;
    }

    public boolean isIluminare() {
        return iluminare;
    }

    public void setIluminare(boolean iluminare) {
        this.iluminare = iluminare;
    }

    public String getConectivitate() {
        return conectivitate;
    }

    public void setConectivitate(String conectivitate) {
        this.conectivitate = conectivitate;
    }

    @Override
    public String obtineDetalii() {
        return super.toString() + ", Layout: " + tipLayout + ", Iluminare: " + iluminare + ", Conectivitate: " + conectivitate;
    }

    @Override
    public boolean verificaCompatibilitate(String sistemOperare) {
        return compatibilitateSO.contains(sistemOperare);
    }

}
