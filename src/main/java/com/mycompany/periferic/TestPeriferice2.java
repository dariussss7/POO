package com.mycompany.periferic;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Object;

public class TestPeriferice2 {
    public static void main(String[] args) {
       
        ArrayList<Tastatura> tastaturi = new ArrayList<>();
        Tastatura tastatura1 = new Tastatura("Logitech", "G915", 799.99, "Windows, MacOS", "QWERTY", true, "Bluetooth");
        Tastatura tastatura2 = new Tastatura("Razer", "BlackWidow", 699.99, "Windows", "QWERTY", true, "USB");
        Tastatura tastatura3 = new Tastatura("Corsair", "K70", 599.99, "Windows, MacOS", "AZERTY", true, "USB");
        Tastatura tastatura4 = new Tastatura("HP", "Omen", 299.99, "Windows", "QWERTZ", false, "USB");
        Tastatura tastatura5 = new Tastatura("Dell", "KB216", 79.99, "Windows", "QWERTY", false, "USB");
        Tastatura tastatura6 = new Tastatura("Microsoft", "Ergonomic", 199.99, "Windows", "QWERTY", false, "Wireless");
        Tastatura tastatura7 = new Tastatura("Apple", "Magic Keyboard", 999.99, "MacOS", "QWERTY", false, "Bluetooth");
        Tastatura tastatura8 = new Tastatura("SteelSeries", "Apex Pro", 899.99, "Windows", "QWERTY", true, "USB");
        Tastatura tastatura9 = new Tastatura("HyperX", "Alloy FPS", 449.99, "Windows, Linux", "QWERTY", true, "USB");
        Tastatura tastatura10 = new Tastatura("Lenovo", "ThinkPad", 199.99, "Windows", "QWERTY", false, "USB");

        tastaturi.add(tastatura1);
        tastaturi.add(tastatura2);
        tastaturi.add(tastatura3);
        tastaturi.add(tastatura4);
        tastaturi.add(tastatura5);
        tastaturi.add(tastatura6);
        tastaturi.add(tastatura7);
        tastaturi.add(tastatura8);
        tastaturi.add(tastatura9);
        tastaturi.add(tastatura10);
      
        ArrayList<Mouse> mouseuri = new ArrayList<>();
        Mouse mouse1 = new Mouse("Logitech", "MX Master 3", 499.99, "Windows, MacOS", 4000, 7, true);
        Mouse mouse2 = new Mouse("Razer", "Viper Ultimate", 799.99, "Windows, MacOS", 20000, 6, true);
        Mouse mouse3 = new Mouse("SteelSeries", "Rival 3", 249.99, "Windows", 8500, 6, false);
        Mouse mouse4 = new Mouse("HP", "Z5000", 149.99, "Windows", 1200, 3, true);
        Mouse mouse5 = new Mouse("Microsoft", "Classic IntelliMouse", 199.99, "Windows", 3200, 5, false);
        Mouse mouse6 = new Mouse("Apple", "Magic Mouse 2", 399.99, "MacOS", 800, 2, true);
        Mouse mouse7 = new Mouse("Corsair", "Dark Core RGB", 599.99, "Windows", 16000, 8, true);
        Mouse mouse8 = new Mouse("Logitech", "G502 HERO", 399.99, "Windows, Linux", 16000, 11, false);
        Mouse mouse9 = new Mouse("HyperX", "Pulsefire FPS Pro", 349.99, "Windows, MacOS", 16000, 6, false);
        Mouse mouse10 = new Mouse("Dell", "MS116", 49.99, "Windows", 1000, 2, false);

        mouseuri.add(mouse1);
        mouseuri.add(mouse2);
        mouseuri.add(mouse3);
        mouseuri.add(mouse4);
        mouseuri.add(mouse5);
        mouseuri.add(mouse6);
        mouseuri.add(mouse7);
        mouseuri.add(mouse8);
        mouseuri.add(mouse9);
        mouseuri.add(mouse10);
        
        ArrayList<CameraVideo> camere = new ArrayList<>();
        CameraVideo camera1 = new CameraVideo("Logitech", "C920", 399.99, "Windows, MacOS", 1080, 30, true);
        CameraVideo camera2 = new CameraVideo("Razer", "Kiyo", 599.99, "Windows", 1080, 60, true);
        CameraVideo camera3 = new CameraVideo("Microsoft", "LifeCam Studio", 249.99, "Windows", 1080, 30, true);
        CameraVideo camera4 = new CameraVideo("Dell", "UltraSharp", 699.99, "Windows, MacOS", 2160, 30, true);
        CameraVideo camera5 = new CameraVideo("HP", "Pro Webcam", 349.99, "Windows", 720, 30, false);
        CameraVideo camera6 = new CameraVideo("Logitech", "Brio 4K", 999.99, "Windows, MacOS", 2160, 60, true);
        CameraVideo camera7 = new CameraVideo("AverMedia", "PW315", 799.99, "Windows", 1080, 60, true);
        CameraVideo camera8 = new CameraVideo("Lenovo", "500 FHD", 299.99, "Windows", 1080, 30, false);
        CameraVideo camera9 = new CameraVideo("Creative", "Live! Cam", 249.99, "Windows", 720, 30, true);
        CameraVideo camera10 = new CameraVideo("Trust", "Spotlight Pro", 149.99, "Windows", 720, 30, false);

        camere.add(camera1);
        camere.add(camera2);
        camere.add(camera3);
        camere.add(camera4);
        camere.add(camera5);
        camere.add(camera6);
        camere.add(camera7);
        camere.add(camera8);
        camere.add(camera9);
        camere.add(camera10);

        ArrayList<Microfon> microfoane = new ArrayList<>();
        Microfon microfon1 = new Microfon("Blue", "Yeti", 599.99, "Windows, MacOS", -38, "USB", true);
        Microfon microfon2 = new Microfon("Rode", "NT-USB Mini", 449.99, "Windows, MacOS", -45, "USB", false);
        Microfon microfon3 = new Microfon("Shure", "MV5", 799.99, "Windows, MacOS", -40, "USB", true);
        Microfon microfon4 = new Microfon("Samson", "Meteor", 299.99, "Windows", -42, "USB", false);
        Microfon microfon5 = new Microfon("Trust", "GXT 232", 199.99, "Windows", -38, "USB", true);
        Microfon microfon6 = new Microfon("HyperX", "QuadCast", 699.99, "Windows", -40, "USB", true);
        Microfon microfon7 = new Microfon("Razer", "Seiren X", 599.99, "Windows, MacOS", -38, "USB", false);
        Microfon microfon8 = new Microfon("Logitech", "Blue Snowball", 399.99, "Windows", -38, "USB", true);
        Microfon microfon9 = new Microfon("AKG", "Lyra", 499.99, "Windows, MacOS", -45, "USB", false);
        Microfon microfon10 = new Microfon("Audio-Technica", "AT2020", 899.99, "Windows", -36, "XLR", true);

        microfoane.add(microfon1);
        microfoane.add(microfon2);
        microfoane.add(microfon3);
        microfoane.add(microfon4);
        microfoane.add(microfon5);
        microfoane.add(microfon6);
        microfoane.add(microfon7);
        microfoane.add(microfon8);
        microfoane.add(microfon9);
        microfoane.add(microfon10);

       
        Scanner scanner = new Scanner(System.in); 
        
       
        
        //TASTATURA
        System.out.println("Tastatura:");
        System.out.println("Introduceti sistemul de operare (ex: Windows, MacOS):");
        String sistemOperare = scanner.nextLine();

        System.out.println("Doriti tastaturi cu iluminare? (true/false):");
        boolean iluminare = scanner.nextBoolean();
     
        scanner.nextLine();
        
        System.out.println("\nTastaturi care indeplinesc conditiile:");  
        for (Tastatura tastatura : tastaturi) {
          if (tastatura.compatibilitateSO.contains(sistemOperare) && tastatura.isIluminare() == iluminare) {
               System.out.println(tastatura.obtineDetalii());
            }
        }
        
 
        //Parcurgere mouse cu for each loop
       /** System.out.println("Introduceti sistemul de operare (ex: Windows, MacOS):");
        sistemOperare = scanner.nextLine();

        System.out.println("Doriti mouse-uri cu wireless? (true/false):");
        boolean wireless = scanner.nextBoolean();
        
        
        System.out.println("\nMouse-uri care îndeplinesc condițiile:");
        for (Mouse mouse : mouseuri) {
            if (mouse.compatibilitateSO.contains(sistemOperare) && mouse.isWireless() == wireless) {
                System.out.println(mouse.obtineDetalii());
            }
        }
   **/
         //MOUSE
        System.out.println("\nMouse:");
        System.out.println("Introduceti sistemul de operare (ex: Windows, MacOS):");
        sistemOperare = scanner.nextLine();
        
        System.out.println("Doriti mouse-uri cu wireless? (true/false):");
        boolean wireless = scanner.nextBoolean();
        
        scanner.nextLine();
    
        System.out.println("\nMouse-uri care indeplinesc conditiile:");
            for (int i = 0; i < mouseuri.size(); i++) {
                Mouse mouse = mouseuri.get(i); 
            if (mouse.compatibilitateSO.contains(sistemOperare) && mouse.isWireless() == wireless) {
                System.out.println(mouse.obtineDetalii());
    }
}   
            //CAMERA VIDEO
        System.out.println("\nCamera Video:");
        System.out.println("Introduceti sistemul de operare (ex: Windows, MacOS):");
        sistemOperare = scanner.nextLine();

        System.out.println("Doriti Camere cu microfon? (true/false):");
        boolean areMicrofon = scanner.nextBoolean();
        
        scanner.nextLine();
       
        System.out.println("\nCamere video care indeplinesc conditiile:");
        for (CameraVideo camera : camere) {
            if (camera.haveMicrofonn() == areMicrofon && camera.compatibilitateSO.contains(sistemOperare)) {
                System.out.println(camera.obtineDetalii());
            }
        }

        //  MICROFON parcurgere cu for each loop
     /**System.out.println();
        System.out.println("Introduceti sistemul de operare (ex: Windows, MacOS):");
        sistemOperare = scanner.nextLine();

        System.out.println("Doriti Microfoane conferinta? (true/false):");
        boolean esteConferinta = scanner.nextBoolean();
        
        scanner.nextLine();
        
        System.out.println("\nMicrofoane care îndeplinesc condițiile:");
        for (Microfon microfon : microfoane) {
            if (microfon.compatibilitateSO.contains(sistemOperare) && microfon.isConferinta() == esteConferinta) {
                System.out.println(microfon.obtineDetalii());
            }
        }
    }
    **/
        //MICROFON
        System.out.println("\nMicrofon");
        System.out.println("Introduceti sistemul de operare (ex: Windows, MacOS):");
        sistemOperare = scanner.nextLine();

        System.out.println("Doriti Microfoane conferinta? (true/false):");
        boolean esteConferinta = scanner.nextBoolean();

        scanner.nextLine();

        System.out.println("\nMicrofoane care indeplinesc conditiile:");
            for (int i = 0; i < microfoane.size(); i++) {
                Microfon microfon = microfoane.get(i); 
             if (microfon.compatibilitateSO.contains(sistemOperare) && microfon.isConferinta() == esteConferinta) {
                System.out.println(microfon.obtineDetalii());
            }
        }
    }
}