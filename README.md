# Sistema Integrado de Gestão Empresarial em Java (Com Banco de Dados)

![Screenshot Principal](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/ScreenshotPrincipal.png)

## Instruções para configuração do Bando de Dados

Para executar a aplicação em sua máquina é necessário configurar o servidor e alterar algumas linhas de código.

### Configurar o Servidor
Primeiro é criar um banco de dados em um servidor MySQL, Para isso é necessário executar o arquivo CriacaoDoBD.sql no seu servidor MySQL.

### Modificar o código
Na classe ConnectionFactory, presente no pacote conexao, modifique as seguintes linhas

Linha    | Modificação
---------|------------
Linha 8  | Defina o valor da variável para a URL da conexâo com o Banco de Dados (Ex: "jdbc:mysql://localhost:3306/ERP";)
Linha 9  | Defina o valor da variável para o USER do servidor (Ex: "root";)
Linha 10 | Defina o valor da variável para o PASS do USER (Ex: "12345";)

![Imagem codigo](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/LinhasConnectionFactory.png)

É importante se certificar que você tem acesso e permissão para modificar o banco de dados no servidor.

## Funcionalidades
Esse software tem por objetivo integrar os sistemas de Supply chain, Criação de Pedidos, Gerenciamento de Clientes e Sistema de Entregas de uma empresa. 

![Menu inicial](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/SSMenu.png)

### Pedidos e Vendedores
Um Pedido é um registro que contém informações sobre um encomenda feita para a empresa. Cada pedido possui um identificador único, seu ID. **Apenas funcionários** podem fazer novos pedidos.

#### Novo Pedido
Para fazer um novo pedido é necessário ter um **cliente já cadastrado**. O orçamento do pedido é feito automaticamente e só é possível fazer um orçamento com **produtos cadastrados com estoque**. 

![Novo Pedido](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/SSNovoPedido.png)

Após um pedido ser criado, é responsabilidade de um **entregador** atribuir uma data de entrega para o pedido. O número de unidades disponível em estoque é **automaticamente atualizado**, assim como o número de pedidos feitos pelo cliente.

![Pedido](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/SSPedidos.png)

#### Vendedores
Um vendedor é um funcionário responsável por criar novos pedidos. Um vendedor nâo pode atribuir uma data de entrega para um pedido ou **modificar um pedido**.

### Sistema de Entregas e Entregadores
É responsabilidade de um entregador atribuir uma data de entrega para determinado produto. É possível modificar a data de entrega.

![Entregas](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/SSEntrega.png)

#### Entregadores
Um entregador é responsável por fazer a entrega de um pedido para o cliente. Um entregador pode atribuir ou modificar a data de entrega de um pedido. Além disso, um entregador é responsável por **confirmar se um pedido foi entregue**.

![Entregador](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/SSEntregador.png)

### Clientes
Para que um pedido seja feito, é necessário que o cliente que fez o pedido esteja cadastrado. O cadastro do cliente possui informações como **Nome do cliente, pedidos já feitos e Endereço**. Apenas **vendedores podem cadastrar novos clientes e alterar seus cadastros**.

![Cliente](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/SSNovoCliente.png)

### Produtos e Gerentes
Um produto é o elemento que compõe o **Inventário da empresa**. Um produto tem um identificador único (Assim como os pedidos), seu ID. Apenas **gerentes podem cadastrar, exluir ou repôr produtos no estoque**.

![Produto](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/SSProduto.png)
![Reposição de estoque](https://github.com/GabrielIDSM/ERP/blob/master/Imagens/SSRepEstoque.png)

## Colaboradores e contato
O Projeto é pessoal, feito por Gabriel Inácio ([Github](https://github.com/GabrielIDSM)/[LinkedIn](https://www.linkedin.com/in/gabriel-inacio-uff/)).

E-mail: gabrielinacio@id.uff.br




