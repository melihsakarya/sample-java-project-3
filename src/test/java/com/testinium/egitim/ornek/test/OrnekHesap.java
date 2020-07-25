package com.testinium.egitim.ornek.test;

import com.testinium.egitim.ornek.BankaHesap;
import org.junit.Test;

import java.util.Arrays;

public class OrnekHesap {

    @Test
    public void paraCek(){
        BankaHesap hesap1 = new BankaHesap();
        hesap1.bakiyeYazdir();

        hesap1.paraCek(20.0);
        hesap1.bakiyeYazdir();

        hesap1.paraYatir(50.0);
        hesap1.bakiyeYazdir();

        hesap1.paraCek(200.0);
        hesap1.bakiyeYazdir();

    }

    @Test
    public void paraIslem() {
        BankaHesap hesap1 = new BankaHesap();
        BankaHesap hesap2 = new BankaHesap();

        hesap1.bakiyeYazdir();
        hesap2.bakiyeYazdir();

        hesap1.paraCek(20.0);
        hesap2.paraYatir(50.0);

        hesap1.bakiyeYazdir();
        hesap2.bakiyeYazdir();


    }
}
