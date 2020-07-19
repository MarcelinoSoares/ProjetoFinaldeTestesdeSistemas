package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class passosCenariosBruno {

    WebDriver driver = DriverManager.getDriver();

    @Dado("que um usuário acessa a página de Atendimento")
    public void acessarAPáginaDeAtendimento() {
        driver.get("https://www.dafiti.com.br");
        WebElement linkatendimento = driver.findElement(By.cssSelector(".footer-help  ul  li:nth-child(2)  a"));

        linkatendimento.click();
    }

    @E("escolhe o atendimento Fale conosco por Mensagem")
    public void escolherOAtendimentoFaleConoscoPorMensagem() {
        WebElement faleconosco = driver.findElement(By.cssSelector(".message-modal-content .message-email a"));

        faleconosco.click();
    }

    @E("seleciona o tópico de atendimento ‘Outros’")
    public void selecionarOTópicoDeAtendimentoOutros() {
        WebElement topicooutro = driver.findElement(By.cssSelector("#topic_other"));

        topicooutro.click();
    }

    @E("escolhe o assunto da mensagem")
    public void escolherOAssuntoDaMensagem() {
        WebElement assuntodamensagem = driver.findElement(By.cssSelector("#topic_other_problem_3"));

        assuntodamensagem.click();
    }

    @E("preenche os campos obrigatórios")
    public void preencherOsCamposObrigatórios() {
        WebElement nome = driver.findElement(By.cssSelector("#name"));
        WebElement idenficador = driver.findElement(By.cssSelector("#taxIdentification"));
        WebElement email = driver.findElement(By.cssSelector("#email"));
        WebElement telefone = driver.findElement(By.cssSelector("#phone1"));
        WebElement numerodopedido = driver.findElement(By.cssSelector("#orderNumber"));
        WebElement mensagem = driver.findElement(By.cssSelector("#message"));

        nome.sendKeys("Bruno Baima");
        idenficador.sendKeys("12345678900");
        email.sendKeys("bbna@cesar.school");
        telefone.sendKeys("81999366619");
        numerodopedido.sendKeys("987654321");
        mensagem.sendKeys("teste 1");
    }

    @Quando("envia o formulário")
    public void enviarOFormulário() {
        WebElement btnEnviar = driver.findElement(By.cssSelector("#form-faq-contact  .col-xs-6:last-child .btn-primary"));

        btnEnviar.click();
    }

    @Então("é exibida uma mensagem do envio com sucesso.")
    public void exibirUmaMensagemDoEnvioComSucesso() {
        WebElement title = driver.findElement(By.cssSelector(".emailSent-message .emailSent-title"));
        WebElement subtitle = driver.findElement(By.cssSelector(".emailSent-message .emailSent-subtitle"));
        String msgE = "Envio efetuado com sucesso!";
        String msgS = title.getText();
        String msgS2 = subtitle.getText();
        System.out.println(msgS);
        System.out.println(msgS2);

        Assert.assertEquals(
                "A mensagem de resposta está errada.",
                msgE,
                msgS);

    }

    @E("seleciona a opção de Dúvidas Frequentes")
    public void selecionarAOpçãoDeDúvidasFrequentes() {
    }

    @E("escolhe a opção de Cancelamentos")
    public void escolherAOpçãoDeCancelamentos() {
    }

    @Quando("escolhe a opção Como faço para cancelar minha compra")
    public void escolherAOpçãoComoFaçoParaCancelarMinhaCompra() {
    }

    @Então("é exibido o texto esperado de ajuda para cancelamento")
    public void exibirOTextoEsperadoDeAjudaParaCancelamento() {
    }
}
