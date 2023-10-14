Feature: US 19 Create Update Delete Staff as Admin
  Background: Common Process
    Given User go to homepage "url" with properties
    When signs in as "Admin"
    And Clicks on Items&Titles
    And Clicks on Staff
  Scenario: TC_001 Create new Staff as Admin
    And Clicks on +Create a new Staff
    And Click on the use search box
    And Enter a "444-44-2727" in the SSN field
    And Click on the Search User
    Then Verify the text "User found with search SSN"
    And Enter a phone number staff "5553421905"
    And Clear and enter a Birth date as staff "16.06.198600:05:00"
    And Select staff Gender "MALE"
    And Select Staff Blood Group "O+"
    And Enter a Staff Address information "Florya"
    And Enter a Staff description "Son Anda Muslera!"
    And Select the Country "USA"
    And Select the State or City "NEWYORK"
    And Click on the save button
    Then Verify the text "A new Staff is created with identifier"
    And Close the Driver

    Scenario: TC_002 Update Staff Information as Admin
      And Clicks on staff Created Date
      And Click on the edit of the staff ssn number "444-44-2727"
      And Clear and enter a new first name
      And Clear and enter a new last name
      And Clear and enter a Birth date as staff "16.06.198600:05:00"
      And Clear and enter new Phone number
      And Select staff Gender "FEMALE"
      And Select Staff Blood Group "A+"
      And Clear and enter a new Address
      And Clear and enter a new Description
      And Select the Country "USA"
      And Click on the save button
      Then Verify the text "A Staff is updated with identifier"
      And Close the Driver

    Scenario: TC_003 Visible and Delete Staff Information as Admin
      And Clicks on staff Created Date
      And Click on the view of the staff ssn number "444-44-2727"
      Then Verify that the ssn number is visible
      And Verify that the First Name is visible
      And Verify that the Last Name is visible
      And Verify that the Birth Date is visible
      And Verify that the Phone is visible
      And Verify that the Gender is visible
      And Verify that the Blood Group is visible
      And Verify that the Adress is visible
      And Verify that the Description is visible
      And Verify that the Created Date is visible
      And Verify that the User is visible
      And Verify that the Country is visible
      And Verify that the State or City is visible
      When Click on the Back button
      And Clicks on staff Created Date
      And Click on the Delete of the one with the staff ssn number "444-44-2727"
      And Click the delete button on the confirm delete operation alert
      Then Verify the text "A Staff is deleted with identifier"



