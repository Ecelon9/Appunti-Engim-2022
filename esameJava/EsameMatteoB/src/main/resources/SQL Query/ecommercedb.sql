-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Creato il: Lug 25, 2023 alle 09:54
-- Versione del server: 10.4.21-MariaDB
-- Versione PHP: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecommercedb`
--
CREATE DATABASE IF NOT EXISTS `ecommercedb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `ecommercedb`;

-- --------------------------------------------------------

--
-- Struttura della tabella `articolo`
--

DROP TABLE IF EXISTS `articolo`;
CREATE TABLE `articolo` (
  `ID` int(11) NOT NULL,
  `CODICE` varchar(10) NOT NULL,
  `DESCRIZIONE` varchar(100) DEFAULT NULL,
  `PESO` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `articolo`
--

INSERT INTO `articolo` (`ID`, `CODICE`, `DESCRIZIONE`, `PESO`) VALUES
(1, 'PNDRV8', 'Pen drive USB 8G no brand', 0.15),
(2, 'DCP-J715E', 'Stampante Brother DCP J715 W', 5.3),
(3, 'LNVCX1', 'Notebook Lenovo Carbon X1', 1.9),
(4, 'ALCPPC3', 'Smartphone Alcatel POP C3', 0.53),
(5, 'BSHT1R', 'Ampli Combo valvolare BlackStar HT 1-R', 6);

-- --------------------------------------------------------

--
-- Struttura della tabella `ordini`
--

DROP TABLE IF EXISTS `ordini`;
CREATE TABLE `ordini` (
  `id` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `data` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `ordini`
--

INSERT INTO `ordini` (`id`, `numero`, `data`) VALUES
(1, 100, '01/05/2020'),
(2, 101, '02/05/2020'),
(3, 102, '09/05/2020'),
(4, 103, '01/06/2020'),
(5, 104, '02/08/2020'),
(6, 105, '05/08/2020'),
(7, 106, '01/08/2020'),
(8, 107, '02/08/2020'),
(9, 108, '03/08/2020');

-- --------------------------------------------------------

--
-- Struttura della tabella `tariffe_corrieri`
--

DROP TABLE IF EXISTS `tariffe_corrieri`;
CREATE TABLE `tariffe_corrieri` (
  `ID` int(11) NOT NULL,
  `NOME_CORRIERE` varchar(3) NOT NULL,
  `NOME_TARIFFA` varchar(15) NOT NULL,
  `PESO_MASSIMO` float NOT NULL,
  `COSTO` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `tariffe_corrieri`
--

INSERT INTO `tariffe_corrieri` (`ID`, `NOME_CORRIERE`, `NOME_TARIFFA`, `PESO_MASSIMO`, `COSTO`) VALUES
(1, 'SDA', 'Economy', 1, 5.9),
(2, 'SDA', 'Veloce', 5, 7.9),
(3, 'SDA', 'Bigbox', 30, 12.9),
(4, 'DHL', 'Veloce', 1.5, 6.5),
(5, 'DHL', 'Assicurata', 7.5, 9.9),
(6, 'DHL', 'XXL', 40, 13.9),
(7, 'UPS', 'Economy', 0.7, 5.2),
(8, 'UPS', 'Standard', 3, 6.9),
(9, 'UPS', 'Jumbo', 25, 11.5);

-- --------------------------------------------------------

--
-- Struttura della tabella `voce`
--

DROP TABLE IF EXISTS `voce`;
CREATE TABLE `voce` (
  `ID_VOCE` int(11) NOT NULL,
  `ID_ARTICOLO` int(11) NOT NULL,
  `ID_ORDINE` int(11) NOT NULL,
  `NUM_OGGETTI` int(11) NOT NULL,
  `PESO_TOT` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `voce` (`ID_VOCE`,`ID_ARTICOLO`, `ID_ORDINE`, `NUM_OGGETTI`) VALUES
(1, 3, 1, 2),
(2, 2, 2, 1),
(3, 3, 2, 1),
(4, 3, 3, 1),
(5, 4, 3, 1),
(6, 1, 4, 3),
(7, 4, 4, 7),
(8, 4, 5, 2),
(9, 1, 5, 9);

--
-- Calcolo dei pesi
--

UPDATE voce AS v
JOIN articolo AS art ON v.ID_ARTICOLO = art.ID
SET v.PESO_TOT = art.PESO * v.NUM_OGGETTI;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `articolo`
--
ALTER TABLE `articolo`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `CODICE` (`CODICE`);

--
-- Indici per le tabelle `tariffe_corrieri`
--
ALTER TABLE `tariffe_corrieri`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `articolo`
--
ALTER TABLE `articolo`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT per la tabella `tariffe_corrieri`
--
ALTER TABLE `tariffe_corrieri`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
