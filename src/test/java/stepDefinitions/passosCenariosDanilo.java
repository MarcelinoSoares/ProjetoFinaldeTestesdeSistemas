package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class passosCenariosDanilo {

    private WebDriver driver = DriverManager.getDriver();

    @Dado("que um usuário está na página inicial")
    public void acessarAPáginaInicial() {
        driver.get("https://www.dafiti.com.br");
    }

    @Quando("preenche o email para ganhar o cupom ganhe{int} feminino")
    public void preencherOEmailParaGanharOCupomGanheFeminino(int arg0) {
        WebElement elemento_email_feminino = driver.findElement(By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-6 .box-input-email input"));
        WebElement elemento_sexFem = driver.findElement(By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-3:nth-child(5) button"));

        elemento_email_feminino.sendKeys("mulher@fem.com");
        elemento_sexFem.click();
    }

    @Então("recebe a mensagem ‘Cadastro realizado com sucesso!”")
    public void receberAMensagemCadastroRealizadoComSucesso() throws InterruptedException{
        Thread.sleep(1000);
        WebElement elemento_msgSucess = driver.findElement(By.cssSelector("#newsletter-confirmation-container .row .col-md-5 h4"));
        String msgE = "Cadastro efetuado com sucesso!";
        String msgS = elemento_msgSucess.getText();
        System.out.println(msgS);

        Assert.assertEquals(
                "A mensagem de resposta está errada.",
                msgE,
                msgS);
    }

    @Quando("preenche o email para ganhar o cupom ganhe{int} masculino")
    public void preencherOEmailParaGanharOCupomGanheMasculino(int arg0) {
        WebElement elemento_email_masculino = driver.findElement(By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-6 .box-input-email input"));
        WebElement elemento_sexMas = driver.findElement(By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-3:nth-child(6) button"));

        elemento_sexMas.click();
        elemento_email_masculino.sendKeys("homem@masc.com");
    }

    @Quando("insere um email inválido para receber cupom ganhe{int}")
    public void inserirUmEmailInválidoParaReceberCupomGanhe(int arg0) {
        WebElement elemento_email_invalido = driver.findElement(By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-6 .box-input-email input"));
        elemento_email_invalido.sendKeys("invalido.com");
    }

    @Então("o site exibe a mensagem ‘Insira um e-mail válido’")
    public void exibirAMensagemInsiraUmEMailVálido() throws InterruptedException{
        Thread.sleep(1000);
        WebElement elemento_msgInval = driver.findElement(By.cssSelector("#newsletter-confirmation-container .row .col-md-5"));
        String msgI = elemento_msgInval.getText();
        System.out.println(msgI);
        String msgEI = "Insira um e-mail válido";

        Assert.assertEquals(
                "A mensagem de resposta está errada.",
                msgEI,
                msgI);
    }

    @Quando("insere um email que já foi utilizado para receber cupom ganhe{int}")
    public void inserirUmEmailQueJáFoiUtilizadoParaReceberCupomGanhe(int arg0) {
        WebElement elemento_email_feminino = driver.findElement(By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-6 .box-input-email input"));
        WebElement elemento_sexFem = driver.findElement(By.cssSelector("#newsletter-container .col-md-8 .newsletter-form #newsletterValidateDetail .row .col-md-3:nth-child(5) button"));

        elemento_email_feminino.sendKeys("mulher@fem.com");
        elemento_sexFem.click();
    }

    @Então("o site exibe a mensagem ‘Este e-mail já está cadastrado’")
    public void exibirAMensagemEsteEMailJáEstáCadastrado() {

    }
}
