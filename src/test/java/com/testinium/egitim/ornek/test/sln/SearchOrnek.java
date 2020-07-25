package com.testinium.egitim.ornek.test.sln;

import org.junit.Test;
import org.openqa.selenium.By;

public class SearchOrnek extends BaseTest{

    @Test
    public void ornekSearch(){
        driver.findElement(By.id("search_word")).sendKeys("Samsung");
        driver.findElement(By.id("textSearch_ara")).click();
    }

    @Test
    public void searcTest(){
        setById("search_word","Samsung");
        clickById("textSearch_ara");

        setById("search_word", "iphone");
        clickById("textSearch_ara");
    }
}
