-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51a-3ubuntu5.4-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema Academico
--

CREATE DATABASE IF NOT EXISTS Academico;
USE Academico;

--
-- Definition of table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
CREATE TABLE `aluno` (
  `Codigo_Aluno` decimal(10,0) NOT NULL,
  `Nome_Aluno` varchar(40) default NULL,
  PRIMARY KEY  (`Codigo_Aluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aluno`
--

/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` (`Codigo_Aluno`,`Nome_Aluno`) VALUES 
 ('1','JOSE DE TABREU'),
 ('2','ALICE DAS MARAVILHAS'),
 ('3','POMPEU CARDUROSO'),
 ('4','OLAVAO DA SILVA'),
 ('5','MARIANA GONNALVEZ'),
 ('6','ERICA HIGOMES'),
 ('7','CARLA CARDUROSO'),
 ('8','RUTH CARDUROSO'),
 ('9','OSMAR MARAM'),
 ('10','CARLOS POMPEU'),
 ('11','GILBERTO BRASA'),
 ('12','TINA DALU'),
 ('13','JOSE APARECIDO APARECEU APARECENDO');
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;


--
-- Definition of table `atribuicao`
--

DROP TABLE IF EXISTS `atribuicao`;
CREATE TABLE `atribuicao` (
  `Codigo_Atrib` decimal(10,0) NOT NULL,
  `Codigo_Professor` decimal(10,0) NOT NULL,
  `Codigo_CursoDis` decimal(10,0) NOT NULL,
  PRIMARY KEY  (`Codigo_Atrib`),
  KEY `Codigo_CursoDis` (`Codigo_CursoDis`),
  KEY `Codigo_Professor` (`Codigo_Professor`),
  CONSTRAINT `atribuicao_ibfk_1` FOREIGN KEY (`Codigo_CursoDis`) REFERENCES `cursoxdisciplinas` (`Codigo_CursoDis`),
  CONSTRAINT `atribuicao_ibfk_2` FOREIGN KEY (`Codigo_Professor`) REFERENCES `professor` (`Codigo_Professor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `atribuicao`
--

/*!40000 ALTER TABLE `atribuicao` DISABLE KEYS */;
INSERT INTO `atribuicao` (`Codigo_Atrib`,`Codigo_Professor`,`Codigo_CursoDis`) VALUES 
 ('1','1','1'),
 ('2','2','2'),
 ('3','3','2'),
 ('4','4','3'),
 ('5','5','4'),
 ('6','6','4'),
 ('7','6','5'),
 ('8','7','6'),
 ('9','8','7'),
 ('10','1','9');
/*!40000 ALTER TABLE `atribuicao` ENABLE KEYS */;


--
-- Definition of table `curso`
--

DROP TABLE IF EXISTS `curso`;
CREATE TABLE `curso` (
  `Codigo_Curso` decimal(10,0) NOT NULL,
  `Descricao_Curso` varchar(40) default NULL,
  `Qtde_Aluno_Curso` decimal(10,0) default NULL,
  PRIMARY KEY  (`Codigo_Curso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `curso`
--

/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` (`Codigo_Curso`,`Descricao_Curso`,`Qtde_Aluno_Curso`) VALUES 
 ('1','Tecnologo em Processamento de Dados','0'),
 ('2','Engenharia da Computação','0'),
 ('3','Engenharia Mecatronica','0'),
 ('4','Engenharia Teleprocessamento','0'),
 ('5','Desenvolvimento de Software para WEB','0'),
 ('6','Direito','0'),
 ('7','ADatribuicaoCAO','0'),
 ('8','Ciencias Contabeis','0'),
 ('9','Enfermagem','0');
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;


--
-- Definition of table `cursoxdisciplinas`
--

DROP TABLE IF EXISTS `cursoxdisciplinas`;
CREATE TABLE `cursoxdisciplinas` (
  `Codigo_CursoDis` decimal(10,0) NOT NULL,
  `Codigo_Disc` decimal(10,0) NOT NULL,
  `Codigo_Curso` decimal(10,0) NOT NULL,
  PRIMARY KEY  (`Codigo_CursoDis`),
  KEY `Codigo_Curso` (`Codigo_Curso`),
  CONSTRAINT `cursoxdisciplinas_ibfk_1` FOREIGN KEY (`Codigo_Curso`) REFERENCES `curso` (`Codigo_Curso`),
  CONSTRAINT `cursoxdisciplinas_ibfk_2` FOREIGN KEY (`Codigo_Curso`) REFERENCES `disciplina` (`Codigo_Disc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cursoxdisciplinas`
--

/*!40000 ALTER TABLE `cursoxdisciplinas` DISABLE KEYS */;
INSERT INTO `cursoxdisciplinas` (`Codigo_CursoDis`,`Codigo_Disc`,`Codigo_Curso`) VALUES 
 ('1','1','1'),
 ('2','2','1'),
 ('3','3','1'),
 ('4','4','1'),
 ('5','5','1'),
 ('6','6','1'),
 ('7','7','1'),
 ('8','8','1'),
 ('9','9','1'),
 ('10','1','2'),
 ('11','2','2'),
 ('12','3','2'),
 ('13','4','2'),
 ('14','5','2'),
 ('15','6','2'),
 ('16','7','2'),
 ('17','8','2'),
 ('18','9','2'),
 ('19','1','3'),
 ('20','2','3'),
 ('21','3','3'),
 ('22','4','3'),
 ('23','5','3'),
 ('24','6','3'),
 ('25','7','4'),
 ('26','8','4'),
 ('27','9','4'),
 ('28','1','4'),
 ('29','2','4'),
 ('30','3','4'),
 ('31','4','5'),
 ('32','5','5'),
 ('33','6','5'),
 ('34','7','5'),
 ('35','8','3'),
 ('36','9','3');
/*!40000 ALTER TABLE `cursoxdisciplinas` ENABLE KEYS */;


--
-- Definition of table `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
CREATE TABLE `disciplina` (
  `Codigo_Disc` decimal(10,0) NOT NULL,
  `Nome_Disc` varchar(40) default NULL,
  PRIMARY KEY  (`Codigo_Disc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `disciplina`
--

/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` (`Codigo_Disc`,`Nome_Disc`) VALUES 
 ('1','Portugues'),
 ('2','Matematica'),
 ('3','Analise de Sistemas'),
 ('4','Linguagem de Programacao'),
 ('5','Banco de Dados'),
 ('6','Rede de Computadores'),
 ('7','Sistemas Operacionais'),
 ('8','Inteligencia Artificial'),
 ('9','Logica'),
 ('10','Direito');
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;


--
-- Definition of table `frequencia`
--

DROP TABLE IF EXISTS `frequencia`;
CREATE TABLE `frequencia` (
  `Cod_Frequencia` decimal(10,0) NOT NULL,
  `Codigo_Aluno` decimal(10,0) NOT NULL,
  `Codigo_CursoDis` decimal(10,0) NOT NULL,
  `Data_Frequencia` date default NULL,
  PRIMARY KEY  (`Cod_Frequencia`),
  KEY `Codigo_CursoDis` (`Codigo_CursoDis`),
  KEY `Codigo_Aluno` (`Codigo_Aluno`),
  CONSTRAINT `frequencia_ibfk_1` FOREIGN KEY (`Codigo_CursoDis`) REFERENCES `cursoxdisciplinas` (`Codigo_CursoDis`),
  CONSTRAINT `frequencia_ibfk_2` FOREIGN KEY (`Codigo_Aluno`) REFERENCES `aluno` (`Codigo_Aluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `frequencia`
--

/*!40000 ALTER TABLE `frequencia` DISABLE KEYS */;
INSERT INTO `frequencia` (`Cod_Frequencia`,`Codigo_Aluno`,`Codigo_CursoDis`,`Data_Frequencia`) VALUES 
 ('1','1','1','2006-03-15'),
 ('2','1','2','2006-03-15'),
 ('3','1','4','2006-03-15');
/*!40000 ALTER TABLE `frequencia` ENABLE KEYS */;


--
-- Definition of table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
CREATE TABLE `matricula` (
  `Codigo_Matric` decimal(10,0) NOT NULL,
  `Codigo_Curso` decimal(10,0) NOT NULL,
  `Codigo_Aluno` decimal(10,0) NOT NULL,
  `Data_Matric` date default NULL,
  PRIMARY KEY  (`Codigo_Matric`),
  KEY `Codigo_Aluno` (`Codigo_Aluno`),
  KEY `Codigo_Curso` (`Codigo_Curso`),
  CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`Codigo_Aluno`) REFERENCES `aluno` (`Codigo_Aluno`),
  CONSTRAINT `matricula_ibfk_2` FOREIGN KEY (`Codigo_Curso`) REFERENCES `curso` (`Codigo_Curso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matricula`
--

/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
INSERT INTO `matricula` (`Codigo_Matric`,`Codigo_Curso`,`Codigo_Aluno`,`Data_Matric`) VALUES 
 ('1','1','1','0000-00-00'),
 ('2','1','2','2006-01-31'),
 ('3','1','3','2006-02-15'),
 ('4','2','4','2006-02-00'),
 ('5','2','1','2006-02-20'),
 ('6','3','5','2006-02-01'),
 ('7','3','6','2006-02-08'),
 ('8','3','7','2006-02-08'),
 ('9','4','8','2006-02-08'),
 ('10','5','9','2006-02-09'),
 ('11','5','10','2006-02-10'),
 ('12','6','11','2006-02-08');
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;


--
-- Definition of table `professor`
--

DROP TABLE IF EXISTS `professor`;
CREATE TABLE `professor` (
  `Codigo_Professor` decimal(10,0) NOT NULL,
  `Nome_Professor` varchar(40) default NULL,
  PRIMARY KEY  (`Codigo_Professor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `professor`
--

/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` (`Codigo_Professor`,`Nome_Professor`) VALUES 
 ('1','ANDRE LUIZ PEREIRA DA SILVA'),
 ('2','SEBASTIAO OLIVEIRA NOGUEIRA'),
 ('3','CASSIA ANTUNES'),
 ('4','CLODOALDO MANUEL JR'),
 ('5','CLARISSE DOS SANTOS'),
 ('6','MATILDE FIDORIM'),
 ('7','JOANA DA FONSECA CABRAL'),
 ('8','JOAGUIM NOGUERIA'),
 ('9','HELENA NOGUEIRA DA FONSECA'),
 ('10','SANTOS MANUAL DA SILVA'),
 ('11','ANDREIA BRANDAO OLIVEIRA');
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;