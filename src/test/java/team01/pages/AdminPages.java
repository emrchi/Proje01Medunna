package team01.pages;

import org.openqa.selenium.support.PageFactory;
import team01.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AdminPages {

    public AdminPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Rana 15-215







































































































































































































    //Rana 215
    //Zeynep 216























































































































    //Zeynep 336
    //Sinem 337-370
    @FindBy(xpath = " //*[text()='Items&Titles']")
    public WebElement item;
    @FindBy(xpath = " (//*[text()='Country'])[1]")
    public WebElement country;
    @FindBy(xpath = "//*[text()='Create a new Country']")
    public WebElement creatCountry;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement dogrulamaYazisi;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement deleteButton;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement silmeDogrulama;
    @FindBy(linkText = "State/City")
    public WebElement stateCity;
    @FindBy(linkText = "Create a new State/City")
    public WebElement cretaStateCity;
    @FindBy(xpath = "//input[@id='c-state-name']")
    public WebElement stateName;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement stateCitySave;
    @FindBy(xpath = "//select[@name='state.id']")
    public WebElement stateId;






    //Sinem 370
    //Hamza 371-600
































}
