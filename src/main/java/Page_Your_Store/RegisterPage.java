package Page_Your_Store;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    Faker faker = new Faker();


    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    private  By AccountBy = By.xpath("//div[@id='content']/h1");

    private By firstNameBy = By.id("input-firstname");

    private By lastNameBy = By.id("input-lastname");

    private By emailBy = By.id("input-email");
    private By telefhoneBy = By.id("input-telephone");

    private By passwordBy = By.id("input-password");

    private By confirmPasswordBy = By.id("input-confirm");

    private By agreeBy = By.xpath("//div[@class='pull-right']/input[contains(@name, 'agree')]");

    private By continuenBy = By.xpath("//div[@class='pull-right']/input[contains(@value, 'Continue')]");

    private By confirmRegisterBy = By.xpath("//div[@id='content']/p[text()='Congratulations! Your new account has been successfully created!']");

    private By noSubcritorBy = By.xpath("//input[contains(@value, '0')]");

    private By yesSubcritoBy = By.xpath("//label[@class='radio-inline']/input[contains(@value, '1')]");

    private By alertEmailExistenteBy = By.xpath("//div [@class='alert alert-danger alert-dismissible']");

    private By continuarButtonAccountBy = By.xpath("//div [@class='pull-right']/a[contains(@href, 'account/account')]");

    private By alertFirstNameFailBy = By.xpath("//div[text() = 'First Name must be between 1 and 32 characters!']");

    private By alertLastNameFailBy = By.xpath("//div[text() = 'Last Name must be between 1 and 32 characters!']");

    private By alertEmailFailBy = By.xpath("//div[text() = 'E-Mail Address does not appear to be valid!']");

    private By alertTelefonoFailBy = By.xpath("//div[text() = 'Telephone must be between 3 and 32 characters!']");

    private By alertPasswordFailBy = By.xpath("//div[text() = 'Password must be between 4 and 20 characters!']");






    public String getTitulo(){

        return getText(AccountBy);

    }

    public void continuarAccounButton(){

        click(continuarButtonAccountBy);
    }



    public void formularioPersonal_Details(String firstName,
                                           String lastName,
                                           String email,
                                           String telefhone,
                                           String password){

        sendKeys(firstNameBy, firstName);
        sendKeys(lastNameBy, lastName);
        sendKeys(emailBy, email);
        sendKeys(telefhoneBy, telefhone);
        sendKeys(passwordBy, password);
        sendKeys(confirmPasswordBy, password);


    }


    public void agreeBox(){

        click(agreeBy);
    }

    public void continueButton(){

        click(continuenBy);
    }

    public boolean textConfirmRegister(){

        return isDisplayed(confirmRegisterBy);
    }

    public void noSubscribir(){

       click(noSubcritorBy);
    }

    public void yesSubscribir(){

       click(yesSubcritoBy);
    }

    public boolean alertaEmail(){

        return isDisplayed(alertEmailFailBy);
    }

    public boolean alertaNombre(){

        return isDisplayed(alertFirstNameFailBy);
    }

    public boolean alertaApellido(){

        return isDisplayed(alertLastNameFailBy);
    }


    public boolean alertaTelefono(){

        return isDisplayed(alertTelefonoFailBy);
    }


    public  boolean alertaPassword(){

        return isDisplayed(alertPasswordFailBy);
    }















}
