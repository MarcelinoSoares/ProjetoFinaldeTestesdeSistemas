#language: pt

@projetofinal @ganhe20
Funcionalidade: Ganhe20 na primeira compra

  @cupomfeminino
  Cenário: Gerando cupom para primeira compra moda feminina
    Dado que um usuário está na página inicial
    Quando preenche o email para ganhar o cupom ganheVinte feminino
    Então recebe a mensagem ‘Cadastro realizado com sucesso!'

  @cupommasculino
  Cenário: Gerando cupom para primeira compra moda Masculina
    Dado que um usuário está na página inicial
    Quando preenche o email para ganhar o cupom ganheVinte masculino
    Então recebe a mensagem ‘Cadastro realizado com sucesso!'

  @emailinvalido
  Cenário:  Email inválido
    Dado que um usuário está na página inicial
    Quando insere um email inválido para receber cupom ganheVinte
    Então o site exibe a mensagem ‘Insira um e-mail válido’

  @emailjautilizado
  Cenário:  Email já utilizado
    Dado que um usuário está na página inicial
    Quando insere um email que já foi utilizado para receber cupom ganheVinte
    Então o site exibe a mensagem ‘Este e-mail já está cadastrado’