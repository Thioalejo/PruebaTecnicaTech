package co.com.techandsolver.pruebatecnica.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {
    public static Target MENU_PHONES_Y_PDAS = Target.the("click on phones & PDAs ").located(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"));
}
