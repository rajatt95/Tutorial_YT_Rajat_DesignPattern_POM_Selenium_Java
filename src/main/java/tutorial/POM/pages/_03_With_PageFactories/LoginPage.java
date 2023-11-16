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
 * WhatsApp Community: https://chat.whatsapp.com/DVRP0ViD0YwELUKF2XMJHy
 * WhatsApp Channel: https://whatsapp.com/channel/0029Va9XXMhJ93waOU5Xer3r
 */

/***************************************************/

package tutorial.POM.pages._03_With_PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

        // To initialize the Web Elements Declared
        PageFactory.initElements(driver, this);

    }

    /***************************************************************************************/
    // Data Members | Properties
    // Web Elements Declaration
    /***************************************************************************************/


    // With Page Factories
    @FindBy(xpath = "//*[@id='user-name']")
    private WebElement textBox_Username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement textBox_Password;

    @FindBy(id = "login-button")
    private WebElement button_Login;


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
        textBox_Username.sendKeys(username);
    }

    /**
     * Fills the password field with the provided password.
     *
     * @param password The password to be filled in the password field.
     */
    public void fill_TextBox_Password(String password){
        textBox_Password.sendKeys(password);
    }

    /**
     * Clicks the login button.
     */
    public void click_Button_Login(){
        button_Login.click();
    }

}
