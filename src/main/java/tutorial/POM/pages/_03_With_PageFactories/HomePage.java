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

package tutorial.POM.pages._03_With_PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Represents the HomePage of the web application.
 * This class contains web elements declaration and methods to interact with the elements on the Home page.
 */

public class HomePage {

    WebDriver driver;

    /**
     * Constructor for the HomePage class.
     * Initializes the WebDriver.
     *
     * @param driver The WebDriver instance to be used for interacting with the web application.
     */
    public HomePage(WebDriver driver){
        // RHS driver - coming from the test class
            // When we are creating the object of this class
                // Constructor of this class gets called
        // LHS driver - defined in this class
        this.driver = driver;

        // To initialize the Web Elements Declared
        PageFactory.initElements(driver, this);
    }

    /***************************************************************************************/
    // Data Members | Properties
    // Web Elements Declaration
    /***************************************************************************************/

    // With Page Factories

    // Creating WebElements as private and public methods to access them -
        // This is the example of ENCAPSULATION (OOPS Concept)
            // Encapsulation refers to integrating data (variables) and code (methods) into a single unit.
            // A class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.

    @FindBy(xpath = "//a[normalize-space()='Twitter']")
    private WebElement icon_Twitter;

    @FindBy(xpath = "//div[@class='footer_copy']")
    private WebElement msg_Footer;

    /***************************************************************************************/
    // Methods | Tasks | Functionality | Behavior
    // Operations on the Web Elements
    /***************************************************************************************/

    /**
     * Returns the WebElement representing the Twitter icon on the Home page.
     *
     * @return The WebElement representing the Twitter icon.
     */
    public WebElement get_Element_Icon_Twitter(){
        return icon_Twitter;
    }

    /**
     * Returns the WebElement representing the footer message on the Home page.
     *
     * @return The WebElement representing the footer message.
     */
    public WebElement get_Element_Msg_Footer(){
        return msg_Footer;
    }

}
