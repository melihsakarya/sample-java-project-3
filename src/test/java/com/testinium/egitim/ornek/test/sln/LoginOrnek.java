package com.testinium.egitim.ornek.test.sln;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrnek extends BaseTest{


    @Test
    public void loginTest(){

        driver.get("https://www.gittigidiyor.com/uye-girisi");
        driver.findElement(By.id("L-UserNameField")).sendKeys("melih");
        driver.findElement(By.id("L-PasswordField")).sendKeys("123456");
        driver.findElement(By.id("gg-login-enter")).click();


    }

    @Test
    public void login2Test(){

        getURL("https://www.gittigidiyor.com/uye-girisi");
        setById("L-UserNameField", "melih");
        setById("L-PasswordField", "123456");
        clickById("gg-login-enter");

    }



}
