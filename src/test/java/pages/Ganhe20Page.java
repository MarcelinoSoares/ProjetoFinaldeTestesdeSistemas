package pages;

import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.Comum;

public class Ganhe20Page {

    private WebDriver driver;
    private WebDriverWait wait;
    private Comum acoesComuns;

    private By elementoEmail = By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-6 .box-input-email input");
    private By femininoBtn = By.cssSelector("button[value=female]");
    private By elementoMsgSucess = By.cssSelector("#newsletter-confirmation-container .row .col-md-5 h4");
    private By masculinoBtn = By.cssSelector("button[value=male]");
    private By elementoMsgInval = By.cssSelector(".parsley-custom-error-message");
    private By elementoMsgEmailJaCadastrado = By.xpath("//div[contains(text(),'Este e-mail já está cadastrado')]");

    public Ganhe20Page(WebDriver driver){
        this.driver = driver;
        acoesComuns = new Comum(driver);
        wait = DriverManager.getDriverWait();
    }

    public void setEmail(String email) {
        acoesComuns.sendKeys(elementoEmail, email);
    }
    public void clicarBtnSexFem(){
        acoesComuns.clicar(femininoBtn);
    }

    public void clicarBtnSexMas(){
        acoesComuns.clicar(masculinoBtn);
    }

    public String getMsgSucess(){
        acoesComuns.clicar(elementoMsgSucess);
        return acoesComuns.getElementText(elementoMsgSucess);
    }
    public String getMsgInval(){
        return acoesComuns.getElementText(elementoMsgInval);
    }

    public String getMsgEmailJaCadastrado(){
        acoesComuns.clicar(elementoMsgEmailJaCadastrado);
        return acoesComuns.getElementText(elementoMsgEmailJaCadastrado);
    }
}