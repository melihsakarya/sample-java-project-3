package com.testinium.egitim.inh4;

public abstract class Veritabani {

    private void baglan(){
        System.out.println("Veritabani baglantisi yapildi");
    }

    protected abstract void sorgu();

    public void bilgiGetir(){
        baglan();
        sorgu();
        baglantiKes();
    }

    private void baglantiKes(){
        System.out.println("Veritabani baglantisi kesildi");
    }
}
