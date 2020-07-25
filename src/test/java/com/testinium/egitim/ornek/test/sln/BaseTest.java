package com.testinium.egitim.ornek.test.sln;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    @Before
    public void baglantiSagla(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");
    }

    @After
    public void baglantiKes(){
        driver.quit();
    }

    public void setById(String id, String value){
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public void clickById(String id){
        driver.findElement(By.id(id)).click();
    }

    public void getURL(String URL){
        driver.get(URL);
    }
}
