package InfyniAutomationPageObjects;

import InfyniAutomationBase.Base;
import org.openqa.selenium.By;

public class Linkpage extends Base
{
    public static By Blogs_Click = By.xpath("//a[contains(text(),'Blogs')]");
    public static By HeaderVerificationinBlogsPage = By.xpath("//a[@class='dark-logo'])");
    public static By freewebinar_Click=By.xpath("//a[@href='/free-webinars']");
    public static By HeaderVerificationfreewebinarPage=By.xpath("//p[contains(text(),'Free Webinars')]");

    public static void Blogs_linkClick() {
        try {
            driver.findElement(Blogs_Click).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*public static String headerVerification(){
        String actualText=  driver.findElement(HeaderVerificationinBlogsPage).getText();
        return actualText;
    }*/

    public static void freeWebinar_linkClick() {
        try {
            driver.findElement(freewebinar_Click).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String headerVerification_freewebinar(){
        String actualText=  driver.findElement(HeaderVerificationfreewebinarPage).getText();
        return actualText;
    }


}
