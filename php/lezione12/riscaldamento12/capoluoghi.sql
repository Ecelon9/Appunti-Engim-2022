-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: database:3306
-- Creato il: Mar 11, 2023 alle 18:41
-- Versione del server: 10.10.2-MariaDB-1:10.10.2+maria~ubu2204
-- Versione PHP: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `capoluoghi`
--

DROP TABLE IF EXISTS `capoluoghi`;
CREATE TABLE `capoluoghi` (
  `id` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dump dei dati per la tabella `capoluoghi`
--

INSERT INTO `capoluoghi` (`id`, `nome`) VALUES
(1, 'Torino'),
(2, 'Alessandria'),
(3, 'Asti'),
(4, 'Biella'),
(5, 'Cuneo'),
(6, 'Novara'),
(7, 'Verbania-Cusio-Ossola'),
(8, 'Vercelli');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `capoluoghi`
--
ALTER TABLE `capoluoghi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `capoluoghi`
--
ALTER TABLE `capoluoghi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
