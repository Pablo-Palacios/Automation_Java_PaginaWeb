package YourStore.stepDefinitions;

import Page_Your_Store.HomePage;
import Page_Your_Store.LoginPage;
import Page_Your_Store.MyAccountPage;
import YourStore.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;


public class LoginDefinitios {

    LoginPage loginPage;

    HomePage homePage;

    MyAccountPage myAccountPage;

    public LoginDefinitios() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }


    @Y("acciona la opcion login")
    public void accionaLaOpcionlogin() {

        homePage.ingresarLogin();

    }


    @Entonces("ingresa a la pagina login")
    public void ingresaALaPaginaCustomer() {

        Assert.assertEquals(loginPage.titleNewCustomer(), "New Customer");
        Assert.assertEquals(loginPage.titleReturningCustomer(), "Returning Customer");
    }

    @Cuando("escribe su email y password")
    public void escribeSuEmailYPassword() {

        loginPage.usuarioLogin(Hooks.getConfig_Values("username"),
                Hooks.getConfig_Values("password"));

    }

    @Y("acciona la opcion Login")
    public void accionaLaOpcionLogin() {

        loginPage.loginButton();
    }

    @Entonces("ingresa a la pagina myAccount")
    public void ingresaALaPaginaMyAccount() {

        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    }

    @Dado("que se encuentra en la pagina login")
    public void queSeEncuentraEnLaPaginaLogin() {

        homePage.ingresarLogin();

    }

    @Cuando("escribe email incorrecto o no existente")
    public void escribeEmailIncorrecto() {
        loginPage.usuarioLogin("pablomartinpalacios @gmail.com", "12345");
    }


    @Entonces("se muestra la alerta")
    public void seMuestraLaAlerta() {
        Assert.assertTrue(loginPage.alertErrorLogin(),  "algo salio mal");
    }

    @Cuando("escribe password incorrecto")
    public void escribePasswordIncorrecto() {
        loginPage.usuarioLogin("pablomartinpalacios27@gmail.com", "123");
    }

    @Y("se logea correctamente")
    public void seLogeaCorrectamente() {

        homePage.ingresarLogin();
        loginPage.usuarioLogin(Hooks.getConfig_Values("username"),
                Hooks.getConfig_Values("password"));

        loginPage.loginButton();

    }
}
