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


    //Cenário 01
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

    //Cenário 02
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
        pageSacola.getSacolaVazia();
        String msgSacolaVazia = pageSacola.getSacolaVazia();
        Assert.assertEquals("A sacola não está vazia.","Sua sacola está vazia...", msgSacolaVazia);
    }

    //Cenário 03
    @Dado("que o usuário deseja comprar um calçado para presente")
    public void DesejarComprarUmCalçadoParaPresente() {
       pageSacola.irParaURLtenis();
       pageSacola.clicarInputTamanho();
       pageSacola.clicarOptTamanho();
       pageSacola.clicarbtnComprar();
       pageSacola.clicarbtnIrParaSacola();
    }

    @Quando("clica em Embalagem para presente")
    public void clicarEmEmbalagemParaPresente() {
     pageSacola.clicarEmbalagemParaPresente();
    }

    @Então("o link muda o texto para ‘Com embalagem para presente’")
    public void oLinkMudaOTextoParaComEmbalagemParaPresente() {
     //TODO
    }

    @E("um valor é adicionado ao lado no subtotal")
    public void umValorÉAdicionadoAoLadoNoSubtotal() {
     //TODO
    }

    //Cenário 04
    @Dado("que um usuário adiciona um produto na sacola")
    public void adicionarUmProdutoNaSacola() {
      pageSacola.irParaURLtapete();
      pageSacola.clicarbtnComprar();
      pageSacola.getProdutoNaSacola();
    }

    @Quando("aumenta a quantidade para {int}")
    public void aumentarAQuantidadePara(int arg0) {
     //TODO
    }

    @Então("o subtotal desse produto deve corresponder ao dobro do valor individual")
    public void oSubtotalDesseProdutoDeveCorresponderAoDobroDoValorIndividual() {
     //TODO
    }
}
