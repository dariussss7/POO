package com.mycompany.periferic;
public class TestPeriferice {
    public static void main(String[] args) {
       
        System.out.println("Testare Tastatura ");
        Tastatura t1 = new Tastatura(); 
        Tastatura t2 = new Tastatura("Logitech", "K120", 99.99, "Windows, Linux", "QWERTY", true, "USB"); 
        Tastatura t3 = new Tastatura(t2); 

        
        t1.setMarca("HP");
        t1.setModel("Pavilion");
        t1.setPret(149.99);
        t1.setCompatibilitateSO("Windows");
        t1.setTipLayout("AZERTY");
        t1.setIluminare(false);
        t1.setConectivitate("Wireless");

      
        System.out.println("Tastatura 1: " + t1.obtineDetalii());
        System.out.println("Tastatura 2: " + t2.obtineDetalii());
        System.out.println("Tastatura 3 (copiata din 2): " + t3.obtineDetalii());
        
    
        System.out.println("Tastatura 2 compatibila cu Linux: " + t2.verificaCompatibilitate("Linux"));

      
        System.out.println("\nTestare Mouse ");
        Mouse m1 = new Mouse(); 
        Mouse m2 = new Mouse("Razer", "DeathAdder", 249.99, "Windows, MacOS", 16000, 6, true); 
        Mouse m3 = new Mouse(m2); 

        
        m1.setMarca("Microsoft");
        m1.setModel("Basic Optical Mouse");
        m1.setPret(49.99);
        m1.setCompatibilitateSO("Windows");
        m1.setDpi(800);
        m1.setNumarButoane(3);
        m1.setWireless(false);

      
        System.out.println("Mouse 1: " + m1.obtineDetalii());
        System.out.println("Mouse 2: " + m2.obtineDetalii());
        System.out.println("Mouse 3 (copiat din 2): " + m3.obtineDetalii());

        
       
        System.out.println("Mouse 2 compatibil cu MacOS: " + m2.verificaCompatibilitate("MacOS"));

        
        System.out.println("\n Testare CameraVideo ");
        CameraVideo c1 = new CameraVideo(); 
        CameraVideo c2 = new CameraVideo("Logitech", "C920", 399.99, "Windows, MacOS", 1080, 30, true); 
        CameraVideo c3 = new CameraVideo(c2); 

        
        c1.setMarca("Microsoft");
        c1.setModel("LifeCam HD-3000");
        c1.setPret(199.99);
        c1.setCompatibilitateSO("Windows");
        c1.setRezolutie(720);
        c1.setRataCadre(30);
        c1.setAreMicrofon(true);

        
        System.out.println("Camera 1: " + c1.obtineDetalii());
        System.out.println("Camera 2: " + c2.obtineDetalii());
        System.out.println("Camera 3 (copiata din 2): " + c3.obtineDetalii());

       
        System.out.println("Camera 2 compatibila cu MacOS: " + c2.verificaCompatibilitate("MacOS"));

        
        System.out.println("\n Testare Microfon ");
        Microfon mic1 = new Microfon(); 
        Microfon mic2 = new Microfon("Blue", "Yeti", 599.99, "Windows, MacOS", -38, "USB", true); 
        Microfon mic3 = new Microfon(mic2); 

        
        mic1.setMarca("Rode");
        mic1.setModel("NT-USB Mini");
        mic1.setPret(449.99);
        mic1.setCompatibilitateSO("Windows");
        mic1.setSensibilitate(-45);
        mic1.setTipConectare("USB");
        mic1.setEsteConferinta(false);

        
        System.out.println("Microfon 1: " + mic1.obtineDetalii());
        System.out.println("Microfon 2: " + mic2.obtineDetalii());
        System.out.println("Microfon 3 (copiat din 2): " + mic3.obtineDetalii());

        
        System.out.println("Microfon 2 compatibil cu MacOS: " + mic2.verificaCompatibilitate("MacOS"));
    }
}
