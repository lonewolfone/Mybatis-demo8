/*
Navicat MySQL Data Transfer

Source Server         : mm
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : world

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-10-25 11:06:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('1', '一班');
INSERT INTO `class` VALUES ('2', '二班');
INSERT INTO `class` VALUES ('3', '三班');
INSERT INTO `class` VALUES ('4', '四班');
INSERT INTO `class` VALUES ('5', '五班');
