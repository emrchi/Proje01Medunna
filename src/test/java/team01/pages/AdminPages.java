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
    //@FindBy(xpath = "(//button[@type='button'])[4]")
    //public WebElement deleteButton;
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
    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement itemsAndTitles;
    @FindBy(xpath = "(//a[@role='menuitem'])[5]")
    public WebElement testItem;
    @FindBy(id = "jh-create-entity")
    public WebElement createANewItem;
    @FindBy(id="c-test-item-name")
    public WebElement testItemName;
    @FindBy(id="c-test-item-description")
    public WebElement testItemDescription;
    @FindBy(id="c-test-item-price")
    public WebElement testItemPrice;
    @FindBy(id="c-test-item-defaultValMin")
    public WebElement defaultMinValue;
    @FindBy(id="c-test-item-defaultValMax")
    public WebElement defaultMaxValue;
    @FindBy(id="save-entity")
    public WebElement testItemSave;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement verifyText;
    @FindBy(xpath = "(//th//span)[7]")
    public WebElement createdDate;
    @FindBy(xpath = "(//td[text()='Blood Test']/../td[8]//span)[4]")
    public WebElement testItemEdit;
    @FindBy(xpath = "(//td[text()='Hemogram']/../td[8]//span)[2]")
    public WebElement testItemView;
    @FindBy(xpath = "(//td[text()='Hemogram']/../td[8]//span)[6]")
    public WebElement testItemDelete;
    @FindBy(xpath = "//dd[text()='Hemogram']")
    public WebElement viewTestItemName;
    @FindBy(xpath = "//dd[text()='Control']")
    public WebElement viewTestItemDescription;
    @FindBy(xpath = "//dd[text()='150']")
    public WebElement viewTestItemPrice;
    @FindBy(xpath = "//dd[text()='13.1 g/dL']")
    public WebElement viewDefaultMinValue;
    @FindBy(xpath = "//dd[text()='17.2 g/dL']")
    public WebElement viewDefaultMaxValue;
    @FindBy(xpath = "//dd//span")
    public WebElement viewCreatedDate;
    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement testItemBack;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement AlertDeleteButton;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidPrice;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement emptyTestItemName;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement emptyTestItemPrice;
    @FindBy(xpath = "(//a[@role='menuitem'])[3]")
    public WebElement physcian;
    @FindBy(id="useSSNSearch")
    public WebElement useSearch;
    @FindBy(id="searchSSN")
    public WebElement searchSSN;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUser;
    @FindBy(id="physician1-birthDate")
    public WebElement physicianBirthDate;
    @FindBy(id="physician-phone")
    public WebElement physicianPhoneNumber;
    @FindBy(id="physician-adress")
    public WebElement physicianAdress;
    @FindBy(id="physician-gender")
    public WebElement physicianGender;
    @FindBy(id="physician-speciality")
    public WebElement physicianSpeciality;
    @FindBy(id="physician-bloodGroup")
    public WebElement physicianBloodGroup;
    @FindBy(id="physician-description")
    public WebElement physicianDescription;
    @FindBy(id="file_image")
    public WebElement physicianChooseFile;
    @FindBy(id="physician-examFee")
    public WebElement physicianExamFee;
    @FindBy(id="physician-country")
    public WebElement physicianCountry;
    @FindBy(id="physician-cstate")
    public WebElement physicianState;
    @FindBy(xpath = "(//a[@role='menuitem'])[2]")
    public WebElement staff;
    @FindBy(id="staff-birthDate")
    public WebElement staffBirthDate;
    @FindBy(xpath = "(//td[text()='444-55-7878']/../td[18]//span)[4]")
    public WebElement physicianEdit;
    @FindBy(xpath = "(//th//span)[13]")
    public WebElement physicianCreatedDate;
    @FindBy(id = "physician-firstName")
    public WebElement physicianFirstName;
    @FindBy(id = "physician-lastName")
    public WebElement physicianLastName;
    @FindBy(xpath = "(//td[text()='444-55-7878']/../td[18]//span)[2]")
    public WebElement physicianView;
    @FindBy(xpath = "(//td[text()='444-55-7878']/../td[18]//span)[6]")
    public WebElement physicianDelete;
    @FindBy(id="staff-phone")
    public WebElement staffPhoneNumber;
    @FindBy(id="staff-gender")
    public WebElement staffGender;
    @FindBy(id="staff-bloodGroup")
    public WebElement staffBloodGroup;
    @FindBy(id="staff-adress")
    public WebElement staffAdress;
    @FindBy(id="staff-description")
    public WebElement staffDescription;
    @FindBy(id="staff-country")
    public WebElement staffCountry;
    @FindBy(id="staff-cstate")
    public WebElement staffState;
    @FindBy(xpath = "(//th//span)[11]")
    public WebElement staffCreatedDate;
    @FindBy(xpath = "(//td[text()='444-44-2727']/../td[15]//span)[4]")
    public WebElement staffEdit;
    @FindBy(id="staff-firstName")
    public WebElement staffFirstName;
    @FindBy(id="staff-lastName")
    public WebElement staffLastName;
    @FindBy(xpath = "(//td[text()='444-44-2727']/../td[15]//span)[2]")
    public WebElement staffView;
    @FindBy(xpath = "//dd[text()='444-44-2727']")
    public WebElement viewStaffSsn;
    @FindBy(xpath = "//dd[text()='Ceylin']")
    public WebElement viewStaffFirstName;
    @FindBy(xpath = "//dd[text()='Erguvan Kaya']")
    public WebElement viewStaffLastName;
    @FindBy(xpath = "(//dd//span)[1]")
    public WebElement viewStaffBirthDate;
    @FindBy(xpath = "//dd[text()='5554443322']")
    public WebElement viewStaffPhoneNumber;
    @FindBy(xpath = "//dd[text()='FEMALE']")
    public WebElement viewStaffGender;
    @FindBy(xpath = "//dd[text()='Apositive']")
    public WebElement viewStaffBloodGroup;
    @FindBy(xpath = "//dd[text()='Istanbul']")
    public WebElement viewStaffAdress;
    @FindBy(xpath = "//dd[text()='Yargı']")
    public WebElement viewStaffDescription;
    @FindBy(xpath = "(//dd//span)[2]")
    public WebElement viewStaffCreatedDate;
    @FindBy(xpath = "//dd[text()='muslera25']")
    public WebElement viewStaffUser;
    @FindBy(xpath = "//dd[text()='USA']")
    public WebElement viewStaffCountry;
    @FindBy(xpath = "//dd[text()='NEWYORK']")
    public WebElement viewStaffState;
    @FindBy(xpath = "(//td[text()='444-44-2727']/../td[15]//span)[6]")
    public WebElement staffDelete;

}
