package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    //private final By openSelector = By.id("open");
    private final By usernameSelector = By.name("username");
    private final By passwordSelector = By.name("password");
    private final By loginSelector = By.xpath("//input[@value='Enviar']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage loginAsAdmin() {
        //WebElement open = driver.findElement(openSelector);
        WebElement username = driver.findElement(usernameSelector);
        WebElement password = driver.findElement(passwordSelector);
        WebElement login = driver.findElement(loginSelector);

       // open.click();
        username.sendKeys("marciod");
        password.sendKeys("051080");
        login.submit();

        return new LoginPage(driver);
    }
}