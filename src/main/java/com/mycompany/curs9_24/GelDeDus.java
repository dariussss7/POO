package com.mycompany.curs9_24;
class GelDeDus extends Cosmetice {
    private int volum;

    public GelDeDus(String denumire, double pret, int volum) {
        super(denumire, pret, "Gel de dus");
        this.volum = volum;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Volum: " + volum + " ml");
    }
}
