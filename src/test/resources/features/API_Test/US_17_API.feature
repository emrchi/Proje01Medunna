@us17Api
Feature: Create Update Delete Test Items
  Scenario: TC_001 Create Test Item
    Given Post request is prepared to add Test Items
    And Prepares test items to be sent
    When A post request is sent to add test items
    Then Verify the status code 201
    And Verify the test items response body

  Scenario: TC_002 Update Test Item
    Given Put request is prepared to add Test Items
    And Prepares updating test items to be sent
    When A put request is sent to add test items
    Then Verify the status code 200
    And Verify the updating test items response body

  Scenario: TC_003 Delete Test Item
    Given Delete request is prepared to add Test Items
    When A delete request is sent to add test items
    Then Verify the status code 204
