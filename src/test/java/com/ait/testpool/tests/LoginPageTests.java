package com.ait.testpool.tests;

import com.ait.testpool.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        new LoginPage(driver)
                .loginPositive(
                        "",
                        "");//"mayadmin@gmail.com", "Qwerty123$"
    }
}
