@US_12
Feature: US12
  Background:
    Given Doktor "medunna" sayfasina gider
    When "Doctor" hesabiyla login ol
    Then Doktor My Pages sekmesine tiklar
    Then Doktor cikan menüde My Appointments sekmesine tiklar

  @US12_TC01
  Scenario: TC01_Physician (Doktor) test isteyebilmeli
    And Doktor sayfada hastanin yanindaki edit butonuna tiklar
    |Patient|
    |mrv    |
    And Doktor Request a Test butonuna tiklar
    And Doktor test iceriginde gerekli verilerin görüngügünü dogrular
    |Testler|
    |Glucose|
    |Urea   |
    |Creatinine|
    |Sodium    |
    |Potassium |
    |Total Protein|
    |Albumin      |
    |Hemoglobin   |
    And Doktor test secer;
    |Test|
    |Urea|
    And Doktor save butonuna tiklar
    And Doktor test talebinin basarili bir sekilde gerceklestirildigini dogrular



    @US12_TC02
    Scenario: TC02_Negatif Senaryo
      And Doktor sayfada hastanin yanindaki edit butonuna tiklar
        |Patient|
        |mrv    |
      And Doktor Request a Test butonuna tiklar
      And Doktor save butonuna tiklar
      And Doktor test talebinin gerceklesmedigini dogrular
