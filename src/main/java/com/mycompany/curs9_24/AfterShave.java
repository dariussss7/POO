package com.mycompany.curs9_24;
class AfterShave extends Cosmetice {
    private String tipParfum;

    public AfterShave(String denumire, double pret, String tipParfum) {
        super(denumire, pret, "After shave");
        this.tipParfum = tipParfum;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Tip parfum: " + tipParfum);
    }
}
