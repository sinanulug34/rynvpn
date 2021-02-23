package com.ryn.mobile.stepdefs;

import com.ryn.mobile.runner.Runner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseStepDef {
    public AppiumDriver appiumDriver = Runner.appiumDriver();
    private static final int wait = 15;


    public void sendKeys(By element, String text) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, getWait());
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys(text);
    }

    public void clickButton(By button) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, getWait());
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
    }

    public void clickElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, getWait());
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public boolean isElementDisplayed(By element) {
        try {
            return appiumDriver.findElement(element).isDisplayed();
        } catch (WebDriverException e) {
            return false;
        }
    }

    public static int getWait() {
        return wait;
    }
    public List<WebElement> findElements(By element) {
        return appiumDriver.findElements(element);
    }

    public void waitElementInvisible(By element) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, getWait());
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public String getElementText(By element){
        return appiumDriver.findElement(element).getText();
    }

    public void back(By element) {
        appiumDriver.findElement(element).click();
    }
    public boolean isSelectedElement(By element){
      return appiumDriver.findElement(element).isEnabled();
    }
}
