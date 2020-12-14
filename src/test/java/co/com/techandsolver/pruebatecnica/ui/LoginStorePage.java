package co.com.techandsolver.pruebatecnica.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginStorePage {
    public static Target USER_EMAIL = Target.the("user field").located(By.id("input-email"));
    public static Target PASSWORD = Target.the("password field").located(By.id("input-password"));
    public static Target BUTTON_LOGIN = Target.the("button login").located(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
}
