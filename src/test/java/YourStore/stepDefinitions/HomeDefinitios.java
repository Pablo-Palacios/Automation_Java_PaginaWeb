package YourStore.stepDefinitions;

import Page_Your_Store.HomePage;
import YourStore.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class HomeDefinitios {

    HomePage homePage;

    public HomeDefinitios(){
        this.homePage = new HomePage(Hooks.getDriver());
    }



    @Dado("que el usuario ingresa a la pagina opencart")
    public void queElUsuarioIngresaALaPaginaOpencart() {
      Hooks.getDriver().get(Hooks.getConfig_Values("url"));


    }

    @Entonces("se valida que el usuario se encuentra en la pantalla home")
    public void seValidaQueElUsuarioSeEncuentraEnLaPantallaHome() {
        Assert.assertEquals(homePage.getTitulo(), "Your Store");

    }

    @Cuando("acciona la opcion my account-login")
    public void accionaLaOpcionMyAccount() {
        homePage.ingresarLogin();
    }


}
