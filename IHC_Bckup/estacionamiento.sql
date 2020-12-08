-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.8-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.1.0.6116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para estacionamiento
CREATE DATABASE IF NOT EXISTS `estacionamiento` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `estacionamiento`;

-- Volcando estructura para tabla estacionamiento.incidencias
CREATE TABLE IF NOT EXISTS `incidencias` (
  `registro` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `placas` varchar(50) DEFAULT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `tamanio` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `entrada` varchar(50) DEFAULT NULL,
  `salida` varchar(50) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`registro`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='Manejo: ASPIS\r\nObjetivo: Almacenar los datos de los vehiculos que entran y salen de la institucion,esta tabla servirá \r\npara mostrar los vehiculos que han entrado y salido de la UAPT ea los ASPIS.';

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla estacionamiento.usr
CREATE TABLE IF NOT EXISTS `usr` (
  `role` varchar(50) DEFAULT NULL,
  `ctr` varchar(50) DEFAULT NULL,
  UNIQUE KEY `role` (`role`),
  UNIQUE KEY `ctr` (`ctr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla estacionamiento.vehiculosincorporados
CREATE TABLE IF NOT EXISTS `vehiculosincorporados` (
  `registro` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_b` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `credencialAnv` mediumblob DEFAULT NULL,
  `credencialRev` mediumblob DEFAULT NULL,
  `tarjetaCirculacion` mediumblob DEFAULT NULL,
  `placas` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `tamanio` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`registro`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla estacionamiento.vehiculosinvitados
CREATE TABLE IF NOT EXISTS `vehiculosinvitados` (
  `registro` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL DEFAULT '0',
  `placas` varchar(50) NOT NULL DEFAULT '0',
  `color` varchar(50) NOT NULL DEFAULT '0',
  `marca` varchar(50) NOT NULL DEFAULT '0',
  `tamanio` varchar(50) NOT NULL DEFAULT '0',
  `estado` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`registro`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='Maneja:ASPIS\r\nObjetivo: Guardar los vehiculos que son invitados, no incorporados.';

-- La exportación de datos fue deseleccionada.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
