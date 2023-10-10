package team01.stepDefinition.UIStepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import team01.pages.DoctorPages;
import team01.utilities.Driver;
import team01.utilities.JSUtils;
import team01.utilities.ReusableMethods;

public class US13_UI_SD {
    DoctorPages doctorPages=new DoctorPages();

    @And("Kullanici Show Test Results butonuna tiklar")
    public void kullaniciShowTestResultsButonunaTiklar() {
        ReusableMethods.bekle(2);
        JSUtils.scrollIntoViewJS(doctorPages.showTestResultsY);
        JSUtils.clickElementByJS(doctorPages.showTestResultsY);
    }

    @And("Kullanici testin yanindaki view Results butonuna tiklar")
    public void kullaniciTestinYanindakiViewResultsButonunaTiklar(DataTable data) {
        WebElement viewResultsY = Driver.getDriver().findElement(By.xpath("//td[a[text()='"+data.row(1).get(0)+"']]/../td[7]//span"));
        JSUtils.clickElementByJS(viewResultsY);
    }


    @And("Kullanici gerekli verilerin göründügünü dogrular; id {string},name {string}, result {string}, default max value {string},default min value {string},test {string}, description {string},the date {string}")
    public void kullaniciGerekliVerilerinGöründügünüDogrularIdNameResultDefaultMaxValueDefaultMinValueTestDescriptionTheDate(String id, String name, String result, String defaultMaxValue, String defaultMinValue, String test, String description, String theDate) {



    }
}
