package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Ganhe20Page;
import pages.MainPage;

public class Ganhe20 {

    private WebDriver driver = DriverManager.getDriver();
    private Ganhe20Page pageGanhe20 = new Ganhe20Page(driver);
    private MainPage mainPage = new MainPage(driver);

    @Dado("que um usuário está na página inicial")
    public void acessHome() {
        mainPage.accessPage();
    }

    @Quando("preenche o email para ganhar o cupom ganheVinte feminino {string}")
    public void emailCupomGanheFeminino(String email) {
        pageGanhe20.setEmail(email);
        pageGanhe20.clicarBtnSexFem();
    }

    @Então("recebe a mensagem ‘Cadastro realizado com sucesso!'")
    public void msgCadComSucesso() {
        String mensagemAtualsucess = pageGanhe20.getMsgSucess();
        Assert.assertEquals("O cadastro não foi realizado com sucesso", "Cadastro efetuado com sucesso!", mensagemAtualsucess);
    }

    @Quando("preenche o email para ganhar o cupom ganheVinte masculino {string}")
    public void emailCupomGanheMasculino(String email) {
        pageGanhe20.setEmail(email);
        pageGanhe20.clicarBtnSexMas();
    }

    @Então("o site exibe a mensagem ‘Insira um e-mail válido’")
    public void msgEMailVálido() {
        String mensagemAtual = pageGanhe20.getMsgInval();
        Assert.assertEquals("O email não foi validado com sucesso", "Insira um e-mail válido", mensagemAtual);
    }

    @Quando("insere um email que já foi utilizado para receber cupom ganheVinte {string}")
    public void emailJaUtilizado(String email) {
        pageGanhe20.setEmail(email);
        pageGanhe20.clicarBtnSexFem();
    }

    @Então("o site exibe a mensagem ‘Este e-mail já está cadastrado’")
    public void emailJaCadastrado() {
        String mensagemAtualJaCadastrada = pageGanhe20.getMsgEmailJaCadastrado();
        Assert.assertEquals("O email não está cadastrado" , "Este e-mail já está cadastrado", mensagemAtualJaCadastrada);
    }
}