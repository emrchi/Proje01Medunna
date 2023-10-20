package team01.stepDefinition.UIStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import team01.pages.PatientPages;
import team01.utilities.ConfigReader;
import team01.utilities.Driver;
import team01.utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US24_UI_SD {
    PatientPages patientPages=new PatientPages();
    @When("my pagesa tiklayip my apointments i sec")
    public void myPagesaTiklayipMyApointmentsISec() {
        patientPages.myPages.click();
        patientPages.myAppointments.click();
    }

    @And("show test {string} bölümlerini gor")
    public void showTestBölümleriniGor(String arg0) {
     patientPages.fromDate.sendKeys("03.10.2023");
     patientPages.toDate.sendKeys("12.10.2023");
     patientPages.showTest.click();
   ReusableMethods.click(patientPages.showResult);

        assertFalse( ReusableMethods.getTableData(null, 1).isEmpty());
        assertFalse( ReusableMethods.getTableData(null, 2).isEmpty());
        assertFalse( ReusableMethods.getTableData(null, 3).isEmpty());
        assertFalse( ReusableMethods.getTableData(null, 4).isEmpty());
        assertFalse( ReusableMethods.getTableData(null, 5).isEmpty());
        assertFalse( ReusableMethods.getTableData(null, 6).isEmpty());
        assertFalse( ReusableMethods.getTableData(null, 7).isEmpty());
        assertFalse( ReusableMethods.getTableData(null, 8).isEmpty());



    }



    @Given("{string} sayfasina git")
    public void sayfasinaGit(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @Then("show invoice'e tikla ve faturayi gor")
    public void showInvoiceETiklaVeFaturayiGor() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        patientPages.fromDate.sendKeys("03.10.2023");
        patientPages.toDate.sendKeys("12.10.2023");
        patientPages.showInvoice.click();
        patientPages.inVoice.click();
       assertFalse(patientPages.totalCost.isEmpty());






    }

    @And("sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();
    }
}