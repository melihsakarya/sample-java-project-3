package com.testinium.egitim.inh4;

public class MusteriVeritabani extends Veritabani{
    @Override
    public void sorgu() {
        System.out.println("select * from Musteri");
    }
}
