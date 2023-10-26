package Tests_Your_Store;

import Page_Your_Store.AccountPage;
import Page_Your_Store.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends Base{

    @Test
    public void Register(){

        getDriver().get("https://opencart.abstracta.us/");


        HomePage homePage = new HomePage(getDriver());

        AccountPage accountPage = new AccountPage(getDriver());




        homePage.Register();


        Assert.assertEquals(accountPage.getTitulo(), "Account", "No se encuentra en la pagina de Register");


        accountPage.formularioPersonal_Details("Martin", "Peralta", "juan1@gmail.com", "3542548345");

        accountPage.formularioPassword("123456", "123456");

        accountPage.agreeBox();

        accountPage.continueButton();

        Assert.assertEquals(accountPage.textConfirmRegister(), "Congratulations! Your new account has been successfully created!");




        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }


}
