package com.mycompany.periferic;

class Mouse extends Periferice {
    private int dpi;
    private int numarButoane;
    private boolean wireless;

    // Constructor fără argumente
    public Mouse() {
        super();
        this.dpi = 0;
        this.numarButoane = 0;
        this.wireless = false;
    }

    // Constructor cu toate câmpurile
    public Mouse(String marca, String model, double pret, String compatibilitateSO, int dpi, int numarButoane, boolean wireless) {
        super(marca, model, pret, compatibilitateSO);
        this.dpi = dpi;
        this.numarButoane = numarButoane;
        this.wireless = wireless;
    }

    // Constructor de copiere
    public Mouse(Mouse altMouse) {
        super(altMouse);
        this.dpi = altMouse.dpi;
        this.numarButoane = altMouse.numarButoane;
        this.wireless = altMouse.wireless;
    }

    // Getter și setter pentru fiecare câmp
    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNumarButoane() {
        return numarButoane;
    }

    public void setNumarButoane(int numarButoane) {
        this.numarButoane = numarButoane;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String obtineDetalii() {
        return super.toString() + ", DPI: " + dpi + ", Numar Butoane: " + numarButoane + ", Wireless: " + wireless;
    }

    @Override
    public boolean verificaCompatibilitate(String sistemOperare) {
        return compatibilitateSO.contains(sistemOperare);
    }

    
}
