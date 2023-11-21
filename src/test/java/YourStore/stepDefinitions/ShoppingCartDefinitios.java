package YourStore.stepDefinitions;

import Page_Your_Store.HomePage;
import Page_Your_Store.ShoppingCartPage;
import YourStore.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class ShoppingCartDefinitios {

    ShoppingCartPage shoppingCartPage;
    HomePage homePage;

    public ShoppingCartDefinitios() {
        this.shoppingCartPage = new ShoppingCartPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
    }


    @Cuando("el usuario agrega al carro la camara Canon EOS de color rojo")
    public void elUsuarioAgregaAlCarroLaCamaraCanonEOSDeColorRojo() {

        homePage.cameraSeccion();
        shoppingCartPage.addCanonRedShoppingCart();

    }


    @Entonces("se verifica que se agrego el producto al Shopping Cart")
    public void seVerificaQueSeAgregoElProductoAlShoppingCart() {

        shoppingCartPage.shoppingCart();
        Assert.assertEquals(shoppingCartPage.titleShoppingCart(), "Shopping Cart");
        Assert.assertEquals(shoppingCartPage.nameCanonCart(), "Canon EOS 5D");


    }
}
