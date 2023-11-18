package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {






    public WishListPage(WebDriver driver) {
        super(driver);
    }


    private By wishPageBy = By.id("wishlist-total");

    private By macButtonWhisListBy = By.xpath("//button[contains(@onclick, 'wishlist.add('43');')]");


    private By iphoneButtonWhisListBy = By.xpath("//button[@onclick='wishlist.add(40);']");


    private By alertSuccessWhisIphoneBy = By.xpath("//a[contains(text(), 'iPhone')]");

    private By alertSuccessWhisMacBookBy = By.xpath("//a[contains(text(), 'MacBook')]");

    private By alertAddedWishlistBy = By.xpath("//a[contains(text(), 'wish list')]");


    private By titleWishListPageBy = By.xpath("//a[contains(text(), 'My Wish List')]");


    private By tableWishListBy = By.className("table-responsive");

    private By textWishListEmptyBy = By.xpath("//div[@id='content']/p");



    public String getTitle(){

        return getText(titleWishListPageBy);
    }


    public String textEmptyList(){

        return getText(textWishListEmptyBy);
    }


    public void addIphoneWishList(){

        click(iphoneButtonWhisListBy);
    }


    public boolean existWishList(){

        return isDisplayed(tableWishListBy);
    }

    public String alertAddedElementWishList(){

        return getText(alertAddedWishlistBy);
    }














}
