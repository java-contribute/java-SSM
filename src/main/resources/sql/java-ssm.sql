-- MySQL dump 10.13  Distrib 5.5.53, for Win32 (AMD64)
--
-- Host: 192.168.42.128    Database: java-ssm
-- ------------------------------------------------------
-- Server version	5.6.39

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `address_content` varchar(60) NOT NULL COMMENT '地址内容',
  `from_id` bigint(20) NOT NULL COMMENT '从属谁,商家和用户的id',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次修改时间',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除,0-未删除,1-删除,默认为0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户地址表，用户收货地址表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `content`
--

DROP TABLE IF EXISTS `content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增di',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `shop_id` bigint(20) NOT NULL COMMENT '商家id',
  `merchandise_id` bigint(20) NOT NULL COMMENT '商品id',
  `content_text` varchar(255) NOT NULL COMMENT '评论内容',
  `is_anonymous` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否匿名,0-不匿名,1-匿名,默认为0',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '评论时间',
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除,0-未删除,1-删除,默认为0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content`
--

LOCK TABLES `content` WRITE;
/*!40000 ALTER TABLE `content` DISABLE KEYS */;
/*!40000 ALTER TABLE `content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `image` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `from_id` bigint(20) NOT NULL COMMENT '从属id,商店id,商品id,用户id',
  `image_address` varchar(50) NOT NULL COMMENT '图片保存地址',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) NOT NULL COMMENT '逻辑删除,0-未删除,1-删除,默认为0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `merchandise`
--

DROP TABLE IF EXISTS `merchandise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `merchandise` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `merchandise_code` varchar(25) NOT NULL COMMENT '商品编号',
  `merchandise_name` varchar(25) NOT NULL COMMENT '商品名称',
  `merchandise_content` varchar(255) NOT NULL COMMENT '商品描述',
  `merchandise_price` double NOT NULL COMMENT '商品价格',
  `merchandise_number` int(11) NOT NULL COMMENT '商品数量',
  `merchandise_factory` varchar(25) NOT NULL COMMENT '商品厂家',
  `merchandise_birthday` date NOT NULL COMMENT '出厂日期',
  `merchandise_category_id` int(11) DEFAULT NULL COMMENT '商品种类id',
  `merchandise_shop_id` bigint(20) NOT NULL COMMENT '商品从属的店家id',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次更改时间',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除,0-未删除,1-删除,默认为0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merchandise`
--

LOCK TABLES `merchandise` WRITE;
/*!40000 ALTER TABLE `merchandise` DISABLE KEYS */;
/*!40000 ALTER TABLE `merchandise` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `shop_identity` varchar(25) NOT NULL COMMENT '商户账号',
  `shop_password` varchar(255) NOT NULL COMMENT '商户密码',
  `shop_salt` varchar(255) NOT NULL COMMENT '加密盐',
  `shop_name` varchar(25) NOT NULL COMMENT '商店名称',
  `shop_number` int(11) NOT NULL COMMENT '商店联系方式',
  `shop_email` varchar(30) NOT NULL COMMENT '商家邮箱',
  `shop_category` bigint(20) NOT NULL COMMENT '商店类别',
  `shop_state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-正在营业,1-暂停营业',
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次修改时间',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除,0-未删除,1-删除,默认为0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_notice`
--

DROP TABLE IF EXISTS `shop_notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop_notice` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `notice_content` varchar(200) NOT NULL COMMENT '公告内容',
  `shop_id` bigint(20) NOT NULL COMMENT '商家id',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除,0-未删除,1-删除,默认为0',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家公告表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_notice`
--

LOCK TABLES `shop_notice` WRITE;
/*!40000 ALTER TABLE `shop_notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop_notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shopping_cart`
--

DROP TABLE IF EXISTS `shopping_cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shopping_cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) NOT NULL COMMENT '逻辑删除,0-未删除,1-删除,默认为0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户购物车';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shopping_cart`
--

LOCK TABLES `shopping_cart` WRITE;
/*!40000 ALTER TABLE `shopping_cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `shopping_cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shopping_cart_menchandise`
--

DROP TABLE IF EXISTS `shopping_cart_menchandise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shopping_cart_menchandise` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `shopping_cart_id` bigint(20) NOT NULL COMMENT '购物车id',
  `menchandise_id` bigint(20) NOT NULL COMMENT '商品id',
  `menchandise_number` int(11) NOT NULL COMMENT '商品数量',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除,0-未删除,1-删除,默认为0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车里的商品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shopping_cart_menchandise`
--

LOCK TABLES `shopping_cart_menchandise` WRITE;
/*!40000 ALTER TABLE `shopping_cart_menchandise` DISABLE KEYS */;
/*!40000 ALTER TABLE `shopping_cart_menchandise` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_name` varchar(12) NOT NULL COMMENT '用户名',
  `user_email` varchar(30) NOT NULL COMMENT '用户邮箱',
  `user_password` varchar(255) NOT NULL COMMENT '用户密码',
  `user_salt` varchar(255) NOT NULL COMMENT '加密盐',
  `user_number` int(11) NOT NULL COMMENT '用户电话号码',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更改时间',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除,0-未删除，1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Table structure for table `user_collect`
--

DROP TABLE IF EXISTS `user_collect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_collect` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `shop_id` bigint(20) NOT NULL COMMENT '商家id',
  `shop_name` varchar(30) NOT NULL COMMENT '商家名称',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户对商店收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_collect`
--

LOCK TABLES `user_collect` WRITE;
/*!40000 ALTER TABLE `user_collect` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_collect` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-21 19:47:15
