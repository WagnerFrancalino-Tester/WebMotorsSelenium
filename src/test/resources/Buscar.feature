#language:pt

 Funcionalidade: busca por produtos
  Dado que eu sou um usuario do sistema
  Quando desejo realizar uma busca por marca, modelo e versao
  Entao o sistema exibe uma lista de produtos do estoque

  @HU01-Buscar_produto_marca
  Cenario: Bucar produto por marca
  Dado que eu esteja na pagina resultado de busca da Webmotors
	Quando seleciono uma marca
	Entao o sistema lista os produtos relacionados
	
	@HU02-Buscar_produto_marca_modelo
  Cenario: Bucar produto por marca e modelo
  Dado que eu esteja na pagina resultado de busca da Webmotors
	Quando seleciono uma marca e um modelo
	Entao o sistema lista os produtos relacionados ao modelo
	
	@HU03-Bucar_produto_marca_modelo_versao
	Cenario: Bucar produto por marca e modelo
  Dado que eu esteja na pagina resultado de busca da Webmotors
	Quando seleciono uma marca, modelo e versao
	Entao o sistema lista os produtos relacionados a versao