package InfyniApplicationTestCase;

import InfyniAutomationPageObjects.Linkpage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class BlogsTestcase extends Linkpage {
    @Test
    public static void Blogs_Verification() {
        String parent = driver.getWindowHandle();
        Blogs_linkClick();


        Set<String> s = driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                String BlogsactualText = driver.switchTo().window(child_window).getTitle();
                String BlogsexpectedText = "Infyni Blog: Insights and Trends to Watch Out For";
                Assert.assertEquals(BlogsactualText, BlogsexpectedText);
                closeBrowser();
                driver.switchTo().window(parent);

                closeBrowser();
            }

        }
    }
}