package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Ganhe20Page;

public class Ganhe20 {

    private WebDriver driver = DriverManager.getDriver();
    private Ganhe20Page pageGanhe20 = new Ganhe20Page(driver);

    //cenario 1
    @Dado("que um usuário está na página inicial")
    public void acessarAPáginaInicial() {
      pageGanhe20.irParaURL();
    }

    @Quando("preenche o email para ganhar o cupom ganhe{int} feminino")
    public void preencherOEmailParaGanharOCupomGanheFeminino(int arg0) {
        pageGanhe20.sendkeyemailfem();
        pageGanhe20.clicarbtnsexfem();
    }

    @Então("recebe a mensagem ‘Cadastro realizado com sucesso!'")
    public void receberAMensagemCadastroRealizadoComSucesso() {
        String mensagemAtualsucess = pageGanhe20.getmsgsucess();
        Assert.assertEquals("O cadastro não foi realizado com sucesso", "Cadastro efetuado com sucesso!", mensagemAtualsucess);
        DriverManager.endSession();
    }

    @Quando("preenche o email para ganhar o cupom ganhe{int} masculino")
    public void preencherOEmailParaGanharOCupomGanheMasculino(int arg0) {
        pageGanhe20.sendkeyemailmas();
        pageGanhe20.clicarbtnsexmas();
    }

    @Quando("insere um email inválido para receber cupom ganhe{int}")
    public void inserirUmEmailInválidoParaReceberCupomGanhe(int arg0) {
        pageGanhe20.sendkeyemailinvalido();
        pageGanhe20.clicarbtnsexmas();
    }

    @Então("o site exibe a mensagem ‘Insira um e-mail válido’")
    public void exibirAMensagemInsiraUmEMailVálido() {
        String mensagemAtual = pageGanhe20.getmsginval();
        Assert.assertEquals("O email não foi validado com sucesso", "Insira um e-mail válido", mensagemAtual);
        DriverManager.endSession();
    }

    @Quando("insere um email que já foi utilizado para receber cupom ganhe{int}")
    public void inserirUmEmailQueJáFoiUtilizadoParaReceberCupomGanhe(int arg0) {
        pageGanhe20.sendkeyemailfem();
        pageGanhe20.clicarbtnsexfem();
    }

    @Então("o site exibe a mensagem ‘Este e-mail já está cadastrado’")
    public void exibirAMensagemEsteEMailJáEstáCadastrado() {
        String mensagemAtualJaCadastrada = pageGanhe20.getmsgemailjacadastrado();
        Assert.assertEquals("O email não está cadastrado" , "Caso não tenha recebido nossos emails, verifique sua caixa de SPAM ou lixo eletrônico.", mensagemAtualJaCadastrada);
        DriverManager.endSession();
    }
}
