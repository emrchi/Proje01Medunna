package team01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team01.utilities.Driver;
import java.util.List;

public class RandomUserPages {

public RandomUserPages(){PageFactory.initElements(Driver.getDriver(),this);}

    //esma 13 - 250



    @FindBy(xpath = "(//a[@href='#'])[1]")
    public WebElement loginDropdown;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signIn;

    @FindBy(xpath = "//span[text()='DOCTORS']")
    public WebElement sayfayidogrula;

    @FindBy(xpath = "//input[@placeholder='Your username']")
    public WebElement usernameKutusu;

    @FindBy(xpath = "//input[@id='rememberMe']")
    public WebElement rememberMe;

    @FindBy(xpath = "//a[@href='/account/reset/request']")
    public WebElement forgetYourPasswordButonu;

    @FindBy(xpath = "(//a[@href='/account/register'])[2]")
    public WebElement registerNewAccountButonu;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButonu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = " //div[text()='Authentication information not correct.']")
    public WebElement usernamePasswordYanlis ;

    @FindBy(xpath = "//div[text()='Username cannot be empty!']")
    public WebElement usernameGirilmedigindeUyari;


    @FindBy(xpath = "//div[text()='Password cannot be empty!']")
    public WebElement passwordGirilmedigindeUyari;


    /*
    US_04 locateler

(//a[@href='#'])[1]  -->login dropdown
//a[@href='/login']  -->sign in
//input[@placeholder='Your username']  -->username kkutusu
//input[@id='rememberMe']  -->remmeber me radiobutton
//a[@href='/account/reset/request']  -->forget your password butonu
(//a[@href='/account/register'])[2]  -->register new account butonu
//span[text()='Cancel']  -->cancel butonu
//button[@type='submit']  -->sign in button
 //div[text()='Authentication information not correct.']   -->username password yanlis oldugunda cikan alert
//div[text()='Username cannot be empty!'] -->username girilmediginde cikan hata
//div[text()='Password cannot be empty!'] -->password girilmediginde cikan hata
//span[text()='DOCTORS'] -->sayfaya girildiginde doktors yazisindan dogrula

     */


    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement accountSekmesi;

    @FindBy(xpath = "//a[@href='/account/settings']")
    public WebElement settingsButonu;

    @FindBy(xpath = "//label[text()='First Name']")
    public WebElement settingsDogrulama;

    @FindBy(xpath = "//input[@value='esma']")
    public WebElement firstnameKutusu;

    @FindBy(xpath = "//div[text()='Your first name is required.']")
    public WebElement firstnameSilindigindeHata;

    @FindBy(xpath = "//input[@value='sanli']")
    public WebElement lastnameKutusu;

    @FindBy(xpath = "//div[text()='Your last name is required.']")
    public WebElement lastnameSilindigindeHata;

    @FindBy(xpath = "//input[@value='esmacan1998@gmail.com'] ")
    public WebElement emailKutusu;

    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement etKonulmadigindaHata;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement emailSilindigindeHata;

/*
US_06

(//a[@href='#'])[3]  -->giris yaptiktan sonra account sekmesi
//a[@href='/account/settings']  -->settings butonu
//label[text()='First Name']  -->settings sayfa dogrulama
//input[@value='esma'] -->firstname kutusu
//div[text()='Your first name is required.']  -->firstname silindiginde hata mesaji verir
//input[@value='sanli']  -->lastname kutusu
//div[text()='Your last name is required.']  -->lastname silindiginde hata mesaji verir
//input[@value='esmacan1998@gmail.com']  -->email kutusu
//div[text()='This field is invalid']  -->@ konulmadigindaki hata mesaji
//div[text()='Your email is required.']  -->email silindiginde hata mesaji verir

 */



    @FindBy(xpath = "//a[@href='/account/password']")
    public WebElement accountSekmesi2;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentpassword;

    @FindBy(xpath = "(//div[text()='Your password is required.'])[1]")
    public WebElement currentPasswordHata;

    @FindBy(xpath = "(//div[text()='Your password is required.'])[2]")
    public WebElement newPasswordHata;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordKutucuk;

    @FindBy(xpath = "//li[@style='background-color: rgb(221, 221, 221);']")
    public WebElement KucukveBuyukHarfOlmadiginda;
    //bosKutucuk

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[1]")
    public WebElement rakamOlmadiginda;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[2]")
    public WebElement rakamOlmadigindaiki;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[3]")
    public WebElement accountSekmesiuc;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[4]")
    public WebElement accountSekmesiDort;

/*
US_08

//a[@href='/account/password']  -->account password sekmesi
//input[@name='currentPassword']  -->currentpassword
(//div[text()='Your password is required.'])[1]  -->current password hata mesaji
(//div[text()='Your password is required.'])[2]  -->new password hata mesaji

//li[@style='background-color: rgb(255, 0, 0);']  -->password dolu kutucuk locatei
//li[@style='background-color: rgb(221, 221, 221);']  -->bos kutucuk locatei

TOTALDE 5 KUTUCUK VAR
1 küçük harf olmadiginda -->//li[@style='background-color: rgb(221, 221, 221);']  -->son bos kutucuk locatei
1 büyük harf olmadiginda -->//li[@style='background-color: rgb(221, 221, 221);']  -->son bos kutucuk locatei
1 rakam olmadiginda -->(//li[@style='background-color: rgb(221, 221, 221);'])[1],2,3 hepsini ekle bos kutucuklar
1 özel karakter olmadiginda -->(//li[@style='background-color: rgb(221, 221, 221);'])[1],2,3 hepsini ekle bos kutucuklar
4,5,6 karakter oldugunda -->(//li[@style='background-color: rgb(221, 221, 221);'])[1],2,3,4



 */








































































    //**********************************************************



    //Esma 250
    //Emre 251-320




































































    //Emre 320

}
