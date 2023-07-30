/**
 * Author: Rajat Verma
 * Email: rajatvermaa95@gmail.com
 * GitHub Profile: https://github.com/rajatt95
 * GitHub Page: https://rajatt95.github.io/
 * LinkedIn: https://www.linkedin.com/in/rajatt95/
 * Topmate: https://topmate.io/rajatt95
 * Telegram: https://t.me/rajatt95
 * Instagram: https://www.instagram.com/rajattvermaa95/
 * YouTube: https://www.youtube.com/@rajatt95
 * WhatsApp: https://chat.whatsapp.com/DVRP0ViD0YwELUKF2XMJHy
 */

/***************************************************/

package tutorial.POM.base;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * This is the BaseTest class, which serves as the base class for all test classes in the project.
 * It contains common setup and teardown methods to be executed before and after each test method.
 */
public class BaseTest {

    WebDriver driver;

    /**
     * This method is executed before each test method.
     * It sets up the WebDriver instance and configures it to use the ChromeDriver.
     * Other drivers like EdgeDriver and FirefoxDriver can also be set up using this method.
     */
    @BeforeMethod
    public void setup(){
        // System.setProperty("webdriver.chrome.driver","path to chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.edgedriver().setup();
        // WebDriverManager.firefoxdriver().setup();


        // driver - Reference name
        // WebDriver - Interface
        // ChromeDriver - Class
        // new - Keyword in Java (used to create the object a class)

        // This is the example of ABSTRACTION (OOPS Concept)
            // Abstraction is a process of hiding the implementation details and showing only functionality to the user.
        driver = new ChromeDriver();
        // driver = new EdgeDriver();
        // driver = new FirefoxDriver();

    }

    /**
     * This method is executed after each test method.
     * It performs a delay of 5 seconds before quitting the WebDriver instance.
     */
    @AfterMethod
    public void tearDown(){
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }*/
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        driver.quit();
    }

    /**
     * Returns the WebDriver instance for test classes to use.
     *
     * @return The WebDriver instance.
     */
    public WebDriver getDriver(){
        return driver;
    }


}
