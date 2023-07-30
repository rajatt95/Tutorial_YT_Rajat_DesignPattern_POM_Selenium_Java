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


package tutorial.POM.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorial.POM.base.BaseTest;
import tutorial.POM.pages._02_Without_PageFactories.HomePage;
import tutorial.POM.pages._02_Without_PageFactories.LoginPage;


/**
 * This is a test class that contains test cases for the login functionality using the
 * Page Object Model (POM) without PAGE FACTORIES.
 */
public class Test_02_Login_POM_Without_PageFactories extends BaseTest {

    // Test_02_Login_POM_Without_PageFactories extends BaseTest - This is the example of INHERITANCE (OOPS Concept) - Single-level inheritance
    // The Inheritance is used to implement the "is-a" relationship.
    // It is a concept that acquires the properties and behaviors from Parent/Base/Super class to Child/Derived/Sub classes

    /**
     * Test case to verify login functionality with valid credentials.
     * It navigates to the login page, fills in the username and password, and clicks the login button.
     * After successful login, it checks the presence of the Twitter icon in the footer and verifies the footer message.
     */
    @Test
    public void test_Login_Functionality_Valid_Credentials(){

        getDriver().get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.fill_TextBox_Username("standard_user");
        loginPage.fill_TextBox_Password("secret_sauce");
        loginPage.click_Button_Login();

        HomePage homePage = new HomePage(getDriver());

        // Assert.assertEquals() -
            // Boolean values as Actual and Expected
            // String values as Actual and Expected
        // This is the example of POLYMORPHISM (OOPS Concept) - Compile Time (Method Overloading)
            // It allows us to perform a single action in different ways.
        Assert.assertEquals(homePage.get_Element_Icon_Twitter().isDisplayed(), true,
                "Assertion for Twitter icon presence in the Footer");

        String msg_FooterText_Actual = homePage.get_Element_Msg_Footer().getText();
        String msg_FooterText_Expected = "© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
        Assert.assertEquals(msg_FooterText_Actual, msg_FooterText_Expected,
                "Assertion for message present in the Footer");    }
}
