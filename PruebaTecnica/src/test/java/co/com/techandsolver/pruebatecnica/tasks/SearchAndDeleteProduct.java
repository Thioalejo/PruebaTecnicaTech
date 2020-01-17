package co.com.techandsolver.pruebatecnica.tasks;

import co.com.techandsolver.pruebatecnica.util.Util;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class SearchAndDeleteProduct implements Task {

    private Util util = new Util();
    private final String product;

    protected SearchAndDeleteProduct(final String product) {
        this.product = product;
    }

    @Override
    @Step("Delete product from cart")
    public <T extends Actor> void performAs(T actor) {
        util.searchTextAndClick(product);
    }

    public static SearchAndDeleteProduct clickInProductToDelete(final String product) {
        return instrumented(SearchAndDeleteProduct.class, product);
    }
}
