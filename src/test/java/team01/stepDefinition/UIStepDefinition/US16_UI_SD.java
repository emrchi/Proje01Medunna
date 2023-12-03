package team01.stepDefinition.UIStepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.Select;
import team01.pages.AdminPages;
import team01.utilities.Driver;
import team01.utilities.ReusableMethods;
import static org.junit.Assert.*;
import static team01.utilities.ReusableMethods.randomRoomNumber;
import static team01.utilities.ReusableMethods.waitForVisibility;

public class US16_UI_SD {
    AdminPages page = new AdminPages();
    static String odaId;
    Select select;
    @And("Room' gorunurlulugunu dogrula")
    public void roomGorunurlulugunuDogrula() {
        assertTrue(page.roomButton.isDisplayed());
    }

    @And("Room' yazisina tikla")
    public void roomYazisinaTikla() {
        page.roomButton.click();
    }

    @And("Rooms sayfasinin acildigini dogrula")
    public void roomsSayfasininAcildiginiDogrula() {
        assertEquals("Rooms", page.roomTitle.getText());
    }

    @And("Create a new Room butonuna tikla")
    public void createANewRoomButonunaTikla() {
        page.createNewRoom.click();
    }

    @And("Room Number alanina Room Number gir")
    public void roomNumberAlaninaRoomNumberGir() {
        page.roomNumber.sendKeys(randomRoomNumber());
        ReusableMethods.bekle(2);
    }

    @And("Room Type'in defoult olarak geldigini dogrula")
    public void roomTypeInDefoultOlarakGeldiginiDogrula() {
        assertFalse(page.roomTypeDdm.getText().isEmpty());
    }

    @And("{string}; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCAR")
    public void twinDELUXEPREMIUM_DELUXESUITVeDAYCAR(String arg0) {
        select = new Select(page.roomTypeDdm);
        assertTrue(select.getOptions().get(0).getText().contains("TWIN"));
        assertTrue(select.getOptions().get(1).getText().contains("DELUXE"));
        assertTrue(select.getOptions().get(2).getText().contains("PREMIUM_DELUXE"));
        assertTrue(select.getOptions().get(3).getText().contains("SUIT"));
        assertTrue(select.getOptions().get(4).getText().contains("DAYCAR"));
    }
    @And("Room Type alanindan Room Type sec")
    public void roomTypeAlanindanRoomTypeSec() {
        select = new Select(page.roomTypeDdm);
        select.selectByVisibleText("SUITE");
    }
    @And("Status kutusunun secilebilirligini dogrula")
    public void statusKutusununSecilebilirliginiDogrula() {
        assertTrue(page.statusRoom.isEnabled());
    }
    @And("tarih ikonuna tikla")
    public void tarihIkonunaTikla() {
        page.createdDateRoom.sendKeys("11.10.2024");
    }
    @And("Room eklendigini dogrula")
    public void roomEklendiginiDogrula() {
        assert page.savedVerify.isDisplayed();
        assertTrue(page.savedVerify.getText().contains("A new Room is created with identifier"));
        odaId = page.savedVerify.getText().replaceAll("[^0-9]", "");
    }
    @And("Room listin altinda son sayfaya git butonuna tikla")
    public void roomListinAltindaSonSayfayaGitButonunaTikla() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(page.sonSayfa);
    }
    @And("Olusturulan roomun gorunurlulugunu dogrula")
    public void olusturulanRoomunGorunurlulugunuDogrula() {
        assert page.sonUserVerify.getText().contains(odaId);
    }

    @And("This field is required. \\(Room Number)")
    public void thisFieldIsRequiredRoomNumber() {
        page.thisFieldIsInvalidroomNumber.getText().contains("This field is required.");
    }

    @And("This field is required. \\(Price)")
    public void thisFieldIsRequiredPrice() {
        page.thisFieldIsInvalidprice.getText().contains("This field is required.");
    }

    @And("Created Date alanindan gecmis tarih sec")
    public void createdDateAlanindanIleriTarihSec() {
        page.createdDateRoom.sendKeys("10.10.2022");
    }

    @And("Room eklenemedigini dogrula")
    public void roomEklenemediginiDogrula() {
        assertFalse(page.savedVerify.getText().contains("A new Room is created with identifier"));
    }
    @And("Create or edit a Room' yazisinin gorunurlulugunu dogrula")
    public void createOrEditARoomYazisininGorunurlulugunuDogrula() {
        assertEquals("Create or edit a Room", page.createoreditaRoom.getText());
    }
    @And("Room Number alanini sil")
    public void roomNumberAlaniniSil() {
        page.roomNumber.clear();
    }
    @And("Room Type alanindan farkli Room Type sec")
    public void roomTypeAlanindanFarkliRoomTypeSec() {
        select = new Select(page.roomTypeDdm);
        select.selectByVisibleText("DELUXE");
    }
    @And("Price alanini sil")
    public void priceAlaniniSil() {
        ReusableMethods.clearJS(page.priceRoom);
    }

    @And("Description alanini sil")
    public void descriptionAlaniniSil() {
        ReusableMethods.clearJS(page.descriptionRoom);
    }

    @And("Room'un editlendigini dogrula")
    public void roomUnEditlendiginiDogrula() {
        assertTrue(page.savedVerify.getText().contains("A Room is updated with identifier"));
    }
    @And("Olusturulan roomun delete butonuna tikla")
    public void olusturulanRoomunDeleteButonunaTikla() {
        ReusableMethods.bekle(5);
        page.createdDateRoomTitle.click();
        waitForVisibility(page.deletebuttonRoom,10);
        ReusableMethods.bekle(2);
        page.deletebuttonRoom.click();
    }

    @And("Room'un silindigini dogrula")
    public void roomUnSilindiginiDogrula() {
        assertTrue(page.savedVerify.getText().contains("A Room is deleted with identifier"));
    }

    @And("Room Number alanina kayitli Room Number gir")
    public void roomNumberAlaninaKayitliRoomNumberGir() {
        page.roomNumber.sendKeys("4");
    }

    @And("{string} mesajinin ciktigini dogrula")
    public void mesajininCiktiginiDogrula(String message) {
        assertEquals(message, page.savedVerify.getText());
    }

    @And("Created Date alanina {string} şeklinde tarih gir")
    public void createdDateAlaninaŞeklindeTarihGir(String date) {
        page.createdDateRoom.sendKeys(date);
    }

    @And("Roomun gorunurlulugunu dogrula")
    public void roomunGorunurlulugunuDogrula() {
        assert page.sonUserVerify.isDisplayed();
    }

    @And("Roomun edit butonuna tikla")
    public void roomunEditButonunaTikla() {
        page.editPatientAndRoom.click();
        Driver.getDriver().navigate().refresh();
    }
    @And("Price alanaina {string} gir")
    public void priceAlanainaGir(String prc) {
        page.priceRoom.sendKeys(prc);
    }

    @And("Acilan pencerede Delete butonuna tikla")
    public void acilanPenceredeDeleteButonunaTikla() {
        waitForVisibility(page.deleteButton,10);
        ReusableMethods.click(page.deleteButton);
    }
    @And("Sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();
    }

    @And("Olusturulan Roomun Created Date bilgisinin degismedigini dogrula")
    public void olusturulanRoomunCreatedDateBilgisininDegismediginiDogrula() {


    }
}
