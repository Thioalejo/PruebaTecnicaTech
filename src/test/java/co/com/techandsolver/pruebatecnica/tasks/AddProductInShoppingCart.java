package co.com.techandsolver.pruebatecnica.tasks;

import co.com.techandsolver.pruebatecnica.ui.DescriptionProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class AddProductInShoppingCart implements Task {

    @Step("Add to shopping cart")
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(Click.on(DescriptionProductPage.BUTTON_ADD_PRODUCT_CART)
        );
    }

}
