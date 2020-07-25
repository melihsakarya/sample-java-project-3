package com.testinium.egitim.inh2;

public class Mudur extends Calisan{

    public void yonet(){
        System.out.println(getAd() + " " + getSoyad() + " ekibini yonetiyor");
    }

    public void projeHazirla(){
        System.out.println(getAd() + " " + getSoyad() + " projelerini hazirliyor");
    }

    public void raporIste(){
        System.out.println(getAd() + " " + getSoyad() + " departman calisanlarindan rapor istiyor");
    }

}
