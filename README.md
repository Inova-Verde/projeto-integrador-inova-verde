<h4 align="center"> 
	🚧  InovaVerde 🚀 Em construção...  🚧
</h4>

<div align="center">

  <img src= "https://github.com/Inova-Verde/projeto-integrador-inova-verde/assets/147213232/af7509c4-70e3-49dd-bf81-e9c57abf3b5a" alt="drawing" width="300"/>


</div>

# 🌳**Projeto integrador InovaVerde**
<div style="text-align: justify;">
  <p style="text-align: justify;">
    
### Descrição do Projeto
    
 <p align="center"> 
   O  projeto  InovaVerde  é  um  _e-commerce_  baseado  na  ODS  9  da  ONU  (Indústria,  inovação  e  infraestrutura)
   <br><br>
 <img src="https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" width="156"/>
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" width="150"/>
<img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" width="156" height="46"/>
 </p>

</div>

# ✨Features

- [x] CRUD de usuário
- [x] CRUD de categorias
- [x] CRUD de produtos
- [x] CRUD do banco de dados
- [ ] Transferência
<br>

# 📝Tabela de conteúdos
<!--ts-->
   * 👉[Descrição do Projeto](#descricao-do-projeto)
   * 👉[Tabela de Conteudos](#Tabela-de-conteúdos)
   * 👉[Contextualização](#Contextualização)
      * [O problema social](#O-problema-social)
      * [Quais são as causas, os impactos e as consequências do Problema Social foco do projeto na sociedade?](#local-files)
      * [Qual o motivo da escolha do modelo de software acima?](#remote-files)
      * [Como a aplicação irá contribuir na solução do Problema Social?](#multiple-files)
   * 👉[Diagrama de Entidade-Relacionamento (DER)](#testes)
   * 👉[Descrição das Tabelas e seus atributos](#tecnologias)
   * 👉[Iniciando um projeto no Spring Starter](#tecnologias)
      * [Dependências do Spring Tool Suite](#O-problema-social)
      * [Estruturas relevantes do projeto Spring](#O-problema-social)
<!--te-->
<br>
<br>

# 💡Contextualização

### O problema social
<div style="text-align: justify;">
  <p style="text-align: justify;">
  Indústria,  inovação  e  infraestrutura  Construir  infraestruturas  resilientes,  promover  a  industrialização  inclusiva  e  sustentável  e  fomentar  a  inovação.
O foco do projeto é a meta 9.4: “Até 2030, modernizar a infraestrutura e reabilitar as indústrias para torná-las sustentáveis, com eficiência aumentada no uso de recursos e maior adoção de tecnologias e processos industriais limpos e ambientalmente corretos; com todos os países atuando de acordo com suas respectivas capacidades”.
  </p>
</div>
<br>

### Quais são as causas, os impactos e as consequências do Problema Social foco do projeto na sociedade?
<div style="text-align: justify;">
  <p style="text-align: justify;">
  Problemas ambientais associados à emissão de CO2 como a chuva ácida, gerando problemas secundários como alteração do PH de corpos hídricos alterando toda a dinâmica da fauna e flora local, além de mudança de preços dos alimentos agrícolas devido a alteração do PH da chuva e outros problemas relacionados a saúde pública como o aumento de doenças respiratórias e aumento da ocupação do leito de hospitais.
  </p>
</div>
<br>

### Qual o motivo da escolha do modelo de software acima?
<div style="text-align: justify;">
  <p style="text-align: justify;">
  
  O _e-commerce_ foi escolhido pelo grupo 5 pensando na solução da problemática da emissão de CO2 que foi discutida na reunião da ONU denominada protocolo de Kyoto de 1997, nessa reunião foi discutido sobre o mercado de crédito de carbono.
  </p>
</div>
<br>

### Como a aplicação irá contribuir na solução do Problema Social?
<div style="text-align: justify;">
  <p style="text-align: justify;">
  
  A ideia do software é compensar o cliente através da compensação em cashback com créditos de carbono a partir das compras de produtos sustentáveis. Como agricultura familiar e produtos reciclados.
  </p>
</div>
<br>

# 📌Diagrama de Entidade-Relacionamento (DER)
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

### Descrição das Tabelas e seus atributos

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

# ✔️Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Node.js](https://nodejs.org/en/). 
Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/)

## 🎲 Rodando o Back End (servidor)

### Clone este repositório
$ git clone <https://github.com/tgmarinho/nlw1>

### Acesse a pasta do projeto no terminal/cmd
$ cd nlw1

### Vá para a pasta server
$ cd server

### Instale as dependências
$ npm install

### Execute a aplicação em modo de desenvolvimento
$ npm run dev:server

### O servidor inciará na porta:3333 - acesse <http://localhost:3333>

<br>

 # 📦Iniciando um projeto no Spring Starter

Utilizando a IDE Spring Tool Suite foi criado um nove projeto Spring Starter como indica a figura 2 abaixo:
<div align="center">

<img src= "https://github.com/Inova-Verde/projeto-integrador-inova-verde/assets/147213232/ba618766-6384-4e6f-b0af-3a6bd29de3c7" alt="drawing" width="500"/>

</div>

<div style="text-align: justify;">
  <p style="text-align: justify;">
  
**Figura 2 - O Spring Starter incluida no próprio Spring Tool Suite é uma alternativa ao Spring Initialzr e ambas permitem a importação de algumas dependências que auxiliam os desenvolvedores em diferentes funcionalidades.**
  </p>
</div>
<br>

### Dependências do Spring Tool Suite

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

### Estruturas relevantes do projeto Spring

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
| model | Categoria.java, Produto.java, Usuario.java e UsuarioLogin.java |
| repository | CategoriaRepository.java, ProdutoRepository.java e UsuarioRepository.java |
| security | BasicSecurityConfig.java, JwtAuthFilter.java, JwtService.java, UserDetailsImpl.java e UserDatailsServiceImpl.java |
| service | UsuarioService.java |

</div>
<br>
<br>

# 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Expo](https://expo.io/)
- [Node.js](https://nodejs.org/en/)
- [React](https://pt-br.reactjs.org/)
- [React Native](https://reactnative.dev/)
- [TypeScript](https://www.typescriptlang.org/)
  
<br>

# 🤝Contribuidores

<div align="center">
<table>
  <tr>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars2.githubusercontent.com/u/2254731?s=400&u=0ba16a79456c2f250e7579cb388fa18c5c2d7d65&v=4" width="100px;" alt=""/><br /><sub><b>Diego Fernandes</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat">👨‍🚀</a></td>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars1.githubusercontent.com/u/4669899?s=460&u=806503605676192b5d0c363e4490e13d8127ed64&v=4" width="100px;" alt=""/><br /><sub><b>Cleiton Souza</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat">👨‍🚀</a></td>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars2.githubusercontent.com/u/861751?s=460&v=4" width="100px;" alt=""/><br /><sub><b>Robson Marques</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat">👨‍🚀</a></td>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars3.githubusercontent.com/u/16831337?s=460&v=4" width="100px;" alt=""/><br /><sub><b>Claudio Orlandi</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat">🚀</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars0.githubusercontent.com/u/39345247?s=460&u=cdff2624a327a43e2765112a54e966a06eac6d79&v=4" width="100px;" alt=""/><br /><sub><b>Joseph Oliveira</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat">🚀</a></td>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars0.githubusercontent.com/u/10366880?s=460&u=59e93e1752e9d2ece4b7d8e129d60caba9c94207&v=4" width="100px;" alt=""/><br /><sub><b>Guilherme Rodz</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat">🚀</a></td>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars2.githubusercontent.com/u/37725197?s=460&u=446439436524c37f66e41f35b607dbb70358d5e4&v=4" width="100px;" alt=""/><br /><sub><b>Vinícios Fraga</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat">🚀</a></td>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars3.githubusercontent.com/u/26551306?s=460&u=18446655ccae6c2a29eb177a104ecf32f029aa3a&v=4" width="100px;" alt=""/><br /><sub><b>Hugo Duarte</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat">🚀</a>  <a href="https://blog.rocketseat.com.br/" title="Blog">🌐</a></td>
  </tr>
</table>
</div>
