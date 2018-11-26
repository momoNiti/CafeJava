-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurant
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `order_foods`
--

DROP TABLE IF EXISTS `order_foods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `order_foods` (
  `orderID` int(11) NOT NULL AUTO_INCREMENT,
  `detail` json NOT NULL,
  `price_total` double NOT NULL,
  `price_include_vat` double NOT NULL,
  `orderDate` timestamp NOT NULL,
  `user` varchar(100) NOT NULL,
  PRIMARY KEY (`orderID`),
  UNIQUE KEY `orderID_UNIQUE` (`orderID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_foods`
--

LOCK TABLES `order_foods` WRITE;
/*!40000 ALTER TABLE `order_foods` DISABLE KEYS */;
INSERT INTO `order_foods` VALUES (1,'[{\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}]',89,95,'2018-11-16 15:54:26','admin'),(2,'[{\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}, {\"name\": \"Honey Toast\", \"price\": 189.0, \"quantity\": 1, \"price_each\": 189.0}]',278,297,'2018-11-16 17:41:16','admin'),(3,'[{\"name\": \"Honey Toast\", \"price\": 189.0, \"quantity\": 1, \"price_each\": 189.0}, {\"name\": \"Chocolat Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}, {\"name\": \"Cookies\", \"price\": 55.0, \"quantity\": 1, \"price_each\": 55.0}, {\"name\": \"GreenTea\", \"price\": 69.0, \"quantity\": 1, \"price_each\": 69.0}]',402,430,'2018-11-17 09:04:54','admin'),(4,'[{\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}]',89,95,'2018-11-19 06:09:53','admin'),(5,'[{\"name\": \"Egg with Bread\", \"price\": 199.0, \"quantity\": 1, \"price_each\": 199.0}]',199,213,'2018-11-19 06:39:25','mo'),(6,'[{\"name\": \"Egg with Bread\", \"price\": 199.0, \"quantity\": 1, \"price_each\": 199.0}, {\"name\": \"Chocolat Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}, {\"name\": \"Super Sunday\", \"price\": 79.0, \"quantity\": 1, \"price_each\": 79.0}, {\"name\": \"Nuty Waffle\", \"price\": 149.0, \"quantity\": 1, \"price_each\": 149.0}, {\"name\": \"Mix Berry Pancake\", \"price\": 159.0, \"quantity\": 1, \"price_each\": 159.0}, {\"name\": \"Honey Toast\", \"price\": 189.0, \"quantity\": 1, \"price_each\": 189.0}, {\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}]',953,1020,'2018-11-19 07:24:22','admin'),(7,'[{\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}]',89,95,'2018-11-21 15:29:57','admin'),(8,'[{\"name\": \"Cookies\", \"price\": 110.0, \"quantity\": 2, \"price_each\": 55.0}]',110,118,'2018-11-22 06:57:48','admin'),(9,'[{\"name\": \"Nuty Waffle\", \"price\": 149.0, \"quantity\": 1, \"price_each\": 149.0}]',149,159,'2018-11-22 07:59:51','mo'),(10,'[{\"name\": \"Mix Berry Pancake\", \"price\": 159.0, \"quantity\": 1, \"price_each\": 159.0}, {\"name\": \"Nuty Waffle\", \"price\": 149.0, \"quantity\": 1, \"price_each\": 149.0}, {\"name\": \"Super Sunday\", \"price\": 79.0, \"quantity\": 1, \"price_each\": 79.0}]',387,414,'2018-11-24 07:27:55','admin'),(11,'[{\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}, {\"name\": \"Honey Toast\", \"price\": 378.0, \"quantity\": 2, \"price_each\": 189.0}, {\"name\": \"Mix Berry Pancake\", \"price\": 159.0, \"quantity\": 1, \"price_each\": 159.0}]',626,670,'2018-11-25 10:04:08','mo'),(12,'[{\"name\": \"Frenchfries\", \"price\": 60.0, \"quantity\": 1, \"price_each\": 60.0}]',60,64,'2018-11-25 10:21:50','mo'),(13,'[{\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}, {\"name\": \"Latte\", \"price\": 79.0, \"quantity\": 1, \"price_each\": 79.0}, {\"name\": \"Cookies\", \"price\": 55.0, \"quantity\": 1, \"price_each\": 55.0}]',223,239,'2018-11-25 10:42:05','mo'),(14,'[{\"name\": \"Super Sunday\", \"price\": 79.0, \"quantity\": 1, \"price_each\": 79.0}]',79,85,'2018-11-25 10:42:50','admin'),(15,'[{\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}, {\"name\": \"Honey Toast\", \"price\": 189.0, \"quantity\": 1, \"price_each\": 189.0}, {\"name\": \"Cookies\", \"price\": 55.0, \"quantity\": 1, \"price_each\": 55.0}]',333,356,'2018-11-26 06:01:23','admin'),(16,'[{\"name\": \"GreenTea Lava\", \"price\": 89.0, \"quantity\": 1, \"price_each\": 89.0}]',89,95,'2018-11-26 07:47:07','mo'),(17,'[{\"name\": \"Mix Berry Pancake\", \"price\": 159.0, \"quantity\": 1, \"price_each\": 159.0}, {\"name\": \"Nuty Waffle\", \"price\": 149.0, \"quantity\": 1, \"price_each\": 149.0}]',308,330,'2018-11-26 10:02:32','mo'),(18,'[{\"name\": \"Milk\", \"price\": 55.0, \"quantity\": 1, \"price_each\": 55.0}]',55,59,'2018-11-26 10:22:17','mo');
/*!40000 ALTER TABLE `order_foods` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-26 17:29:05
