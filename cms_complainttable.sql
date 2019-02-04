-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cms
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
-- Table structure for table `complainttable`
--

DROP TABLE IF EXISTS `complainttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `complainttable` (
  `S_no` int(10) NOT NULL AUTO_INCREMENT,
  `Com_id` varchar(50) DEFAULT NULL,
  `Stu_id` varchar(10) DEFAULT NULL,
  `Sname` varchar(20) DEFAULT NULL,
  `Cont` varchar(10) DEFAULT NULL,
  `Dept` varchar(50) DEFAULT NULL,
  `Course` varchar(20) DEFAULT NULL,
  `Com_sub` varchar(100) DEFAULT NULL,
  `Com_msg` varchar(500) DEFAULT NULL,
  `Com_date` varchar(50) DEFAULT NULL,
  `Reply` varchar(500) DEFAULT NULL,
  `Reply_date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`S_no`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complainttable`
--

LOCK TABLES `complainttable` WRITE;
/*!40000 ALTER TABLE `complainttable` DISABLE KEYS */;
INSERT INTO `complainttable` VALUES (1,'STUW/2018/0001','2016CA10','HARPREET SINGH','9457810399','DEAN STU WELFARE','MCA','Incorrect Registration number show on scholarship status.','Hello, sir I facing problem during my login in scholarship portal.','10/03/2018','Not Replied','00/00/000'),(2,'APME/2018/0002','2016CA09','BALJEET SINGH','8888888888','APPLIED MECHANICS','B_Tech AM','Lab tube light is not working properly.','Hello sir , this is our  class problem that in Applied mechanics  lab tube light are always  fluctuate.','10/03/2018','Not Replied','00/00/000'),(3,'COMP/2018/0003','2016CA09','RANVEER RANA','9457810399','COMPUTER SCI & ENGG','MCA','This is my problem.','The problem statement by provide you is not understandable at a this movement.','10/03/2018','Not Replied','00/00/000'),(4,'BIOT/2018/0004','2016CA10','PANDIT ARJUN','1234567890','BIOTECHNOLOGY','B_Tech BIO','Having No problem just chil.','This is trial message to check DBMS connectivity .','10/03/2018','Not Replied','00/00/000'),(5,'CHEM/2018/0005','2016CA10','ASHUTOSH RANA','8445433991','CHEMICAL ENGG','M_Tech CHE','This is my problem .','I will write a complaint later.','10/03/2018','Not Replied','00/00/000'),(8,'CIVI/2018/0006','2016CA07','TEJPRATAP SINGH','9911911991','CIVIL ENGG','B_Tech CIVIL','This is my problem .','Hello sir..........','10/03/2018','Not Replied','00/00/000'),(9,'ACAD/2018/0007','2016CA07','SANKARSHAN MISRA','8445433991','DEAN ACADEMIC','MCA','Wrong registration number have been printed on my marks sheet. I want change it.','Respected sir , today i found my marks sheet and then check their was wrong registration number printed on it.','10/03/2018','Not Replied','00/00/000'),(10,'MECH/2018/0008','2016CA10','ROHIT KUMAR','8445433991','MECHANICAL ENGG','M_Tech ME','I have with  this this this...','Something happening wrong with in the Department therefore i am writing to you.','10/03/2018','Not Replied','00/00/000'),(11,'MGMT/2018/0009','2016CA10','VIJAYVEER SINGH','8888888888','MGMT STUDIES','MBA','Light problem in Lecture hall.','Respected sir, \r\nThere is a big problem of light in SMS Department.','10/03/2018','Not Replied','00/00/000'),(12,'ELEC/2018/0010','2016CA09','GYAYAK JAIN','9457810399','ELECTRICAL ENGG','B_Tech EC','There is something wrong  .........','This is my problem message','10/03/2018','Not Replied','00/00/000');
/*!40000 ALTER TABLE `complainttable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-10 12:53:00
