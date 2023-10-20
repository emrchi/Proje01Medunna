package team01.pages;

import org.openqa.selenium.support.PageFactory;
import team01.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class PatientPages {

    public PatientPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Emre 15-100




















































































    //Emre 100
    //Sinem 101-150
@FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public  WebElement myPages;
    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;
   @FindBy(xpath = " //*[text()='Show Tests']")
    public WebElement showTest;
    @FindBy(xpath = "(//*[text()='View Results'])[1]")
    public WebElement showResult;
    @FindBy(xpath = "//div[@class='container-fluid view-container']")
    public List<WebElement> table;
    @FindBy(xpath = "//a[@class='btn btn-warning btn-sm']")
    public WebElement showInvoice;
    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement inVoice;
    @FindBy(xpath = "//tr[7]")
    public List<WebElement> totalCost;
@FindBy(xpath = "//input[@name='fromDate']")
public WebElement fromDate;
    @FindBy(xpath = "//input[@name='toDate']")
    public WebElement toDate;































    //Sinem 150
}