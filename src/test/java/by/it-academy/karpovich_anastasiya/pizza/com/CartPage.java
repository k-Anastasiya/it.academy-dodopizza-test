package com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    @FindBy(xpath = "//button[text()='Корзина']")
    WebElement buttonCart;
    @FindBy(xpath = "//section[@class='section']//following::h3[1]")
    WebElement selectedPizzaIntoCart;

    public CartPage clickButtonCart() {
        buttonCart.click();
        return this;
    }
    public  String getNameOfPizza() {
        return   selectedPizzaIntoCart.getText();
    }
}
