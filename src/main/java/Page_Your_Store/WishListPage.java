package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {



    public WishListPage(WebDriver driver) {
        super(driver);
    }





    private By titleWishListPageBy = By.xpath("//a[contains(text(), 'My Wish List')]");


    private By textWishListEmptyBy = By.xpath("//div[@id='content']/p");

    private By wishButtonCameraCanonBy = By.xpath("//button[contains(@onclick, \"wishlist.add('30');\")]");


    private By nameWishListCanonBy = By.xpath("//div[@id='account-wishlist']//a[contains(text(), 'Canon EOS 5D')]");

    private By wishListBy = By.id("wishlist-total");





    public String getTitle(){

        return getText(titleWishListPageBy);
    }


    public String textEmptyList(){

        return getText(textWishListEmptyBy);
    }

    public void addCamaraCanonFav(){

        click(wishButtonCameraCanonBy);
    }



    public String nameCamaraCanonWishList(){

        return getText(nameWishListCanonBy);
    }


    public void wishListButton(){

        click(wishListBy);
    }





















}
