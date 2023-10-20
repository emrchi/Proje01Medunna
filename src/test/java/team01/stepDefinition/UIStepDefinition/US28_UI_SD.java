package team01.stepDefinition.UIStepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import team01.pages.AdminPages;
import team01.utilities.Driver;
import team01.utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static team01.stepDefinition.UIStepDefinition.US09_UI_SD.faker;

public class US28_UI_SD {
    AdminPages adminPages = new AdminPages();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String countryA = faker.country().name();

    @When("item&title a tiklar ve country sec")
    public void itemTitleATiklarVeCountrySecer() {
        adminPages.item.click();
        adminPages.country.click();
    }

    @And("Creat a new country e tikla")
    public void creatANewCountryETiklar() {
        adminPages.creatCountry.click();
    }

    @Then("Name e yeni bir ukle ismi yazip save e tikla")
    public void nameEYeniBirUkleIsmiYazipSaveETiklar() {

        adminPages.name.sendKeys(countryA);
        adminPages.save.click();
    }

    @And("Dogrulama yazisini gor")
    public void dogrulamaYazisiniGorur() {
        assertTrue(adminPages.dogrulamaYazisi.getText().contains("A new Country is created with identifier"));
    }


    @Then("kendi olusturdugu ulkeyi sil")
    public void kendiOlusturduguUlkeyiSiler() {
        String country = adminPages.dogrulamaYazisi.getText();
        String counrtyId = country.substring(41);
        ReusableMethods.bekle(5);
        ReusableMethods.click(Driver.getDriver().findElement(By.xpath("(//td[text()='" + countryA + "']/../td[4]//span)[6]")));
        ReusableMethods.bekle(2);
        adminPages.deleteButton.click();
        assertTrue(adminPages.silmeDogrulama.getText().contains("A Country is deleted with identifier"));

    }

    @And("olusturdugu ulkeye eyalet ve sehir olustur")
    public void olusturduguUlkeyeEyaletVeSehirOlusturur() {
        adminPages.item.click();
        adminPages.stateCity.click();
        ReusableMethods.click(adminPages.cretaStateCity);
        adminPages.stateName.sendKeys("Rwanda");
        ReusableMethods.ddmVisibleText(adminPages.stateId, "Guatemala");
        ReusableMethods.click(adminPages.stateCitySave);
        assertTrue(adminPages.dogrulamaYazisi.getText().contains("Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty!"));
    }


}
