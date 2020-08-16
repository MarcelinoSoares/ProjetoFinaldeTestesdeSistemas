#language: pt

@projetofinal @ajuda
Funcionalidade: Ajuda
  // Descricao da funcionalidade

  @emailoutroassuntos
  Cenário: Enviar e-mail de suporte para outros assuntos.
    Dado que um usuário acessa a página de Atendimento
    E escolhe o atendimento Fale conosco por Mensagem
    E seleciona o tópico de atendimento ‘Outros’
    E escolhe o assunto da mensagem
    E preenche os campos obrigatórios
    Quando envia o formulário
    Então é exibida uma mensagem do envio com sucesso.

  @cancelamento
  Cenário: Obter informações de ajuda para cancelamento
    Dado que um usuário seleciona a opção de Dúvidas Frequentes
    Quando escolhe a opção de Cancelamentos
    E escolhe a opção Como faço para cancelar minha compra
    Então é exibido o texto esperado de ajuda para cancelamento

  @recuperasenha
  Cenário: Obter informações de ajuda para Recuperar sua senha
    Dado que um usuário seleciona a opção de FAQ
    Quando escolhe a opção de Como Comprar
    E escolhe a opção Como faço para recuperar minha senha
    Então é exibido o texto esperado de ajuda para recuperar senha

  @infoajudaparaentregas
  Cenário: Obter informações de ajuda para Entregas no mesmo dia
    Dado que um usuário seleciona a opção de ajuda por perguntas e respostas
    Quando escolhe a opção de Entregas e Frete
    E escolhe a opção O que é o frete hoje
    Então é exibido o texto esperado de ajuda sobre o que é o frete hoje