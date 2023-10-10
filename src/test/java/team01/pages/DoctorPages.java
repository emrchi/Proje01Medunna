package team01.pages;

import org.openqa.selenium.support.PageFactory;
import team01.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class DoctorPages {

    public DoctorPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Yasemin 15-115
    @FindBy(xpath="//span[text()='MY PAGES']")
    public WebElement myPagesY;

    @FindBy(xpath="//span[text()='My Appointments']")
    public WebElement myAppointmentsY;

    @FindBy(xpath="(//span[text()='Edit'])[5]")
    public WebElement patientEditY;

    @FindBy(xpath="//a[@class='btn btn-success btn-sm' and text()='Request A Test']")
    public WebElement requestATestY;

    @FindBy(xpath="//table")
    public WebElement tableY;

    @FindBy(xpath="//span[text()='Save']")
    public WebElement saveTestY;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement successTestY;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement failTestY;

    @FindBy(xpath="//a[@class='btn btn-danger btn-sm' and text()='Show Test Results']")
    public WebElement showTestResultsY;

    @FindBy(xpath="//td[a[text()='16279']]/../td[7]//span")
    public WebElement viewResultsY;






































































    //Yasemin 115
    //Merve 116-200



















































































    //Merve 200

}
