package com.mycompany.curs9_24;
class CremaCorp extends Cosmetice {
    private String aroma;

    public CremaCorp(String denumire, double pret, String aroma) {
        super(denumire, pret, "Crema pentru corp");
        this.aroma = aroma;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Aroma: " + aroma);
    }
}
