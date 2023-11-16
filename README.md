<!--
    #/**
    # * @author Rajat Verma
    # * Email: rajatvermaa95@gmail.com
    # * GitHub Profile: https://github.com/rajatt95
    # * GitHub Page: https://rajatt95.github.io/
    # * LinkedIn: https://www.linkedin.com/in/rajatt95/
    # * Topmate: https://topmate.io/rajatt95
    # * Telegram: https://t.me/rajatt95
    # * Instagram: https://www.instagram.com/rajattvermaa95/
    # * YouTube: https://www.youtube.com/@rajatt95
    # * WhatsApp Community: https://chat.whatsapp.com/DVRP0ViD0YwELUKF2XMJHy
    # * WhatsApp Channel: https://whatsapp.com/channel/0029Va9XXMhJ93waOU5Xer3r
    # */
    #/***************************************************/
-->
---
# 💻 Tutorial | Page Object Model (POM)

[![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)

[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![TestNG](https://img.shields.io/badge/TestNG-1E5799?style=for-the-badge&logo=testng&logoColor=white)](https://testng.org/doc/)
[![Page Object Model](https://img.shields.io/badge/Page_Object_Model-4285F4?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA5klEQVR42mJ8/vz8PwMxgAO4BMZcA5xggnIKCAkw4IACZpMHwBwD6EIAOMmQFQBzF8HlACMwMFAHMRgD8GVMH8CZAAAAAElFTkSuQmCC)](https://en.wikipedia.org/wiki/Page_Object_Model)

## 📑 Table of Contents

- [Introduction](#introduction)
- [Video Tutorial](#video-tutorial)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Other Projects](#other-projects)
- [Technical Documents](#technical-documents)
- [Contacts](#contacts)

## 📖 Introduction
This repository contains a Tutorial for Page Object Model (POM) design pattern implementation using Selenium WebDriver and Java for automated testing of web applications.

## 🎥 Video Tutorial

<a href="https://www.youtube.com/watch?v=_NoOYqg8pJ4"> <img src="https://img.youtube.com/vi/_NoOYqg8pJ4/0.jpg" alt="Tutorial | POM | Selenium WebDriver + Java | Part 02 - Implement without Page Factories" width="200"> </a>

Click on the image above to watch the tutorial.

## 🛠️ Prerequisites

- [![Java JDK](https://img.shields.io/badge/Java_JDK-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/technologies/javase-downloads.html) (v11 or higher recommended)
- [![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/) (v3.8.7 or higher recommended)

## ▶️ Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/rajatt95/Tutorial_YT_Rajat_DesignPattern_POM_Selenium_Java
   ```

2. Navigate to the project directory:
   ```bash
   cd Tutorial_YT_Rajat_DesignPattern_POM_Selenium_Java
   ```

3. Install dependencies:
   ```bash
   mvn clean install
   ```

## 🚀 Running Tests

You can execute the tests using the test runner class located in `src/test/java`:

- **Run All Tests**: Execute the testng.xml file to run all the tests.

- **Run Specific Test**: The test runner class allows you to run specific test methods if needed.

- Execute tests using Maven:

  ```bash
  mvn clean test
  ``` 

## 📁 Project Structure

The tests follow a modular and maintainable structure:

```
|-- src
|     |-- main
|          |-- java
|              |-- tutorial.POM.pages
|                  |-- _02_Without_PageFactories
|                      |-- HomePage
|                      |-- LoginPage
|                  |-- _03_With_PageFactories
|                      |-- HomePage
|                      |-- LoginPage
|                  |-- _04_BuilderPattern
|                     |-- HomePage
|                      |-- LoginPage
|                 |-- _05_FluentInterface
|                      |-- HomePage
|                      |-- LoginPage
|                 |-- _06_HandleComponents
|                      |-- components
|                          |-- AppHeader
|                      |-- HomePage
|                      |-- LoginPage
|     |-- test
|          |-- java
|              |-- tutorial.POM
|                  |-- base
|                    |-- BaseTest
|                  |-- tests
|                      |-- Test_02_Login_POM_Without_PageFactories
|                      |-- Test_03_Login_POM_With_PageFactories
|                      |-- Test_04_Login_POM_BuilderPattern
|                      |-- Test_05_Login_POM_FluentInterface
|                      |-- Test_06_Login_POM_Components
|-- testng.xml
```

- `src/main/java/tutorial.POM.pages`: Contains the Page Object Model (POM) classes representing web pages and their elements.
- `src/test/java/tutorial.POM.base`: Contains the Base for every test (setup and tearDown methods).
- `src/test/java/tutorial.POM.tests`: Contains the actual test files. You can organize your tests into subdirectories as needed.
- `testng.xml`: Tests execution configuration file 

## ⚙️ Configuration

- Modify `testng.xml` for Tests execution configuration settings.
- Customize `BaseTest` for setup and tearDown methods (Change browser for tests execution).

## 🔭 Other Projects

- [![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://github.com/stars/rajatt95/lists/programming-language-java)  -
  [![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://github.com/stars/rajatt95/lists/selenium-automation-frameworks)
  [![Appium](https://img.shields.io/badge/Appium-40C4FF?style=for-the-badge&logo=appium&logoColor=white)](https://github.com/stars/rajatt95/lists/appium-automation-frameworks)
  [![Rest Assured](https://img.shields.io/badge/Rest%20Assured-5B47A5?style=for-the-badge&logo=rest-assured&logoColor=white)](https://github.com/stars/rajatt95/lists/restassured-automation-framework)

- [![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)](https://github.com/stars/rajatt95/lists/programming-language-javascript) -
  [![Cypress](https://img.shields.io/badge/Cypress-17202C?style=for-the-badge&logo=cypress&logoColor=white)](https://github.com/stars/rajatt95/lists/cypress-automation-frameworks)
  [![Playwright](https://img.shields.io/badge/Playwright-34495E?style=for-the-badge&logo=playwright&logoColor=white)](https://github.com/stars/rajatt95/lists/playwright-automation-frameworks)

- [![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)](https://github.com/stars/rajatt95/lists/programming-language-python) -
  [![Requests](https://img.shields.io/badge/Requests-2CA5E0?style=for-the-badge&logo=python&logoColor=white)](https://github.com/stars/rajatt95/lists/requests-automation-framework)

## 📄 Technical Documents
- [![Google Drive](https://img.shields.io/badge/Google%20Drive-4285F4?style=for-the-badge&logo=google-drive&logoColor=white)](https://drive.google.com/drive/folders/1tne9pZjgWvfrS0l9tVHs6k1jnQHpTLoA?usp=sharing)
- [![GitHub Repository](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rajatt95/Documents)

## 📧 Contacts

- [![Email](https://img.shields.io/badge/Email-rajatvermaa95%40gmail.com-green)](mailto:rajatvermaa95@gmail.com)
- [![GitHub Profile](https://img.shields.io/badge/GitHub-Profile-blue)](https://github.com/rajatt95)
- [![GitHub Page](https://img.shields.io/badge/GitHub-Page-lightgrey)](https://rajatt95.github.io/)
- [![LinkedIn](https://img.shields.io/badge/LinkedIn-Profile-blue)](https://www.linkedin.com/in/rajatt95)
- [![Topmate](https://img.shields.io/badge/Topmate-Profile-red)](https://topmate.io/rajatt95)
- [![Telegram](https://img.shields.io/badge/Telegram-Channel-blue)](https://t.me/rajatt95)
- [![Instagram](https://img.shields.io/badge/Instagram-Profile-orange)](https://www.instagram.com/rajattvermaa95/)
- [![YouTube](https://img.shields.io/badge/YouTube-Channel-red)](https://www.youtube.com/@rajatt95)
- [![WhatsApp Community](https://img.shields.io/badge/WhatsApp-Community-brightgreen)](https://chat.whatsapp.com/LP20xMGvxnEL88GoB58bo1)
- [![WhatsApp Channel](https://img.shields.io/badge/WhatsApp-Channel-brightgreen)](https://whatsapp.com/channel/0029Va9XXMhJ93waOU5Xer3r)

Feel free to reach out if you have any questions, or suggestions, or just want to chat!

Thanks for visiting my GitHub profile! 😊

<p align="left"> <img src="https://komarev.com/ghpvc/?username=rajatt95&label=Profile%20views&color=0e75b6&style=flat" alt="rajatt95" /> </p>
