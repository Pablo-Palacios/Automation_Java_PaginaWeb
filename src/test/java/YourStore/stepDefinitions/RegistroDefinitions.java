package YourStore.stepDefinitions;

import Page_Your_Store.RegisterPage;
import Page_Your_Store.HomePage;
import Page_Your_Store.LoginPage;
import Page_Your_Store.MyAccountPage;
import YourStore.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;
import com.github.javafaker.Faker;

public class RegistroDefinitions {


    LoginPage loginPage;

    HomePage homePage;

    RegisterPage registerPage;

    MyAccountPage myAccountPage;

    Faker faker = new Faker();

    public RegistroDefinitions() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }



    @Y("acciona la opcion my account-register")
    public void accionaLaOpcionMyAccountRegister() {

        homePage.Register();
    }

    @Entonces("ingresa a la pagina account")
    public void ingresaALaPaginaAccount() {

        Assert.assertEquals(registerPage.getTitulo(), "Account");

    }

    @Cuando("el usuario completa todos los campos")
    public void elUsuarioCompletaTodosLosCampos() {

        registerPage.formularioPersonal_Details(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password()
                );

        registerPage.agreeBox();
        registerPage.continueButton();

    }


    @Y("no se suscribe")
    public void noSeSuscribe() {

        registerPage.noSubscribir();
    }

    @Y("acciona el check box privacy policy")
    public void accionaElCheckBoxPrivacyPolicy() {

        registerPage.agreeBox();
    }

    @Y("acciona la opcion continuar")
    public void accionaLaOpcionContinuar() {

        registerPage.continueButton();
    }

    @Entonces("se visualiza mensaje de creado correctamente")
    public void seVisualizaMensajeDeCreadoCorrectamente() {

        Assert.assertTrue(registerPage.textConfirmRegister(), "No se registro correctamente");
    }

    @Y("se dirige a la pagina myAccount")
    public void seDirigeALaPaginaMyAccount() {


        registerPage.continuarAccounButton();

        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    }



    @Y("si se suscribe")
    public void siSeSuscribe() {

        registerPage.yesSubscribir();

    }


    @Cuando("el usuario completa los campos con nombre {string}, apellido {string}, email {string}, telefono {string}, password {string}")
    public void elUsuarioCompletaLosCamposConNombreApellidoEmailTelefonoPassword(String nombre,
                                                                                 String apellido,
                                                                                 String email,
                                                                                 String telefono,
                                                                                 String password) {


        registerPage.formularioPersonal_Details(nombre, apellido, email, telefono, password);

        registerPage.agreeBox();
        registerPage.continueButton();


    }



    @Cuando("el usuario completa todos los campos subscribiendose")
    public void elUsuarioCompletaTodosLosCamposSubscribiendose() {

        registerPage.formularioPersonal_Details(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password()
        );

        registerPage.yesSubscribir();
        registerPage.agreeBox();
        registerPage.continueButton();
    }

    @Cuando("el usuario deja vacio los campos")
    public void elUsuarioDejaVacioLosCampos() {

        registerPage.agreeBox();
        registerPage.continueButton();
    }

    @Entonces("se verefican los mensajes  de error en los campos")
    public void seVereficanLosMensajesDeErrorEnLosCampos() {


        Assert.assertTrue(registerPage.alertaApellido());
        Assert.assertTrue(registerPage.alertaNombre());
        Assert.assertTrue(registerPage.alertaEmail());
        Assert.assertTrue(registerPage.alertaTelefono());
        Assert.assertTrue(registerPage.alertaPassword());



    }
}
