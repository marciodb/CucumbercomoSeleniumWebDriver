package paginas;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage navigateTo() {

        driver.manage().window().maximize();
        driver.navigate().to("https://pt.crmpro.com");
        assertEquals("Obtenha CRMPRO, software lír no mercado, e comece hoje.", driver.getTitle());
        return new LoginPage(driver);
    }
}