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

package tutorial.POM.pages._02_Without_PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Represents the LoginPage of the web application.
 * This class contains web elements declaration and methods to interact with the elements on the Login page.
 */
public class LoginPage {

    WebDriver driver;

    /**
     * Constructor for the LoginPage class.
     * Initializes the WebDriver.
     *
     * @param driver The WebDriver instance to be used for interacting with the web application.
     */
    public LoginPage(WebDriver driver){
        // RHS driver - coming from the test class
            // When we are creating the object of this class
                // Constructor of this class gets called
        // LHS driver - defined in this class
        this.driver = driver;
    }

    /***************************************************************************************/
    // Data Members | Properties
    // Web Elements Declaration
    /***************************************************************************************/


    // Without Page Factories
    private By textBox_Username = By.xpath("//*[@id=\"user-name\"]");
    private By textBox_Password = By.xpath("//input[@placeholder='Password']");
    private By button_Login = By.id("login-button");

    /***************************************************************************************/
    // Methods | Tasks | Functionality | Behavior
    // Operations on the Web Elements
    /***************************************************************************************/

    /**
     * Fills the username field with the provided username.
     *
     * @param username The username to be filled in the username field.
     */
    public void fill_TextBox_Username(String username){
        driver.findElement(textBox_Username).sendKeys(username);
    }

    /**
     * Fills the password field with the provided password.
     *
     * @param password The password to be filled in the password field.
     */
    public void fill_TextBox_Password(String password){
        driver.findElement(textBox_Password).sendKeys(password);
    }

    /**
     * Clicks the login button.
     */
    public void click_Button_Login(){
        driver.findElement(button_Login).click();
    }


}