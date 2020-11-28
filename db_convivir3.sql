-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_convivir3
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `abono`
--

DROP TABLE IF EXISTS `abono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `abono` (
  `id_abono` int NOT NULL,
  `id_cuota` int NOT NULL,
  `fecha_abono` date DEFAULT NULL,
  `monto_abono` float DEFAULT NULL,
  `validado` int DEFAULT NULL,
  `tipo_abono` int DEFAULT NULL,
  `foto_comprobante` blob,
  PRIMARY KEY (`id_abono`),
  KEY `R_20` (`id_cuota`),
  CONSTRAINT `abono_ibfk_1` FOREIGN KEY (`id_cuota`) REFERENCES `cuota` (`id_cuota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abono`
--

LOCK TABLES `abono` WRITE;
/*!40000 ALTER TABLE `abono` DISABLE KEYS */;
INSERT INTO `abono` VALUES (1,2,'2020-11-27',10,1,1,NULL);
/*!40000 ALTER TABLE `abono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrador` (
  `id_usuario` int NOT NULL,
  `id_uinmobiliaria` int NOT NULL,
  `estado` int DEFAULT NULL,
  PRIMARY KEY (`id_usuario`,`id_uinmobiliaria`),
  KEY `R_17` (`id_uinmobiliaria`),
  CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuariosistema` (`id_usuario`),
  CONSTRAINT `administrador_ibfk_2` FOREIGN KEY (`id_uinmobiliaria`) REFERENCES `unidadinmobiliaria` (`id_uinmobiliaria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concepto`
--

DROP TABLE IF EXISTS `concepto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `concepto` (
  `id_concepto` int NOT NULL,
  `nombre_corto` varchar(20) DEFAULT NULL,
  `nombre_largo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_concepto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concepto`
--

LOCK TABLES `concepto` WRITE;
/*!40000 ALTER TABLE `concepto` DISABLE KEYS */;
INSERT INTO `concepto` VALUES (1,'Vigilancia','Servicio de vigilancia'),(2,'Porteria','Servivio de porteria'),(3,'Agua','Servicio de agua'),(4,'Electricidad','Servicio de electricidad');
/*!40000 ALTER TABLE `concepto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuota`
--

DROP TABLE IF EXISTS `cuota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuota` (
  `id_cuota` int NOT NULL,
  `titulo` varchar(100) DEFAULT NULL,
  `anio` int DEFAULT NULL,
  `mes` int DEFAULT NULL,
  `fecha_emision` date DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `num_cuota` int DEFAULT NULL,
  `id_uprivada` int NOT NULL,
  PRIMARY KEY (`id_cuota`),
  UNIQUE KEY `uprivada_num` (`id_uprivada`,`num_cuota`),
  CONSTRAINT `cuota_ibfk_1` FOREIGN KEY (`id_uprivada`) REFERENCES `unidadprivada` (`id_uprivada`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuota`
--

LOCK TABLES `cuota` WRITE;
/*!40000 ALTER TABLE `cuota` DISABLE KEYS */;
INSERT INTO `cuota` VALUES (1,'Cuota Mantenimiento de Enero',2020,1,'2020-01-15','2020-02-05',1,1),(2,'Cuota Mantenimiento de Enero',2020,2,'2020-02-15','2020-03-05',1,2),(3,'Cuota Mantenimiento de Febrero',2020,2,'2020-02-15','2020-03-05',2,1),(4,'Cuota Mantenimiento de Marzo',2020,3,'2020-03-15','2020-04-05',3,1);
/*!40000 ALTER TABLE `cuota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle`
--

DROP TABLE IF EXISTS `detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle` (
  `id_cuota` int NOT NULL,
  `id_detalle` int NOT NULL,
  `id_concepto` int NOT NULL,
  `monto` float DEFAULT NULL,
  PRIMARY KEY (`id_cuota`,`id_detalle`),
  KEY `R_15` (`id_concepto`),
  CONSTRAINT `detalle_ibfk_1` FOREIGN KEY (`id_cuota`) REFERENCES `cuota` (`id_cuota`),
  CONSTRAINT `detalle_ibfk_2` FOREIGN KEY (`id_concepto`) REFERENCES `concepto` (`id_concepto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle`
--

LOCK TABLES `detalle` WRITE;
/*!40000 ALTER TABLE `detalle` DISABLE KEYS */;
INSERT INTO `detalle` VALUES (1,1,1,10),(1,2,2,10),(1,3,3,20),(1,4,4,20),(2,1,1,10),(2,2,2,20),(2,3,3,30),(2,4,4,40),(3,1,1,20),(3,2,2,30),(3,3,3,40),(3,4,4,10),(4,1,1,30),(4,2,2,31),(4,3,3,33),(4,4,4,34);
/*!40000 ALTER TABLE `detalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id_persona` int NOT NULL,
  `tipo_documento` int DEFAULT NULL,
  `num_documento` varchar(11) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `primer_apellido` varchar(100) DEFAULT NULL,
  `segundo_apellido` varchar(100) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,1,'20010201','Andres','Asto','Zarate','1980-06-20'),(2,1,'20010202','Baeatriz','Buendia','Vilca','1980-03-10'),(3,1,'20010203','Carlos','Carrasco','Yepez','1970-07-07'),(4,1,'20010204','Demetrio','Dominguez','Surichaqui','1980-03-03');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona_up`
--

DROP TABLE IF EXISTS `persona_up`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona_up` (
  `id_uprivada` int NOT NULL,
  `id_persona` int NOT NULL,
  `id_tipo_relacion` int NOT NULL,
  PRIMARY KEY (`id_uprivada`,`id_persona`),
  KEY `R_18` (`id_persona`),
  KEY `R_23` (`id_tipo_relacion`),
  CONSTRAINT `persona_up_ibfk_1` FOREIGN KEY (`id_uprivada`) REFERENCES `unidadprivada` (`id_uprivada`),
  CONSTRAINT `persona_up_ibfk_2` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`),
  CONSTRAINT `persona_up_ibfk_3` FOREIGN KEY (`id_tipo_relacion`) REFERENCES `tiporelacion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona_up`
--

LOCK TABLES `persona_up` WRITE;
/*!40000 ALTER TABLE `persona_up` DISABLE KEYS */;
INSERT INTO `persona_up` VALUES (1,1,1),(2,1,1),(3,3,1),(4,3,1),(5,4,1),(6,4,1),(7,2,1),(8,4,1),(9,4,1),(10,1,1);
/*!40000 ALTER TABLE `persona_up` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiporelacion`
--

DROP TABLE IF EXISTS `tiporelacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiporelacion` (
  `id` int NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiporelacion`
--

LOCK TABLES `tiporelacion` WRITE;
/*!40000 ALTER TABLE `tiporelacion` DISABLE KEYS */;
INSERT INTO `tiporelacion` VALUES (1,'Propietario'),(2,'Residente');
/*!40000 ALTER TABLE `tiporelacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipounidad`
--

DROP TABLE IF EXISTS `tipounidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipounidad` (
  `id` int NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipounidad`
--

LOCK TABLES `tipounidad` WRITE;
/*!40000 ALTER TABLE `tipounidad` DISABLE KEYS */;
INSERT INTO `tipounidad` VALUES (1,'Vivienda'),(2,'Departamento');
/*!40000 ALTER TABLE `tipounidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidadinmobiliaria`
--

DROP TABLE IF EXISTS `unidadinmobiliaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidadinmobiliaria` (
  `id_uinmobiliaria` int NOT NULL,
  `nombre_corto` varchar(50) DEFAULT NULL,
  `nombre_largo` varchar(200) DEFAULT NULL,
  `des_direccion` varchar(200) DEFAULT NULL,
  `ubigeo` varchar(20) DEFAULT NULL,
  `latitud_map` varchar(100) DEFAULT NULL,
  `longitud_map` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_uinmobiliaria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadinmobiliaria`
--

LOCK TABLES `unidadinmobiliaria` WRITE;
/*!40000 ALTER TABLE `unidadinmobiliaria` DISABLE KEYS */;
INSERT INTO `unidadinmobiliaria` VALUES (1,'Alborada','Condominio la Alborada','Av. Surco 15049, Santiago de Surco','150140 ','-12.142035','-76.995872');
/*!40000 ALTER TABLE `unidadinmobiliaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidadprivada`
--

DROP TABLE IF EXISTS `unidadprivada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidadprivada` (
  `id_uprivada` int NOT NULL,
  `id_tipo_unidad` int DEFAULT NULL,
  `numeracion` varchar(20) DEFAULT NULL,
  `zona` varchar(20) DEFAULT NULL,
  `id_uinmobiliaria` int NOT NULL,
  PRIMARY KEY (`id_uprivada`),
  KEY `R_8` (`id_uinmobiliaria`),
  KEY `R_28` (`id_tipo_unidad`) /*!80000 INVISIBLE */,
  CONSTRAINT `unidadprivada_ibfk_1` FOREIGN KEY (`id_uinmobiliaria`) REFERENCES `unidadinmobiliaria` (`id_uinmobiliaria`),
  CONSTRAINT `unidadprivada_tipo_rel` FOREIGN KEY (`id_tipo_unidad`) REFERENCES `tiporelacion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadprivada`
--

LOCK TABLES `unidadprivada` WRITE;
/*!40000 ALTER TABLE `unidadprivada` DISABLE KEYS */;
INSERT INTO `unidadprivada` VALUES (1,2,'101','Torre A',1),(2,2,'102','Torre A',1),(3,2,'103','Torre A',1),(4,2,'104','Torre A',1),(5,2,'105','Torre A',1),(6,2,'106','Torre A',1),(7,2,'107','Torre A',1),(8,2,'108','Torre A',1),(9,2,'109','Torre A',1),(10,2,'201','Torre A',1);
/*!40000 ALTER TABLE `unidadprivada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuariosistema`
--

DROP TABLE IF EXISTS `usuariosistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuariosistema` (
  `id_usuario` int NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `id_persona` int NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `R_7` (`id_persona`),
  CONSTRAINT `usuariosistema_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuariosistema`
--

LOCK TABLES `usuariosistema` WRITE;
/*!40000 ALTER TABLE `usuariosistema` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuariosistema` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-27 18:45:39
