package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


    public class MyOddoPage {

        public MyOddoPage(){

            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
        public WebElement Database;

        @FindBy(id = "login")
        public WebElement Email;

        @FindBy(id = "password")
        public WebElement Password;

        @FindBy(xpath = "//button[@class='btn btn-primary']")
        public WebElement LoginBtn;

        @FindBy(css="span[class=oe_topbar_name]")
        public WebElement ManufacturingManager5;


        @FindBy (xpath = "//li[@class='o_user_menu open']//a[@data-menu='account']")
        public WebElement MyOdooAccount;

        @FindBy (xpath = "//a[@class='dropdown-toggle waves']")
        public WebElement NameOnAccount;

        @FindBy(id="login")
        public WebElement OdooUserNameInput;

        @FindBy (id="password")
        public WebElement OdooPasswordInput;

        @FindBy (css = "button[type=submit]")
        public WebElement OdooSignInBtn;

        @FindBy(xpath = "//div[@itemprop='address']//div[2]")
        public WebElement userEmailDispalyed;

        @FindBy(xpath = "//a[@class='dropdown-toggle waves']")
        public WebElement fullNameDisplayed;

        @FindBy (xpath = "//a[@class='list-group-item list-group-item-action d-flex align-items-center justify-content-between']")
        public WebElement myOpportunities;

        @FindBy(xpath = "//span[@itemprop='streetAddress']")
        public WebElement displayedLocation;

        @FindBy(xpath = "//a[@role='button']")
        public WebElement editBtn;

        @FindBy(xpath = "//div[@class='o_portal_my_home']//h3")
        public WebElement yourDocumtens;


        @FindBy(xpath = "//a[@class='float-left o_logo']")
        public WebElement logo;


        public void OdooSignIn(){
            new WebDriverWait(Driver.getDriver(),10).until(ExpectedConditions.visibilityOf(OdooUserNameInput));
            OdooUserNameInput.sendKeys("zabitester@gmail.com");
            OdooPasswordInput.sendKeys("Hamdam123");
            OdooSignInBtn.click();
        }

        public void toOdoo(){
            ManufacturingManager5.click();
            MyOdooAccount.click();
        }
        public void LoginManager() throws InterruptedException {
            Thread.sleep(2000);

            Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //??????????????????????????? rabotaet c Driver.geDriver or not
            Database.click();
            Email.sendKeys(ConfigurationReader.getProperty("managerUser"));
            Password.sendKeys(ConfigurationReader.getProperty("managerPassword"));
            LoginBtn.click();
            System.out.println("Login as a Manager");

        }

    }
