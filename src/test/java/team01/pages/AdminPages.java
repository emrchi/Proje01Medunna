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
    @FindBy(xpath = "(//span)[23]")
    public WebElement adminPageVerify;//Rana Betül Türkmen
    @FindBy(xpath = "(//span)[11]")
    public WebElement itemsTitles;
    @FindBy(xpath = "//h1")
    public WebElement homePageVerify;
    @FindBy(xpath = "(//span)[12]")
    public WebElement patientText;
    @FindBy(xpath = "(//span)[27]")//(//*[.='Patients'])[1]
    public WebElement patientTitle;
    @FindBy(xpath = "(//span)[28]")
    public WebElement createNewPatient;
    @FindBy(xpath = "//input[@id=\"patient-firstName\"]")
    public WebElement firstNamePatient;
    @FindBy(xpath = "//input[@id=\"patient-lastName\"]")
    public WebElement lastNamePatient;
    @FindBy(css = "#patient-birthDate")
    public WebElement birthDatePatient;
    @FindBy(css = "#email")
    public WebElement emailPatient;
    @FindBy(css = "#patient-phone")
    public WebElement phonePatient;
    @FindBy(css = "#patient-gender")
    public WebElement genderPatient;
    @FindBy(css = "#patient-bloodGroup")
    public WebElement bloodGroupPatient;
    @FindBy(css = "#patient-adress")
    public WebElement addressPatient;
    @FindBy(css = "#patient-description")
    public WebElement descriptionPatient;
    @FindBy(css = "#patient-user")
    public WebElement userPatient;
    @FindBy(css = "#patient-country")
    public WebElement countryPatient;
    @FindBy(css = "#patient-cstate")
    public WebElement statePatient;
    @FindBy(css = "#save-entity")
    public WebElement savePatientAndRoom;
    @FindBy(xpath = "//div[@class=\"Toastify__toast Toastify__toast--success toastify-toast\"]")
    public WebElement savedVerify;
    @FindBy(xpath = "(//a[@class=\"page-link\"])[last()]")
    public WebElement sonSayfa;
    @FindBy(xpath = "(//tr)[last()]")
    public WebElement sonUserVerify;
    @FindBy(xpath = "(//a[@class=\"btn btn-link btn-sm\"])[last()]")
    public WebElement sonPatientId;
    @FindBy(xpath = "(//a[@class=\"btn btn-primary btn-sm\"])[last()]")
    public WebElement editPatientAndRoom;
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public List<WebElement> thisFieldIsInvalidPatient;
    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[2]")
    public WebElement thisFieldIsInvalidprice;
    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[1]")
    public WebElement thisFieldIsInvalidroomNumber;
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[last()]")
    public WebElement deletePatientAndRoom;
    @FindBy(xpath = "//*[.='Created Date']")
    public WebElement createdDateRoomTitle;
    @FindBy(xpath = "(//*[.='Delete'])[1]")
    public WebElement deletebuttonRoom;
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> idPatientList;
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> ssnPatientList;
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> firstNamePatientList;
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> lastNamePatientList;
    @FindBy(xpath = "//tr//td[5]")
    public List<WebElement> birthPatientList;
    @FindBy(xpath = "//tr//td[6]")
    public List<WebElement> phonePatientList;
    @FindBy(xpath = "//tr//td[7]")
    public List<WebElement> emailPatientList;
    @FindBy(xpath = "//tr//td[8]")
    public List<WebElement> genderPatientList;
    @FindBy(xpath = "//tr//td[9]")
    public List<WebElement> bloodPatientList;
    @FindBy(xpath = "//tr//td[10]")
    public List<WebElement> addressPatientList;
    @FindBy(xpath = "//tr//td[11]")
    public List<WebElement> descriptionPatientList;
    @FindBy(xpath = "//tr//td[12]")
    public List<WebElement> createdPatientList;
    @FindBy(xpath = "//tr//td[13]")
    public List<WebElement> userPatientList;
    @FindBy(xpath = "//tr//td[14]")
    public List<WebElement> countryPatientList;
    @FindBy(xpath = "//tr//td[15]")
    public List<WebElement> statePatientList;
    @FindBy(xpath = "(//span)[17]")
    public WebElement roomButton;
    @FindBy(xpath = "(//span)[27]")
    public WebElement roomTitle;
    @FindBy(xpath = "(//span)[28]")
    public WebElement createNewRoom;
    @FindBy(xpath = "//input[@id='room-roomNumber']")
    public WebElement roomNumber;
    @FindBy(id = "room-roomType")
    public WebElement roomTypeDdm;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    public WebElement statusRoom;
    @FindBy(id = "room-price")
    public WebElement priceRoom;
    @FindBy(id = "room-description")
    public WebElement descriptionRoom;
    @FindBy(id = "patient-description")
    public WebElement descriptionRoomEdit;
    @FindBy(id = "room-createdDate")
    public WebElement createdDateRoom;
    @FindBy(xpath = "(//span)[27]")
    public WebElement createoreditaRoom;
    @FindBy(xpath = "//button[@id=\"jhi-confirm-delete-room\"]")
    public WebElement deleteAlertRoom;
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> idRoomList;
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> roomNumberList;
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> roomTypeList;
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> statusRoomList;
    @FindBy(xpath = "//tr//td[5]")
    public List<WebElement> priceRoomList;
    @FindBy(xpath = "//tr//td[6]")
    public List<WebElement> descriptionRoomList;
    @FindBy(xpath = "//tr//td[7]")
    public List<WebElement> createdDateRoomList;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement deleteButton;




































































    //Rana 215
    //Zeynep 216























































































































    //Zeynep 336
    //Sinem 337-370
































    //Sinem 370
    //Hamza 371-600
































}
