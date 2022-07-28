import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPage extends BaseTest {
    MinskHomePage minskHomePage;
    WebDriverWait wait;

    @Before
    public void preparation() {
        minskHomePage =new MinskHomePage(driver);
        driver.get(minskHomePage.BASE_URL);
    }
    @Test
    public void isDisplayedPizzaFourSeasons() throws InterruptedException {
        minskHomePage.clickButtonCookieFiles().clickButtonPizza().clickButtonPizzaFourSeasons().clickButtonAddToCart().clickButtonCart();
        Assert.assertEquals("Четыре сезона", minskHomePage.getNameOfPizza());
    }
}