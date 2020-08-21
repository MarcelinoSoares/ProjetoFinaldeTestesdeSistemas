package pages;

import Utils.Comum;
import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Comum acoesComuns;

    private By entrarBtn = By.cssSelector(".header-login-link");
    private By cadastrarBtn = By.xpath("//h2[contains(text(),'Quero me cadastrar')]");
    private By campoNome = By.cssSelector("#RegistrationForm_first_name");
    private By campoSobrenome = By.cssSelector("#RegistrationForm_last_name");
    private By campoEmail = By.cssSelector("#RegistrationForm_email");
    private By campoCpf = By.cssSelector("#RegistrationForm_tax_identification");
    private By campoSenha = By.cssSelector("input[name='RegistrationForm[password]']");
    private By campoRepetirSenha = By.cssSelector("input[name='RegistrationForm[password2]");
    private By selectSexo = By.cssSelector("#RegistrationForm_gender");
    private By selectDia = By.cssSelector("#RegistrationForm_day");
    private By selectMes = By.cssSelector("#RegistrationForm_month");
    private By selectAno = By.cssSelector("#RegistrationForm_year");
    private By criarContaBtn = By.cssSelector("#customer-account-create");
    private By msgErro = By.xpath("//span[contains(text(),'E-mail ou CPF já cadastrado(s).')]");

    public CadastroPage(WebDriver driver){
        this.driver = driver;
        acoesComuns = new Comum(driver);
        wait = DriverManager.getDriverWait();
    }

    public void setNome(String nome) {
        acoesComuns.sendKeys(campoNome, nome);
    }

    public void setSobrenome(String sobrenome) {
        acoesComuns.sendKeys(campoSobrenome, sobrenome);
    }

    public void setEmail(String email) {
        acoesComuns.sendKeys(campoEmail, email);
    }

    public void setCpf(String cpf) {
        acoesComuns.sendKeys(campoCpf, cpf);
    }

    public void setSenha(String senha) {
        acoesComuns.sendKeys(campoSenha, senha);
    }

    public void setRepetirSenha(String repetirSenha) {
        acoesComuns.sendKeys(campoRepetirSenha, repetirSenha);
    }

    public void setSelectSexo(String sexo) {
        acoesComuns.selectComboBox(selectSexo, sexo);
    }

    public void setSelectData(String dia, String mes, String ano) {
        acoesComuns.selectComboBox(selectDia, dia);
        acoesComuns.selectComboBox(selectMes, mes);
        acoesComuns.selectComboBox(selectAno, ano);
    }

    public void clicarCriarConta() {
        acoesComuns.clicar(criarContaBtn);
    }

    public void acessarTelaCadastro(){
        acoesComuns.clicar(entrarBtn);
        acoesComuns.clicar(cadastrarBtn);
    }

    public String getErrorMsg() {
        return acoesComuns.getElementText(msgErro);
    }

}
