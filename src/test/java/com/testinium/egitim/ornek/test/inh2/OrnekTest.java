package com.testinium.egitim.ornek.test.inh2;

import com.testinium.egitim.inh2.Calisan;
import com.testinium.egitim.inh2.GenelMudur;
import com.testinium.egitim.inh2.Mudur;
import com.testinium.egitim.inh2.Yazilimci;
import org.junit.Test;

public class OrnekTest {

    @Test
    public void ornekTest(){
        Yazilimci yazilimci = new Yazilimci();
        yazilimci.setAd("Melih");
        yazilimci.setSoyad("Sakarya");
        yazilimci.setSicilNo(12345L);
        yazilimci.calis();
        yazilimci.programYaz();
        yazilimci.raporHazirla();

        Mudur mudur = new Mudur();
        mudur.setAd("Ahmet");
        mudur.setSoyad("Dursun");
        mudur.setSicilNo(2222L);
        mudur.yonet();
        mudur.raporIste();

        GenelMudur genelMudur = new GenelMudur();
        genelMudur.setAd("Ali");
        genelMudur.setSoyad("Sakarya");
        genelMudur.setSicilNo(44444L);
        genelMudur.yonet();
        genelMudur.denetle();

        girisKontrol(yazilimci);
        girisKontrol(mudur);
        girisKontrol(genelMudur);
    }


    public void girisKontrol(Calisan calisan){
        if(calisan instanceof Yazilimci){
            System.out.println("Arge girisini de gerceklistir");
        }
        System.out.println(calisan.getAd() + " " + calisan.getSoyad() + " sirkete giris yapti");
    }


    // Sporcu
    // Futbolcu, Basketbolcu, Santranç Oyuncusu

}
