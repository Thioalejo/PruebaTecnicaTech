package co.com.techandsolver.pruebatecnica.features.compras;

import co.com.techandsolver.pruebatecnica.tasks.AddProductInShoppingCart;
import static net.serenitybdd.screenplay.GivenWhenThen.and;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import co.com.techandsolver.pruebatecnica.tasks.OpenTheApplication;
import co.com.techandsolver.pruebatecnica.tasks.OpenTheMenuApplication;
import co.com.techandsolver.pruebatecnica.tasks.Login;
import co.com.techandsolver.pruebatecnica.tasks.SearchSeeDetailProduct;
import co.com.techandsolver.pruebatecnica.tasks.SearchAndDeleteProduct;
import co.com.techandsolver.pruebatecnica.tasks.ValidateProductInShoppingCart;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ValidateShoppingCart {

    Actor alejandro = Actor.named("alejandro");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Steps
    OpenTheMenuApplication openTheMenuApplication;

    @Steps
    AddProductInShoppingCart addProductInShoppingCart;

    @Before
    public void annaCanBrowseTheWeb() {
        alejandro.can(BrowseTheWeb.with(herBrowser));
        givenThat(alejandro).wasAbleTo(openTheApplication);
        and(alejandro).attemptsTo(Login.login("alejo.saraza@gmail.com", "123456"));
    }

    @Test
    public void add_A_Product_And_Remove_From_Shopping_Cart() throws InterruptedException {

        givenThat(alejandro).wasAbleTo(openTheMenuApplication);

        and(alejandro).attemptsTo(SearchSeeDetailProduct.clickInProduct("HTC Touch HD"));

        when(alejandro).wasAbleTo(addProductInShoppingCart);

        and(alejandro).attemptsTo(ValidateProductInShoppingCart.validateProductInCart("HTC Touch HD"));

        then(alejandro).attemptsTo(SearchAndDeleteProduct.clickInProductToDelete("HTC Touch HD"));
    }
}
