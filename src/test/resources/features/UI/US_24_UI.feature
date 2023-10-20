Feature: US24 Hasta hesabına girdiğinde test sonuçlarını görebilmelidir.
@us24
  Scenario: TC01
    Given "medunna" sayfasina git
    And "Patient" hesabiyla login ol
    When   my pagesa tiklayip my apointments i sec
    And show test "e tiklayip  id, name for test,default max ve min value, test date and description" bölümlerini gor
    Then show invoice'e tikla ve faturayi gor
    And sayfayi kapat
