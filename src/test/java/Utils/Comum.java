package Utils;

import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Comum {

    private WebDriver driver;
    private WebDriverWait wait;

    public Comum(WebDriver driver){
        this.driver = driver;
        this.wait = DriverManager.getDriverWait();
    }

    public void irParaURL(String url){
        driver.get(url);
    }
    public void sendKeys(By elemento, String texto) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        driver.findElement(elemento).clear();
        driver.findElement(elemento).sendKeys(texto);
    }
    public void clicar(By elemento) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        driver.findElement(elemento).click();
    }
    public void clicarClicavel(By elemento) {
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
        WebElement element = driver.findElement(By.cssSelector(elemento));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
//        driver.findElement(elemento).click();
    }

    public String getElementText(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        WebElement elemento = driver.findElement(element);
        return elemento.getText().trim();
    }
}
