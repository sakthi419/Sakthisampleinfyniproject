package InfyniApplicationTestCase;

import InfyniAutomationPageObjects.Linkpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FreeWebinarVerification extends Linkpage {

    @Test
    public static void freeWebinar_Verification() {
        freeWebinar_linkClick();

        String actualText = headerVerification_freewebinar();
        String expectedText = "Free Webinars";
        Assert.assertEquals(actualText, expectedText);
        driver.navigate().back();
    }
            }



