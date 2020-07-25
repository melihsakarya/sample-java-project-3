package com.testinium.egitim.inh2;

public class Calisan {

    public Calisan(){
        System.out.println("Calisan() constructor calisti");
    }

    private String ad;
    private String soyad;
    private Long sicilNo;

    public final void calis(){
        System.out.println(ad + " " + soyad + " calisiyor");
    }

    public void maasAl(){
        System.out.println(ad + " " + soyad + " maasini  ay sonunda aliyor ");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Long getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(Long sicilNo) {
        this.sicilNo = sicilNo;
    }
}
