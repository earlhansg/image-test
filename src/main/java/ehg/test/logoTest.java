package ehg.test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

import ehg.base.Hooks;
import ehg.pageObjects.HomePage;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class logoTest extends Hooks {

    public logoTest() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Test
    public void SavingLogoTest() throws IOException, InterruptedException {

        // creating an object of the Homepage
        HomePage home = new HomePage();
        Thread.sleep(1500);

        System.out.println("Image File Captured ? " + home.getLogoImage().isDisplayed());

        Screenshot logoImageScreenShot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(getDriver(), home.getLogoImage());
        ImageIO.write(logoImageScreenShot.getImage(), "PNG",new File("C:\\Users\\Admin\\Desktop\\Resources\\Projects\\image-test\\src\\main\\java\\ehg\\resources\\logo\\TheDemoSiteLogo.png"));
        File savedLogo = new File("C:\\Users\\Admin\\Desktop\\Resources\\Projects\\image-test\\src\\main\\java\\ehg\\resources\\logo\\TheDemoSiteLogo.png");
        
        if(savedLogo.exists()) {
            System.out.println("Image File Captured");
        }
        else {
            System.out.println("Image File Not Exist");
        }
    }
    
}
