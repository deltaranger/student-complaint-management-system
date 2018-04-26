-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: voting_system
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `voter`
--

DROP TABLE IF EXISTS `voter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `voter` (
  `Fname` char(20) DEFAULT NULL,
  `Lname` char(20) DEFAULT NULL,
  `Sex` char(10) DEFAULT NULL,
  `UserId` varchar(20) NOT NULL,
  `Mobile` varchar(15) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Dist` char(30) DEFAULT NULL,
  `Pin` int(6) DEFAULT NULL,
  `Stat` char(10) DEFAULT NULL,
  PRIMARY KEY (`UserId`),
  UNIQUE KEY `Mobile` (`Mobile`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voter`
--

LOCK TABLES `voter` WRITE;
/*!40000 ALTER TABLE `voter` DISABLE KEYS */;
INSERT INTO `voter` VALUES ('Manjeet','Kour','MALE','2016CA05','9457810699','.com05','Allahabad','Allahabad',211004,NULL),('Raja','Ram','MALE','2016CA06','9457810599','.com06','Allahabad','Allahabad',211004,NULL),('Rajan','Singh','MALE','2016CA07','9457810199','.com07','Allahabad','Allahabad',211004,NULL),('Singh','Har','MALE','2016CA08','9457810499','.com08','Allahabad','Allahabad',211004,NULL),('Gayak','Jain','MALE','2016CA09','9457810299','.com','Allahabad','Allahabad',21000,NULL),('harpreet','Singh','MALE','2016CA10','9457810399','singhHarr@gmail.comm','Allahabad','Allahabad',211004,NULL),('harpreet','Singh','MALE','2016CA15','10910190','.com2303','Allahabad','Allahabad',211004,NULL),('harpreet','Har','MALE','90','1','Sing','Allahabad','Allhabad',211004,NULL);
/*!40000 ALTER TABLE `voter` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-13 11:21:30
