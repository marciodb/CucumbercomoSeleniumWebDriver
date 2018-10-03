package paginas;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NavigationPage extends BasePage {
    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    public NavigationPage checkForNavigationList() {

        String title = driver.getTitle();
        System.out.println("titulo pagina principal ::" + title);
        Assert.assertEquals("CRMPRO", title);
        return new NavigationPage(driver);
    }
}