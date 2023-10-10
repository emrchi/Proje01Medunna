package team01.stepDefinition.UIStepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import team01.pages.StaffPages;
import team01.utilities.ConfigReader;
import team01.utilities.Driver;
import team01.utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.*;

public class US09_UI_SD {
    StaffPages staffPages = new StaffPages();
    SoftAssert softAssert = new SoftAssert();
    static Faker faker = new Faker();

    public static String idNumber = ""+faker.number().randomNumber(5,true);
    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String phoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
    public static String address = faker.address().city();
    public static String description = faker.address().city();

    @Given("user goes to homepage")
    public void userGoesToHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("waits for {int} seconds")
    public void waitsForSeconds(int second) {
        ReusableMethods.bekle(second);
    }

    @And("clicks on My Pages")
    public void clicksOnMyPages() {
        staffPages.myPagesButton.click();
    }

    @And("clicks on Search Patient")
    public void clicksOnSearchPatient() {
        staffPages.searchPatient.click();
    }

    @Then("verifies patient information sections are seen")
    public void verifiesPatientInformationSectionsAreSeen(DataTable data) {
        for (int i = 1; i < data.asList().size() ; i++) {
            //getTableData(null,i).forEach(t-> System.out.println(t.getText()));
            assertFalse(getTableData(null,i).isEmpty());
        }

    }

    @And("closes the page")
    public void closesThePage() {
        Driver.closeDriver();
    }

    @And("enters Patient SSN in the search box")
    public void entersPatientSSNInTheSearchBox() {
        staffPages.ssnSearchBox.sendKeys(ConfigReader.getProperty("patientSSN1"));
    }

    @And("clicks on View button")
    public void clicksOnViewButton() {
        staffPages.patientViewButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("verifies registration info is populated")
    public void verifiesRegistrationInfoIsPopulated(DataTable data) {
        ReusableMethods.bekle(2);
      for (String w : data.asList()){
          switch (w){
              case("SSN"):
                  assertTrue(staffPages.viewPatientSsn.isDisplayed());
                  break;
              case("First Name"):
                  assertTrue(staffPages.viewPatientFirstName.isDisplayed());
                  break;
              case("Last Name"):
                  assertTrue(staffPages.viewPatientLastName.isDisplayed());
                  break;
              case("Username"):
                  assertTrue(staffPages.viewPatientUsername.isDisplayed());
                  break;
              case("Email"):
                  assertTrue(staffPages.viewPatientEmail.isDisplayed());
                  break;
          }

        }

    }

    @And("clicks on Edit button")
    public void clicksOnEditButton() {
        ReusableMethods.scroll(staffPages.patientEditButton);
        ReusableMethods.bekle(2);
        staffPages.patientEditButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("verifies patient information can be editted by entering new information")
    public void verifiesPatientInformationCanBeEdittedByEnteringNewInformation(DataTable data) {
        for (String w : data.asList()){
            String delete = Keys.chord(Keys.CONTROL, "a",Keys.BACK_SPACE);
            switch (w){
                case("ID"):
                    staffPages.patientEditList.get(0).sendKeys(delete,idNumber);
                    ReusableMethods.bekle(1);
                    assertEquals(idNumber,staffPages.patientEditList.get(0).getText());
                    break;
                case("First Name"):
                    staffPages.patientEditList.get(1).sendKeys(delete,firstName);
                    ReusableMethods.bekle(1);
                    assertEquals(firstName,staffPages.patientEditList.get(1).getText());
                    break;
                case("Last Name"):
                    staffPages.patientEditList.get(2).sendKeys(delete,lastName);
                    ReusableMethods.bekle(1);
                    assertEquals(lastName,staffPages.patientEditList.get(2).getText());
                    break;
                case("Phone"):
                    staffPages.patientEditList.get(3).sendKeys(delete,phoneNumber);
                    ReusableMethods.bekle(1);
                    assertEquals(phoneNumber,staffPages.patientEditList.get(3).getText());
                    break;
                case("Address"):
                    staffPages.patientEditList.get(4).sendKeys(delete,address);
                    ReusableMethods.bekle(1);
                    assertEquals(address,staffPages.patientEditList.get(4).getText());
                    break;
                case("Description"):
                    staffPages.patientDescription.sendKeys(delete,description);
                    ReusableMethods.bekle(1);
                    assertEquals(description,staffPages.patientDescription.getText());
                    break;
            }

        }
    }

    @Then("verifies patient information can be editted by selecting different values from default")
    public void verifiesPatientInformationCanBeEdittedBySelectingDifferentValuesFromDefault() {
    }

    @And("clicks on Save button")
    public void clicksOnSaveButton() {
    }

    @Then("verifies “A patient is updated with identifier” text is seen")
    public void verifiesAPatientIsUpdatedWithIdentifierTextIsSeen() {
    }

    public static List<WebElement> getTableData(Integer row,Integer column){
        List<WebElement> infoList;
        if (row==null){
            infoList = Driver.getDriver().findElements(By.xpath("//tbody//td["+column+"]"));
        } else if (column == null) {
            infoList = Driver.getDriver().findElements(By.xpath("//tbody//tr["+row+"]"));
        }else {
            infoList = Driver.getDriver().findElements(By.xpath("//tbody//tr["+row+"]//td["+column+"]"));
        }
        return infoList;
    }


}
