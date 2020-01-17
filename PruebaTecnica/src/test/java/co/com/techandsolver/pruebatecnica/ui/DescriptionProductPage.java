package co.com.techandsolver.pruebatecnica.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DescriptionProductPage {
    public static Target BUTTON_ADD_PRODUCT_CART = Target.the("add product to cart button").located(By.id("button-cart"));
    public static Target BUTTON_SEE_PRODUCT_IN_CART = Target.the("button see product in cart").located(By.id("cart-total"));
    public static Target LINK_TEXT_SEE_CART = Target.the("link see shopping cart").located(By.linkText("shopping cart"));
}
