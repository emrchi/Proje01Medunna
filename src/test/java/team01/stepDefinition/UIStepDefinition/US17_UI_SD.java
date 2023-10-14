package team01.stepDefinition.UIStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team01.pages.AdminPages;
import team01.utilities.ConfigReader;
import team01.utilities.Driver;
import team01.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US17_UI_SD {
    AdminPages adminPages = new AdminPages();
    String testId;

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

    @And("Clicks on +Create a new Test Item")
    public void clicksOnCreateANewTestItem() {
        ReusableMethods.click(adminPages.createANewItem);
    }

    @And("Enter a {string} in the name field")
    public void enterAInTheNameField(String testName) {
        adminPages.testItemName.sendKeys(testName);
    }

    @And("Enter a {string} in the description field")
    public void enterAInTheDescriptionField(String description) {
        adminPages.testItemDescription.sendKeys(description);
    }

    @And("Enter a {string} in the price field")
    public void enterAInThePriceField(String price) {
        adminPages.testItemPrice.sendKeys(price);
    }

    @And("Enter a {string} in default min. value")
    public void enterAInDefaultMinValue(String defaultMinValue) {
        adminPages.defaultMinValue.sendKeys(defaultMinValue);
    }

    @And("Enter a {string} in default max. value")
    public void enterAInDefaultMaxValue(String defaultMaxValue) {
        adminPages.defaultMaxValue.sendKeys(defaultMaxValue);
    }

    @And("Click on the save button")
    public void clickOnTheSaveButton() {
        ReusableMethods.click(adminPages.testItemSave);
        ReusableMethods.bekle(5);
    }

    @Then("Verify the text {string}")
    public void verifyTheText(String verifyText) {
        ReusableMethods.visibleWait(adminPages.verifyText, 5);
        assertTrue(adminPages.verifyText.getText().contains(verifyText));
        testId = adminPages.verifyText.getText().replaceAll("[^0-9]", "");
        System.out.println(testId);
    }
    @And("Close the Driver")
    public void closeTheDriver() {
        Driver.closeDriver();
    }

    @And("Clicks on Created Date")
    public void clicksOnCreatedDate() {
        ReusableMethods.click(adminPages.createdDate);
    }
    @And("Click on the edit of the one with the name blood test")
    public void clickOnTheEditOfTheOneWithTheNameBloodTest() {
        ReusableMethods.click(adminPages.testItemEdit);
    }
    @And("Clear and enter a new test name {string}")
    public void clearAndEnterANewTestName(String newTestName) {
        adminPages.testItemName.clear();
        adminPages.testItemName.sendKeys(newTestName);
    }
    @And("Clear and enter a new description {string}")
    public void clearAndEnterANewDescription(String newDescription) {
        adminPages.testItemDescription.clear();
        adminPages.testItemDescription.sendKeys(newDescription);
    }
    @And("Clear and enter a new price {string}")
    public void clearAndEnterANewPrice(String newPrice) {
        adminPages.testItemPrice.clear();
        adminPages.testItemPrice.sendKeys(newPrice);
    }

    @And("Clear and enter a new default min value {string}")
    public void clearAndEnterANewDefaultMinValue(String newDefaultMinValue) {
        adminPages.defaultMinValue.clear();
        adminPages.defaultMinValue.sendKeys(newDefaultMinValue);
    }

    @And("Clear and enter a new default max value {string}")
    public void clearAndEnterANewDefaultMaxValue(String newDefaultMaxValue) {
        adminPages.defaultMaxValue.clear();
        adminPages.defaultMaxValue.sendKeys(newDefaultMaxValue);
    }

    @And("Click on the view of the one with the name Hemogram")
    public void clickOnTheViewOfTheOneWithTheNameHemogram() {
        ReusableMethods.click(adminPages.testItemView);
    }

    @Then("Verify that the Name contains a {string}")
    public void verifyThatTheNameContainsA(String viewTestName) {
        ReusableMethods.visibleWait(adminPages.viewTestItemName, 3);
        assertTrue(adminPages.viewTestItemName.getText().contains(viewTestName));
    }

    @And("Verify that the Description contains a {string}")
    public void verifyThatTheDescriptionContainsA(String viewDescription) {
        ReusableMethods.visibleWait(adminPages.viewTestItemDescription, 3);
        assertTrue(adminPages.viewTestItemDescription.getText().contains(viewDescription));
    }

    @And("Verify that the Price contains a {string}")
    public void verifyThatThePriceContainsA(String viewPrice) {
        ReusableMethods.visibleWait(adminPages.viewTestItemPrice, 3);
        assertTrue(adminPages.viewTestItemPrice.getText().contains(viewPrice));
    }

    @And("Verify that the Default Min. Value contains a {string}")
    public void verifyThatTheDefaultMinValueContainsA(String viewDefaultMinValue) {
        ReusableMethods.visibleWait(adminPages.viewDefaultMinValue, 3);
        assertTrue(adminPages.viewDefaultMinValue.getText().contains(viewDefaultMinValue));
    }

    @And("Verify that the Default Max. Value contains a {string}")
    public void verifyThatTheDefaultMaxValueContainsA(String viewDefaultMaxValue) {
        ReusableMethods.visibleWait(adminPages.viewDefaultMaxValue, 3);
        assertTrue(adminPages.viewDefaultMaxValue.getText().contains(viewDefaultMaxValue));
    }

    @And("Verify that the created date is visible")
    public void verifyThatTheCreatedDateIsVisible() {
        assertTrue(adminPages.viewCreatedDate.isDisplayed());
    }

    @When("Click on the Back button")
    public void clickOnTheBackButton() {
        ReusableMethods.click(adminPages.testItemBack);
    }

    @And("Click on the Delete of the one with the test name Hemogram")
    public void clickOnTheDeleteOfTheOneWithTheTestNameHemogram() {
        ReusableMethods.click(adminPages.testItemDelete);
    }

    @And("Click the delete button on the confirm delete operation alert")
    public void clickTheDeleteButtonOnTheConfirmDeleteOperationAlert() {
        ReusableMethods.bekle(5);
        ReusableMethods.click(adminPages.deleteButton);
    }

    @Then("Verify the text This field should be at least zero")
    public void verifyTheTextThisFieldShouldBeAtLeastZero() {
        ReusableMethods.visibleWait(adminPages.invalidPrice,5);
        assertEquals("This field should be at least 0.",adminPages.invalidPrice.getText());
    }

    @Then("Verify the text This field is required in the Name field")
    public void verifyTheTextThisFieldIsRequiredInTheNameField() {
        ReusableMethods.visibleWait(adminPages.emptyTestItemName,5);
        assertEquals("This field is required.",adminPages.emptyTestItemName.getText());
    }

    @And("Verify the text This field is required in the Price field")
    public void verifyTheTextThisFieldIsRequiredInThePriceField() {
        ReusableMethods.visibleWait(adminPages.emptyTestItemPrice,5);
        assertEquals("This field is required.",adminPages.emptyTestItemPrice.getText());
    }
}
