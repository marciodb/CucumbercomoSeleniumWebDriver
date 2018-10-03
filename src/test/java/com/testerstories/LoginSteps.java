package com.testerstories;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.LoginPage;
import paginas.NavigationPage;


public class LoginSteps {
    WebDriver driver;
    LoginPage login;
    NavigationPage nav;

    @Given("^the Symbiote home page$")


    public void the_Symbiote_home_page() throws Throwable {

        login = new LoginPage(driver);
        login.navigateTo();
    }

    @When("^logging in as an admin$")
    public void logging_in_as_an_admin() throws Throwable {
        login.loginAsAdmin();
    }

    @Then("^the home page navigation is available$")
    public void the_home_page_navigation_is_available() throws Throwable {
        nav = new NavigationPage(driver);
        nav.checkForNavigationList();
    }

    @Before
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marciod\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
