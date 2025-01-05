CREATE TABLE `cadastro`.`cadastro_pessoa` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `nome` VARCHAR(100) NOT NULL COMMENT '',
  `endereco` VARCHAR(100) NOT NULL COMMENT '',
  `email` VARCHAR(100) NULL COMMENT '',
  `telefone` VARCHAR(17) NULL COMMENT '',
  PRIMARY KEY (`id')  COMMENT '');

  use cadastro;
  select * from cadastro_pessoa;