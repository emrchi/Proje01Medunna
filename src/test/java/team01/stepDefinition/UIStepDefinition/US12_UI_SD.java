package team01.stepDefinition.UIStepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import team01.pages.DoctorPages;
import team01.utilities.ConfigReader;
import team01.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import team01.utilities.JSUtils;
import team01.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class US12_UI_SD {
    DoctorPages doctorPages=new DoctorPages();
    @Given("Doktor {string} sayfasina gider")
    public void doktor_sayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("Doktor My Pages sekmesine tiklar")
    public void doktor_my_pages_sekmesine_tiklar() {
        doctorPages.myPagesY.click();

    }
    @Then("Doktor cikan menüde My Appointments sekmesine tiklar")
    public void doktor_cikan_menüde_my_appointments_sekmesine_tiklar() {
        doctorPages.myAppointmentsY.click();
        ReusableMethods.bekle(2);

    }
    @And("Doktor sayfada hastanin yanindaki edit butonuna tiklar")
    public void doktor_sayfada_hastanin_yanindaki_edit_butonuna_tiklar(DataTable data) {
        WebElement patientEditY=Driver.getDriver().findElement(By.xpath("(//td[a[text()='"+data.row(1).get(0)+"']]/../td[13]//span)[2]"));
        JSUtils.scrollIntoViewJS(patientEditY);
        ReusableMethods.bekle(2);
        JSUtils.clickElementByJS(patientEditY);
    }

    @And("Doktor Request a Test butonuna tiklar")
    public void doktor_request_a_test_butonuna_tiklar() {
        ReusableMethods.bekle(2);
        JSUtils.scrollIntoViewJS(doctorPages.requestATestY);
        JSUtils.clickElementByJS(doctorPages.requestATestY);

    }

    @And("Doktor test iceriginde gerekli verilerin görüngügünü dogrular")
    public void doktor_test_iceriginde_gerekli_verilerin_göründügünü_dogrular(DataTable data) {
        int columnIndex = 1;
        List<String> columnData = null;
        List<WebElement> columnCells = doctorPages.tableY.findElements(By.xpath(".//tr/td[" + (columnIndex + 1) + "]"));
        if (!columnCells.isEmpty()) {
            columnData = new ArrayList<>();

            for (WebElement cell : columnCells) {
                columnData.add(cell.getText());
            }
            assertTrue(columnData.contains(data.row(1).get(0)));
            assertTrue(columnData.contains(data.row(2).get(0)));
            assertTrue(columnData.contains(data.row(3).get(0)));
            assertTrue(columnData.contains(data.row(4).get(0)));
            assertTrue(columnData.contains(data.row(5).get(0)));
            assertTrue(columnData.contains(data.row(6).get(0)));
            assertTrue(columnData.contains(data.row(7).get(0)));
            assertTrue(columnData.contains(data.row(8).get(0)));
        }
    }


    @And("Doktor test secer;")
    public void doktor_test_secer(DataTable data) {
        WebElement testClickY=Driver.getDriver().findElement(By.xpath("//td[text()='"+data.row(1).get(0)+"']/../td[9]//input"));
        JSUtils.clickElementByJS(testClickY);
    }

    @And("Doktor save butonuna tiklar")
    public void doktor_save_butonuna_tiklar() {
        ReusableMethods.scroll(doctorPages.saveTestY);
        JSUtils.clickElementByJS(doctorPages.saveTestY);

    }

    @And("Doktor test talebinin basarili bir sekilde gerceklestirildigini dogrular")
    public void doktor_test_talebinin_basarili_bir_sekilde_gerceklestirildigini_dogrular() {
        ReusableMethods.waitForVisibility(doctorPages.successTestY,2);
        String successTest="A new Test is created with identifier";
        assertTrue(doctorPages.successTestY.getText().contains(successTest));
        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }

    @And("Doktor test talebinin gerceklesmedigini dogrular")
    public void doktorTestTalebininGerceklesmediginiDogrular() {
        ReusableMethods.waitForVisibility(doctorPages.failTestY,2);
        String failTest="Test item list can not be empty";
        assertTrue(doctorPages.failTestY.getText().contains(failTest));
        ReusableMethods.bekle(3);
    }

    @And("Doktor sayfayi kapatir")
    public void doktorSayfayiKapatir() {
        Driver.getDriver().quit();
    }
}
