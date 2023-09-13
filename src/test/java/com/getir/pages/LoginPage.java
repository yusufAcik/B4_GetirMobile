package com.getir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id="com.getir.casestudy.dev:id/usernameEditText")
    public WebElement usernameInput;

    @FindBy(id="com.getir.casestudy.dev:id/passwordEditText")
    public WebElement passwordInput;
}
