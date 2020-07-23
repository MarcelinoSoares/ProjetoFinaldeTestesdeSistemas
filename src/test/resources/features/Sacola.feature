#language: pt

Funcionalidade: Sacola

#  @sacola @run
#  Cenário: adicionar produto à sacola
#    Dado que o usuário acessa a página de um produto
#    Quando clica em comprar
#    Então o produto é adicionado na sacola

  @sacola @run
  Cenário: remover produto da sacola
    Dado que o usuário possui um produto na sacola
    Quando clica em ‘Remover produto’
    Então o produto é removido da sacola

#  @sacola
#  Cenário: Adicionar embalagem para presente
#    Dado que o usuário deseja comprar um calçado para presente
#    Quando clica em Embalagem para presente
#    Então o link muda o texto para ‘Com embalagem para presente’
#    E um valor é adicionado ao lado no subtotal
#
#  @sacola
#  Cenário: Aumentar a quantidade de um produto
#    Dado que um usuário adiciona um produto na sacola
#    Quando aumenta a quantidade para 2
#    Então o subtotal desse produto deve corresponder ao dobro do valor individual