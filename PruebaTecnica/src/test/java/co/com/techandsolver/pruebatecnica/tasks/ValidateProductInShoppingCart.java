package co.com.techandsolver.pruebatecnica.tasks;

import co.com.techandsolver.pruebatecnica.ui.DescriptionProductPage;
import co.com.techandsolver.pruebatecnica.util.Util;
import static junit.framework.TestCase.assertTrue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ValidateProductInShoppingCart implements Task {

    private Util util = new Util();
    private final String product;

    protected ValidateProductInShoppingCart(final String product) {
        this.product = product;
    }

    @Step("See product in the shopping cart")
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(Click.on(DescriptionProductPage.BUTTON_SEE_PRODUCT_IN_CART)
        );

        actor.attemptsTo(Click.on(DescriptionProductPage.BUTTON_SEE_PRODUCT_IN_CART)
        );

        actor.attemptsTo(Click.on(DescriptionProductPage.LINK_TEXT_SEE_CART)
        );

        if (!util.searchText(product)) {
            assertTrue("Product not found", false);
        }
    }

    public static ValidateProductInShoppingCart validateProductInCart(final String product) {
        return instrumented(ValidateProductInShoppingCart.class,
                 product);
    }
}
