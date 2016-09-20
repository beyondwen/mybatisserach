/*
Navicat MySQL Data Transfer

Source Server         : 紫貂皮
Source Server Version : 50532
Source Host           : localhost:3306
Source Database       : mybatisserach

Target Server Type    : MYSQL
Target Server Version : 50532
File Encoding         : 65001

Date: 2016-09-20 17:24:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(255) DEFAULT NULL,
  `productType` varchar(255) DEFAULT NULL,
  `productMinPrice` decimal(10,0) DEFAULT NULL,
  `productMaxPrice` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=100004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('1', 'iphone', '手机', '1000', '6000');
INSERT INTO `t_product` VALUES ('2', '三星', '手机', '1000', '7000');
INSERT INTO `t_product` VALUES ('3', '联想', '手机', '1000', '7000');
INSERT INTO `t_product` VALUES ('4', '华为', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('5', '中兴', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('6', '魅族', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('7', '小米', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('8', 'oppo', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('9', 'vovi', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('10', '步步高', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('11', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('12', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('13', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('14', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('15', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('16', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('17', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('18', '小辣椒', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('19', '湘江', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('20', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('21', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('22', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('23', '红名', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('24', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('25', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('26', '黑莓', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('27', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('28', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('29', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('30', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('31', 'pingg', 'shouji', '100', '100');
INSERT INTO `t_product` VALUES ('32', 'pingg', 'shouji', '100', '100');
