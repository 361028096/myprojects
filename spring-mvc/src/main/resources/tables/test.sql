/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50638
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-04-27 16:36:57
*/

SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `due_time` date DEFAULT NULL,
  `instalment` int(11) DEFAULT NULL COMMENT '当前期数',
  `freeze_time` datetime DEFAULT NULL COMMENT '冻结时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', '贺炜', '2017-12-29', '1', '2017-12-21 14:47:11');
INSERT INTO `test` VALUES ('2', 'haha', '2017-12-29', '1', '2017-12-21 14:57:46');
INSERT INTO `test` VALUES ('3', 'haha', '2017-12-29', '1', null);
INSERT INTO `test` VALUES ('4', 'asdf', null, '4', null);
INSERT INTO `test` VALUES ('5', 'h5', null, null, null);

-- ---------------------------