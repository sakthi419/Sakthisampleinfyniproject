package InfyniAutomationPageObjects;

import InfyniAutomationBase.Base;
import org.openqa.selenium.By;

public class Loginpage extends Base {
    public static By click_Login=By.xpath("//span[contains(text(),'Log In')]");
    public static By enter_Username=By.xpath("//input[@type='email']");
    public static By enter_Password=By.xpath("//input[@type='password']");
    public static By click_Loginbutton=By.xpath("//button[@type='submit']");
    public static By verify_dashboard=By.xpath("//span[contains(text(),'Dashboard')]");
    public static By click_homelink=By.linkText("Home");


   public static void click_Login(){

       driver.findElement(click_Login).click();
   }


    public static String enter_Username(String username){
        driver.findElement(enter_Username).sendKeys(username);
        return username;
    }
    public static String enter_Password(String password){
        driver.findElement(enter_Password).sendKeys(password);
        return password;
    }
    public static void click_button()
    {
        driver.findElement(click_Loginbutton).click();
    }
public static String Dashboardpage() {
    String actualText = driver.findElement(verify_dashboard).getText();
    return actualText;
}
    public static void click_home()
{
        driver.findElement(click_homelink).click();
    }


}





