#language: pt

@projetofinal @ganhe20
Funcionalidade: Ganhe20 na primeira compra

  @cupomfeminino
  Cenário: Gerando cupom para primeira compra moda feminina
    Dado que um usuário está na página inicial
    Quando preenche o email para ganhar o cupom ganheVinte feminino "mulher36@femiappp.com"
    Então recebe a mensagem ‘Cadastro realizado com sucesso!'

  @cupommasculino
  Cenário: Gerando cupom para primeira compra moda Masculina
    Dado que um usuário está na página inicial
    Quando preenche o email para ganhar o cupom ganheVinte masculino "homem36@masculippp.com"
    Então recebe a mensagem ‘Cadastro realizado com sucesso!'

  @emailinvalido
  Cenário:  Email inválido
    Dado que um usuário está na página inicial
    Quando preenche o email para ganhar o cupom ganheVinte masculino "invalido.com"
    Então o site exibe a mensagem ‘Insira um e-mail válido’

  @emailjautilizado
  Cenário:  Email já utilizado
    Dado que um usuário está na página inicial
    Quando insere um email que já foi utilizado para receber cupom ganheVinte "mulher7@femiappp.com"
    Então o site exibe a mensagem ‘Este e-mail já está cadastrado’