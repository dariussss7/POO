
package com.mycompany.periferic;

public class Periferice extends Periferic{
    protected String marca;
    protected String model;
    protected double pret;
    protected String compatibilitateSO;

    
    public Periferice() {
        this.marca = "Necunoscut";
        this.model = "Necunoscut";
        this.pret = 0.0;
        this.compatibilitateSO = "Necunoscut";
    }

   
    public Periferice(String marca, String model, double pret, String compatibilitateSO) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.compatibilitateSO = compatibilitateSO;
    }

    
    public Periferice(Periferice altPeriferic) {
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
    @Override
    public String toString() {
        return "Marca: " + marca + ", Model: " + model + ", Pret: " + pret + " RON, Compatibilitate: " + compatibilitateSO;
    }

    @Override
    public String obtineDetalii() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean verificaCompatibilitate(String sistemOperare) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
