package co.com.techandsolver.pruebatecnica.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class SearchSeeDetailProduct implements Task {

    private final String product;

    protected SearchSeeDetailProduct(final String product) {
        this.product = product;
    }

    @Step("Enter detail product")
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(Click.on("//*[contains(text(),'" + product + "')]")
        );
    }

    public static SearchSeeDetailProduct clickInProduct(final String product) {
        return instrumented(SearchSeeDetailProduct.class, product);
    }
}
