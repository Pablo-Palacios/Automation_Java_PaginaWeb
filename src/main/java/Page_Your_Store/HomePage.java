package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    public WebDriverWait wait;



    private By titulo = By.xpath("//div[@id='logo']/h1/a");

    private By AccountButton = By.xpath("//li[@class='dropdown']/a[contains(@href, 'account/account')]");

    private By AccountLogin = By.xpath("//a[contains(@href, 'account/login')]");

    private By registerBy = By.xpath("//a[contains(@href, 'account/register')]");

    private By cameraSeccionBy = By.xpath("//a[contains(@href, 'gory&path=33')]");

    private By cameraCanonBy = By.xpath("//div[@class='product-thumb']//a[contains(text(), 'Canon EOS 5D')]");




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

    public void cameraSeccion(){

        click(cameraSeccionBy);
    }

    public String cameraCanonEOS5D(){

        return getText(cameraCanonBy);
    }







}
