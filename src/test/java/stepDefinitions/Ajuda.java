package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AjudaPage;


public class Ajuda {

    private WebDriver driver = DriverManager.getDriver();
    private AjudaPage pageAjuda = new AjudaPage(driver);

    @Dado("que um usuário acessa a página de Atendimento")
    public void acessarAPáginaDeAtendimento() {
        pageAjuda.irParaURL();
        pageAjuda.clicarlinkatendimento();
    }

    @E("escolhe o atendimento Fale conosco por Mensagem")
    public void escolherOAtendimentoFaleConoscoPorMensagem() {
         pageAjuda.clicaratendimentopormensagem();
    }

    @E("seleciona o tópico de atendimento ‘Outros’")
    public void selecionarOTópicoDeAtendimentoOutros() {
       pageAjuda.clicartopicooutro();
    }

    @E("escolhe o assunto da mensagem")
    public void escolherOAssuntoDaMensagem() {
        pageAjuda.clicarassuntodamensagem();
    }

    @E("preenche os campos obrigatórios")
    public void preencherOsCamposObrigatórios() {
        pageAjuda.sendkeynome();
        pageAjuda.sendkeyidenficador();
        pageAjuda.sendkeyemail();
        pageAjuda.sendkeytelefone();
        pageAjuda.sendkeynumerodopedido();
        pageAjuda.sendkeymensagem();
    }

    @Quando("envia o formulário")
    public void enviarOFormulário() {
      pageAjuda.clicarbtnEnviar();
    }

    @Então("é exibida uma mensagem do envio com sucesso.")
    public void exibirUmaMensagemDoEnvioComSucesso() {
        pageAjuda.gettitle();
        String mensagemAtualsucess = pageAjuda.gettitle();
        Assert.assertEquals("O cadastro não foi realizado com sucesso", "Cadastro efetuado com sucesso!", mensagemAtualsucess);
        pageAjuda.getsubtitle();
        String mensagemAtualsucess2 = pageAjuda.getsubtitle();
        Assert.assertEquals("O cadastro não foi realizado com sucesso", "Cadastro efetuado com sucesso!", mensagemAtualsucess2);
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
