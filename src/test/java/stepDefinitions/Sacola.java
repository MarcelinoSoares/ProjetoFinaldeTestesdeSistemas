package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SacolaPage;

public class Sacola {

    private WebDriver driver = DriverManager.getDriver();
    private SacolaPage pageSacola = new SacolaPage(driver);


    @Dado("que o usuário acessa a página de um produto")
    public void acessarAPáginaDeUmProduto() {
        pageSacola.irParaUrlTapete();
    }

    @Quando("clica em comprar")
    public void clicarEmBotaoComprar() {
        pageSacola.clicarBtnComprar();
    }

    @Então("o produto é adicionado na sacola")
    public void verificarProdutoNaSacola() {
        pageSacola.clicarBtnIrParaSacola();
        String produtoAtual = pageSacola.getProdutoNaSacola();
        Assert.assertEquals("O produto não foi encontrado na sacola", "Tapete Felpudo Classic Casa Dona Bege 100cm x 150cm", produtoAtual);
    }

    @Dado("que o usuário possui um produto na sacola")
    public void possuirUmProdutoNaSacola() {
        pageSacola.irParaUrlTapete();
        pageSacola.clicarBtnComprar();
        pageSacola.clicarBtnIrParaSacola();
    }

    @Quando("clica em ‘Remover produto’")
    public void clicarEmBotaoRemoverProduto() {
        pageSacola.clicarBtnRemover();
    }

    @Então("o produto é removido da sacola")
    public void oProdutoÉRemovidoDaSacola() {
        String msgAtual = pageSacola.getRemoverMsg();
        Assert.assertEquals("Mensagem Errada!", "SUA SACOLA ESTÁ VAZIA...", msgAtual);
    }
}