package com.ait.testpool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "")//добавить локатор для поля
    WebElement email;

    @FindBy(id = "")//добавить локатор для поля
    WebElement password;

    @FindBy(id = "")//добавить локатор для поля
    WebElement loginButton;

    public ProfilePage loginPositive(String uEmail,String uPassword) {
        type(email,uEmail);
        type(password,uPassword);
        click(loginButton);

        return new ProfilePage(driver);
    }

    public LoginPage loginNegative(String uEmail,String uPassword) {
        type(email,uEmail);
        type(password,uPassword);
        click(loginButton);

        return this;
    }
}
