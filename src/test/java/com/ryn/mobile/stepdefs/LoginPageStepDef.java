package com.ryn.mobile.stepdefs;

import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPageStepDef extends BaseStepDef {
    final By useForFreeButton = By.id("btn_use_for_fee");
    final By closePopUp = By.xpath("//android.widget.ImageButton[@content-desc=\"Interstitial close button\"]");
    final By connectText = By.id("tv_vpn_status");
    final By gameText = By.id("tv_server_type_game_name");
    final By streamText = By.id("tv_server_type_streaming_name");
    final By stream = By.id("tv_server_type_streaming_name");
    final By remainingTimeLeft = By.id("tv_remaining_title");
    final By remaining = By.id("remaining");
    final By serverType = By.id("txt_choose_server");
    final By connectButton = By.id("img_bg_btn_connection");
    final By connectionRequestApprove = By.id("android:id/button1");
    final By continueButton = By.id("android:id/button1");
    final By connectionRequestCancel = By.id("android:id/button2");
    final By tryPremiumButton = By.id("lyt_premium");
    final By selectPlanElement = By.id("tv_dialog_title");
    final By monthlySubscription = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Monthly Subscription']");
    final By threeMonthsSubscription = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Three Months']");
    final By halfYearlySubscription = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Half Yearly Subscription']");
    final By streamingServers = By.id("tv_server_type");
    final By serverCountryIcon = By.xpath("//android.widget.FrameLayout[@resource-id='com.secure.cryptovpn:id/cv_server_country']");
    final By unitedKingdom = By.id("//android.widget.TextView[@text='UNITED KINGDOM']");
    final By startYour7DaysFreeTrialButton = By.id("btn_start_trial");
    final By offlineSubscription = By.id("btn_enter_secret_key");
    final By secretKey = By.id("secret_key");
    final By secretKeyEnterButton = By.id("send_key");
    final By AllowRYNVPNButton = By.id("\t\n" +
            "com.android.permissioncontroller:id/permission_allow_button");

    @When("I click connection request approve")
    public void clickRequestApprove() {
        clickButton(connectionRequestApprove);
    }
    @When("I fill secret key")
    public void fillSecretKey(){
        sendKeys(secretKey,"20");
    }
    @When("I click Allow button")
    public void allowButton() throws InterruptedException {
        clickButton(AllowRYNVPNButton);
        Thread.sleep(8000);
    }
    @When("I click enter button")
    public void clickEnterKeyButton(){
        clickButton(secretKeyEnterButton);
    }
    @When("I click offline subscription")
    public void clickOfflineSubscription(){
        clickButton(offlineSubscription);
    }
    @When("I click start your 7 days free trial button")
    public void click7Days(){
        clickButton(startYour7DaysFreeTrialButton);
    }
    @When("I click any server")
    public void clickServer(){
        clickButton(unitedKingdom);
    }

    @Then("I must be able to see as streaming servers")
    public void seeStreamingServers() {
        isElementDisplayed(streamingServers);
    }
    @Then("I must be able to see server country icon")
    public void seeServerCountryIcon(){
        isElementDisplayed(serverCountryIcon);
    }

    @When("I click stream button")
    public void clickStreamButton() throws InterruptedException {
        clickButton(stream);
        Thread.sleep(10000);
    }

    @When("I click continue button")
    public void continueButton() throws InterruptedException {
        clickButton(continueButton);
        Thread.sleep(10000);
    }

    @When("I click try premium button")
    public void clickTryPremium() {
        clickButton(tryPremiumButton);
    }

    @When("I must be able to see select plan element")
    public void seeSelectPlanElement() {
        isElementDisplayed(selectPlanElement);
        Assert.assertEquals(true, isElementDisplayed(selectPlanElement));
    }

    @When("I click close popup")
    public void clickPopUp() throws InterruptedException {
        clickButton(closePopUp);
        Thread.sleep(10000);
    }

    @When("I click connection request cancel")
    public void clickRequestCancel() {
        clickButton(connectionRequestCancel);
    }

    @When("I click use for free button")
    public void clickUseForFreeButton() throws InterruptedException {
        clickButton(useForFreeButton);
        Thread.sleep(4000);
    }

    @When("I click connect button")
    public void clickConnectButton() {
        clickButton(connectButton);
    }

    @Then("I must be able to see text as connect")
    public void seeConnectText() {
        isElementDisplayed(connectText);
    }

    @Then("I must be able to see text as game")
    public void seeGameText() {
        isElementDisplayed(gameText);
    }

    @Then("I must be able to see monthly subscription")
    public void seeMonthlySubscription() {
        isElementDisplayed(monthlySubscription);
    }

    @Then("I must be able to see three months subscription")
    public void seeThreeMonthsSubscription() {
        isElementDisplayed(threeMonthsSubscription);
    }

    @Then("I must be able to see half yearly subscription")
    public void seeHalfYearlySubscription() {
        isElementDisplayed(halfYearlySubscription);
    }


    @Then("I must be able to see text as stream")
    public void seeStreamText() {
        isElementDisplayed(streamText);
    }

    @Then("I must be able to see text as time left")
    public void seeTimeLeftText() {
        isElementDisplayed(remainingTimeLeft);
    }

    @Then("I must be able to see text as server location")
    public void seeServerTypeText() {
        isElementDisplayed(serverType);
    }

    @When("I click back button")
    public void clickBackButton() throws InterruptedException {
        appiumDriver.pressKey(new KeyEvent(AndroidKey.BACK));
        appiumDriver.pressKey(new KeyEvent(AndroidKey.BACK));
       Thread.sleep(30000);
    }
}
