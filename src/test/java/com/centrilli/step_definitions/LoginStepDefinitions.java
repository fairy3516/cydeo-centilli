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

    @When("user enters email enter password and login")
    public void userEntersEmailEnterPasswordAndLogin() {
        logInPage.EmailBox.sendKeys("posmanager10@info.com");
        logInPage.PasswordBox.sendKeys("posmanager");
        logInPage.LogInButton.click();

    }

    @Then("user is on the Centrilli page")
    public void userIsOnTheCentrilliPage() throws InterruptedException {
  Thread.sleep(5000);
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("#Inbox - Odoo"));
    }

    @And("user clicks more icon")
    public void userClicksMoreIcon() throws InterruptedException {
        Thread.sleep(5000);
        logInPage.MoreIcon.click();
    }

    @And("user clicks fleet icon")
    public void userClicksFleetIcon() throws InterruptedException {
        Thread.sleep(5000);
        logInPage.FleetIcon.click();
    }



    @Then("user clicks vehicle model button")
    public void userClicksVehicleModelButton() throws InterruptedException {
        Thread.sleep(5000);
        logInPage.VehicleModel.click();
    }


    @Then("user is on the vehicle create page")
    public void userIsOnTheVehicleCreatePage() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Vehicles - Odoo"));
    }


}
