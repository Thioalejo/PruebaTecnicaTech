package co.com.techandsolver.pruebatecnica.tasks;

import co.com.techandsolver.pruebatecnica.ui.LoginPageHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheApplication implements Task {


    LoginPageHome loginPageHome;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(loginPageHome)
        );
    }
}
