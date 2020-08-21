package pages;

import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.Comum;

public class AjudaPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Comum acoesComuns;

    private By linkAtendimento = By.cssSelector(".footer-help  ul  li:nth-child(2)  a");
    private By atendimentoPorMensagem = By.cssSelector(".message-modal-content .message-email a");
    private By topicoOutro = By.xpath("//label[contains(text(),'OUTROS')]");
    private By assuntoDaMensagem = By.xpath("//div [@class=\"mainContent-problems-options topic_other\"]");
    private By radioOutros = By.cssSelector("#topic_other_problem_3");

    private By btnEnviar = By.cssSelector("#form-faq-contact  .col-xs-6:last-child .btn-primary");
    private By title = By.cssSelector(".emailSent-message .emailSent-title");
    private By subtitle = By.cssSelector(".emailSent-message .emailSent-subtitle");

    private By duvidaFrequentes = By.cssSelector(".footer-help ul li:nth-child(1) a");
    private By opcaoCancelamento = By.cssSelector("#ajax-cancelamentos > a");
    private By comoCancelar = By.cssSelector("#item-selected-103-1 > div > h2");
    private By textCancelamento = By.cssSelector("#item-selected-103-1 > div > div > p");

    private By opcaoComoComprar = By.cssSelector("#ajax-como-comprar > a");
    private By comoRecuperarSenha = By.cssSelector("#item-selected-100-1 > div > h2");
    private By textComoRecuperarSenha = By.cssSelector("#item-selected-100-1 > div > div > p");

    private By opcaoEntregas = By.cssSelector("#ajax-pedidos > a");
    private By freteHoje = By.cssSelector("#item-selected-104-7 > div > h2");
    private By textFreteHoje = By.cssSelector("#item-selected-104-7 > div > div > p");

    public AjudaPage(WebDriver driver){
        this.driver = driver;
        acoesComuns = new Comum(driver);
        wait = DriverManager.getDriverWait();
    }

    public void clicarLinkAtendimento(){
        acoesComuns.clicar(linkAtendimento);
    }
    public void clicarAtendimentoPorMensagem(){
        acoesComuns.clicar(atendimentoPorMensagem);
    }
    public void clicarTopicoOutro(){
        acoesComuns.clicar(topicoOutro);
    }

    public void clicarAssuntoDaMensagem(){
        acoesComuns.clicar(assuntoDaMensagem);
        acoesComuns.clicar(radioOutros);
    }


    public void clicarBtnEnviar(){
        acoesComuns.clicar(btnEnviar);
    }
    public String getTitle(){
        return acoesComuns.getElementText(title);
    }
    public String getSubtitle(){
        return acoesComuns.getElementText(subtitle);
    }

    public void clicarLinkFaq() {
        acoesComuns.clicar(duvidaFrequentes);
    }
    public void clicarBtnCancelamento(){
        acoesComuns.clicar(opcaoCancelamento);
    }
    public void clicarComoCancelaCompra(){
        acoesComuns.clicar(comoCancelar);
    }
    public String getTextCancelamento(){
        return acoesComuns.getElementText(textCancelamento);
    }

    public void clicarBtnComoComprar(){
        acoesComuns.clicar(opcaoComoComprar);
    }
    public void clicarComoRecuperarSenha(){
        acoesComuns.clicar(comoRecuperarSenha);
    }
    public String getTextComoRecuperarSenha(){
        return acoesComuns.getElementText(textComoRecuperarSenha);
    }

    public void clicarBtnEntregas(){
        acoesComuns.clicar(opcaoEntregas);
    }
    public void clicarFreteHoje(){
        acoesComuns.clicar(freteHoje);
    }
    public String getTextFreteHoje(){
        return acoesComuns.getElementText(textFreteHoje);
    }

}
