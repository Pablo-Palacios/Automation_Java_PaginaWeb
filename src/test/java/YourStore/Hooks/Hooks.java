package YourStore.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {

    private static WebDriver driver;

    private static Properties properties;

    @Before
    public void setUp() throws IOException {

        properties = new Properties();

        properties.load(new FileInputStream(System.getProperty("user.dir")
        + "\\src\\test\\resources\\config.properties"));

        ChromeOptions options = new ChromeOptions();


        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        driver = new ChromeDriver(options);


    }

    public static WebDriver getDriver() {
        return driver;
    }





    public static String getConfig_Values(String key){
        return properties.getProperty(key);
    }

    @After
    public void close(){

        if (driver != null){
            driver.quit();
        }
    }

}
