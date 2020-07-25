package com.testinium.egitim.ornek.test;

import com.testinium.egitim.ornek.Ogrenci;
import com.testinium.egitim.ornek.Ornek;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class OrnekTest {

    @Test
    public void ornekTest(){
       Ornek o1 = new Ornek("Hello World", 4);
       Ornek o2 = new Ornek("Hello World", 10);

       //Ornek o3 = new Ornek();
       File f = new File("/Users/melihsakarya/dev/test.txt");
    }

    @Test
    public void ogrenciTest(){
        Ogrenci ogr = new Ogrenci("Melih");
        List<String> liste;
    }
}
