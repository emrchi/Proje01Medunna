package team01.stepDefinition.UIStepDefinition;

import io.cucumber.java.en.And;
import team01.pages.AdminPages;
import team01.utilities.Driver;
import team01.utilities.ReusableMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US18_UI_SD {
    AdminPages adminPages = new AdminPages();

    @And("Clicks on Physician")
    public void clicksOnPhysician() {
        ReusableMethods.click(adminPages.physcian);
    }

    @And("Clicks on +Create a new Physician")
    public void clicksOnCreateANewPhysician() {
        ReusableMethods.click(adminPages.createANewItem);
    }

    @And("Click on the use search box")
    public void clickOnTheUseSearchBox() {
        ReusableMethods.click(adminPages.useSearch);
    }

    @And("Enter a {string} in the SSN field")
    public void enterAInTheSSNField(String ssnNumber) {
        adminPages.searchSSN.sendKeys(ssnNumber);
    }

    @And("Click on the Search User")
    public void clickOnTheSearchUser() {
        ReusableMethods.click(adminPages.searchUser);
    }

    @And("Clear and enter a Birth date {string}")
    public void clearAndEnterABirthDate(String birthDate) {
        adminPages.physicianBirthDate.clear();
        adminPages.physicianBirthDate.sendKeys(birthDate);
    }

    @And("Enter a phone number {string}")
    public void enterAPhoneNumber(String phoneNumber) {
        adminPages.physicianPhoneNumber.sendKeys(phoneNumber);
    }

    @And("Enter a Address information {string}")
    public void enterAAddressInformation(String adress) {
        adminPages.physicianAdress.sendKeys(adress);
    }

    @And("Select Gender")
    public void selectGender() {
        ReusableMethods.ddmValue(adminPages.physicianGender, "MALE");
    }

    @And("Select Speciality")
    public void selectSpeciality() {
        ReusableMethods.ddmValue(adminPages.physicianSpeciality, "PSYCHIATRY");
    }

    @And("Select Blood Group")
    public void selectBloodGroup() {
        ReusableMethods.ddmIndex(adminPages.physicianBloodGroup, 4);
    }

    @And("Enter a description {string}")
    public void enterADescription(String description) {
        adminPages.physicianDescription.sendKeys(description);
    }


    @And("Upload the image")
    public void uploadTheImage() {
        // ReusableMethods.click(adminPages.physicianChooseFile);
        String imagePath = "C:\\Users\\90553\\Desktop\\260520231-1080x720.jpg";
        //ReusableMethods.uploadFile(imagePath);
        adminPages.physicianChooseFile.sendKeys(imagePath);


    }

    @And("Enter a Exam Fee {string}")
    public void enterAExamFee(String examFee) {
        adminPages.physicianExamFee.clear();
        adminPages.physicianExamFee.sendKeys(examFee);
    }

    @And("Select the Country")
    public void selectTheCountry() {
        ReusableMethods.ddmVisibleText(adminPages.physicianCountry,"USA");
    }

    @And("Select the State or City")
    public void selectTheStateOrCity() {
        ReusableMethods.ddmVisibleText(adminPages.physicianState,"NEWYORK");
    }

    @And("Click on the edit of the ssn number {string}")
    public void clickOnTheEditOfTheSsnNumber(String ssnNumber) {
        ReusableMethods.click(adminPages.physicianEdit);
    }

    @And("Clicks on physcian Created Date")
    public void clicksOnPhyscianCreatedDate() {
        ReusableMethods.click(adminPages.physicianCreatedDate);
        ReusableMethods.bekle(5);
    }

    @And("Clear and enter a new first name {string}")
    public void clearAndEnterANewFirstName(String editPhysician) {
        adminPages.physicianFirstName.clear();
        adminPages.physicianFirstName.sendKeys(editPhysician);
    }

    @And("Clear and enter a new last name {string}")
    public void clearAndEnterANewLastName(String lastName) {
        adminPages.physicianLastName.clear();
        adminPages.physicianLastName.sendKeys(lastName);
    }

    @And("Clear and enter new Birth date {string}")
    public void clearAndEnterNewBirthDate(String newBirthDate) {
        adminPages.physicianBirthDate.clear();
        adminPages.physicianBirthDate.sendKeys(newBirthDate);
    }

    @And("Clear and enter a new Phone Number {string}")
    public void clearAndEnterANewPhoneNumber(String newPhoneNumber) {
        adminPages.physicianPhoneNumber.clear();
        adminPages.physicianPhoneNumber.sendKeys(newPhoneNumber);
    }

    @And("Clear and enter a new Address {string}")
    public void clearAndEnterANewAddress(String newAdress) {
        adminPages.physicianAdress.clear();
        adminPages.physicianAdress.sendKeys(newAdress);
    }
    @And("Select new Speciality")
    public void selectNewSpeciality() {
        ReusableMethods.ddmVisibleText(adminPages.physicianSpeciality,"Family_medicine");
    }

    @And("Select new Blood Group")
    public void selectNewBloodGroup() {
        ReusableMethods.ddmIndex(adminPages.physicianBloodGroup, 5);

    }

    @And("Clear and enter a new Description {string}")
    public void clearAndEnterANewDescription(String newDescription) {
        adminPages.physicianDescription.clear();
        adminPages.physicianDescription.sendKeys(newDescription);
    }

    @And("Clear and upload a new image")
    public void clearAndUploadANewImage() {
        adminPages.physicianChooseFile.clear();
        String newImagePath="C:\\Users\\90553\\Desktop\\mecnunçınar.jpg";
        adminPages.physicianChooseFile.sendKeys(newImagePath);
    }

    @And("Clear and enter a new Exam Fee {string}")
    public void clearAndEnterANewExamFee(String newExamFee) {
        adminPages.physicianExamFee.clear();
        adminPages.physicianExamFee.sendKeys(newExamFee);
    }

    @And("Select the new Country")
    public void selectTheNewCountry() {
        ReusableMethods.ddmVisibleText(adminPages.physicianCountry,"Turkey");
    }

    @And("Click on the view of the ssn number {string}")
    public void clickOnTheViewOfTheSsnNumber(String ssnNumber) {
        ReusableMethods.click(adminPages.physicianView);
    }


    @And("Click on the Delete of the one with the ssn number {string}")
    public void clickOnTheDeleteOfTheOneWithTheSsnNumber(String ssnNumber) {
        ReusableMethods.click(adminPages.physicianDelete);
    }
}
