package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {


    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }


    private By buttonCanonShopCartBy = By.xpath("//button[contains(@onclick, \"cart.add('30', '1');\")]");

    private By colorRedCameraCanonBy = By.xpath("//select[@id='input-option226']/option[contains(text(), 'Red')]");

    private By listSelectBy = By.id("input-option226");

    private By addCartBy = By.id("button-cart");

    private By shoppingCartBy = By.xpath("//a[contains(@title,'Shopping Cart')]");

    private By camaraCanonCartBy = By.xpath("//div[@class='table-responsive']//a[contains(text(), 'Canon EOS 5D')]");

    private By titleShoppingCartBy = By.xpath("//a[contains(text(), 'Shopping Cart')]");




    public String titleShoppingCart(){

        return getText(titleShoppingCartBy);
    }


    public void addCanonRedShoppingCart(){

        click(buttonCanonShopCartBy);
        click(listSelectBy);
        click(colorRedCameraCanonBy);
        click(addCartBy);

    }


    public void shoppingCart() {

        click(shoppingCartBy);
    }


    public String nameCanonCart(){

        return getText(camaraCanonCartBy);
    }










}