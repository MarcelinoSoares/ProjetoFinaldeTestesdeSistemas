package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SacolaPage;

public class Sacola {

   private WebDriver driver = DriverManager.getDriver();
   private SacolaPage pageSacola = new SacolaPage(driver);


 @Dado("que o usuário acessa a página de um produto")
    public void acessarAPáginaDeUmProduto() {
      pageSacola.irParaURLtapete();
    }

    @Quando("clica em comprar")
    public void clicarEmBotaoComprar() {
      pageSacola.clicarbtnComprar();
    }

    @Então("o produto é adicionado na sacola")
    public void verificarProdutoNaSacola() {
        pageSacola.clicarbtnIrParaSacola();
        String produtoAtual = pageSacola.getProdutoNaSacola();
        Assert.assertEquals("O produto não foi encontrado na sacola","Tapete Felpudo Classic Casa Dona Bege 100cm x 150cm", produtoAtual);
    }

    @Dado("que o usuário possui um produto na sacola")
    public void possuirUmProdutoNaSacola() {
     pageSacola.irParaURLmochila();
     pageSacola.clicarbtnComprar();
     pageSacola.clicarbtnIrParaSacola();
    }

    @Quando("clica em ‘Remover produto’")
    public void clicarEmBotaoRemoverProduto() {
    pageSacola.clicarbtnRemover();
    }

    @Então("o produto é removido da sacola")
    public void oProdutoÉRemovidoDaSacola() {
    }

    @Dado("que o usuário deseja comprar um calçado para presente")
    public void DesejarComprarUmCalçadoParaPresente() {
       pageSacola.irParaURLtenis();
       pageSacola.clicarinputTamanho();
       pageSacola.clicaropttamanho();
       pageSacola.clicarbtnComprar();
       pageSacola.clicarbtnIrParaSacola();
    }

    @Quando("clica em Embalagem para presente")
    public void clicarEmEmbalagemParaPresente() {
     pageSacola.clicarembalagemparapresente();
    }

    @Então("o link muda o texto para ‘Com embalagem para presente’")
    public void oLinkMudaOTextoParaComEmbalagemParaPresente() {
    }

    @E("um valor é adicionado ao lado no subtotal")
    public void umValorÉAdicionadoAoLadoNoSubtotal() {
    }

    @Dado("que um usuário adiciona um produto na sacola")
    public void adicionarUmProdutoNaSacola() {
      pageSacola.irParaURLtapete();
      pageSacola.clicarbtnComprar();
      pageSacola.getProdutoNaSacola();
    }

    @Quando("aumenta a quantidade para {int}")
    public void aumentarAQuantidadePara(int arg0) {
    }

    @Então("o subtotal desse produto deve corresponder ao dobro do valor individual")
    public void oSubtotalDesseProdutoDeveCorresponderAoDobroDoValorIndividual() {
    }
}
