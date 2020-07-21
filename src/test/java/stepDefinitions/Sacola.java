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
    public void acessarPaginaDoProduto() {
        pageSacola.irParaURLtapete();
    }

    @Quando("clica em comprar")
    public void clica_em_comprar() {
        pageSacola.clicarbtnComprar();
    }

    @Então("o produto é adicionado na sacola")
    public void o_produto_é_adicionado_na_sacola() {
        pageSacola.clicarbtnIrParaSacola();
        String produtoAtual = pageSacola.getProdutoNaSacola();
        Assert.assertEquals("O produto não foi encontrado na sacola","Tapete Felpudo Classic Casa Dona Bege 100cm x 150cm", produtoAtual);
    }

    @Dado("que o usuário possui um produto na sacola")
    public void que_o_usuário_possui_um_produto_na_sacola() {
        throw new io.cucumber.java.PendingException();
    }

    @Quando("clica em ‘Remover produto’")
    public void clica_em_Remover_produto() {
        throw new io.cucumber.java.PendingException();
    }

    @Então("o produto é removido da sacola")
    public void o_produto_é_removido_da_sacola() {
        throw new io.cucumber.java.PendingException();
    }

    @Dado("que o usuário deseja comprar um calçado para presente")
    public void que_o_usuário_deseja_comprar_um_calçado_para_presente() {
        throw new io.cucumber.java.PendingException();
    }

    @Quando("clica em Embalagem para presente")
    public void clica_em_Embalagem_para_presente() {
        throw new io.cucumber.java.PendingException();
    }

    @Então("o link muda o texto para ‘Com embalagem para presente’")
    public void o_link_muda_o_texto_para_Com_embalagem_para_presente() {
        throw new io.cucumber.java.PendingException();
    }

    @Então("um valor é adicionado ao lado no subtotal")
    public void um_valor_é_adicionado_ao_lado_no_subtotal() {
        throw new io.cucumber.java.PendingException();
    }

    @Dado("que um usuário adiciona um produto na sacola")
    public void que_um_usuário_adiciona_um_produto_na_sacola() {
        throw new io.cucumber.java.PendingException();
    }

    @Quando("aumenta a quantidade para {int}")
    public void aumenta_a_quantidade_para(Integer int1) {
        throw new io.cucumber.java.PendingException();
    }

    @Então("o subtotal desse produto deve corresponder ao dobro do valor individual")
    public void o_subtotal_desse_produto_deve_corresponder_ao_dobro_do_valor_individual() {
        throw new io.cucumber.java.PendingException();
    }


}
