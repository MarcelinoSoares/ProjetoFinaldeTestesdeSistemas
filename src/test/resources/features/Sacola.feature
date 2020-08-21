#language: pt

@projetofinal @sacola
Funcionalidade: Sacola

  @adicionarproduto
  Cenário: adicionar produto à sacola
    Dado que o usuário acessa a página de um produto
    Quando clica em comprar
    Então o produto é adicionado na sacola

  @removerproduto
  Cenário: remover produto da sacola
    Dado que o usuário possui um produto na sacola
    Quando clica em ‘Remover produto’
    Então o produto é removido da sacola
