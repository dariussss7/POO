package com.mycompany.curs9_25;

public class Curs9_25 {
    public static void main(String[] args) {
        
        AdresaEmail expeditor = new AdresaEmail("d_ifrose", "gmail.com");
        AdresaEmail destinatar = new AdresaEmail("darius.ifrose", "yahoo.com");

        Email email = new Email("Confirmare documente", "Cer confirmare ca ati primiti documentele", expeditor, destinatar);
        
        email.trimite(); 
        System.out.println();  
        email.primeste(); 
    }
}
