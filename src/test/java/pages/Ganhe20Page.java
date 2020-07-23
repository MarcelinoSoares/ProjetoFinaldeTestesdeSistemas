package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.Comum;

public class Ganhe20Page {


    private WebDriver driver;
    private WebDriverWait wait;
    private String pageURL = "https://www.dafiti.com.br/";
    private Comum acoesComuns;

    private By elemento_email_feminino = By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-6 .box-input-email input");
    private By elemento_sexFem = By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-3:nth-child(5) button");
    private By elemento_msgSucess = By.cssSelector("#newsletter-confirmation-container .row .col-md-5 h4");
    private By elemento_email_masculino = By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-6 .box-input-email input");
    private By elemento_sexMas = By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-3:nth-child(6) button");
    private By elemento_email_invalido = By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-6 .box-input-email input");
    private By elemento_msgInval = By.cssSelector("#newsletter-confirmation-container .row .col-md-5");
    private By elemento_msgEmailJaCadastrado = By.cssSelector("#newsletter-container > div > div.col-md-8 > div > div > div > p");


    public Ganhe20Page(WebDriver driver){
        this.driver = driver;
        acoesComuns = new Comum(driver);
    }

    public void irParaURL(){
        acoesComuns.irParaURL(pageURL);
    }

    public void sendkeyemailfem() {
        acoesComuns.sendKeys(elemento_email_feminino, "mulher@fem.com");
    }
    public void clicarbtnsexfem(){
        acoesComuns.clicar(elemento_sexFem);
    }
    public void sendkeyemailmas(){
        acoesComuns.sendKeys( elemento_email_masculino, "homem@mas.com");
    }
    public void clicarbtnsexmas(){
        acoesComuns.clicar(elemento_sexMas);
    }
    public void sendkeyemailinvalido(){
        acoesComuns.sendKeys( elemento_email_invalido, "invalido.com");
    }

    public String getmsgsucess(){
        return acoesComuns.getElementText(elemento_msgSucess);
    }
    public String getmsginval(){

        return acoesComuns.getElementText(elemento_msgInval);
    }

    public String getmsgemailjacadastrado(){

        return acoesComuns.getElementText(getmsgemailjacadastrado);
    }

}
