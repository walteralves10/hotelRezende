CREATE TABLE `clientes` (
	`idcliente` int NOT NULL AUTO_INCREMENT,
	`nomecliente` varchar(100) NOT NULL,
	`CPFcliente` varchar(11) NOT NULL,
	`emailcliente` varchar(200),
	`idtelefonecliente` int NOT NULL,
	`idenderecocliente` int NOT NULL,
	`idocupacaocliente` int NOT NULL,
	PRIMARY KEY (`idcliente`)
);

CREATE TABLE `enderecos` (
	`idendereco` int NOT NULL AUTO_INCREMENT,
	`ruaendereco` varchar(200),
	`bairroendereco` varchar(80),
	`cidadeendereco` varchar(80),
	`estadoendereco` varchar(2),
	`CEPendereco` varchar(9),
	PRIMARY KEY (`idendereco`)
);

CREATE TABLE `telefones` (
	`idtelefone` int NOT NULL AUTO_INCREMENT,
	`dddtelefone` varchar(3) NOT NULL,
	`numerotelefone` varchar(9) NOT NULL,
	PRIMARY KEY (`idtelefone`)
);

CREATE TABLE `ocupacoes` (
	`idocupacao` int NOT NULL AUTO_INCREMENT,
	`idquartoocupacao` int NOT NULL,
	`idservidodequartoocupacao` int NOT NULL,
	PRIMARY KEY (`idocupacao`)
);

CREATE TABLE `quartos` (
	`idquarto` int NOT NULL AUTO_INCREMENT,
	`numeroquarto` int NOT NULL,
	`descricaoquarto` varchar(100),
	PRIMARY KEY (`idquarto`)
);

CREATE TABLE `servidodequarto` (
	`idservidodequarto` int NOT NULL AUTO_INCREMENT,
	`descricaoservidodequarto` varchar(200) NOT NULL,
	PRIMARY KEY (`idservidodequarto`)
);

CREATE TABLE `comprovantes` (
	`idcomprovante` int NOT NULL AUTO_INCREMENT,
	`datacomprovante` DATE NOT NULL,
	`idclientecomprovante` int NOT NULL,
	`idfuncionariocomprovantes` int NOT NULL,
	PRIMARY KEY (`idcomprovante`)
);

CREATE TABLE `funcionarios` (
	`idfuncionario` int NOT NULL AUTO_INCREMENT,
	`nomefuncionario` varchar(100) NOT NULL,
	`loginfuncionario` varchar(100) NOT NULL,
	`senhafuncionario` varchar(100) NOT NULL,
	`cargofuncionario` varchar(100),
	PRIMARY KEY (`idfuncionario`)
);

ALTER TABLE `clientes` ADD CONSTRAINT `clientes_fk0` FOREIGN KEY (`idtelefonecliente`) REFERENCES `telefones`(`idtelefone`);

ALTER TABLE `clientes` ADD CONSTRAINT `clientes_fk1` FOREIGN KEY (`idenderecocliente`) REFERENCES `enderecos`(`idendereco`);

ALTER TABLE `clientes` ADD CONSTRAINT `clientes_fk2` FOREIGN KEY (`idocupacaocliente`) REFERENCES `ocupacoes`(`idocupacao`);

ALTER TABLE `ocupacoes` ADD CONSTRAINT `ocupacoes_fk0` FOREIGN KEY (`idquartoocupacao`) REFERENCES `quartos`(`idquarto`);

ALTER TABLE `ocupacoes` ADD CONSTRAINT `ocupacoes_fk1` FOREIGN KEY (`idservidodequartoocupacao`) REFERENCES `servidodequarto`(`idservidodequarto`);

ALTER TABLE `comprovantes` ADD CONSTRAINT `comprovantes_fk0` FOREIGN KEY (`idclientecomprovante`) REFERENCES `clientes`(`idcliente`);

ALTER TABLE `comprovantes` ADD CONSTRAINT `comprovantes_fk1` FOREIGN KEY (`idfuncionariocomprovantes`) REFERENCES `funcionarios`(`idfuncionario`);

