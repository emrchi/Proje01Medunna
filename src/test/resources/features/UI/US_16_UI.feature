Feature: US01
  Background: login islemi
    Given Anasayfaya git
    And Anasayfaya gidildigini dogrula
    And "Admin" hesabiyla login ol
    And Admin olarak giris yapildigini dogrula
    And Items&Titles butonuna tikla
    And Room' gorunurlulugunu dogrula
    And Room' yazisina tikla
    And Rooms sayfasinin acildigini dogrula

  Scenario: TC01
    And Create a new Room butonuna tikla
    And Room Number alanina Room Number gir
    And Room Type'in defoult olarak geldigini dogrula
    And "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCAR
    And Room Type alanindan Room Type sec
    And Status kutusunun secilebilirligini dogrula
    And Price alanaina "999" gir
    And Description alanina Description gir
    And tarih ikonuna tikla
    And Created Date alanindan gecmis tarih sec
    And Save butonuna tikla
    And Room eklendigini dogrula
    And Room listin altinda son sayfaya git butonuna tikla
    And Olusturulan roomun gorunurlulugunu dogrula

  Scenario: TC02
    And Create a new Room butonuna tikla
    And Save butonuna tikla
    And This field is required. (Room Number)
    And This field is required. (Price)

  Scenario: TC03
    And Create a new Room butonuna tikla
    And Room Number alanina Room Number gir
    And Room Type alanindan Room Type sec
    And Status kutusunun secilebilirligini dogrula
    And Price alanaina "999" gir
    And Description alanina Description gir
    And Created Date alanindan gecmis tarih sec
    And Save butonuna tikla
    And Room eklenemedigini dogrula
    And Created Date alanina "08.10.22222" şeklinde tarih gir
    And Save butonuna tikla
    And Room eklenemedigini dogrula

  Scenario: TC04
    And Room listin altinda son sayfaya git butonuna tikla
    And Roomun gorunurlulugunu dogrula
    And Roomun edit butonuna tikla
    And Create or edit a Room' yazisinin gorunurlulugunu dogrula
    And Room Number alanini sil
    And Room Number alanina Room Number gir
    And Room Type alanindan farkli Room Type sec
    And Price alanini sil
    And Price alanaina "77" gir
    And Description alanini sil
    And Description alanina Description gir
    And Created Date alanindan gecmis tarih sec
    And Save butonuna tikla
    And Room'un editlendigini dogrula

  Scenario: TC05
    And Olusturulan roomun delete butonuna tikla
    And Acilan pencerede Delete butonuna tikla
    And Room'un silindigini dogrula

  Scenario: TC06
    And Create a new Room butonuna tikla
    And Room Number alanina kayitli Room Number gir
    And Room Type'in defoult olarak geldigini dogrula
    And Room Type alanindan Room Type sec
    And Status kutusunun secilebilirligini dogrula
    And Price alanaina "888" gir
    And Description alanina Description gir
    And tarih ikonuna tikla
    And Created Date alanindan gecmis tarih sec
    And Save butonuna tikla
    And "Room information is not consistent. Room number must be unique" mesajinin ciktigini dogrula