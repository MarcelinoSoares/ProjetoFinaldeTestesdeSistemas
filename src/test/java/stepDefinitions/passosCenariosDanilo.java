package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class passosCenariosDanilo {

    @Dado("que um usuário está na página inicial")
    public void queUmUsuárioEstáNaPáginaInicial() {
    }

    @Quando("preenche o email para ganhar o cupom ganhe{int} feminino")
    public void preencheOEmailParaGanharOCupomGanheFeminino(int arg0) {
    }

    @Então("recebe a mensagem ‘Cadastro realizado com sucesso!”")
    public void recebeAMensagemCadastroRealizadoComSucesso() {
    }

    @Quando("preenche o email para ganhar o cupom ganhe{int} masculino")
    public void preencheOEmailParaGanharOCupomGanheMasculino(int arg0) {
    }

    @Quando("insere um email inválido para receber cupom ganhe{int}")
    public void insereUmEmailInválidoParaReceberCupomGanhe(int arg0) {
    }

    @Então("o site exibe a mensagem ‘Insira um e-mail válido’")
    public void oSiteExibeAMensagemInsiraUmEMailVálido() {
    }

    @Quando("insere um email que já foi utilizado para receber cupom ganhe{int}")
    public void insereUmEmailQueJáFoiUtilizadoParaReceberCupomGanhe(int arg0) {
    }

    @Então("o site exibe a mensagem ‘Este e-mail já está cadastrado’")
    public void oSiteExibeAMensagemEsteEMailJáEstáCadastrado() {
    }
}
