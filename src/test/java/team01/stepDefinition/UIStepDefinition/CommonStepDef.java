package team01.stepDefinition.UIStepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import team01.pages.RandomUserPages;
import team01.utilities.ReusableMethods;

public class CommonStepDef {

    RandomUserPages homePage=new RandomUserPages();
    @Given("{string} hesabiyla login ol")
    public void hesabiyla_login_ol(String users) {
        ReusableMethods.click(homePage.loginDropdown);
        ReusableMethods.click(homePage.signIn);

        switch (users){
            case "Admin" :
                homePage.usernameKutusu.sendKeys("Team01Admin", Keys.TAB,"Team01Admin",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
                break;
            case "Staff" :
                homePage.usernameKutusu.sendKeys("StaffTeam01", Keys.TAB,"StaffTeam01",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
                break;
            case "Doctor" :
                homePage.usernameKutusu.sendKeys("Team01Doctor", Keys.TAB,"Team01Doctor",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

                break;
            case "Patient" :
                homePage.usernameKutusu.sendKeys("Team01Patient", Keys.TAB,"Team01Patient",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

                break;
            case "User" :
                homePage.usernameKutusu.sendKeys("UserTeam01", Keys.TAB,"UserTeam01",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
                break;
            default:
                System.out.println("Gecersiz kullanici ismi");
        }

    }

}
