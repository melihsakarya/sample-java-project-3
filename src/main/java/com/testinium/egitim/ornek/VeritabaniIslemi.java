package com.testinium.egitim.ornek;

public class VeritabaniIslemi {

    private void baglan(){
        System.out.println("Veritabanina baglandi...");
    }

    public void kayitYap(){
        baglan();
        System.out.println("Kaydi yapiyorum...");
        baglantiKes();
    }

    private void baglantiKes(){
        System.out.println("Veritabani baglantisi kesildi...");
    }
}
