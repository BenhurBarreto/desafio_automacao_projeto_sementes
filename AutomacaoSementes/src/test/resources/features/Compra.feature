#language:pt

Funcionalidade: Compra de Monitor

Cenário: Realiza compra de Monitor
  Dado que acesso a Product Store
  E acesso a categoria Monitors
  E seleciono um Apple Monitor
  E o adiciono o produto no carrinho Chart
  E confirmo clicando em OK na caixa de diálogo que aparece
  E acesso o carrinho em Chart
  E confirmo a inclusão
  Quando clico em Place Order
  E preencho todos os campos
  E clico em Purchase
  Então eu devo ver a mensagem de compra realizada