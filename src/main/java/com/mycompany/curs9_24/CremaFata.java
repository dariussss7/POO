package com.mycompany.curs9_24;
class CremaFata extends Cosmetice {
    private String tipTen;

    public CremaFata(String denumire, double pret, String tipTen) {
        super(denumire, pret, "Crema pentru fata");
        this.tipTen = tipTen;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Tip ten: " + tipTen);
    }
}
