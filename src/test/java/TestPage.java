import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPage extends SettingTest {
    BasePageObject basePageObject;

    @Before
    public void preparation() {
        basePageObject=new BasePageObject(driver);
        driver.get(basePageObject.WEBSITEURL);
    }


    @Test
    public void isDisplayedPizzaFourSeasons()  {
        basePageObject.clickButtonCookieFiles();
        basePageObject.clickButtonPizza();
        basePageObject.clickButtonPizzaFourSeasons();

        basePageObject.clickButtonAddToBasket();
        basePageObject.clickButtonBasket();
        Assert.assertTrue(basePageObject.isDisplayedPizzaFourSeasonIntoBasket());
    }
}
