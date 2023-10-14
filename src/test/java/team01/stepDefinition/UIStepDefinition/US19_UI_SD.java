package team01.stepDefinition.UIStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import team01.pages.AdminPages;
import team01.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US19_UI_SD {
        AdminPages adminPages=new AdminPages();
    @And("Clicks on Staff")
    public void clicksOnStaff() {
        ReusableMethods.click(adminPages.staff);

    }

    @And("Clicks on +Create a new Staff")
    public void clicksOnCreateANewStaff() {
        ReusableMethods.click(adminPages.createANewItem);
    }

    @And("Clear and enter a Birth date as staff {string}")
    public void clearAndEnterABirthDateAsStaff(String birthDate) {
        adminPages.staffBirthDate.clear();
        adminPages.staffBirthDate.sendKeys(birthDate);
    }

    @And("Enter a phone number staff {string}")
    public void enterAPhoneNumberStaff(String phoneNumber) {
        adminPages.staffPhoneNumber.sendKeys(phoneNumber);

    }

    @And("Select staff Gender {string}")
    public void selectStaffGender(String gender) {
        ReusableMethods.ddmVisibleText(adminPages.staffGender,gender);
    }


    @And("Select Staff Blood Group {string}")
    public void selectStaffBloodGroup(String bloodGroup) {
        ReusableMethods.ddmVisibleText(adminPages.staffBloodGroup,bloodGroup);
    }

    @And("Enter a Staff Address information {string}")
    public void enterAStaffAddressInformation(String adress) {
        adminPages.staffAdress.sendKeys(adress);
    }

    @And("Enter a Staff description {string}")
    public void enterAStaffDescription(String description) {
        adminPages.staffDescription.sendKeys(description);
    }

    @And("Select the Country {string}")
    public void selectTheCountry(String country) {
        ReusableMethods.ddmVisibleText(adminPages.staffCountry,country);
    }

    @And("Select the State or City {string}")
    public void selectTheStateOrCity(String state) {
        ReusableMethods.ddmVisibleText(adminPages.staffState,state);
    }

    @And("Clicks on staff Created Date")
    public void clicksOnStaffCreatedDate() {
        ReusableMethods.click(adminPages.staffCreatedDate);
    }

    @And("Click on the edit of the staff ssn number {string}")
    public void clickOnTheEditOfTheStaffSsnNumber(String ssnNumber) {
       ReusableMethods.click(adminPages.staffEdit);
    }

    @And("Clear and enter a new first name")
    public void clearAndEnterANewFirstName() {
        adminPages.staffFirstName.clear();
        adminPages.staffFirstName.sendKeys("Ceylin");
    }

    @And("Clear and enter a new last name")
    public void clearAndEnterANewLastName() {
        adminPages.staffLastName.clear();
        adminPages.staffLastName.sendKeys("Erguvan Kaya");
    }

    @And("Clear and enter new Phone number")
    public void clearAndEnterNewPhoneNumber() {
        adminPages.staffPhoneNumber.clear();
        adminPages.staffPhoneNumber.sendKeys("5554443322");
    }

    @And("Clear and enter a new Address")
    public void clearAndEnterANewAddress() {
        adminPages.staffAdress.clear();
        adminPages.staffAdress.sendKeys("Istanbul");
    }

    @And("Clear and enter a new Description")
    public void clearAndEnterANewDescription() {
        adminPages.staffDescription.clear();
        adminPages.staffDescription.sendKeys("Yargı");
    }

    @And("Click on the view of the staff ssn number {string}")
    public void clickOnTheViewOfTheStaffSsnNumber(String ssnNumber) {
        ReusableMethods.click(adminPages.staffView);
    }

    @Then("Verify that the ssn number is visible")
    public void verifyThatTheSsnNumberIsVisible() {
        assertTrue(adminPages.viewStaffSsn.isDisplayed());
    }

    @And("Verify that the First Name is visible")
    public void verifyThatTheFirstNameIsVisible() {
        assertTrue(adminPages.viewStaffFirstName.isDisplayed());
    }

    @And("Verify that the Last Name is visible")
    public void verifyThatTheLastNameIsVisible() {
        assertTrue(adminPages.viewStaffLastName.isDisplayed());
    }

    @And("Verify that the Birth Date is visible")
    public void verifyThatTheBirthDateIsVisible() {
        assertTrue(adminPages.viewStaffBirthDate.isDisplayed());
    }

    @And("Verify that the Phone is visible")
    public void verifyThatThePhoneIsVisible() {
        assertTrue(adminPages.viewStaffPhoneNumber.isDisplayed());
    }

    @And("Verify that the Gender is visible")
    public void verifyThatTheGenderIsVisible() {
        assertTrue(adminPages.viewStaffGender.isDisplayed());
    }

    @And("Verify that the Blood Group is visible")
    public void verifyThatTheBloodGroupIsVisible() {
        assertTrue(adminPages.viewStaffBloodGroup.isDisplayed());
    }

    @And("Verify that the Adress is visible")
    public void verifyThatTheAdressIsVisible() {
        assertTrue(adminPages.viewStaffAdress.isDisplayed());
    }

    @And("Verify that the Description is visible")
    public void verifyThatTheDescriptionIsVisible() {
        assertTrue(adminPages.viewStaffDescription.isDisplayed());
    }

    @And("Verify that the Created Date is visible")
    public void verifyThatTheCreatedDateIsVisible() {
        assertTrue(adminPages.viewStaffCreatedDate.isDisplayed());
    }

    @And("Verify that the User is visible")
    public void verifyThatTheUserIsVisible() {
        assertTrue(adminPages.viewStaffUser.isDisplayed());
    }

    @And("Verify that the Country is visible")
    public void verifyThatTheCountryIsVisible() {
        assertTrue(adminPages.viewStaffCountry.isDisplayed());
    }

    @And("Verify that the State or City is visible")
    public void verifyThatTheStateOrCityIsVisible() {
        assertTrue(adminPages.viewStaffState.isDisplayed());
    }

    @And("Click on the Delete of the one with the staff ssn number {string}")
    public void clickOnTheDeleteOfTheOneWithTheStaffSsnNumber(String ssnNumber) {
        ReusableMethods.click(adminPages.staffDelete);
        ReusableMethods.bekle(5);
    }
}
