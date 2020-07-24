#language: pt

Funcionalidade: Ajuda
  //Descricao da funcionalidade

  @ajuda
  Cenário: Enviar e-mail de suporte para outros assuntos.
    Dado que um usuário acessa a página de Atendimento
    E escolhe o atendimento Fale conosco por Mensagem
    E seleciona o tópico de atendimento ‘Outros’
    E escolhe o assunto da mensagem
    E preenche os campos obrigatórios
    Quando envia o formulário
    Então é exibida uma mensagem do envio com sucesso.

  @ajuda
  Cenário: Obter informações de ajuda para cancelamento
    Dado que um usuário seleciona a opção de Dúvidas Frequentes
    Quando escolhe a opção de Cancelamentos
    E escolhe a opção Como faço para cancelar minha compra
    Então é exibido o texto esperado de ajuda para cancelamento

  @ajuda @run
  Cenário: Obter informações de ajuda para Recuperar sua senha
    Dado que um usuário seleciona a opção de FAQ
    Quando escolhe a opção de Como Comprar
    E escolhe a opção Como faço para recuperar minha senha
    Então é exibido o texto esperado de ajuda para recuperar senha
