package YourStore.stepDefinitions;

import Page_Your_Store.HomePage;
import Page_Your_Store.WishListPage;
import YourStore.Hooks.Hooks;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class WishListDefinitions {

    WishListPage wishListPage;

    HomePage homePage;

    public WishListDefinitions() {

        this.wishListPage = new WishListPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Y("agrega a favoritos la camara Canon")
    public void agregaAFavoritosLaCamaraCanon() {

        wishListPage.addCamaraCanonFav();
    }


    @Entonces("se verifica que el producto se agrego a la lista de favoritos")
    public void seVerificaQueElProductoSeAgregoALaListaDeFavoritos() {

        wishListPage.wishListButton();
        Assert.assertEquals(wishListPage.getTitle(), "My Wish List");
        Assert.assertEquals(wishListPage.nameCamaraCanonWishList(), "Canon EOS 5D");


    }
}
