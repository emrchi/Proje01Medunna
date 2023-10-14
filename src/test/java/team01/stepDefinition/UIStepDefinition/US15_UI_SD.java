package team01.stepDefinition.UIStepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import team01.pages.AdminPages;
import team01.utilities.Driver;
import team01.utilities.ReusableMethods;

import javax.swing.*;

import static org.junit.Assert.*;
import static team01.utilities.JSUtils.setValueByJS;
import static team01.utilities.ReusableMethods.scroll;
import static team01.utilities.ReusableMethods.waitForVisibility;

public class US15_UI_SD {
    AdminPages page = new AdminPages();
    Faker faker = new Faker();
    public static String patientId;
    Select select;

    @Given("Anasayfaya git")
    public void anasayfayaGit() {
        Driver.getDriver().get("https://www.medunna.com/");
    }

    @And("Anasayfaya gidildigini dogrula")
    public void anasayfayaGidildiginiDogrula() {
        assertEquals("WELCOME TO MEDUNNA", page.homePageVerify.getText());
    }

    @And("Items&Titles butonuna tikla")
    public void itemsTitlesButonunaTikla() {
        ReusableMethods.bekle(2);
        page.itemsTitles.click();
    }

    @And("Admin olarak giris yapildigini dogrula")
    public void adminOlarakGirisYapildiginiDogrula() {
        waitForVisibility(page.adminPageVerify, 20);
        assertTrue(page.adminPageVerify.isDisplayed());
    }

    @And("Patient yazisinin gorunurlulugunu dogrula")
    public void patientYazisininGorunurlulugunuDogrula() {
        assertTrue(page.patientText.isDisplayed());
    }

    @And("Patient yazisina tikla")
    public void patientYazisinaTikla() {
        ReusableMethods.click(page.patientText);
    }

    @And("Patient sayfasinin acildigini dogrula")
    public void patientSayfasininAcildiginiDogrula() {
        assertTrue(page.patientTitle.getText().contains("Patients"));
    }

    @And("Create a new Patient butonuna tikla")
    public void createANewPatientButonunaTikla() {
        ReusableMethods.click(page.createNewPatient);
    }

    @And("First Name alanina isim gir")
    public void firstNameAlaninaIsimGir() {
        ReusableMethods.bekle(2);
        page.firstNamePatient.sendKeys(faker.name().firstName());
    }

    @And("Last Name alanina soyisim gir")
    public void lastNameAlaninaSoyisimGir() {
        ReusableMethods.bekle(2);
        page.lastNamePatient.sendKeys(faker.name().lastName());
    }


    @And("Birth Date alanina dogum tarihi gir")
    public void birthDateAlaninaDogumTarihiGir() {
        ReusableMethods.bekle(2);
        page.birthDatePatient.sendKeys("05/28/1999");
    }

    @And("Email alanina email gir")
    public void emailAlaninaEmailGir() {
        page.emailPatient.sendKeys(faker.internet().emailAddress());
    }

    @And("Phone alanina phone gir")
    public void phoneAlaninaPhoneGir() {
        page.phonePatient.sendKeys(ReusableMethods.randomPhone());
    }

    @And("Gender'in defoult olarak geldigini dogrula")
    public void genderInDefoultOlarakGeldiginiDogrula() {
        assertFalse(page.genderPatient.getText().isEmpty());
    }

    @And("Gender alaninda gender sec")
    public void genderAlanindaGenderSec() {
        select = new Select(page.genderPatient);
        select.selectByVisibleText("FEMALE");
    }

    @And("Blood Group'un defoult olarak geldigini dogrula")
    public void bloodGroupUnDefoultOlarakGekdiginiDogrula() {
        assertFalse(page.bloodGroupPatient.getText().isEmpty());
    }

    @And("Blood Group alaninda kan grubu sec")
    public void bloodGroupAlanindaKanGrubuSec() {
        select = new Select(page.bloodGroupPatient);
        select.selectByVisibleText("B+");
    }

    @And("Address alanina adres gir")
    public void addressAlaninaAdresGir() {
        page.addressPatient.sendKeys(faker.address().fullAddress());
    }

    @And("Description alanina desciption gir")
    public void descriptionAlaninaDesciptionGir() {
        page.descriptionPatient.sendKeys(faker.funnyName().name());
    }

    @And("User alaninada user sec")
    public void userAlaninadaUserSec() {
        select = new Select(page.userPatient);
        select.selectByIndex(1);
    }

    @And("Country alanindan US state sec")
    public void countryAlanindanUSStateSec() {
        select = new Select(page.countryPatient);
        select.selectByVisibleText("USA");
    }

    @And("Country alanindan US state secildigini dogrula")
    public void countryAlanindanUSStateSecildiginiDogrula() {
        assertTrue(page.countryPatient.getText().contains("US"));
    }
    @And("Save butonuna tikla")
    public void saveButonunaTikla() {
        ReusableMethods.click(page.savePatientAndRoom);
    }

    @And("Basarili bir sekilde patient eklendigini dogrula")
    public void basariliBirSekildePatientEklendiginiDogrula() {
        assertTrue(page.savedVerify.getText().contains("A new Patient is created with identifier"));
        patientId = page.savedVerify.getText().replaceAll("[^0-9]", "");
    }

    @And("Patients listin altinda son sayfaya git butonuna tikla")
    public void patientsListinAltindaSonSayfayaGitButonunaTikla() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(page.sonSayfa);
    }

    @And("Patients listesinde en son sayfada olusturulan patient'in eklendigini dogrula")
    public void patientsListesindeEnSonSayfadaOlusturulanPatientInEklendiginiDogrula() {
        ReusableMethods.scroll(page.sonUserVerify);
        ReusableMethods.bekle(2);
        assertTrue(page.sonPatientId.getText().contains(patientId));
    }

    @And("This field is required.\\(First Name )")
    public void thisFieldIsRequiredFirstName() {
        assertTrue(page.thisFieldIsInvalidPatient.get(0).getText().contains("This field is required."));
    }

    @And("This field is required.\\(Last Name)")
    public void thisFieldIsRequiredLastName() {
        assertTrue(page.thisFieldIsInvalidPatient.get(1).getText().contains("This field is required."));
    }

    @And("Your email is required.\\(Email)")
    public void yourEmailIsRequiredEmail() {
        assertTrue(page.thisFieldIsInvalidPatient.get(2).getText().contains("Your email is required."));
    }

    @And("Phone number is required.\\(Phone)")
    public void phoneNumberIsRequiredPhone() {
        assertTrue(page.thisFieldIsInvalidPatient.get(3).getText().contains("Phone number is required."));
    }

    @And("Patient eklenemedigini dogrula")
    public void patientEklenemediginiDogrula() {
        assertFalse(page.savedVerify.getText().contains("A new Patient is created with identifier"));
    }

    @And("First Name alanina tek karakter gir")
    public void firstNameAlaninaTekKarakterGir() {
        page.firstNamePatient.sendKeys("a");
    }

    @And("Last Name alanina tek karakter gir")
    public void lastNameAlaninaTekKarakterGir() {
        page.lastNamePatient.sendKeys("a");
    }

    @And("Olusturulan patientin edit butonuna tikla")
    public void olusturulanPatientinEditButonunaTikla() {
        ReusableMethods.scroll(page.editPatientAndRoom);
        ReusableMethods.click(page.editPatientAndRoom);
    }

    @And("First Name alanini sil")
    public void firstNameAlaniniSil() {
        page.firstNamePatient.clear();
    }

    @And("Last Name alanini sil")
    public void lastNameAlaniniSil() {
        page.lastNamePatient.clear();
    }

    @And("Birth Date alanina farkli dogum tarihi gir")
    public void birthDateAlaninaFarkliDogumTarihiGir() {
        page.birthDatePatient.sendKeys(ReusableMethods.fakeBirthDate("dd.mm.yyyy"));
    }

    @And("Email alanini sil")
    public void emailAlaniniSil() {
        page.emailPatient.clear();
    }

    @And("Phone alanini sil")
    public void phoneAlaniniSil() {
        page.phonePatient.clear();
    }

    @And("Gender alaninda farkli gender sec")
    public void genderAlanindaFarkliGenderSec() {
        select = new Select(page.genderPatient);

        if (page.genderPatient.getText().contains("FEMALE")) {
            select.selectByVisibleText("MALE");
        } else select.selectByVisibleText("FEMALE");
    }

    @And("Blood Group alaninda farkli Blood Group sec")
    public void bloodGroupAlanindaFarkliBloodGroupSec() {
        select = new Select(page.bloodGroupPatient);
        select.selectByVisibleText("A+");
    }

    @And("Address alanina Address gir")
    public void addressAlaninaAddressGir() {
        page.addressPatient.sendKeys("Tatlikuyu");
    }

    @And("Description alanina Description gir")
    public void descriptionAlaninaDescriptionGir() {
        page.descriptionRoomEdit.sendKeys("Team01 icin ayrilmistir");
    }

    @And("User alanindan User sec")
    public void userAlanindanUserSec() {
        select = new Select(page.userPatient);
        select.selectByIndex(5);
    }
    @And("Email alanina @ isareti olmadan email gir")
    public void emailAlaninaIsaretiOlmadanEmailGir() {
        page.emailPatient.sendKeys(faker.name().firstName());
    }
    @And("Email alanina {string} ekle")
    public void emailAlaninaEkle(String str) {
        page.emailPatient.sendKeys(str);
    }
    @And("Olusturulan patientin delete butonuna tikla")
    public void olusturulanPatientinDeleteButonunaTikla() {
        ReusableMethods.click(page.deletePatientAndRoom);
    }
    @And("Patientin basarili bir sekilde silindigini dogrula")
    public void patientinBasariliBirSekildeSilindiginiDogrula() {
        assertTrue(page.savedVerify.getText().contains("A Patient is deleted with identifier"));
    }
    @And("Birth Date alanina ileri tarih gir")
    public void birthDateAlaninaIleriTarihGir() {
        page.birthDatePatient.sendKeys("10.10.2025");
    }
    @And("Phone number is invalid yazisinin gorundugunu dogrula")
    public void phoneNumberIsInvalidYazisininGorundugunuDogrula() {
        assertTrue( page.thisFieldIsInvalidPatient.get(0).getText().contains("Phone number is invalid"));
    }
    @And("First Name alanina rakam gir")
    public void firstNameAlaninaRakamGir() {
        page.firstNamePatient.sendKeys("458974");
    }
    @And("Last Name alanina rakam gir")
    public void lastNameAlaninaRakamGir() {
        page.lastNamePatient.sendKeys("458974");
    }
    @And("Patientin basarili bir sekilde editlendigini dogrula")
    public void patientinBasariliBirSekildeEditlendiginiDogrula() {
        assertTrue(page.savedVerify.getText().contains("A Patient is updated with identifier"));
    }
    @And("State-City alanianda kent sec")
    public void stateCityAlaniandaKentSec() {
        select = new Select(page.statePatient);
        select.selectByVisibleText("TEXAS");
    }
    @Then("{string} yazisini dogrula")
    public void yazisiniDogrula(String str) {
        waitForVisibility(page.thisFieldIsInvalidPatient.get(0),10);
        scroll(page.thisFieldIsInvalidPatient.get(0));
        assertEquals(str, page.thisFieldIsInvalidPatient.get(0).getText());
    }
    @When("Phone alanina {string} gir")
    public void phoneAlaninaGir(String phone) {
        page.phonePatient.sendKeys(phone);
    }
}
