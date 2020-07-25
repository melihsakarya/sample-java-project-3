package com.testinium.egitim.ornek;

public class Ornek {

    public Ornek(String mesaj, int mesajSayisi){
        for (int i = 0; i < mesajSayisi; i++) {
            //System.out.println(mesaj);
        }
    }

    public Ornek(String mesaj){
        this(mesaj, 1);
        //System.out.println(mesaj);
    }

}
