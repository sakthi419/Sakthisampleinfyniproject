package InfyniApplicationTestCase;

import InfyniAutomationPageObjects.Loginpage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Testcase Login the Application
//Testcase Redirect and verify the Dashboard page
//Testcase click on Home link

public class LoginApplication extends Loginpage {

    @Parameters({"EmailId", "Password"})
    @Test

public static void  infynilink_Verification(String email, String pwd) {
        launchApplication("Chrome");
        implicitWait(6);
        click_Login();
        enter_Username(email);
        enter_Password(pwd);
        click_button();
        String actualText = Dashboardpage();
        String expectedText = "Dashboard";
        Assert.assertEquals(actualText, expectedText);

        click_home();

    }
}