package com.centrilli.step_definitions;

import com.centrilli.pages.LogInPage;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefinitions {

    LogInPage logInPage=new LogInPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.centrilli.com/web/login");

    }
    @When("user enters {string} to the email box")
    public void userEntersToTheEmailBox(String arg0) {
        logInPage.EmailBox.sendKeys("posmanager10@info.com");
    }

    @And("user enters posmanager to the password box")
    public void userEntersPosmanagerToThePasswordBox() {
        logInPage.PasswordBox.sendKeys("posmanager");
    }

    @And("user clicks to the login button")
    public void userClicksToTheLoginButton() {
        logInPage.LogInButton.click();
    }

    @Then("user is on the Centrilli page")
    public void userIsOnTheCentrilliPage() throws InterruptedException {
  Thread.sleep(5000);
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("https://qa.centrilli.com/web?#menu_id=115&action=120&active_id=channel_inbox"));
    }



}
