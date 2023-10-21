@us16Api
Feature: Create Update Delete Room
  Scenario: TC_001 Create Test Item
    Given Post request is prepared to add Room
    And Prepares Room to be sent
    When A post request is sent to add Room
    And Verify the Room response body

  Scenario: TC_002 Update Room
    Given Put request is prepared to add Room
    And Prepares updating Room to be sent
    When A put request is sent to add Room
    And Verify the updating Room response body

  Scenario: TC_003 Delete Room
    Given Delete request is prepared to add Room
    When A delete request is sent to add Room
    Then Verify the status code 204 room
