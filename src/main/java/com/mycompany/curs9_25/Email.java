package com.mycompany.curs9_25;

class Email {
    private final String subiect;
    private final String continut;
    private final AdresaEmail expeditor;
    private final AdresaEmail destinatar;

    public Email(String subiect, String continut, AdresaEmail expeditor, AdresaEmail destinatar) {
        this.subiect = subiect;
        this.continut = continut;
        this.expeditor = expeditor;
        this.destinatar = destinatar;
    }

    // Simulăm trimiterea unui email
    public void trimite() {
        System.out.println("Email trimis de la: " + expeditor.getAdresaEmail());
        System.out.println("Catre: " + destinatar.getAdresaEmail());
        System.out.println("Subiect: " + subiect);
        System.out.println("Continut: " + continut);
        System.out.println("Email trimis cu succes!");
    }

    // Simulăm primirea unui email
    public void primeste() {
        System.out.println("Email primit de la: " + expeditor.getAdresaEmail());
        System.out.println("Catre: " + destinatar.getAdresaEmail());
        System.out.println("Subiect: " + subiect);
        System.out.println("Continut: " + continut);
        System.out.println("Email primit cu succes!");
    }
}
