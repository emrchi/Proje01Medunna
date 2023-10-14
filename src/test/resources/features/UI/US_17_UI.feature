@ui17-18
Feature: US 17 Create Update  Delete test items

  Background: Common Process
    Given User go to homepage "url" with properties
    When signs in as "Admin"
    And Clicks on Items&Titles
    And Clicks on Test Item

  Scenario: TC_001 Create Test Items as Admin
    And Clicks on +Create a new Test Item
    And Enter a "Blood Test" in the name field
    And Enter a "Routine Control" in the description field
    And Enter a "125" in the price field
    And Enter a "13.0 g/dL" in default min. value
    And Enter a "17.0 g/dL" in default max. value
    And Click on the save button
    Then Verify the text "A new Test Item is created with identifier"
    And Close the Driver

  Scenario: TC_002 Update Test Items as Admin
    And Clicks on Created Date
    And Click on the edit of the one with the name blood test
    And Clear and enter a new test name "Hemogram"
    And Clear and enter a new description "Control"
    And Clear and enter a new price "150"
    And Clear and enter a new default min value "13.1 g/dL"
    And Clear and enter a new default max value "17.2 g/dL"
    And Click on the save button
    Then Verify the text "A Test Item is updated with identifier"
    And Close the Driver

  Scenario: TC_003 Visible and Delete Test Items as Admin
    And Clicks on Created Date
    And Click on the view of the one with the name Hemogram
    Then Verify that the Name contains a "Hemogram"
    And Verify that the Description contains a "Control"
    And Verify that the Price contains a "150"
    And Verify that the Default Min. Value contains a "13.1 g/dL"
    And Verify that the Default Max. Value contains a "17.2 g/dL"
    And Verify that the created date is visible
    When Click on the Back button
    And Clicks on Created Date
    And Click on the Delete of the one with the test name Hemogram
    And Click the delete button on the confirm delete operation alert
    Then Verify the text "A Test Item is deleted with identifier"
    And Close the Driver

  Scenario: TC_004 Create Test Items as Admin without entering Description Default Min. Value and Default Max. Value values
    And Clicks on +Create a new Test Item
    And Enter a "Hemogram" in the name field
    And Enter a "125" in the price field
    And Click on the save button
    Then Verify the text "A new Test Item is created with identifier"
    And Close the Driver


  Scenario: TC_005 Create Test Items as an Admin by Entering Negative Numbers in the Price section
    And Clicks on +Create a new Test Item
    And Enter a "Hemogram" in the name field
    And Enter a "-125" in the price field
    And Click on the save button
    Then Verify the text This field should be at least zero
    And Close the Driver

  Scenario: TC_006 Test Items not be Created With Empty Data
    And Clicks on +Create a new Test Item
    And Click on the save button
    Then Verify the text This field is required in the Name field
    And  Verify the text This field is required in the Price field










