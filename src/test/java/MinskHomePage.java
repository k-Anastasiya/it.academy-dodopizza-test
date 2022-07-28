import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MinskHomePage extends CartPage{

    private WebDriver driver;

    public MinskHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public static final String BASE_URL = "https://dodopizza.by/minsk";
    @FindBy(xpath = "//div[@class='grid']//a[text()='Пицца']")
    WebElement buttonPizza;
    @FindBy(xpath = "//div[3]/span/button")
    WebElement buttonCookieFiles;
    @FindBy(xpath = "//section[@id='pizzas']//picture//img[@title='Четыре сезона']")
    WebElement buttonChoosePizzaFourSeasons;
    @FindBy(xpath = "//button[contains (text(),'Добавить в корзину за')]")
    WebElement buttonAddToBasket;


    public MinskHomePage clickButtonPizza() {
        buttonPizza.click();
        return this ;
    }
    public MinskHomePage clickButtonCookieFiles() {
        buttonCookieFiles.click();
        return this;
    }
    public MinskHomePage clickButtonPizzaFourSeasons() {
        buttonChoosePizzaFourSeasons.click();
        return this;
    }
    public MinskHomePage clickButtonAddToCart(){
        buttonAddToBasket.click();
        return this;
    }

}