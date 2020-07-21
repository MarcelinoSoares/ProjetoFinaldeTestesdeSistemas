package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Comum;

public class AjudaPage {


    private WebDriver driver;
    private WebDriverWait wait;
    private String pageURL = "https://www.dafiti.com.br/";
    private Comum acoesComuns;

    private By linkatendimento = By.cssSelector(".footer-help  ul  li:nth-child(2)  a");
    private By atendimentopormensagem = By.cssSelector(".message-modal-content .message-email a");
    private By topicooutro = By.cssSelector("#topic_other");
    private By assuntodamensagem = By.cssSelector("#topic_other_problem_3");
    private By nome = By.cssSelector("#name");
    private By idenficador = By.cssSelector("#taxIdentification");
    private By email = By.cssSelector("#email");
    private By telefone = By.cssSelector("#phone1");
    private By numerodopedido = By.cssSelector("#orderNumber");
    private By mensagem = By.cssSelector("#message");
    private By btnEnviar = By.cssSelector("#form-faq-contact  .col-xs-6:last-child .btn-primary");
    private By title = By.cssSelector(".emailSent-message .emailSent-title");
    private By subtitle = By.cssSelector(".emailSent-message .emailSent-subtitle");

    public AjudaPage(WebDriver driver){
        this.driver = driver;
        acoesComuns = new Comum(driver);
    }

    public void irParaURL(){
        acoesComuns.irParaURL(pageURL);
    }

    public void clicarlinkatendimento(){
        acoesComuns.clicar(linkatendimento);
    }
    public void clicaratendimentopormensagem(){
        acoesComuns.clicar(atendimentopormensagem);
    }
    public void clicartopicooutro(){
        acoesComuns.clicar(topicooutro);
    }
    public void clicarassuntodamensagem(){
        acoesComuns.clicar(assuntodamensagem);
    }
    public void sendkeynome(){
        acoesComuns.sendKeys( nome, "bruno baima");
    }
    public void sendkeyidenficador(){
        acoesComuns.sendKeys( idenficador, "12345678900");
    }
    public void sendkeyemail(){
        acoesComuns.sendKeys( email, "bbna@cesar.school");
    }
    public void sendkeytelefone(){
        acoesComuns.sendKeys( telefone, "81999366619");
    }
    public void sendkeynumerodopedido(){
        acoesComuns.sendKeys( numerodopedido, "987654321");
    }
    public void sendkeymensagem(){
        acoesComuns.sendKeys( mensagem, "teste 1");
    }
    public void clicarbtnEnviar(){
        acoesComuns.clicar(btnEnviar);
    }
    public String gettitle(){
        return acoesComuns.getElementText(title);
    }
    public String getsubtitle(){
        return acoesComuns.getElementText(subtitle);
    }
}
