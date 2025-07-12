package base;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.example.pages.HomePage;

public class BaseTests {
    protected WebDriver driver;

    protected HomePage homePage;
    
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //System.out.println(driver.getTitle()); Devuelve el titulo de la pagina
        //Dimension dimension = new Dimension(1080, 1920); Crea una dimension en pixeles
        //driver.manage().window().setSize(dimension); Establece un tamaño de pantalla especifico
        //driver.manage().window().maximize(); //Maximiza la pantalla
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit(); //cierra la ventana y la sesion
    }
}
