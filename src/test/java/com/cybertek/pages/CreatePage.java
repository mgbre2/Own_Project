package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;


    public class CreatePage {

        public CreatePage(){

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

        @FindBy(id="login")
        public WebElement OdooUserNameInput;

        @FindBy (id="password")
        public WebElement OdooPasswordInput;

        @FindBy (css = "button[type=submit]")
        public WebElement OdooSignInBtn;

        @FindBy(xpath = "//div[@class='o_thread_title']")
        public WebElement emptyMessage;

        @FindBy(xpath = "//img[@src='http://52.39.162.23/web/binary/company_logo?db=BriteErpDemo&company=1']")
        public WebElement briteErpLogo;

        @FindBy(xpath = "//li[.='Manufacturing Orders']")
        public WebElement ordersMessage;

        @FindBy(xpath = "//div[@itemprop='address']//div[2]")
        public WebElement userEmailDispalyed;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
        public WebElement createBtn;

        @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[3]")
        public WebElement manufactureLink;

        @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
        public WebElement importLink;

        @FindBy(xpath = "(//th[@class='o_column_sortable'])[4]")
        public WebElement materialsAvaillability;

        @FindBy(xpath = "//td[.='Partially Available']")
        public List<WebElement> partiallyAvaillable;

        @FindBy(xpath = "//input[@id='o_field_input_254']")
        public WebElement productName;

        @FindBy(xpath = "//input[@id='o_field_input_256']")
        public WebElement quantityToProduce;

        @FindBy(xpath = "(//input[@id='o_field_input_258']")
        public WebElement billsOfMaterials;

        @FindBy(xpath = "//input[@id='o_field_input_260']")
        public WebElement deadlineStart;

        @FindBy(xpath = "//input[@id='o_field_input_262']")
        public WebElement responsible;

        @FindBy(xpath = "(//div[@class='oe_secondary_menu'])[6]")
        public List<WebElement> etireLeftMenue;

        @FindBy(xpath = "//li[.='#Inbox']")
        public WebElement inboxMessage;

        @FindBy(xpath = "//span[.='ManufacturingManager']")
        public WebElement manufactureMannager;

        @FindBy(xpath = "//span[.='New']")
        public WebElement newLink;

        @FindBy(xpath = "//a[.='Finished Products']")
        public WebElement finishProducts;

        @FindBy(xpath = "//p")
        public WebElement finishText;

        @FindBy(xpath = "//input[@id='o_field_input_1689']")
        public WebElement productInfo;

        @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
        public WebElement productManualName;

        @FindBy(xpath = "(//span[@class='o_dropdown_button'])[1]")
        public WebElement spanBtn;

        @FindBy(xpath = "(//a[.='manta'])[1]")
        public WebElement manta;

        @FindBy(xpath = "//div[@class='modal-header']")
        public WebElement OdooServerError;

        @FindBy(xpath = "//input[@id='o_field_input_1691']")
        public WebElement quantityProduce;

        @FindBy(xpath = "//span[.='Create']")
        public WebElement createBillOfMaerialsBtn;

        @FindBy(xpath = "//input[@id='o_field_input_1698']")
        public WebElement sourceBox;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
        public WebElement saveButton;

        @FindBy(xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[3]")
        public WebElement linkToNextWindow;

        @FindBy(xpath = "//span[@name='login']")
        public WebElement userEmail;

        @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
        public WebElement manufacture;

        //

        public void toOdoo(){
            ManufacturingManager5.click();
            MyOdooAccount.click();
        }
        public void LoginManager() {

            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //??????????????????????????? rabotaet c Driver.geDriver or not
            Database.click();
            Email.sendKeys(ConfigurationReader.getProperty("email"));
            Password.sendKeys(ConfigurationReader.getProperty("password"));
            LoginBtn.click();
            System.out.println("Login as a Manager");

        }

        public void OdooSignIn(){
            OdooUserNameInput.sendKeys(ConfigurationReader.getProperty("OdooUserName"));
            OdooPasswordInput.sendKeys(ConfigurationReader.getProperty("OdooPassword"));
            OdooSignInBtn.click();
        }




    }
