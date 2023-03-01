-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 29-Nov-2014 às 02:20
-- Versão do servidor: 5.6.15-log
-- PHP Version: 5.5.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `equipamentos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `componente`
--

CREATE TABLE IF NOT EXISTS `componente` (
  `num_comp` int(5) NOT NULL COMMENT 'Número do Componente',
  `num_serie` int(5) NOT NULL COMMENT 'Número de Serie',
  `descricao` varchar(40) NOT NULL COMMENT 'Descrição do Componente',
  `fabricante` varchar(40) NOT NULL COMMENT 'Fabricante do Componente',
  `modelo` varchar(40) NOT NULL COMMENT 'Modelo do Componente',
  `procedencia` varchar(40) NOT NULL COMMENT 'Procedência do Componente',
  PRIMARY KEY (`num_comp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `componente`
--

INSERT INTO `componente` (`num_comp`, `num_serie`, `descricao`, `fabricante`, `modelo`, `procedencia`) VALUES
(1, 1, 'Tamanho Compacto', 'Epson', 'L110', 'Loja Virtual'),
(2, 2, 'Multifuncional', 'HP', '30000-1', 'Loja'),
(3, 3, 'Full HD', 'AOC', '30000-1', 'Loja'),
(4, 2, 'Mecanico', 'Maxxtro', '2154-21', 'Loja'),
(5, 2, 'Nikomarx', '---', 'Desktop', 'boadica.com.br'),
(6, 17, 'Full HD', 'LG', '2154-0', 'Casas Bahia'),
(7, 15, 'Voa', 'Wise Case', '24251', 'Centro Stand 521'),
(8, 21, 'Ultra Rapido', 'HP', '12151', 'GG'),
(9, 1515, 'Botao duplo clique, 2 adicionais e DPI', 'A4 Tech', '2012', 'MercadoLivre');

-- --------------------------------------------------------

--
-- Estrutura da tabela `defeito`
--

CREATE TABLE IF NOT EXISTS `defeito` (
  `codigo` int(5) NOT NULL COMMENT 'Código do Defeito',
  `tipo` varchar(40) NOT NULL COMMENT 'Tipo do Defeito',
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `defeito`
--

INSERT INTO `defeito` (`codigo`, `tipo`) VALUES
(1, 'Configuração'),
(2, 'Cartucho');

-- --------------------------------------------------------

--
-- Estrutura da tabela `gabinete`
--

CREATE TABLE IF NOT EXISTS `gabinete` (
  `num_comp` int(5) NOT NULL COMMENT 'Código do Componente',
  `codigo` int(5) NOT NULL COMMENT 'Codigo do Gabinete',
  `pl_mae` varchar(40) NOT NULL COMMENT 'Placa Mãe',
  `hd` varchar(40) NOT NULL COMMENT 'Hard Disk',
  `pl_rede` varchar(40) NOT NULL COMMENT 'Placa de Rede',
  `memoria` varchar(40) NOT NULL COMMENT 'Memória',
  `disquete` varchar(40) NOT NULL COMMENT 'Disquete ou Leitor de Cartão',
  `pl_video` varchar(40) NOT NULL COMMENT 'Placa de Vídeo',
  `cd_rom` varchar(40) NOT NULL COMMENT 'Cd-Rom',
  `processador` varchar(40) NOT NULL COMMENT 'CPU',
  PRIMARY KEY (`codigo`),
  KEY `num_comp` (`num_comp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `gabinete`
--

INSERT INTO `gabinete` (`num_comp`, `codigo`, `pl_mae`, `hd`, `pl_rede`, `memoria`, `disquete`, `pl_video`, `cd_rom`, `processador`) VALUES
(5, 1, 'GIGABYTE 78LMT-S2P', 'SAMSUNG HD103SI ATA DEVICE', 'Qualcomm Atheros AR8151', '2x Kingston 4GB', '---', 'NVIDIA GeForce GTX 650 TI', '---', 'AMD FX-6100 Six-Core'),
(7, 2, 'Asrock A55H', 'WD 500GB', 'Qualquer uma', 'Kingston 4GB', 'Não possui', 'AMD 6570', 'LG', 'AMD A6');

-- --------------------------------------------------------

--
-- Estrutura da tabela `impressora`
--

CREATE TABLE IF NOT EXISTS `impressora` (
  `num_comp` int(5) NOT NULL COMMENT 'Número do componente',
  `codigo` int(5) NOT NULL COMMENT 'Código da Impressora',
  `velocidade` int(5) NOT NULL COMMENT 'Velocidade da Impressora',
  PRIMARY KEY (`codigo`),
  KEY `num_comp_imp` (`num_comp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `impressora`
--

INSERT INTO `impressora` (`num_comp`, `codigo`, `velocidade`) VALUES
(1, 1, 4),
(2, 2, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `instalacao`
--

CREATE TABLE IF NOT EXISTS `instalacao` (
  `codigo_software` int(5) NOT NULL COMMENT 'Código do Software',
  `codigo_maquina` int(5) NOT NULL COMMENT 'Código da Máquina',
  `data_instalacao` varchar(10) NOT NULL COMMENT 'Data da Instalação',
  PRIMARY KEY (`codigo_maquina`),
  KEY `codigo_software` (`codigo_software`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `instalacao`
--

INSERT INTO `instalacao` (`codigo_software`, `codigo_maquina`, `data_instalacao`) VALUES
(2, 1, '19/11/2014'),
(1, 3, '19/11/2014');

-- --------------------------------------------------------

--
-- Estrutura da tabela `maquina`
--

CREATE TABLE IF NOT EXISTS `maquina` (
  `codigo` int(5) NOT NULL COMMENT 'Código da Máquina',
  `cod_monitor` int(5) NOT NULL COMMENT 'Código do Monitor',
  `cod_teclado` int(5) NOT NULL COMMENT 'Código do Teclado',
  `cod_gabinete` int(5) NOT NULL COMMENT 'Código do Gabinete',
  `cod_impressora` int(5) NOT NULL COMMENT 'Código da Impressora',
  `cod_scanner` int(5) NOT NULL COMMENT 'Código do Scanner',
  `cod_mouse` int(5) NOT NULL COMMENT 'Código do Mouse',
  PRIMARY KEY (`codigo`),
  KEY `cod_monitor` (`cod_monitor`,`cod_teclado`,`cod_gabinete`,`cod_impressora`,`cod_scanner`,`cod_mouse`),
  KEY `cod_teclado` (`cod_teclado`),
  KEY `cod_gabinete` (`cod_gabinete`),
  KEY `cod_impressora` (`cod_impressora`),
  KEY `cod_scanner` (`cod_scanner`),
  KEY `cod_mouse` (`cod_mouse`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `maquina`
--

INSERT INTO `maquina` (`codigo`, `cod_monitor`, `cod_teclado`, `cod_gabinete`, `cod_impressora`, `cod_scanner`, `cod_mouse`) VALUES
(1, 1, 1, 1, 1, 1, 1),
(2, 2, 1, 2, 1, 1, 1),
(3, 2, 1, 2, 2, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `monitor`
--

CREATE TABLE IF NOT EXISTS `monitor` (
  `num_comp` int(5) NOT NULL COMMENT 'Numero do Componente',
  `codigo` int(5) NOT NULL COMMENT 'Código do Monitor',
  `polegadas` int(2) NOT NULL COMMENT 'Tamanho do Monitor',
  PRIMARY KEY (`codigo`),
  KEY `num_comp` (`num_comp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `monitor`
--

INSERT INTO `monitor` (`num_comp`, `codigo`, `polegadas`) VALUES
(3, 1, 22),
(6, 2, 32);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mouse`
--

CREATE TABLE IF NOT EXISTS `mouse` (
  `num_comp` int(5) NOT NULL COMMENT 'Código do Componente',
  `codigo` int(5) NOT NULL COMMENT 'Código do Mouse',
  PRIMARY KEY (`codigo`),
  KEY `num_comp` (`num_comp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `mouse`
--

INSERT INTO `mouse` (`num_comp`, `codigo`) VALUES
(9, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ordem_servico`
--

CREATE TABLE IF NOT EXISTS `ordem_servico` (
  `num_comp` int(5) NOT NULL COMMENT 'Número do Componente',
  `codigo_defeito` int(5) NOT NULL COMMENT 'Código do Defeito',
  `data_abertura` varchar(10) NOT NULL COMMENT 'Data da Abertura',
  `data_fechamento` varchar(10) NOT NULL COMMENT 'Data do Fechamento',
  `estado` varchar(40) NOT NULL COMMENT 'Estado do Componente',
  `solucao` varchar(40) NOT NULL COMMENT 'Solução do Defeito',
  PRIMARY KEY (`num_comp`,`codigo_defeito`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `ordem_servico`
--

INSERT INTO `ordem_servico` (`num_comp`, `codigo_defeito`, `data_abertura`, `data_fechamento`, `estado`, `solucao`) VALUES
(1, 2, '21/11/2014', '22/11/2014', 'Sem Tinta', 'Compra de Cartuchos novos');

-- --------------------------------------------------------

--
-- Estrutura da tabela `sala`
--

CREATE TABLE IF NOT EXISTS `sala` (
  `codigo` int(5) NOT NULL COMMENT 'Código da Sala',
  `nome` varchar(40) NOT NULL COMMENT 'Nome da Sala',
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `sala`
--

INSERT INTO `sala` (`codigo`, `nome`) VALUES
(1, 'Laboratorio 1'),
(2, 'Redes');

-- --------------------------------------------------------

--
-- Estrutura da tabela `scanner`
--

CREATE TABLE IF NOT EXISTS `scanner` (
  `num_comp` int(5) NOT NULL COMMENT 'Código do Componente',
  `codigo` int(5) NOT NULL COMMENT 'Código do Scanner',
  PRIMARY KEY (`codigo`),
  KEY `num_comp` (`num_comp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `scanner`
--

INSERT INTO `scanner` (`num_comp`, `codigo`) VALUES
(8, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `sm`
--

CREATE TABLE IF NOT EXISTS `sm` (
  `codigo_sala` int(5) NOT NULL COMMENT 'Código da Sala',
  `codigo_maquina` int(5) NOT NULL COMMENT 'Código da Máquina',
  PRIMARY KEY (`codigo_sala`,`codigo_maquina`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `sm`
--

INSERT INTO `sm` (`codigo_sala`, `codigo_maquina`) VALUES
(1, 2),
(1, 3),
(2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `software`
--

CREATE TABLE IF NOT EXISTS `software` (
  `codigo` int(5) NOT NULL COMMENT 'Código do Software',
  `nome` varchar(40) NOT NULL COMMENT 'Nome do Software',
  `licenca` varchar(40) NOT NULL COMMENT 'Licença do Software',
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `software`
--

INSERT INTO `software` (`codigo`, `nome`, `licenca`) VALUES
(1, 'Windows 8.1 Profissional 2457', '00178-10323-92050-AA095'),
(2, 'Skype', 'XXXX-XXX-XXX-XXXX-XX');

-- --------------------------------------------------------

--
-- Estrutura da tabela `teclado`
--

CREATE TABLE IF NOT EXISTS `teclado` (
  `num_comp` int(5) NOT NULL COMMENT 'Número do Componente',
  `codigo` int(5) NOT NULL COMMENT 'Código do Teclado',
  PRIMARY KEY (`codigo`),
  KEY `num_comp` (`num_comp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `teclado`
--

INSERT INTO `teclado` (`num_comp`, `codigo`) VALUES
(4, 1);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `gabinete`
--
ALTER TABLE `gabinete`
  ADD CONSTRAINT `gabinete_ibfk_1` FOREIGN KEY (`num_comp`) REFERENCES `componente` (`num_comp`);

--
-- Limitadores para a tabela `impressora`
--
ALTER TABLE `impressora`
  ADD CONSTRAINT `impressora_ibfk_1` FOREIGN KEY (`num_comp`) REFERENCES `componente` (`num_comp`);

--
-- Limitadores para a tabela `instalacao`
--
ALTER TABLE `instalacao`
  ADD CONSTRAINT `instalacao_ibfk_1` FOREIGN KEY (`codigo_software`) REFERENCES `software` (`codigo`),
  ADD CONSTRAINT `instalacao_ibfk_2` FOREIGN KEY (`codigo_maquina`) REFERENCES `maquina` (`codigo`);

--
-- Limitadores para a tabela `maquina`
--
ALTER TABLE `maquina`
  ADD CONSTRAINT `maquina_ibfk_1` FOREIGN KEY (`cod_monitor`) REFERENCES `monitor` (`codigo`),
  ADD CONSTRAINT `maquina_ibfk_2` FOREIGN KEY (`cod_teclado`) REFERENCES `teclado` (`codigo`),
  ADD CONSTRAINT `maquina_ibfk_3` FOREIGN KEY (`cod_impressora`) REFERENCES `impressora` (`codigo`),
  ADD CONSTRAINT `maquina_ibfk_4` FOREIGN KEY (`cod_gabinete`) REFERENCES `gabinete` (`codigo`),
  ADD CONSTRAINT `maquina_ibfk_5` FOREIGN KEY (`cod_scanner`) REFERENCES `scanner` (`codigo`),
  ADD CONSTRAINT `maquina_ibfk_6` FOREIGN KEY (`cod_mouse`) REFERENCES `mouse` (`codigo`);

--
-- Limitadores para a tabela `monitor`
--
ALTER TABLE `monitor`
  ADD CONSTRAINT `monitor_ibfk_1` FOREIGN KEY (`num_comp`) REFERENCES `componente` (`num_comp`);

--
-- Limitadores para a tabela `mouse`
--
ALTER TABLE `mouse`
  ADD CONSTRAINT `mouse_ibfk_1` FOREIGN KEY (`num_comp`) REFERENCES `componente` (`num_comp`);

--
-- Limitadores para a tabela `scanner`
--
ALTER TABLE `scanner`
  ADD CONSTRAINT `scanner_ibfk_1` FOREIGN KEY (`num_comp`) REFERENCES `componente` (`num_comp`);

--
-- Limitadores para a tabela `teclado`
--
ALTER TABLE `teclado`
  ADD CONSTRAINT `teclado_ibfk_1` FOREIGN KEY (`num_comp`) REFERENCES `componente` (`num_comp`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
