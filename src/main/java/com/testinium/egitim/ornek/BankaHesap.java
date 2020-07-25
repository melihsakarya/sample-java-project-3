package com.testinium.egitim.ornek;

public class BankaHesap {

    //static ve public olmamali
    //public static Double para = 100.0;
    private Double para = 100.0;

    public void paraCek(Double miktar){
        if(miktar > this.para){
            System.out.println(miktar + " için limitiniz yetersiz");
        }
        else {
            para -= miktar;
        }
    }

    public void paraYatir(Double miktar){
        para += miktar;
    }

    public void bakiyeYazdir(){
        System.out.println(this.para);
    }



    //100 tane öğrencinin olduğu ve
    // 0-100 arasinda rasgele ortalamalarının olduğu bir liste yapmanızı istiyorum
    // Bu öğrencileri en başarılıdan itibaren notları ile yazdirin

    //Ogrenci -> Ad, Soyad, Not ortalamasi
}
