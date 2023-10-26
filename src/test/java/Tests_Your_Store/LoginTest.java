package Tests_Your_Store;

import Page_Your_Store.HomePage;
import Page_Your_Store.LoginPage;
import Page_Your_Store.myAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void login() {

        HomePage homePage = new HomePage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());

        myAccountPage myAccountPage = new myAccountPage(getDriver());


        getDriver().get("https://opencart.abstracta.us/");


        homePage.ingresarLogin();

        loginPage.usuarioLogin("pablomartinpalacios27@gmail.com",
                "12345");

        Assert.assertEquals(myAccountPage.getTitulo(), "My Account",
                "No se logeo correctamente");


    }


    @Test
    public void loginFallido(){

        HomePage homePage = new HomePage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());




        getDriver().get("https://opencart.abstracta.us/");


        homePage.ingresarLogin();

        loginPage.usuarioLogin("pablomartinpalacios27@gmail.com",
                "1234565");


        Assert.assertTrue(loginPage.alertErrorLogin(), "No se encontro el mensaje de alerta");


    }

}
