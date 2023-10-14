Feature: US01

  Background: login islemi
    Given Anasayfaya git
    And Anasayfaya gidildigini dogrula
    And "Admin" hesabiyla login ol
    And Admin olarak giris yapildigini dogrula
    And Items&Titles butonuna tikla
    And Patient yazisinin gorunurlulugunu dogrula
    And Patient yazisina tikla
    And Patient sayfasinin acildigini dogrula
    And Create a new Patient butonuna tikla

  Scenario: TC01
    When First Name alanina isim gir
    And Last Name alanina soyisim gir
    And Birth Date alanina dogum tarihi gir
    And Email alanina email gir
    And Phone alanina phone gir
    Then Gender'in defoult olarak geldigini dogrula
    When Gender alaninda gender sec
    And Blood Group'un defoult olarak geldigini dogrula
    And Blood Group alaninda kan grubu sec
    And Address alanina adres gir
    And Description alanina desciption gir
    And User alaninada user sec
    And Country alanindan US state sec
    Then Country alanindan US state secildigini dogrula
    When State-City alanianda kent sec
    And Save butonuna tikla
    Then Basarili bir sekilde patient eklendigini dogrula
    When Patients listin altinda son sayfaya git butonuna tikla
    Then Patients listesinde en son sayfada olusturulan patient'in eklendigini dogrula

  Scenario: TC02
    When Save butonuna tikla
    And This field is required.(First Name )
    And This field is required.(Last Name)
    And Your email is required.(Email)
    And Phone number is required.(Phone)
    And First Name alanina isim gir
    And Last Name alanina soyisim gir
    And Birth Date alanina dogum tarihi gir
    And Email alanina email gir
    And Phone alanina phone gir
    And Save butonuna tikla
    Then Patient eklenemedigini dogrula

  Scenario: TC03
    When First Name alanina tek karakter gir
    And Last Name alanina tek karakter gir
    And Birth Date alanina dogum tarihi gir
    And Email alanina email gir
    And Phone alanina phone gir
    And Country alanindan US state sec
    And Save butonuna tikla
    Then Basarili bir sekilde patient eklendigini dogrula
    When Patients listin altinda son sayfaya git butonuna tikla
    Then Patients listesinde en son sayfada olusturulan patient'in eklendigini dogrula
    When Olusturulan patientin edit butonuna tikla
    And First Name alanini sil
    And First Name alanina isim gir
    And Last Name alanini sil
    And Last Name alanina tek karakter gir
    And Birth Date alanina farkli dogum tarihi gir
    And Email alanini sil
    And Email alanina email gir
    And Phone alanini sil
    And Phone alanina phone gir
    And Gender alaninda farkli gender sec
    And Blood Group alaninda farkli Blood Group sec
    And Address alanina Address gir
    And Description alanina Description gir
    And User alanindan User sec
    And Country alanindan US state sec
    #bu stepi eklemeden city alaninda optionslar gelmiyor
    Then Country alanindan US state secildigini dogrula
    When State-City alanianda kent sec
    And Save butonuna tikla
    Then Patientin basarili bir sekilde editlendigini dogrula

  Scenario: TC04
    When First Name alanina isim gir
    And Last Name alanina soyisim gir
    And Birth Date alanina dogum tarihi gir
    And Email alanina @ isareti olmadan email gir
    And Save butonuna tikla
    Then "This field is invalid" yazisini dogrula
    And Email alanina "@" ekle
    Then "This field is invalid" yazisini dogrula
    When Email alanina "gmail" ekle
    Then "This field is invalid" yazisini dogrula
    When Email alanina "." ekle
    Then "This field is invalid" yazisini dogrula
    When Email alanina "com" ekle
    And Phone alanina phone gir
    And Country alanindan US state sec
    Then Country alanindan US state secildigini dogrula
    When Save butonuna tikla
    Then Basarili bir sekilde patient eklendigini dogrula
    And Patients listin altinda son sayfaya git butonuna tikla
    When Patients listesinde en son sayfada olusturulan patient'in eklendigini dogrula
    And Olusturulan patientin delete butonuna tikla
    And Acilan pencerede Delete butonuna tikla
    Then Patientin basarili bir sekilde silindigini dogrula

  Scenario: TC05
    When First Name alanina isim gir
    And Last Name alanina soyisim gir
    And Birth Date alanina ileri tarih gir
    And Email alanina email gir
    And Phone alanina phone gir
    And Country alanindan US state sec
    Then Country alanindan US state secildigini dogrula
    When Save butonuna tikla
    Then Patient eklenemedigini dogrula

  Scenario Outline: TC06
    When First Name alanina isim gir
    And Last Name alanina soyisim gir
    And Birth Date alanina ileri tarih gir
    And Email alanina email gir
    When Phone alanina "<gecersiz phone>" gir
    And Country alanindan US state sec
    When Save butonuna tikla
    Then Phone number is invalid yazisinin gorundugunu dogrula
    And Sayfayi kapat
    Examples:
      | gecersiz phone |
      | 564654865      |
      | 56465486558    |
      | 5646548cb+     |
      | 5646548655     |

  Scenario: TC07
    When First Name alanina rakam gir
    And Last Name alanina rakam gir
    And Birth Date alanina dogum tarihi gir
    And Email alanina email gir
    And Phone alanina phone gir
    Then Gender'in defoult olarak geldigini dogrula
    When Gender alaninda gender sec
    Then Blood Group'un defoult olarak geldigini dogrula
    When Blood Group alaninda kan grubu sec
    And Address alanina adres gir
    And Description alanina desciption gir
    And User alaninada user sec
    And Country alanindan US state sec
    Then Country alanindan US state secildigini dogrula
    When State-City alanianda kent sec
    And Save butonuna tikla
    Then Patient eklenemedigini dogrula

