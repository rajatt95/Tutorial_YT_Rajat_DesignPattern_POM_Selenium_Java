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

package tutorial.POM.pages._06_HandleComponents.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Represents the Header of the web application.
 * This class contains web elements declaration and methods to interact with the elements on the Header component.
 */

public class AppHeader {
    WebDriver driver;

    /**
     * Initializes a new instance of the AppHeader class.
     *
     * @param driver The WebDriver object used to interact with the web browser.
     */
    public AppHeader(WebDriver driver) {
        this.driver = driver;
    }

    /***************************************************************************************/
    // Data Members | Properties
    // Web Elements Declaration
    /***************************************************************************************/

    // Without Page Factories

    // Creating WebElements as private and public methods to access them -
      // This is the example of ENCAPSULATION (OOPS Concept)
        // Encapsulation refers to integrating data (variables) and code (methods) into a single unit.
        // A class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.

    // Locator for the heading SwagLabs
    private final By heading_SwagLabs = By.xpath("//*[@class='app_logo']");

    /***************************************************************************************/
    // Methods | Tasks | Functionality | Behavior
    // Operations on the Web Elements
    /***************************************************************************************/

    /**
     * Returns the WebElement representing the heading SwagLabs in the header component.
     *
     * @return The WebElement representing the heading SwagLabs.
     */
    public WebElement get_Element_Heading_SwagLabs(){
        return driver.findElement(heading_SwagLabs);
    }
}
