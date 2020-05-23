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
