Feature: US13
  Background:
    Given Doktor "medunna" sayfasina gider
    When "Doctor" hesabiyla login ol
    Then Doktor My Pages sekmesine tiklar
    Then Doktor cikan menüde My Appointments sekmesine tiklar

  @US12_TC01
  Scenario Outline: TC01_Physician (Doktor) test results islemleri yapabilmeli
    And Doktor sayfada hastanin yanindaki edit butonuna tiklar
      |Patient|
      |mrv    |
    And Kullanici Show Test Results butonuna tiklar
    And Kullanici testin yanindaki view Results butonuna tiklar
      |testId|
      |16296 |
    And Kullanici gerekli verilerin göründügünü dogrular; id "<id>",name "<name>", result "<result>", default max value "<default max value>",default min value "<default min value>",test "<test>", description "<description>",the date "<the date>"
    Examples:
      |id   | name   | result| default max value | default min value | test   | description | the date       |
      |78520| Urea   | 60    | 10 mg/dL          | 20 mg/dL          | 16296  | sehr hoch   | 10/10/23 16:06 |

