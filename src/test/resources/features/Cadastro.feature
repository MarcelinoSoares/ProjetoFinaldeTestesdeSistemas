#language: pt

@projetofinal @cadastro
Funcionalidade: Cadastro de usuário

  @emailJaCadastrado
  Cenário: Tentar cadastrar usuário com email já cadastrado
    Dado que o usuário está na tela de cadastro
    Quando preenche os dados corretamente informando um e-mail já cadastrado "brunobaima@yahoo.com.br"
    Então recebe a mensagem "E-mail ou CPF já cadastrado(s)."