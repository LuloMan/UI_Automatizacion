package fileUpload;

import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.FileUploadedPage;

import base.BaseTests;

public class FileUploadTests extends BaseTests {

     @Test
    public void testFileUpload() {
        var fileUpload = homePage.ClickFileUploadLink();
        String archivo = "archivo.txt";
        String rutaAbsoluta = Paths.get("src/test/" + archivo).toAbsolutePath().toString();
        FileUploadedPage uploaded = fileUpload.uploadFile(rutaAbsoluta);
        String nombreArchivo = uploaded.getUploadedFiles();

        Assert.assertEquals(nombreArchivo, archivo);
    }
}
