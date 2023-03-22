package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {

    public CreatePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//button[@accesskey='c']")
    public WebElement CreateButton;

    @FindBy(xpath="//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement ModalNameButton;

    @FindBy(xpath="//input[@class='o_input ui-autocomplete-input']")
    public WebElement MakeButton;

    @FindBy(xpath="//button[@accesskey='s']")
    public WebElement SaveButton;

    @FindBy(xpath="//button[.='Create and edit']")
    public WebElement CreateAndEditButton;

    @FindBy(xpath="//button[@class='btn btn-sm btn-primary']")
    public WebElement InSaveButton;



}
