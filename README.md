# **Projeto integrador InovaVerde**
<p style="text-align: justify;">
  
  O projeto InovaVerde é um _e-commerce_ baseado na ODS 9 da ONU (Indústria, inovação e infraestrutura)

</p>

**O problema social**
<p style="text-align: justify;">
  
  Indústria, inovação e infraestrutura Construir infraestruturas resilientes, promover a industrialização inclusiva e sustentável e fomentar a inovação.
O foco do projeto é a meta 9.4: “Até 2030, modernizar a infraestrutura e reabilitar as indústrias para torná-las sustentáveis, com eficiência aumentada no uso de recursos e maior adoção de tecnologias e processos industriais limpos e ambientalmente corretos; com todos os países atuando de acordo com suas respectivas capacidades”.

</p>

**Quais são as causas, os impactos e as consequências do Problema Social foco do projeto na sociedade?**
<p style="text-align: justify;">
  
  Problemas ambientais associados à emissão de CO2 como a chuva ácida, gerando problemas secundários como alteração do PH de corpos hídricos alterando toda a dinâmica da fauna e flora local, além de mudança de preços dos alimentos agrícolas devido a alteração do PH da chuva e outros problemas relacionados a saúde pública como o aumento de doenças respiratórias e aumento da ocupação do leito de hospitais.

</p>

**Qual o motivo da escolha do modelo de software acima?**
<p style="text-align: justify;">
  
  O _e-commerce_ foi escolhido pelo grupo 5 pensando na solução da problemática da emissão de CO2 que foi discutida na reunião da ONU denominada protocolo de Kyoto de 1997, nessa reunião foi discutido sobre o mercado de crédito de carbono.

</p>

**Como a aplicação irá contribuir na solução do Problema Social escolhido pelo grupo?**
<p style="text-align: justify;">
  
  A ideia do software é compensar o cliente através da compensação em cashback com créditos de carbono a partir das compras de produtos sustentáveis. Como agricultura familiar e produtos reciclados.

</p>

**Diagrama de Entidade-Relacionamento (DER)**
<p style="text-align: justify;">
  
  Um Diagrama de Entidade-Relacionamento (DER) é uma ferramenta utilizada na modelagem de dados para representar as relações entre entidades em um sistema. Ele é composto por entidades (que representam objetos do mundo real) e relacionamentos (que representam como essas entidades se conectam). O DER é frequentemente usado no projeto de bancos de dados para visualizar a estrutura e as relações dos dados.

  O início do projeto InovaVerde foi idealizado através de uma DER, ou seja, um banco de dados que armazena dados dos produtos do _e-commerce_, dados da categoria dos produtos e por fim, dados do usuário cadastrado no site deste _e-commerce_, a forma como o DER inicialmente foi construído pode ser observada na figura 1 a seguir:
</p>

![InovaVerde_DER_page-0001](https://github.com/Inova-Verde/projeto-integrador-inova-verde/assets/147213232/a7411e79-9f42-4e83-afb8-44fa9d23050a)

<p style="text-align: justify;">
  
**Figura 1. Modelo de diagrama de entidade de relacionamento entre produtos, categorias e usuários, sendo que a relação usuarios:produtos é 1:n e categorias:produtos é 1:n.**

</p>


# Descrição das Tabelas e seus atributos

### Tabela: tb_categorias

| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| `id` BIGINT | Identificador único da tabela usuário | **PK** |
| `nome` VARCHAR(255) | Definir Nome da categoria dos produtos | **NN** |
| `subcategoria` VARCHAR(255) | Definir Subcategoria dos produtos | **NN** |
