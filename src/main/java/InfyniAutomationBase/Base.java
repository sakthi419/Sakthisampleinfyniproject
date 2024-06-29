package InfyniAutomationBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Base {
    public static WebDriver driver;
    public static void launchApplication(String browser)
    {
        switch(browser){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            case "FireFox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                System.out.println("Browser is Invalid");
        }
        driver.get("https://devnj.infyni.com/");
        driver.manage().window().maximize();
    }
    public static void implicitWait(int time){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
    public static void closeBrowser(){
        driver.close();
    }
}
