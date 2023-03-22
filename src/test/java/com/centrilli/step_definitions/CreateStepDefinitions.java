package com.centrilli.step_definitions;

import com.centrilli.pages.CreatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateStepDefinitions {

    CreatePage createPage=new CreatePage();

    @When("user clicks create button")
    public void user_clicks_create_button() throws InterruptedException {
        Thread.sleep(5000);
        createPage.CreateButton.click();
    }
    @When("user write Artun to Model name field")
    public void user_write_artun_to_model_name_field() {
        createPage.ModalNameButton.sendKeys("Artun");
    }
    @When("user clicks Make field and write Artun")
    public void user_clicks_make_field_and_write_artun() {
        createPage.MakeButton.sendKeys("Artun");
        createPage.MakeButton.click();
    }


    @And("user clicks save button")
    public void userClicksSaveButton() {
    createPage.SaveButton.click();
    }

    @And("user clicks create and edit button")
    public void userClicksCreateAndEditButton() {
        createPage.CreateAndEditButton.click();
    }

    @And("user clicks Save{int} button")
    public void userClicksSaveButton(int arg0) throws InterruptedException {
        Thread.sleep(5000);
    createPage.InSaveButton.click();
    }



}
