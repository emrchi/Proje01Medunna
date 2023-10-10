package team01.pages;

import org.openqa.selenium.support.PageFactory;
import team01.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class StaffPages {
    public StaffPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Merve 15-100
    @FindBy(css = "#entity-menu")
    public WebElement myPagesButton;

    @FindBy(xpath = "//*[text()='Search Patient']")
    public WebElement searchPatient;

    @FindBy(css = ".form-control")
    public WebElement ssnSearchBox;

    @FindBy(xpath = "//span[text()='View']")
    public WebElement patientViewButton;

    @FindBy(xpath = "(//dd)[1]")
    public WebElement viewPatientSsn;

    @FindBy(xpath = "(//dd)[2]")
    public WebElement viewPatientFirstName;

    @FindBy(xpath = "(//dd)[3]")
    public WebElement viewPatientLastName;

    @FindBy(xpath = "(//dd)[5]")
    public WebElement viewPatientEmail;

    @FindBy(xpath = "(//dd)[11]")
    public WebElement viewPatientUsername;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement patientEditButton;

    @FindBy(xpath = "//*[@type='text']")
    public List<WebElement> patientEditList;

    @FindBy(css = "#patient-description")
    public WebElement patientDescription;

















































    //Omer 100-200




















































































    //Omer 200



}
