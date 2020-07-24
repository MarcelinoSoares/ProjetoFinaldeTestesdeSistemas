#language: pt

Funcionalidade: Sacola

  @sacola
  Cenário: adicionar produto à sacola
    Dado que o usuário acessa a página de um produto
    Quando clica em comprar
    Então o produto é adicionado na sacola