import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPage extends SettingTest {
    BasePageObject basePageObject;
    WebDriverWait wait;

    @Before
    public void preparation() {
        basePageObject=new BasePageObject(driver);
        driver.get(basePageObject.WEBSITEURL);
    }


    @Test
    public void isDisplayedPizzaFourSeasons() throws InterruptedException {
        basePageObject.clickButtonCookieFiles();
        basePageObject.clickButtonPizza();
        basePageObject.clickButtonPizzaFourSeasons();
        basePageObject.clickButtonAddToBasket();
        basePageObject.clickButtonBasket();
        Assert.assertTrue(basePageObject.isDisplayedPizzaFourSeasonIntoBasket());
    }
}
