package addRemove;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.AddRemoveElements;

import base.BaseTests;

public class AddRemoveElementsTests extends BaseTests {

    AddRemoveElements addRemove;

    @Test
    public void testAddElements(){//comprueba qu agrega 3 elementos Delete
        addRemove = homePage.ClickAddRemoveLink();
        for (int i = 0; i < 3; i++) {
            addRemove.clickAddButton();
        }
        List<WebElement> lista = addRemove.FindDeleteButtons();
        Assert.assertEquals(lista.size(), 3);
    }

    @Test
    public void testRemoveElements(){//elimina el segundo Delete y lo comprueba
        addRemove = homePage.ClickAddRemoveLink();
        for (int i = 0; i < 3; i++) {
            addRemove.clickAddButton();
        }
        List<WebElement> lista = addRemove.FindDeleteButtons();
        lista.get(1).click();
        
        List<WebElement> listaRemovida = addRemove.FindDeleteButtons();
        Assert.assertEquals(listaRemovida.size(), 2);
    }
}
