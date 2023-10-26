package Tests_Your_Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Base {


    private WebDriver driver;

    @BeforeMethod
    public void setUp(){

        ChromeOptions options = new ChromeOptions();


        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);


    }

    public WebDriver getDriver() {
        return this.driver;
    }






    @AfterMethod
    public void close(){

        if (this.driver != null){
            this.driver.quit();
        }
    }





















}
