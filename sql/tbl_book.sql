/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : ssm_db

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 24/03/2023 12:38:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_book
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book`;
CREATE TABLE `tbl_book`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_book
-- ----------------------------
INSERT INTO `tbl_book` VALUES (1, '计算机理论', 'spring实战 第5版', '深入理解spring原理技术内幕原理');
INSERT INTO `tbl_book` VALUES (2, '计算机理论', 'spring实战 第6版', '深入理解spring原理技术内幕原理');
INSERT INTO `tbl_book` VALUES (3, '测试数据1', '测试数据1', '测试数据1');
INSERT INTO `tbl_book` VALUES (4, '测试数据2', '测试数据2', '测试数据2');
INSERT INTO `tbl_book` VALUES (7, '测试数据3', '测试数据3', '测试数据3');
INSERT INTO `tbl_book` VALUES (8, '测试数据4', '测试数据4', '测试数据4');
INSERT INTO `tbl_book` VALUES (9, '测试数据5', '测试数据5', '测试数据5');
INSERT INTO `tbl_book` VALUES (10, '测试数据6', '测试数据6', '测试数据6');
INSERT INTO `tbl_book` VALUES (11, '测试数据7', '测试数据7', '测试数据7');
INSERT INTO `tbl_book` VALUES (12, '测试数据8', '测试数据8', '测试数据8');
INSERT INTO `tbl_book` VALUES (13, '测试数据9', '测试数据9', '测试数据9');
INSERT INTO `tbl_book` VALUES (14, '测试数据10', '测试数据10', '测试数据10');
INSERT INTO `tbl_book` VALUES (15, '测试数据11', '测试数据11', '测试数据11');
INSERT INTO `tbl_book` VALUES (16, '测试数据12', '测试数据12', '测试数据12');

SET FOREIGN_KEY_CHECKS = 1;
