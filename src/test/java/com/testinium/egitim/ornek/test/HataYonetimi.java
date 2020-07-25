package com.testinium.egitim.ornek.test;

import org.junit.Test;

import java.io.*;

public class HataYonetimi {

    @Test
    public void ornekTest(){
        try {
            File dosya = new File("/Users/melihsakarya/sample.txt");
            BufferedReader dosyaOkuma = new BufferedReader(new FileReader(dosya));
            System.out.println(dosyaOkuma.readLine());
            dosyaOkuma.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Dosya okunamiyor");
        }
        catch (IOException e){
            System.out.println("Dosya üzerine yazilamiyor");
        }
        finally {

        }
    }

    @Test
    public void test2() throws IOException {
        File dosya = new File("/Users/melihsakarya/sample.txt");
        BufferedReader dosyaOkuma = new BufferedReader(new FileReader(dosya));
        System.out.println(dosyaOkuma.readLine());
        dosyaOkuma.close();
    }
}
