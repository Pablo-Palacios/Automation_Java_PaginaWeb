package YourStore.stepDefinitions;

import Page_Your_Store.WishListPage;
import YourStore.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class WishListDefinitions {

    WishListPage wishListPage;

    public WishListDefinitions() {
        this.wishListPage = new WishListPage(Hooks.getDriver());
    }


    @Cuando("el usuario agrega el producto iphone al wish list")
    public void elUsuarioAgregaElProductoIphoneAlWishList() {

        wishListPage.addIphoneWishList();

    }

    @Entonces("se muestra la alerta de success added al wish list")
    public void seMuestraLaAlertaDeSuccessAddedAlWishList() {

        Assert.assertEquals(wishListPage.alertAddedElementWishList(), "'wish list");
    }
}
