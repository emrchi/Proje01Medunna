Feature: Admin olarak; Country oluşturma / Okuma ve Silme
  @us28
  Scenario: TC01
    Given "Admin" hesabiyla login ol
    When item&title a tiklar ve country sec
    And Creat a new country e tikla
    Then Name e yeni bir ukle ismi yazip save e tikla
    And Dogrulama yazisini gor
    Then kendi olusturdugu ulkeyi sil
    And olusturdugu ulkeye eyalet ve sehir olustur
    Then sayfayi kapat
