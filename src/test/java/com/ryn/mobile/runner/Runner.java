package com.ryn.mobile.runner;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Runner {
    private static WebDriver webDriver;
    private static AndroidDriver appiumDriver;


    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.secure.cryptovpn");
        cap.setCapability("appActivity", "de.blinkt.openvpn.activities.LaunchActivity");
        cap.setCapability("noReset", false);

        URL rynVpn = new URL("http://localhost:4723/wd/hub");
        appiumDriver = new AndroidDriver(rynVpn, cap);
    }

    @After
    public void tearDown() {
        appiumDriver.quit();
    }

    public static AndroidDriver appiumDriver() {
        return appiumDriver;
    }
}

