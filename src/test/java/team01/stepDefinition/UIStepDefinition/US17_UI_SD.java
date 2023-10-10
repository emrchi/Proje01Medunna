package team01.stepDefinition.UIStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import team01.pages.AdminPages;
import team01.utilities.ConfigReader;
import team01.utilities.Driver;
import team01.utilities.ReusableMethods;

public class US17_UI_SD {
    AdminPages adminPages = new AdminPages();

    @Given("User go to homepage {string} with properties")
    public void userGoToHomepageWithProperties(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("Clicks on Items&Titles")
    public void clicksOnItemsTitles() {
        ReusableMethods.click(adminPages.itemsAndTitles);
    }

    @And("Clicks on Test Item")
    public void clicksOnTestItem() {
        ReusableMethods.click(adminPages.testItem);
    }
}
