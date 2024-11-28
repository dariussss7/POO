package com.mycompany.curs9_24;
class Sampon extends Cosmetice {
    private int volum;

    public Sampon(String denumire, double pret, int volum) {
        super(denumire, pret, "Sampon");
        this.volum = volum;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Volum: " + volum + " ml");
    }
}
