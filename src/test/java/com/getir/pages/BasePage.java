package com.getir.pages;

import com.getir.step_definitions.Initialize;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    public AndroidDriver driver;
    public WebDriverWait wait;
    public BasePage() {
        this.driver= Initialize.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
