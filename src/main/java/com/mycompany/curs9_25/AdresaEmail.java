package com.mycompany.curs9_25;

class AdresaEmail {
    private String utilizator;
    private String domeniu;

    public AdresaEmail(String utilizator, String domeniu) {
        this.utilizator = utilizator;
        this.domeniu = domeniu;
    }

    public String getAdresaEmail() {
        return utilizator + "@" + domeniu;
    }
}
