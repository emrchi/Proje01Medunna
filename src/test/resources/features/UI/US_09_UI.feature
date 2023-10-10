Feature: US009 Patient Management By Staff

  Background: Navigate to Staff Page
    Given user goes to homepage
    When signs in as "Staff"
    And waits for 2 seconds
    And clicks on My Pages
    And clicks on Search Patient
    And waits for 2 seconds

  Scenario: TC001 Staff can view patient information
    Then verifies patient information sections are seen
      | Sections     |
      | ID           |
      | SSN          |
      | First Name   |
      | Last Name    |
      | Birth Date   |
      | Phone        |
      | Email        |
      | Gender       |
      | Blood Group  |
      | Address      |
      | Description  |
      | Created Date |
      | User         |
      | Country      |
      | State/City   |
    And closes the page

  Scenario: TC002 Staff can edit patient information
    And enters Patient SSN in the search box
    And waits for 2 seconds
    And clicks on View button
    Then verifies registration info is populated
      | registration info |
      | SSN               |
      | First Name        |
      | Last Name         |
      | Username          |
      | Email             |

    And clicks on Edit button
    Then verifies patient information can be editted by entering new information
      | information |
      | ID          |
      | First Name  |
      | Last Name   |
      | Phone       |
      | Address     |
      | Description |
    Then verifies patient information can be editted by selecting different values from default
      | choices     |
      | Birth Date  |
      | Gender      |
      | Blood Group |
      | User        |
      | Country     |
      | State/City  |
    And clicks on Save button
    Then verifies “A patient is updated with identifier” text is seen
    And closes the page




