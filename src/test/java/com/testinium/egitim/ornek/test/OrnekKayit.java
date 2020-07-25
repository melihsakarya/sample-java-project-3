package com.testinium.egitim.ornek.test;

import com.testinium.egitim.ornek.VeritabaniIslemi;
import org.junit.Test;

public class OrnekKayit {

    @Test
    public void kayitTest(){
        VeritabaniIslemi vt = new VeritabaniIslemi();

        vt.kayitYap();

    }
}
