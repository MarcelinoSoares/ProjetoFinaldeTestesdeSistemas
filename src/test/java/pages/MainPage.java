package pages;

import Utils.Comum;
import Utils.Constantes;
import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Comum acoesComuns;

    public MainPage (WebDriver driver) {
        this.driver = driver;
        acoesComuns = new Comum(driver);
        wait = DriverManager.getDriverWait();
    }

    public MainPage accessPage() {
        driver.get(Constantes.DAFITI_MAIN_URL);
        return this;
    }

}
