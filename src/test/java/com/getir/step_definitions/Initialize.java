package com.getir.step_definitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Initialize {

    public static AndroidDriver driver;

    @Before
    public void setUp(){
initializeDriver();
//driver.resetApp();
    }
    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Thread.sleep(3000);
       //  driver.closeApp();
    }

    public void initializeDriver(){
        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setVersion("11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");

        capabilities.setCapability("appPackage","com.getir.casestudy.dev");
        capabilities.setCapability("appActivity","com.getir.casestudy.modules.main.ui.SplashActivity");

        try {
            driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
        }catch (MalformedURLException e) {
       e.printStackTrace(); }
        }


    }

    /**
     * C:\Users\ASUS>adb shell
     * generic_x86_arm:/ $ dumpsys window | grep -E mCurrentFocus
     *    mCurrentFocus=Window{4ed24c1 u0 com.getir.casestudy.dev/com.getir.casestudy.modules.main.ui.MainActivity}
     * generic_x86_arm:/ $
     */

