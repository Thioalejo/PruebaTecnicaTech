package co.com.techandsolver.pruebatecnica.tasks;

import co.com.techandsolver.pruebatecnica.ui.LoginStorePage;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task {

    private final String user;
    private final String password;

    protected Login(final String user, final String password) {
        this.user = user;
        this.password = password;
    }

    @Step("Log in")
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Enter.theValue(user)
                        .into(LoginStorePage.USER_EMAIL)
        );

        actor.attemptsTo(
                Enter.theValue(password)
                        .into(LoginStorePage.PASSWORD)
                        .thenHit(ENTER)
        );
    }

    public static Login login(final String userEnter, final String passwordEnter) {
        return instrumented(Login.class, userEnter, passwordEnter);
    }

}
