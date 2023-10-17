package Proyecto_Automation_PaginaWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends Base_Conexion{


    @Test
    public void abrirPagina(){



        getDriver().get("https://opencart.abstracta.us/");

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        By titulo = By.xpath("//div[@id=\"logo\"]/h1/a");

        WebElement tituloElement = wait.until(ExpectedConditions.visibilityOfElementLocated(titulo));

        Assert.assertEquals(tituloElement, "Your Stone");






    }



}
