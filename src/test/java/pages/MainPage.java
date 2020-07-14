package pages;

import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {


    private WebDriver driver;
    private WebDriverWait wait;
    private String pageURL = "https://www.dafiti.com.br/";

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = DriverManager.getDriverWait();
    }

    public MainPage accessPage(){
        driver.get(pageURL);
        return this;
    }
}
