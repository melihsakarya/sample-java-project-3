package com.testinium.egitim.ornek.test.inh;

import com.testinium.egitim.inh.Ogrenci;
import com.testinium.egitim.inh.Ogretmen;
import org.junit.Test;

public class InheritanceTest {

    @Test
    public void inhTest(){
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Melih";
        ogrenci.soyad = "Sakarya";
        ogrenci.yas = 39;
        ogrenci.bolum = "Matematik";
        ogrenci.notOrtalamasi = 78;
        ogrenci.tcKimlik = 13123L;
        ogrenci.konus();
        ogrenci.sinavaGir();

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.ad = "Ahmet";
        ogretmen.soyad = "Dursun";
        ogretmen.brans = "Fizik";
        ogretmen.tcKimlik = 12313L;
        ogretmen.konus();
    }
}
