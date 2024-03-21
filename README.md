# **Projeto integrador InovaVerde**
<div style="text-align: justify;">
  <p style="text-align: justify;">
  O  projeto  InovaVerde  é  um  _e-commerce_  baseado  na  ODS  9  da  ONU  (Indústria,  inovação  e  infraestrutura)
  </p>
</div>
<br>

**-- O problema social --**
<div style="text-align: justify;">
  <p style="text-align: justify;">
  Indústria,  inovação  e  infraestrutura  Construir  infraestruturas  resilientes,  promover  a  industrialização  inclusiva  e  sustentável  e  fomentar  a  inovação.
O foco do projeto é a meta 9.4: “Até 2030, modernizar a infraestrutura e reabilitar as indústrias para torná-las sustentáveis, com eficiência aumentada no uso de recursos e maior adoção de tecnologias e processos industriais limpos e ambientalmente corretos; com todos os países atuando de acordo com suas respectivas capacidades”.
  </p>
</div>
<br>

**-- Quais são as causas, os impactos e as consequências do Problema Social foco do projeto na sociedade? --**
<div style="text-align: justify;">
  <p style="text-align: justify;">
  Problemas ambientais associados à emissão de CO2 como a chuva ácida, gerando problemas secundários como alteração do PH de corpos hídricos alterando toda a dinâmica da fauna e flora local, além de mudança de preços dos alimentos agrícolas devido a alteração do PH da chuva e outros problemas relacionados a saúde pública como o aumento de doenças respiratórias e aumento da ocupação do leito de hospitais.
  </p>
</div>
<br>

**-- Qual o motivo da escolha do modelo de software acima? --**
<div style="text-align: justify;">
  <p style="text-align: justify;">
  
  O _e-commerce_ foi escolhido pelo grupo 5 pensando na solução da problemática da emissão de CO2 que foi discutida na reunião da ONU denominada protocolo de Kyoto de 1997, nessa reunião foi discutido sobre o mercado de crédito de carbono.
  </p>
</div>
<br>

**-- Como a aplicação irá contribuir na solução do Problema Social escolhido pelo grupo? --**
<div style="text-align: justify;">
  <p style="text-align: justify;">
  
  A ideia do software é compensar o cliente através da compensação em cashback com créditos de carbono a partir das compras de produtos sustentáveis. Como agricultura familiar e produtos reciclados.
  </p>
</div>
<br>

**-- Diagrama de Entidade-Relacionamento (DER) --**
<div style="text-align: justify;">
  <p style="text-align: justify;">
  
  Um Diagrama de Entidade-Relacionamento (DER) é uma ferramenta utilizada na modelagem de dados para representar as relações entre entidades em um sistema. Ele é composto por entidades (que representam objetos do mundo real) e relacionamentos (que representam como essas entidades se conectam). O DER é frequentemente usado no projeto de bancos de dados para visualizar a estrutura e as relações dos dados.

  O início do projeto InovaVerde foi idealizado através de uma DER no software MySQL Workbench, ou seja, um banco de dados que armazena dados dos produtos, categoria e usuarios do _e-commerce_, a disposição das tabelas e seus atributos no DER pode ser observada na figura 1 a seguir:
  </p>
</div>

<div align="center">
  
![Diagrama DER Projeto InovaVerde](https://github.com/Inova-Verde/projeto-integrador-inova-verde/assets/147213232/b253fb5d-63c9-4b1b-af22-247b5b42be85)

</div>

<div style="text-align: justify;">
  <p style="text-align: justify;">
  
**Figura 1 - Modelo de diagrama de entidade de relacionamento entre produtos, categorias e usuários, sendo que a relação usuarios:produtos é 1:n e categorias:produtos é 1:n.**
  </p>
</div>
<br>

# Descrição das Tabelas e seus atributos

<div align="center">

 **Tabela 1 - Descrição dos atributos da tabela "tb_categorias", bem como a definição do tipo de dado e seus limites.**

 </div>
 
<div align="center">

| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| `id` BIGINT | Identificador único da tabela "tb_categorias" | **PK** |
| `nome` VARCHAR(255) | Definir Nome da categoria dos produtos | **NN** |
| `subcategoria` VARCHAR(255) | Definir Subcategoria dos produtos | **NN** |

</div>

A seguir temos exemplos de como será contruído as categorias e suas respectivas subcategorias:
 
Categoria 1: Produtos Orgânicos e Sustentáveis.<br>
Subcategoria: Frutas orgânicas e Vegetais orgânicos.

Categoria 2: Produtos de Agricultura de Conservação.<br>
Subcategoria: Kits de compostagem doméstica, Fertilizantes orgânicos e Produtos para manejo de pragas e doenças orgânicos.

Categoria 3: Energia Renovável para Residências e Pequenos Negócios.<br>
Subcategoria: Kits de energia solar para residências, Sistemas de aquecimento de água solar, Iluminação LED de baixo consumo energético.

<br>
<br>
<div align="center">

 **Tabela 2 - Descrição dos atributos da tabela "tb_produtos", bem como a definição do tipo de dado e seus limites.**

 </div>
 
<div align="center">

| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| `id` BIGINT | Identificador único da tabela "tb_produtos" | **PK** |
| `nome` VARCHAR(255) | Definir Nome do produto | **NN** |
| `preco` DECIMAL(6,2) | Preço do produto | **NN** |
| `descricao` VARCHAR(255) | Descrição do produto do e-commerce | **NN** |
| `estoque` BIGINT | Quantidade do produto em estoque | **NN** |
| `data_validade` DATE | Data de validade do produto em estoque | **NN** |

</div>
<br>
<br>
<div align="center">
   
   **Tabela 3 - Descrição dos atributos da tabela "tb_usuarios", bem como a definição do tipo de dado e seus limites.**
   
</div>
 
<div align="center">

| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| `id` BIGINT | Identificador único da tabela "tb_usuarios" | **PK** |
| `nome` VARCHAR(255) | Nome de usuário para o login | **NN** |
| `usuario` VARCHAR (255) | E-mail para confirmação e possível contato do usuário | **NN** |
| `senha` VARCHAR(255) | Senha de usuário para o login | **NN** |
| `foto` VARCHAR(255) | Foto do usuário (opcional) |  |

</div>
<br>

# Iniciando um projeto no Spring Starter

Utilizando a IDE Spring Tool Suite foi criado um nove projeto Spring Starter como indica a figura 2 abaixo:
<div align="center">
  
![Spring Starter](https://github.com/Inova-Verde/projeto-integrador-inova-verde/assets/147213232/ba618766-6384-4e6f-b0af-3a6bd29de3c7)

</div>

<div style="text-align: justify;">
  <p style="text-align: justify;">
  
**Figura 2 - O Spring Starter incluida no próprio Spring Tool Suite é uma alternativa ao Spring Initialzr e ambas permitem a importação de algumas dependências que auxiliam os desenvolvedores em diferentes funcionalidades.**
  </p>
</div>
<br>

**-- Dependências do Spring Tool Suite --**

<div style="text-align: justify;">
  <p style="text-align: justify;">
O projeto InovaVerde utiliza as dependências descritas na tabela 4 abaixo:
  </p>
</div>

<div align="center">
  <br>
   
   **Tabela 4 - Descrição resumida das funcionalidades de cada dependência que foi utilizada no projeto.**  

| Dependência   | Breve descrição       |
| :---------- | :--------- |
| _Spring Data JPA_ | Essa dependência permite usar os comandos de manipulação do banco de dados utilizando a linguagem Java ao invés de usar diretamente a linguagem SQL, simplificando bastante o código. |
| _Spring Boot DevTools_ | Essa dependência permite reinicializar a aplicação sempre que um código for alterado e salvo posteriormente, isso permite que o desenvolvedor possa monitorar em tempo real o que está acontecendo na aplicação. |
| _Spring Web_ | Essa dependência fornece recursos para criar facilmente endpoints RESTful e controladores MVC (Model-View-Controller). Com o Spring Web, você pode criar APIs web poderosas e flexíveis, além de páginas web dinâmicas. |
| _Validation_ | Essa dependência facilita a validação de dados numa tabela do banco de dados utilizando o conceito de _annotation_, normalmente a _annotation_ se antecede à uma declaração de variável no "model" do projeto Spring podendo aplicar a regra de validação nesta variável. |
| _MySQL Driver_ | Essa dependência faz a ponte entre a aplicação do Spring com a SGBD MySQL Workbench. |
|_Spring Boot Starter Security_| Configura as funcionalidades de segurança, como autenticação e autorização, garantindo proteção dos recursos e facilitando integração com diferentes sistemas de autenticação. |
|_jjwt api_| Fornece API para manipulação programática de tokens JWT, permitindo criar, validar e extrair informações de forma eficiente e segura. |
|_jjwt impl_| Implementa as funcionalidades da API jjwt-api, fornecendo mecanismos internos para gerar e validar tokens JWT em conformidade com as especificações estabelecidas. |
|_Jiwt jacksonl_| Implementa as funcionalidades da API jjwt-api, fornecendo mecanismos internos para gerar e validar tokens JWT em conformidade com as especificações estabelecidas. |



</div>
<br>

**-- Estruturas relevantes do projeto Spring --**

<div style="text-align: justify;">
  <p style="text-align: justify;">
Dentro da pasta do projeto Spring temos a seguinte configuração de pastas:
  </p>
</div>

<div align="center">
  <br>
  
`scr > main > java > com > generation > inovaverde > (controller, model,  repository, security e service)`
  
</div>
<br>
Em que cada tabela criada no banco de dados teremos: 1 controller, 1 model, 1 repository, 1 security e 1 service dedicado, neste caso será utilizado 3 tabelas ao todo como indica a figura 1, então no projeto teremos: 3 arquivos java para o controller na pasta "controller", 4 arquivos java para o model na pasta "model", 3 arquivos java para o repository na pasta "repository", 5 arquivos java para o security na pasta "security" e 1 arquivo java para o service na pasta "service"  como indica a tabela 5 a seguir:


<div align="center">
<br>
   
   **Tabela 5 - Pastas contidas no projeto do Spring Starter e os arquivos java contidos nas respectivas pastas.**
   
  
| Pasta   | Arquivos       |
| :---------- | :--------- |
| controller | CategoriaController.java, ProdutoControler.java e UsuarioController.java |
| model | Categoria.java, Produto.java e Usuario.java |
| repository | CategoriaRepository.java, ProdutoRepository.java e UsuarioRepository.java |
| security | BasicSecurityConfig.java, JwtAuthFilter.java, JwtService.java, UserDetailsImpl.java e UserDatailsServiceImpl.java |
| service | UsuarioService.java |

</div>
