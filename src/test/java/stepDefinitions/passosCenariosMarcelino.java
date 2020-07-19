package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class passosCenariosMarcelino {

   private WebDriver driver = DriverManager.getDriver();

    @Dado("que o usuário acessa a página de um produto")
    public void acessarAPáginaDeUmProduto() {
    }

    @Quando("clica em comprar")
    public void clicarEmBotaoComprar() {
    }

    @Então("o produto é adicionado na sacola")
    public void adicionarNaSacola() {
    }

    @Dado("que o usuário possui um produto na sacola")
    public void possuirUmProdutoNaSacola() {
    }

    @Quando("clica em ‘Remover produto’")
    public void clicarEmBotaoRemoverProduto() {
    }

    @Então("o produto é removido da sacola")
    public void oProdutoÉRemovidoDaSacola() {
    }

    @Dado("que o usuário deseja comprar um calçado para presente")
    public void DesejarComprarUmCalçadoParaPresente() {
    }

    @Quando("clica em Embalagem para presente")
    public void clicarEmEmbalagemParaPresente() {
    }

    @Então("o link muda o texto para ‘Com embalagem para presente’")
    public void oLinkMudaOTextoParaComEmbalagemParaPresente() {
    }

    @E("um valor é adicionado ao lado no subtotal")
    public void umValorÉAdicionadoAoLadoNoSubtotal() {
    }

    @Dado("que um usuário adiciona um produto na sacola")
    public void AdicionarUmProdutoNaSacola() {
    }

    @Quando("aumenta a quantidade para {int}")
    public void aumentarAQuantidadePara(int arg0) {
    }

    @Então("o subtotal desse produto deve corresponder ao dobro do valor individual")
    public void oSubtotalDesseProdutoDeveCorresponderAoDobroDoValorIndividual() {
    }
}
