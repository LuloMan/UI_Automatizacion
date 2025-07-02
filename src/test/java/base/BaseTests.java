package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.pages.HomePage;

public class BaseTests {
    private WebDriver driver;

    private HomePage homePage;
    
    public void setUp(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.ClickFormAuthLink();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Shifting Content")).click();//encontrar elemento con nombre "Shifting Content" y clickearlo
        driver.findElement(By.linkText("Example 1: Menu Element")).click();//lo mismo con Example 1: Menu Element
        List<WebElement> list = driver.findElements(By.tagName("li"));//encuentra una lista de elementos
        for(WebElement element : list){//recorre la lista de elementos
            System.out.println(element.getText());//muestra elementos
        }
        //Dimension dimension = new Dimension(1080, 1920); Crea una dimension en pixeles
        //driver.manage().window().setSize(dimension); Establece un tamaño de pantalla especifico
        driver.manage().window().maximize(); //Maximiza la pantalla
        //driver.quit(); cierra la ventana y la sesion
    }
    
    public static void main(String[] args) {
        BaseTests baseTests = new BaseTests();
        baseTests.setUp();
    }

}
