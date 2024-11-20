/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.periferic;

abstract class Periferic {
    protected String marca;
    protected String model;
    protected double pret;
    protected String compatibilitateSO;

    public Periferic() {
        this.marca = "Necunoscut";
        this.model = "Necunoscut";
        this.pret = 0.0;
        this.compatibilitateSO = "Necunoscut";
    }

    public Periferic(String marca, String model, double pret, String compatibilitateSO) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.compatibilitateSO = compatibilitateSO;
    }

    public Periferic(Periferic altPeriferic) {
        this.marca = altPeriferic.marca;
        this.model = altPeriferic.model;
        this.pret = altPeriferic.pret;
        this.compatibilitateSO = altPeriferic.compatibilitateSO;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getCompatibilitateSO() {
        return compatibilitateSO;
    }

    public void setCompatibilitateSO(String compatibilitateSO) {
        this.compatibilitateSO = compatibilitateSO;
    }


    public abstract String obtineDetalii();

    public abstract boolean verificaCompatibilitate(String sistemOperare);

    @Override
    public String toString() {
        return "Marca: " + marca + ", Model: " + model + ", Pret: " + pret + " RON, Compatibilitate: " + compatibilitateSO;
    }
}
