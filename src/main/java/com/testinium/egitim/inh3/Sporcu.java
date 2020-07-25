package com.testinium.egitim.inh3;

public abstract class Sporcu {

    public abstract void sporYap();

    public void musabakayaGir(){
        System.out.println("kayit yap");
        sporYap();
        System.out.println("sonuc bekle");
    }
}
