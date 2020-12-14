package co.com.techandsolver.pruebatecnica.tasks;

import co.com.techandsolver.pruebatecnica.ui.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class OpenTheMenuApplication implements Task {

    @Step("Enter the submenu phones & PDAs")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuPage.MENU_PHONES_Y_PDAS)
        );

    }
}
