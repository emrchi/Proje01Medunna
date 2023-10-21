Feature: Create Update Delete Patient
  Scenario: TC_001 Create Patient
    Given Post request is prepared to add Patient
    And Prepares post Patient to be sent
    When A post request is sent to add Patient
    And Verify the Patient post response body

  Scenario: TC_002 Get Patient
    Given Get request is prepared to add Patient
    And Prepares Patient to be sent
    When A get request is sent to add Patient
    And Verify the Patient response body

  Scenario: TC_003 Update Patient
    Given Put request is prepared to add Patient
    And Prepares updating Patient to be sent
    When A put request is sent to add Patient
    And Verify the updating Patient response body

  Scenario: TC_004 Delete Patient
    Given Delete request is prepared to add with "84422"
    When A delete request is sent to add Patient
    Then Verify the status code 204 delete
