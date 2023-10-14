@ui17-18
Feature: US 18 Create Update  Delete Physician
  Background: Common Process
    Given User go to homepage "url" with properties
    When signs in as "Admin"
    And Clicks on Items&Titles
    And Clicks on Physician

  Scenario: TC_001 Create Physician as Admin
    And Clicks on +Create a new Physician
    And Click on the use search box
    And Enter a "444-55-7878" in the SSN field
    And Click on the Search User
    Then Verify the text "User found with search SSN"
    And Clear and enter a Birth date "19/02/1993"
    And Enter a phone number "5554441905"
    And Enter a Address information "Florya Metin Oktay Tesisleri"
    And Select Gender
    And Select Speciality
    And Select Blood Group
    And Enter a description "HERO"
    And Upload the image
    And Enter a Exam Fee "1000"
    And Select the Country
    And Click on the save button
    Then Verify the text "A new Physician is created with identifier"
    And Close the Driver

  Scenario: TC_002 Update Physician Information as Admin
    And Clicks on physcian Created Date
    And Click on the edit of the ssn number "444-55-7878"
    And Clear and enter a new first name "Mecnun"
    And Clear and enter a new last name "Çınar"
    And Clear and enter new Birth date "20/04/1976"
    And Clear and enter a new Phone Number "5053420627"
    And Clear and enter a new Address "Kireçburnu"
    And Select Gender
    And Select new Speciality
    And Select new Blood Group
    And Clear and enter a new Description "Leyla ile Mecnun"
    And Clear and upload a new image
    And Clear and enter a new Exam Fee "2000"
    And Select the new Country
    And Click on the save button
    Then Verify the text "A Physician is updated with identifier"
    And Close the Driver
    
  Scenario: TC_003 Visible and Delete Physician as Admin
    And Clicks on physcian Created Date
    #And Click on the view of the ssn number "444-55-7878"
    #View butonuna tıklanıldığında "An unexpected error has occured." uyarısı geliyor
    And Click on the Delete of the one with the ssn number "444-55-7878"
    And Click the delete button on the confirm delete operation alert
    Then Verify the text "A Physician is deleted with identifier"






