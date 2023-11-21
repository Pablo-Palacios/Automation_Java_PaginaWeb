package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{



    private By myAccount = By.xpath("//div[@id='content']/h2[text() = 'My Account']");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }


    public String getTitulo() {

        return getText(myAccount);
    }
}
