package ehg.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehg.base.BasePage;

public class HomePage extends BasePage {

    public WebDriver driver;

    public HomePage() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    By logoImage = By.cssSelector("[data-toggle-type] .custom-logo");

    public WebElement getLogoImage() throws IOException {
        this.driver = getDriver();
        return driver.findElement(logoImage);
    }

}
