package Tests_Your_Store;

import Page_Your_Store.RegisterPage;
import Page_Your_Store.HomePage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends Base{

    @Test
    public void Register(){

        HomePage homePage = new HomePage(getDriver());

        RegisterPage accountPage = new RegisterPage(getDriver());

        Faker faker = new Faker();



        getDriver().get("https://opencart.abstracta.us/");

        homePage.Register();

        accountPage.formularioPersonal_Details(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password());


        accountPage.agreeBox();

        accountPage.continueButton();



        Assert.assertTrue(accountPage.textConfirmRegister());
        Assert.assertEquals(accountPage.getTitulo(), "Account", "No se encuentra en la pagina de Register");




        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }


}
