package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    public WebDriverWait wait;



    By titulo = By.xpath("//div[@id='logo']/h1/a");

    By AccountButton = By.xpath("//li[@class='dropdown']/a[contains(@href, 'account/account')]");

    By AccountLogin = By.xpath("//a[contains(@href, 'account/login')]");

    By registerBy = By.xpath("//a[contains(@href, 'account/register')]");




    public HomePage(WebDriver driver) {
        super(driver);
    }


    public String getTitulo() {

        return getText(titulo);

    }


    public void ingresarLogin(){

        click(AccountButton);

        click(AccountLogin);
        

    }

    public void Register(){

        click(AccountButton);

        click(registerBy);


    }



}
