package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AjudaPage;
import pages.MainPage;


public class Ajuda {

    private WebDriver driver = DriverManager.getDriver();
    private AjudaPage pageAjuda = new AjudaPage(driver);
    private MainPage mainPage = new MainPage(driver);

    @Dado("que um usuário acessa a página de Atendimento")
    public void acessarAPáginaDeAtendimento() {
        mainPage.accessPage();
        pageAjuda.clicarLinkAtendimento();
    }

    @E("escolhe o atendimento Fale conosco por Mensagem")
    public void escolherOAtendimentoFaleConoscoPorMensagem() {
        pageAjuda.clicarAtendimentoPorMensagem();
    }

    @E("seleciona o tópico de atendimento ‘Outros’")
    public void selecionarOTópicoDeAtendimentoOutros() {
        pageAjuda.clicarTopicoOutro();
        pageAjuda.clicarTopicoOutro();
    }

    @E("escolhe o assunto da mensagem")
    public void escolherOAssuntoDaMensagem() {
        pageAjuda.clicarAssuntoDaMensagem();
    }


    @Quando("envia o formulário")
    public void enviarOFormulário() {
        pageAjuda.clicarBtnEnviar();
    }

    @Então("é exibida uma mensagem do envio com sucesso.")
    public void exibirUmaMensagemDoEnvioComSucesso() {
        pageAjuda.getTitle();
        pageAjuda.getSubtitle();

    }

    @Dado("que um usuário seleciona a opção de Dúvidas Frequentes")
    public void selecionarAOpçãoDeDúvidasFrequentes() {
        mainPage.accessPage();
        pageAjuda.clicarLinkFaq();
    }

    @Quando("escolhe a opção de Cancelamentos")
    public void escolherAOpçãoDeCancelamentos() {
        pageAjuda.clicarBtnCancelamento();
    }

    @E("escolhe a opção Como faço para cancelar minha compra")
    public void escolherAOpçãoComoFaçoParaCancelarMinhaCompra() {
        pageAjuda.clicarComoCancelaCompra();
    }

    @Então("é exibido o texto esperado de ajuda para cancelamento")
    public void exibirOTextoEsperadoDeAjudaParaCancelamento() {
        pageAjuda.getTextCancelamento();
        String mensagemAtual = pageAjuda.getTextCancelamento();
        Assert.assertEquals("Mensagem incorreta", "Se a forma de pagamento escolhida foi o boleto bancário e o pagamento ainda não foi efetuado, o pedido será cancelado automaticamente no dia seguinte ao vencimento do boleto, sem ônus para você. Se efetuou o pagamento com cartão de crédito e a Nota Fiscal não tiver sido emitida, poderá solicitar o cancelamento ao entrar em contato com nossa Central de Relacionamento.", mensagemAtual);
    }

    @Dado("que um usuário seleciona a opção de FAQ")
    public void selecionarAOpçãoFAQ() {
        mainPage.accessPage();
        pageAjuda.clicarLinkFaq();
    }

    @Quando("escolhe a opção de Como Comprar")
    public void escolherAOpçãoDeComoComprar() {
        pageAjuda.clicarBtnComoComprar();
    }

    @E("escolhe a opção Como faço para recuperar minha senha")
    public void escolherAOpçãoComoParaRecuperarSenha() {
        pageAjuda.clicarComoRecuperarSenha();
    }

    @Então("é exibido o texto esperado de ajuda para recuperar senha")
    public void exibirOTextoEsperadoDeAjudaParaRecuperarSenha() {
        pageAjuda.getTextComoRecuperarSenha();
        String mensagemAtual = pageAjuda.getTextComoRecuperarSenha();
        Assert.assertEquals("Mensagem incorreta", "Esqueceu sua senha? Isso acontece! Para recuperá-la, clique em \"Entrar\" e depois em \"Esqueceu a senha?\", em seguida coloque seu e-mail, CPF ou CNPJ e enviaremos o passo a passo para criar uma nova no e-mail cadastrado.", mensagemAtual);
    }

    @Dado("que um usuário seleciona a opção de ajuda por perguntas e respostas")
    public void selecionarPerguntasRespostas() {
        mainPage.accessPage();
        pageAjuda.clicarLinkFaq();
    }

    @Quando("escolhe a opção de Entregas e Frete")
    public void escolherAOpçãoEntregasEFretes() {
        pageAjuda.clicarBtnEntregas();
    }

    @E("escolhe a opção O que é o frete hoje")
    public void escolherAOpçãoOQueÉFreteHoje() {
        pageAjuda.clicarFreteHoje();
    }

    @Então("é exibido o texto esperado de ajuda sobre o que é o frete hoje")
    public void exibirOTextoEsperadoDeAjudaParaFreteHoje() {
        pageAjuda.getTextFreteHoje();
        String mensagemAtual = pageAjuda.getTextFreteHoje();
        Assert.assertEquals("Mensagem incorreta", "Nesse tipo de frete, a entrega acontece no mesmo dia que seu pagamento é aprovado. Ele tem quantidade limitada e é oferecido apenas para algumas cidades do estado de São Paulo. Para essa opção, o boleto não está disponível como forma de pagamento. O pedido será liberado somente após a aprovação do pagamento. O prazo de entrega válido apenas para pedidos com pagamento aprovado até às 11h59. Pedidos aprovados após esse horário serão entregues até às 22h do próximo dia útil.", mensagemAtual);
    }
}