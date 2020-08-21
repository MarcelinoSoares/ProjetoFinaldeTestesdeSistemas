package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CadastroPage;
import pages.MainPage;

public class Cadastro {

    private WebDriver driver = DriverManager.getDriver();
    private CadastroPage pageCadastro = new CadastroPage(driver);
    private MainPage mainPage = new MainPage(driver);


    @Dado("que o usuário está na tela de cadastro")
    public void que_o_usuário_está_na_tela_de_cadastro() {
        mainPage.accessPage();
        pageCadastro.acessarTelaCadastro();
    }

    @Quando("preenche os dados corretamente informando um e-mail já cadastrado {string}")
    public void preenche_os_dados_corretamente_informando_um_e_mail_já_cadastrado(String email) {
        pageCadastro.setNome("Fulano");
        pageCadastro.setSobrenome("de Tal");
        pageCadastro.setEmail(email);
        pageCadastro.setSelectSexo("Masculino");
        pageCadastro.setCpf("415.200.250-68");
        pageCadastro.setSelectData("19", "05", "1980");
        pageCadastro.setSenha("abcde1_Fgh");
        pageCadastro.setRepetirSenha("abcde1_Fgh");
        pageCadastro.clicarCriarConta();
    }

    @Então("recebe a mensagem {string}")
    public void recebe_a_mensagem(String mensagem) {
        String actualMsg = pageCadastro.getErrorMsg();

        Assert.assertEquals("Mensagem Errado!", mensagem, actualMsg);
    }
}
