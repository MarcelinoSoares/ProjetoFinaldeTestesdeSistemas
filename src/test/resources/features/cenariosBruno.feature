#language: pt

Funcionalidade: Ajuda

  Cenário: Enviar e-mail de suporte para outros assuntos.
    Dado que um usuário acessa a página de Atendimento
    E escolhe o atendimento Fale conosco por Mensagem
    E seleciona o tópico de atendimento ‘Outros’
    E escolhe o assunto da mensagem
    E preenche os campos obrigatórios
    Quando envia o formulário
    Então é exibida uma mensagem do envio com sucesso.

  Cenário: Obter informações de ajuda para cancelamento
    Dado que um usuário acessa a página de Atendimento
    E seleciona a opção de Dúvidas Frequentes
    E escolhe a opção de Cancelamentos
    Quando escolhe a opção Como faço para cancelar minha compra
    Então é exibido o texto esperado de ajuda para cancelamento
