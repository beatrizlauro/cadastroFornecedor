CREATE DATABASE cadastro;

USE cadastro;

CREATE TABLE `cadastro`.`cadastro_pessoa` (
  `id`       INT          NOT NULL AUTO_INCREMENT COMMENT '',
  `nome`     VARCHAR(100) NOT NULL                COMMENT '',
  `endereco` VARCHAR(100) NOT NULL                COMMENT '',
  `email`    VARCHAR(100)     NULL                COMMENT '',
  `telefone` VARCHAR(17)      NULL                COMMENT '',
  PRIMARY KEY (`id`)                              COMMENT '');
  
  CREATE TABLE `cadastro`.`uf` (
  `id`       INT          NOT NULL AUTO_INCREMENT COMMENT '',
  `nome`     VARCHAR(100) NOT NULL                COMMENT '',
  `sigla`    VARCHAR(2)   NOT NULL                COMMENT '',
  PRIMARY KEY (`id`)                              COMMENT '');
  
	CREATE TABLE `cadastro`.`fornecedor` (
  `id`                   INT          NOT NULL AUTO_INCREMENT COMMENT '',
  `cnpj`                 VARCHAR(14)  NOT NULL                COMMENT '',
  `inscricaoEstadual`    VARCHAR(9)   NOT NULL                COMMENT '',
  `nomeFantasia`         VARCHAR(100) NOT NULL                COMMENT '',
  `nome`                 VARCHAR(100) NOT NULL                COMMENT '',
  `email`                VARCHAR(100) NOT NULL                COMMENT '',
  `endereco`             VARCHAR(100) NOT NULL                COMMENT '',
  `telefone`             VARCHAR(17)  NOT NULL                COMMENT '',
  `uf`                   INT          NOT NULL                COMMENT '',
  `categoria`            VARCHAR(100) NOT NULL                COMMENT '',
  PRIMARY KEY (`id`), 
  CONSTRAINT `fk_uf` FOREIGN KEY (`uf`) REFERENCES `cadastro`.`uf`(`id`)  -- Definindo a chave estrangeira
);

  
/*visualizar todos os dados contidos na tabela uf*/
select * from uf;

/*visualizar todos os dados contidos na tabela cadastro_pessoa*/
select * from cadastro_pessoa;

/*visualizar todos os dados contidos na tabela cadastro_pessoa com id MAIOR que 0*/
select * from cadastro_pessoa WHERE id > 0;

/*visualizar todos os dados contidos na tabela cadastro_pessoa com id MENOR que 4 em ordem DECRESCENTE*/
SELECT * FROM cadastro_pessoa WHERE id < 4 ORDER BY id DESC;