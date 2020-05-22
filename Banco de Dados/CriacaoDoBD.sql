create database ERP;
use ERP;

create table contas(
	Login varchar(20) primary key,
    Senha varchar(20) not null
);

insert into contas (Login, Senha, Funcao) VALUES ("Manager","Manager",2);

create table pedidos(
	ID int auto_increment primary key,
    Vendedor varchar(20) not null,
    Cliente varchar(20) not null,
    DataDeEntrega varchar(20) not null,
    Entregador varchar(20) not null,
    Valor float not null,
    Estado varchar(20) not null
);

create table clientes(
	Cliente varchar(20) primary key,
    PedidosFeitos int not null,
    Numero varchar(20) not null,
    Rua varchar(40) not null,
    CEP varchar(8) not null,
    Complemento varchar(200) not null
);

create table produtos(
	ID int auto_increment primary key,
    Nome varchar(30) not null,
    Quantidade int not null,
    ValorUnitario float not null
);

    