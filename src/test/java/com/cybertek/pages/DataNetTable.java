package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataNetTable {
    public DataNetTable(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='New']")
    public WebElement newname;
    @FindBy(className = "DTE_Header")
    public WebElement header;
    @FindBy(className = "DTE_Form_Content")
    public WebElement form;
    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstname;
    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastname;
    @FindBy(id = "DTE_Field_position")
    public WebElement position;
    @FindBy(id = "DTE_Field_office")
    public WebElement office;
    @FindBy(id = "DTE_Field_start_date")
    public WebElement date;
    @FindBy(id = "DTE_Field_salary")
    public WebElement salaray;
    @FindBy(id = "DTE_Field_extn")
    public WebElement extention;
    @FindBy(xpath = "//button[.='Create']")
    public WebElement create;
    @FindBy (css = "input[type='search']")
    public WebElement search;
    @FindBy (className = "sorting_1")
    public WebElement result;

}
