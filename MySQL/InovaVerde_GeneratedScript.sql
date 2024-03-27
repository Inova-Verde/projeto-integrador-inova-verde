SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_InovaVerde
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_InovaVerde
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_InovaVerde` DEFAULT CHARACTER SET utf8 ;
USE `db_InovaVerde` ;

-- -----------------------------------------------------
-- Table `db_InovaVerde`.`tb_categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_InovaVerde`.`tb_categorias` (
  `id_categoria` BIGINT NULL AUTO_INCREMENT,
  `nome_categoria` VARCHAR(255) NOT NULL,
  `subcategoria` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_InovaVerde`.`tb_usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_InovaVerde`.`tb_usuarios` (
  `id_usuario` BIGINT NULL AUTO_INCREMENT,
  `nome_usuario` VARCHAR(255) NOT NULL,
  `usuario` VARCHAR(255) NOT NULL,
  `senha_usuario` VARCHAR(255) NOT NULL,
  `foto_usuario` VARCHAR(255) NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_InovaVerde`.`tb_produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_InovaVerde`.`tb_produtos` (
  `id_produto` BIGINT NULL AUTO_INCREMENT,
  `nome_produto` VARCHAR(255) NOT NULL,
  `preco_produto` DECIMAL(6,2) NOT NULL,
  `descricao_produto` VARCHAR(255) NOT NULL,
  `qtd_produto` BIGINT NOT NULL,
  `data_validade` DATE NULL,
  `tb_categorias_id_categoria` BIGINT NOT NULL,
  `tb_usuarios_id_usuario` BIGINT NOT NULL,
  PRIMARY KEY (`id_produto`, `tb_categorias_id_categoria`, `tb_usuarios_id_usuario`),
  INDEX `fk_tb_produtos_tb_categorias_idx` (`tb_categorias_id_categoria` ASC) VISIBLE,
  INDEX `fk_tb_produtos_tb_usuarios1_idx` (`tb_usuarios_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_tb_produtos_tb_categorias`
    FOREIGN KEY (`tb_categorias_id_categoria`)
    REFERENCES `db_InovaVerde`.`tb_categorias` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_produtos_tb_usuarios1`
    FOREIGN KEY (`tb_usuarios_id_usuario`)
    REFERENCES `db_InovaVerde`.`tb_usuarios` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
