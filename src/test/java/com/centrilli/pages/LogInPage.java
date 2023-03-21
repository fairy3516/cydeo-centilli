package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
public LogInPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}
@FindBy(xpath="//input[@name='login']")
public WebElement EmailBox;

@FindBy(xpath="//input[@name='password']")
public WebElement PasswordBox;

@FindBy(xpath="//button[.='Log in']")
public WebElement LogInButton;

}
