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
     driver.get("https://www.dafiti.com.br/Tapete-Felpudo-Classic-Casa-Dona-Bege-100cm-x-150cm-5671829.html");
    }

    @Quando("clica em comprar")
    public void clicarEmBotaoComprar() {
     WebElement Btncomprar = driver.findElement(By.cssSelector("#add-to-cart > button"));

     Btncomprar.click();
    }

    @Então("o produto é adicionado na sacola")
    public void IrNaSacola() {
     WebElement irnasacola = driver.findElement(By.cssSelector(".popover-go-to-cart-content > a"));

     irnasacola.click();
    }

    @Dado("que o usuário possui um produto na sacola")
    public void possuirUmProdutoNaSacola() {
     driver.get("https://www.dafiti.com.br/Mochila-Colcci-Matelasse-Preta-4802869.html");
     WebElement Btncomprar = driver.findElement(By.cssSelector("#add-to-cart > button"));
     WebElement irnasacola = driver.findElement(By.cssSelector(".popover-go-to-cart-content > a"));

     Btncomprar.click();
     irnasacola.click();
    }

    @Quando("clica em ‘Remover produto’")
    public void clicarEmBotaoRemoverProduto() {
     WebElement Btnremover = driver.findElement(By.cssSelector(".cart-product-action > a"));

     Btnremover.click();
    }

    @Então("o produto é removido da sacola")
    public void oProdutoÉRemovidoDaSacola() {
    }

    @Dado("que o usuário deseja comprar um calçado para presente")
    public void DesejarComprarUmCalçadoParaPresente() {
     driver.get("https://www.dafiti.com.br/Tenis-adidas-Originals-Superstar-Slip-on-W-Preto-5125927.html");
     WebElement selecionatamanho = driver.findElement(By.cssSelector("#add-to-cart > div.selectbox-2.add-to-cart-form-sizes > input[type=hidden]"));
     WebElement selecionanumero = driver.findElement(By.cssSelector("#add-to-cart > div.selectbox-2.add-to-cart-form-sizes.popover-click.is-open > ul > li:nth-child(6)"));
     WebElement Btncomprar = driver.findElement(By.cssSelector("#add-to-cart > button"));
     WebElement irnasacola = driver.findElement(By.cssSelector(".popover-go-to-cart-content > a"));

     selecionatamanho.click();
     selecionanumero.click();
     Btncomprar.click();
     irnasacola.click();
    }

    @Quando("clica em Embalagem para presente")
    public void clicarEmEmbalagemParaPresente() {
     WebElement embalagemparapresente = driver.findElement(By.cssSelector("#cart_product_gift_AD464SCF72QTB-58"));

     embalagemparapresente.click();
    }

    @Então("o link muda o texto para ‘Com embalagem para presente’")
    public void oLinkMudaOTextoParaComEmbalagemParaPresente() {
    }

    @E("um valor é adicionado ao lado no subtotal")
    public void umValorÉAdicionadoAoLadoNoSubtotal() {
    }

    @Dado("que um usuário adiciona um produto na sacola")
    public void AdicionarUmProdutoNaSacola() {
     driver.get("https://www.dafiti.com.br/Mesa-Escrivaninha-Self-Castanho-e-Branco-Appunto-4804356.html");
     WebElement Btncomprar = driver.findElement(By.cssSelector("#add-to-cart > button"));
     WebElement irnasacola = driver.findElement(By.cssSelector(".popover-go-to-cart-content > a"));

     Btncomprar.click();
     irnasacola.click();
    }

    @Quando("aumenta a quantidade para {int}")
    public void aumentarAQuantidadePara(int arg0) {
    }

    @Então("o subtotal desse produto deve corresponder ao dobro do valor individual")
    public void oSubtotalDesseProdutoDeveCorresponderAoDobroDoValorIndividual() {
    }
}
