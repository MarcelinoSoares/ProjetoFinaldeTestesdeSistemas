#language: pt

Funcionalidade: Ganhe20 na primeira compra

  Cenário: Gerando cupom para primeira compra moda feminina
    Dado que um usuário está na página inicial
    Quando preenche o email para ganhar o cupom ganhe20 feminino
    Então recebe a mensagem ‘Cadastro realizado com sucesso!”

  Cenário: Gerando cupom para primeira compra moda Masculina
    Dado que um usuário está na página inicial
    Quando preenche o email para ganhar o cupom ganhe20 masculino
    Então recebe a mensagem ‘Cadastro realizado com sucesso!”

  Cenário:  Email inválido
    Dado que um usuário está na página inicial
    Quando insere um email inválido para receber cupom ganhe20
    Então o site exibe a mensagem ‘Insira um e-mail válido’

  Cenário:  Email já utilizado
    Dado que um usuário está na página inicial
    Quando insere um email que já foi utilizado para receber cupom ganhe20
    Então o site exibe a mensagem ‘Este e-mail já está cadastrado’
