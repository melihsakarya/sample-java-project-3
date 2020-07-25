package com.testinium.egitim.inh2;

public class Yazilimci extends Calisan{

    public Yazilimci(){
        System.out.println("Yazilimci() constructor calisti");
    }

    public void programYaz(){
        System.out.println(getAd() + " " + getSoyad() + " program yaziyor");
    }
    public void dokumanYaz(){
        System.out.println(getAd() + " " + getSoyad() + " dokuman yaziyor");
    }

    public void raporHazirla(){
        System.out.println(getAd() + " " + getSoyad() + " rapor hazirliyor");
    }


}
