package com.testinium.egitim.ornek.test.sln;


import org.junit.Test;

public class LoginYeniOrnek extends BaseTest {

    @Test
    public void login2Test(){

        getURL("https://www.gittigidiyor.com/uye-girisi");
        setById("L-UserNameField", "melih");
        setById("L-PasswordField", "123456");
        clickById("gg-login-enter");

    }
}
