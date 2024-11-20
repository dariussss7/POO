package com.mycompany.curs8_23;

class Adresa {
    private String strada;
    private String oras;
    private String judet;

    public Adresa(String strada, String oras, String judet) {
        this.strada = strada;
        this.oras = oras;
        this.judet = judet;
    }

    public void afiseaza() {
        System.out.println("Strada: " + strada + ", Oras: " + oras + ", Judet: " + judet);
    }
}

class Data {
    private int zi;
    private int luna;
    private int an;

    public Data(int zi, int luna, int an) {
        this.zi = zi;
        this.luna = luna;
        this.an = an;
    }

    public void afiseaza() {
        System.out.println("Data: " + zi + "/" + luna + "/" + an);
    }
}

class Banca {
    private String nume;
    private Adresa adresa;

    public Banca(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public void afiseaza() {
        System.out.println("Banca: " + nume);
        adresa.afiseaza();
    }
}

class ContBancar {
    private String numar;
    private Banca banca;
    private String titular;
    private double suma;

    public ContBancar(String numar, Banca banca, String titular, double suma) {
        this.numar = numar;
        this.banca = banca;
        this.titular = titular;
        this.suma = suma;
    }

    public void afiseaza() {
        System.out.println("Numar cont: " + numar);
        banca.afiseaza();
        System.out.println("Titular: " + titular);
        System.out.println("Suma in cont: " + suma);
    }
}

class Depozit {
    private String numar;
    private ContBancar cont;
    private double dobanda;
    private Data dataInceput;
    private Data dataSfarsit;
    private double sumaInitiala;
    private double sumaFinala;

    public Depozit(String numar, ContBancar cont, double dobanda, Data dataInceput, Data dataSfarsit, double sumaInitiala) {
        this.numar = numar;
        this.cont = cont;
        this.dobanda = dobanda;
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        this.sumaInitiala = sumaInitiala;
        this.sumaFinala = sumaInitiala * (1 + dobanda / 100); 
    }

    public void afiseaza() {
        System.out.println("Numar depozit: " + numar);
        cont.afiseaza();
        System.out.println("Dobanda: " + dobanda + "%");
        dataInceput.afiseaza();
        dataSfarsit.afiseaza();
        System.out.println("Suma initiala: " + sumaInitiala);
        System.out.println("Suma finala: " + sumaFinala);
    }
}

public class Curs8_23 {
    public static void main(String[] args) {
  
        Adresa adresaBanca = new Adresa("Strada Bancii", "Bucuresti", "Ilfov");
        Banca banca = new Banca("Banca Nationala", adresaBanca);
        ContBancar cont = new ContBancar("RO12BANK", banca, "Ion Popescu", 1000.0);
        Data dataInceput = new Data(1, 1, 2023);
        Data dataSfarsit = new Data(1, 1, 2024);
        Depozit depozit = new Depozit("DEP12345", cont, 5.0, dataInceput, dataSfarsit, 1000.0);

   
        depozit.afiseaza();
    }
}

