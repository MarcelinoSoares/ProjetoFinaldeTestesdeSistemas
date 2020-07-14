import manager.DriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;

public class main {

    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = DriverManager.getDriverWait();

    @Test
    public void testeAcessaraPagna(){
        System.out.println("*** teste acesso a pagna***");
        MainPage mainPage = new MainPage(driver);
        mainPage.accessPage();

        DriverManager.endSession();
    }
}
