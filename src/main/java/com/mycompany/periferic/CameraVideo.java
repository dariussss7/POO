package com.mycompany.periferic;

class CameraVideo extends Periferic {
    private int rezolutie;
    private int rataCadre;
    private boolean areMicrofon;

    // Constructor fără argumente
    public CameraVideo() {
        super();
        this.rezolutie = 0;
        this.rataCadre = 0;
        this.areMicrofon = false;
    }

    // Constructor cu toate câmpurile
    public CameraVideo(String marca, String model, double pret, String compatibilitateSO, int rezolutie, int rataCadre, boolean areMicrofon) {
        super(marca, model, pret, compatibilitateSO);
        this.rezolutie = rezolutie;
        this.rataCadre = rataCadre;
        this.areMicrofon = areMicrofon;
    }

    // Constructor de copiere
    public CameraVideo(CameraVideo altaCamera) {
        super(altaCamera);
        this.rezolutie = altaCamera.rezolutie;
        this.rataCadre = altaCamera.rataCadre;
        this.areMicrofon = altaCamera.areMicrofon;
    }

    // Getter și setter pentru fiecare câmp
    public int getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public int getRataCadre() {
        return rataCadre;
    }

    public void setRataCadre(int rataCadre) {
        this.rataCadre = rataCadre;
    }

    public boolean isAreMicrofon() {
        return areMicrofon;
    }

    public void setAreMicrofon(boolean areMicrofon) {
        this.areMicrofon = areMicrofon;
    }

    @Override
    public String obtineDetalii() {
        return super.toString() + ", Rezolutie: " + rezolutie + " MP, Rata cadre: " + rataCadre + " FPS, Microfon incorporat: " + areMicrofon;
    }

    @Override
    public boolean verificaCompatibilitate(String sistemOperare) {
        return compatibilitateSO.contains(sistemOperare);
    }

}
