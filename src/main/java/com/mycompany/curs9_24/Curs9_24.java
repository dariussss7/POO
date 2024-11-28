package com.mycompany.curs9_24;

public class Curs9_24 {
    public static void main(String[] args) {
        // Creare obiecte pentru fiecare tip de produs cosmetic
        Sampon sampon1 = new Sampon("Sampon Anti-Matreata", 25.0, 250);
        Sampon sampon2 = new Sampon("Sampon Hidratare", 30.0, 300);
        Sampon sampon3 = new Sampon("Sampon Revitalizant", 35.0, 350);

        CremaFata crema1 = new CremaFata("Crema Fata Hidratanta", 45.0, "Uscat");
        CremaFata crema2 = new CremaFata("Crema Fata Regeneranta", 50.0, "Normal");
        CremaFata crema3 = new CremaFata("Crema Fata Anti-Aging", 60.0, "Matur");

        CremaCorp cremaCorp1 = new CremaCorp("Crema Corp Fina", 40.0, "Lavanda");
        CremaCorp cremaCorp2 = new CremaCorp("Crema Corp Citron", 35.0, "Citronella");
        CremaCorp cremaCorp3 = new CremaCorp("Crema Corp Vanilie", 42.0, "Vanilie");

        AfterShave afterShave1 = new AfterShave("AfterShave Fresh", 25.0, "Citrice");
        AfterShave afterShave2 = new AfterShave("AfterShave Mentol", 28.0, "Mentol");
        AfterShave afterShave3 = new AfterShave("AfterShave Relax", 30.0, "Lavanda");

        GelDeDus gelDeDus1 = new GelDeDus("Gel Dus Sensitiv", 18.0, 250);
        GelDeDus gelDeDus2 = new GelDeDus("Gel Dus Revitalizant", 22.0, 300);
        GelDeDus gelDeDus3 = new GelDeDus("Gel Dus Hidratare", 20.0, 350);

        // Afișare detalii pentru fiecare produs
        System.out.println("Produse Sampon:");
        sampon1.afiseaza();
        sampon2.afiseaza();
        sampon3.afiseaza();

        System.out.println("\nProduse Crema Fata:");
        crema1.afiseaza();
        crema2.afiseaza();
        crema3.afiseaza();

        System.out.println("\nProduse Crema Corp:");
        cremaCorp1.afiseaza();
        cremaCorp2.afiseaza();
        cremaCorp3.afiseaza();

        System.out.println("\nProduse AfterShave:");
        afterShave1.afiseaza();
        afterShave2.afiseaza();
        afterShave3.afiseaza();

        System.out.println("\nProduse Gel de Dus:");
        gelDeDus1.afiseaza();
        gelDeDus2.afiseaza();
        gelDeDus3.afiseaza();
    }
}
