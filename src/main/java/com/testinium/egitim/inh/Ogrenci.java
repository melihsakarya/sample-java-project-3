package com.testinium.egitim.inh;

public class Ogrenci extends Insan{

    public String bolum;
    public Integer notOrtalamasi;

    public void sinavaGir(){
        System.out.println(ad + " " + soyad + " " + bolum + " bolumu için sinava giriyor");
    }

    @Override
    public void konus() {
        //super.konus();
        System.out.println("Ogrenci sadece soz verildiğinde konusur...");
    }
}
