package com.mycompany.curs9_24;
class Cosmetice {
    protected String denumire;
    protected double pret;
    protected String tip;

    public Cosmetice(String denumire, double pret, String tip) {
        this.denumire = denumire;
        this.pret = pret;
        this.tip = tip;
    }

    public void afiseaza() {
        System.out.println("Denumire: " + denumire);
        System.out.println("Pret: " + pret + " RON");
        System.out.println("Tip: " + tip);
    }
}
