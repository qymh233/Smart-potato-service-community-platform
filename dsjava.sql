/*
 Navicat Premium Data Transfer

 Source Server         : dsjava
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 39.96.24.140:3306
 Source Schema         : dsjava

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 11/06/2021 22:23:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_announce
-- ----------------------------
DROP TABLE IF EXISTS `t_announce`;
CREATE TABLE `t_announce`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `announcement` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `newtime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_announce
-- ----------------------------
INSERT INTO `t_announce` VALUES (1, '<p>&nbsp;</p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\"><span style=\";font-size: 19px; font-family: \'宋体\';\">本系统由SHD编写，作者目前就读于内蒙古大学大学计算机学院（软件学院）软件工程专业，入学年份2017，四学年制。</span></p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>', '关于作者', '2021-01-17 16:03:56');
INSERT INTO `t_announce` VALUES (2, '<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p style=\"line-height: 1.75em;\"><span style=\"font-family: 宋体; font-size: 18px; line-height: 1.75em;\">&nbsp; &nbsp;</span><span style=\"font-family: 宋体; font-size: 18px; line-height: 1.75em;\"> </span><span style=\"font-family: 宋体; font-size: 18px; line-height: 1.75em;\">马铃薯信息管理系统由SHD</span><span style=\"font-family: 宋体; font-size: 18px; line-height: 1.75em;\">编写目前本系统还在初步建设中，还有很多功能会陆续推出，敬请期待，谢谢大家的支持！</span></p>\r\n<p>&nbsp;</p>', '关于社区', '2021-01-17 16:04:06');
INSERT INTO `t_announce` VALUES (3, '<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\"><span style=\";font-size: 19px; font-family: \'宋体\';\">大家可以向作者提出自己对本系统的建议，为本系统献出自己的一份力量，作者会非常乐意接收大家对本系统的有利的意见，谢谢！</span></p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p>&nbsp;</p>', '反馈作者', '2021-01-17 16:04:11');
INSERT INTO `t_announce` VALUES (4, '<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\"><span style=\";font-size: 19px; font-family: \'宋体\';\">大家可以向作者提出自己对本系统的建议，为本系统献出自己的一份力量，作者会非常乐意接收大家对本系统的有利的意见，谢谢！</span></p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p style=\"text-indent: 37px; text-align: justify; line-height: 1.75em;\">&nbsp;</p>\r\n<p>&nbsp;</p>', '系统测试', '2021-01-17 16:04:18');
INSERT INTO `t_announce` VALUES (5, '<p style=\"line-height: 1.5em;\"><span style=\";font-size: 14px; font-family: \'宋体\';\">隐私和版权：</span></p>\r\n<p style=\"text-indent: 28px; line-height: 1.5em;\"><span style=\";font-size: 14px; font-family: \'宋体\';\">为保证系统正常发展，规避意外风险，从而向广大用户提供更优质的服务，故此特设版权声明。为保证您的知识产权不被侵犯，</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">建议您在接受本站服务之前，请务必仔细阅读</span><span style=\";font-size: 14px; font-family: \'宋体\';\">。</span></p>\r\n<p style=\"line-height: 1.5em;\"><span style=\"font-size: 14px; font-family: \'宋体\';\">1、</span><span style=\";font-size: 14px; font-family: \'宋体\';\">本站将按照法律规定删除违法信息，并一概不受理当事方或委托方的相关投诉。</span></p>\r\n<p style=\"text-align: left; line-height: 1.5em;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">2、</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">所有在本网站发布的转载文章，必须事先征得原作者同意，且注明原作者姓名和文章来源，如有侵权或违法行为，本网站不承担任何法律责任；所有文章仅代表作者个人的观点和立场，其侵权或违法行为的责任由作者本人承担。</span></p>\r\n<p style=\"text-align: left; line-height: 1.5em;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">3、凡本网站上所有的文字、图片和音频、视频稿件，任何媒体、网站或个人未经本网站协议授权不得转载、链接、转贴或以其他方式复制发表，如有需要，请与本网站联系相关事宜。违者本网站将追究其法律责任。</span></p>\r\n<p style=\"text-align: left; line-height: 1.5em;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">4、</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">本站</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">所刊载的文章资料、图片、图表、数据仅供参考使用，所刊登的广告，均为广告商的个人意见及表达方式，和本网站无任何关系，如有侵权或违法行为应由其相关广告商承担责任。</span></p>\r\n<p style=\"text-align: left; line-height: 1.5em;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">5、用户在本站注册时，本网站将在您的同意及确认下，通过注册表格等形式要求您提供一些个人私密资料，在未经用户本人同意的情况下，本站绝对不会将用户的任何资料泄露给第三方。但当政府部门、司法机关依照法定程序要求本网站披露时或不可抗力除外。</span></p>\r\n<p style=\"text-align: left; line-height: 1.5em;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">6</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">、凡以任何方式登陆本网站或直接、间接使用本网站资料者，视为自愿接受本项声明的约束。</span></p>\r\n<p style=\"text-align: left; line-height: 1.5em;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">7</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">、如果您有任何疑问，请与我们联系</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">。</span></p>\r\n<p style=\"text-align: left; line-height: 1.5em;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">电话：</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">15846143&nbsp; </span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">&nbsp;Email:</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">18275@qq.com</span></p>\r\n<p>&nbsp;</p>', '隐私和版权', '2021-01-17 16:04:34');

-- ----------------------------
-- Table structure for t_carousels
-- ----------------------------
DROP TABLE IF EXISTS `t_carousels`;
CREATE TABLE `t_carousels`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `url` varchar(800) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_carousels
-- ----------------------------
INSERT INTO `t_carousels` VALUES (1, 'http://cdn.potatopic.top/lunbo1.jpeg');
INSERT INTO `t_carousels` VALUES (2, 'http://cdn.potatopic.top/lunbp2.jpg');
INSERT INTO `t_carousels` VALUES (3, 'http://cdn.potatopic.top/lunbo3.jpeg');

-- ----------------------------
-- Table structure for t_category
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_category
-- ----------------------------
INSERT INTO `t_category` VALUES (1, '马铃薯常见品种');
INSERT INTO `t_category` VALUES (2, '马铃薯各生育期特征');
INSERT INTO `t_category` VALUES (3, '马铃薯营养要素');
INSERT INTO `t_category` VALUES (4, '马铃薯常见病害');
INSERT INTO `t_category` VALUES (6, '马铃薯常见虫害');
INSERT INTO `t_category` VALUES (7, '社区');
INSERT INTO `t_category` VALUES (10, '马铃薯图像库');

-- ----------------------------
-- Table structure for t_collect
-- ----------------------------
DROP TABLE IF EXISTS `t_collect`;
CREATE TABLE `t_collect`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `tid` int(0) NOT NULL,
  `uid` int(0) NOT NULL,
  `ctime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `tname` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `uname` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_collect
-- ----------------------------
INSERT INTO `t_collect` VALUES (3, 10, 1, '2020-09-17 17:44:32', '平台测试8', '西瓜');
INSERT INTO `t_collect` VALUES (4, 19, 1, '2020-11-07 15:08:13', '我就试试', '土豆');
INSERT INTO `t_collect` VALUES (11, 1, 1, '2021-01-01 17:50:55', '平台测试', '土豆');
INSERT INTO `t_collect` VALUES (14, 2, 1, '2021-01-01 17:53:59', '马铃薯图片', '土豆');

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `content` varchar(800) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `picturl` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `countnice` int(0) NOT NULL DEFAULT 0,
  `commentTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `uid` int(0) NOT NULL,
  `tid` int(0) NOT NULL,
  `status` int(0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_comment
-- ----------------------------
INSERT INTO `t_comment` VALUES (1, '哈哈啊哈', '', 10, '2020-09-07 17:58:16', 1, 1, 0);
INSERT INTO `t_comment` VALUES (2, '哈哈啊哈', '', 0, '2020-09-07 17:58:16', 2, 1, 0);
INSERT INTO `t_comment` VALUES (3, '哈哈啊哈', '', 0, '2020-09-07 17:58:17', 3, 1, 0);
INSERT INTO `t_comment` VALUES (4, '这是马铃薯', 'http://cdn.potatopic.top/b2953731-c0b1-4663-b31f-b0d9ad56e50f.jpg', 0, '2020-09-07 17:58:17', 1, 2, 0);
INSERT INTO `t_comment` VALUES (5, '这是马铃薯吧', 'http://cdn.potatopic.top/b2953731-c0b1-4663-b31f-b0d9ad56e50f.jpg', 0, '2020-09-07 17:58:17', 2, 2, 0);
INSERT INTO `t_comment` VALUES (6, '这是马铃薯嘛', '', 6, '2020-09-07 17:58:17', 3, 2, 0);
INSERT INTO `t_comment` VALUES (7, '这大概是马铃薯', '', 0, '2020-09-07 17:58:17', 4, 2, 0);
INSERT INTO `t_comment` VALUES (8, '这就是是马铃薯', '', 5, '2020-09-07 17:58:17', 5, 2, 0);
INSERT INTO `t_comment` VALUES (9, '哈哈啊哈', '', 0, '2020-09-07 17:58:17', 1, 3, 0);
INSERT INTO `t_comment` VALUES (10, '这事马铃薯图片', 'http://cdn.potatopic.top/b2953731-c0b1-4663-b31f-b0d9ad56e50f.jpg', 0, '2020-09-08 21:27:23', 1, 1, 0);
INSERT INTO `t_comment` VALUES (11, 'hahahahah', 'http://cdn.potatopic.top/c3c8b2a9-4a68-4cf7-aefc-7c23c6ea5def.jpg', 0, '2020-09-09 19:14:08', 1, 2, 0);
INSERT INTO `t_comment` VALUES (12, 'hahahahah', 'http://cdn.potatopic.top/c3c8b2a9-4a68-4cf7-aefc-7c23c6ea5def.jpg', 0, '2020-09-09 19:15:21', 1, 3, 0);
INSERT INTO `t_comment` VALUES (13, '这个是马铃薯', 'http://cdn.potatopic.top/c3c8b2a9-4a68-4cf7-aefc-7c23c6ea5def.jpg', 0, '2020-09-09 19:17:19', 1, 3, 0);
INSERT INTO `t_comment` VALUES (14, 'hhhhhhhhhhhhhh', '', 0, '2020-09-13 17:27:09', 2, 2, 0);
INSERT INTO `t_comment` VALUES (15, '图片上传接口改了', 'http://cdn.potatopic.top/b2953731-c0b1-4663-b31f-b0d9ad56e50f.jpg', 0, '2020-09-15 19:26:27', 1, 10, 0);
INSERT INTO `t_comment` VALUES (16, '再次测试', 'http://cdn.potatopic.top/c3c8b2a9-4a68-4cf7-aefc-7c23c6ea5def.jpg', 0, '2020-09-17 17:44:10', 1, 10, 0);
INSERT INTO `t_comment` VALUES (17, '我就试试。', 'http://cdn.potatopic.top/c2840cca-8a18-4cf7-bbb3-e2562a8a151f.jpg', 0, '2020-11-07 15:02:39', 1, 10, 0);
INSERT INTO `t_comment` VALUES (18, '44444444444444444', '', 0, '2020-12-25 15:00:51', 1, 1, 0);
INSERT INTO `t_comment` VALUES (19, '1233456666', 'http://cdn.potatopic.top/988d28d2-cd73-43fe-96cc-d4d0fef716b6.jpg', 0, '2021-01-01 15:31:13', 1, 10, 0);
INSERT INTO `t_comment` VALUES (20, '999999999999999', '', 0, '2021-01-01 15:31:24', 1, 10, 0);
INSERT INTO `t_comment` VALUES (21, '1', '', 0, '2021-01-01 15:31:27', 1, 10, 0);
INSERT INTO `t_comment` VALUES (22, '2', '', 0, '2021-01-01 15:31:29', 1, 10, 0);
INSERT INTO `t_comment` VALUES (23, '3', '', 0, '2021-01-01 15:31:31', 1, 10, 0);
INSERT INTO `t_comment` VALUES (24, '5555555555555', '', 0, '2021-01-01 15:35:23', 1, 10, 0);
INSERT INTO `t_comment` VALUES (25, '99999', '', 0, '2021-01-01 15:36:27', 1, 10, 0);
INSERT INTO `t_comment` VALUES (26, '555555555555', '', 0, '2021-01-01 15:45:44', 1, 10, 0);
INSERT INTO `t_comment` VALUES (27, '5555555555555', 'http://cdn.potatopic.top/ef28b501-e0d9-42b1-9150-21b9a5f1e9ff.jpg', 0, '2021-01-01 15:45:55', 1, 10, 0);
INSERT INTO `t_comment` VALUES (28, '666666666666666666', '', 0, '2021-01-01 15:53:38', 1, 1, 0);
INSERT INTO `t_comment` VALUES (29, '哈哈哈哈哈哈哈', '', 0, '2021-01-18 15:45:03', 2, 1, 0);
INSERT INTO `t_comment` VALUES (30, '不错不错', 'http://cdn.potatopic.top/69350b5d-8b88-4f4a-b108-81ef9de302b0.jpg', 0, '2021-05-12 14:54:50', 1, 10, 0);

-- ----------------------------
-- Table structure for t_help
-- ----------------------------
DROP TABLE IF EXISTS `t_help`;
CREATE TABLE `t_help`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `newtime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_help
-- ----------------------------
INSERT INTO `t_help` VALUES (1, '登陆与注册', '<p><strong>如何注册账号</strong><br /><br />&nbsp; &nbsp; &nbsp;点击本系统首页的\"用户注册\"进行注册。注册成功之后，系统会自动跳转到社区服务平台系统的首页。<br /><br /><strong>如何登录系统</strong><br /><br /></p>\r\n<p>&nbsp; &nbsp; &nbsp;如果您已经注册成功，您可以点击系统首页的登录进行登录，进入登录界面填写正确的用户名、密码，点击\"登录\"即可完成登录。</p>\r\n<p>&nbsp; &nbsp; &nbsp;登录成功后会自动跳转到社区服务平台系统的首页。</p>\r\n<p><img src=\"http://cdn.potatopic.top/9e86bfc1-3b49-4a81-a3bf-cf3722aaa58e.jpg\" alt=\"\" width=\"731\" height=\"1144\" /></p>\r\n<p>&nbsp;</p>', '2020-11-12 14:59:57');
INSERT INTO `t_help` VALUES (2, '密码注意事项', '<p style=\"line-height: 1.75em;\"><span style=\"font-size: 18px;\"><strong><span style=\"font-family: &#39;宋体&#39;;\">忘记密码</span></strong></span><span style=\";font-size:16px;font-family:&#39;宋体&#39;\"><br/><br/>&nbsp;&nbsp;&nbsp; 目前还没有找回密码的功能，所以请大家先牢记自己的密码，开发人员会加紧时间进一步开发这个功能，敬请期待，谢谢！<br/><br/><span style=\"font-family: &#39;宋体&#39;; font-size: 18px;\"><strong>修改密码</strong></span><br/><br/>&nbsp;&nbsp;&nbsp; 登录后点击系统右上角&quot;个人中心&quot;—&quot;修改密码&quot;&nbsp;可以修改登录密码。</span></p><p><br/></p>', '2020-09-27 13:49:23');
INSERT INTO `t_help` VALUES (3, '如何发表帖子', '<p style=\"line-height: 1.75em;\"><span style=\"font-size: 20px;\"><strong><span style=\"font-family: \'宋体\';\">发帖</span></strong></span></p><p style=\"line-height: 1.75em;\"><span style=\";font-size:16px;font-family:\'宋体\'\">&nbsp;&nbsp;&nbsp; <span style=\"font-family: \'宋体\'; font-size: 18px;\">用户登录后找到相应的发帖按钮如下，</span></span></p><p style=\"line-height: 1.75em;\"><span style=\";font-size:14px;font-family:\'Times New Roman\'\">&nbsp;</span></p><p style=\"line-height: 1.75em;\"><img src=\"http://cdn.potatopic.top/tie.png\" style=\"width: 364px; height: 175px;\" title=\"发帖.png\"></p><p style=\"line-height: 1.75em;\"><br></p><p style=\"line-height: 1.75em;\"><img style=\"width: 508px; height: 101px;\" src=\"http://cdn.potatopic.top/tie2.png\" title=\"发帖2.png\"></p><p style=\"line-height: 1.75em;\"><span style=\";font-size:14px;font-family:\'Times New Roman\'\"></span><br></p><p style=\"line-height: 1.75em;\"><span style=\";font-size:14px;font-family:\'Times New Roman\'\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span style=\"font-size: 18px; font-family: 宋体,SimSun;\">然后会进入到发帖的页面，如果没有登录的话就会跳转到登录界面要求你登录，发帖页面如下，</span></p><p style=\"line-height: 1.75em;\"><span style=\";font-size:14px;font-family:\'Times New Roman\'\">&nbsp;<img style=\"width: 483px; height: 307px;\" src=\"http://cdn.potatopic.top/tie3.png\" title=\"发帖3.png\"></span></p><p style=\"line-height: 1.75em;\"><span style=\";font-size:14px;font-family:\'宋体\'\">&nbsp;&nbsp;&nbsp; <br></span></p><p style=\"line-height: 1.75em;\"><span style=\"font-family: \'宋体\'; font-size: 18px;\">&nbsp;&nbsp;&nbsp; 发帖要求文章标题至少多于3<span style=\"font-size: 18px; font-family: 宋体;\">个字，发帖成功后会跳转到刚刚发表的帖子的页面。</span></span></p><p style=\"line-height: 1.75em;\"><span style=\"font-family: \'宋体\'; font-size: 18px;\">&nbsp;&nbsp;&nbsp; 发帖成功！</span></p><p><br></p>', '2020-11-07 14:47:47');
INSERT INTO `t_help` VALUES (4, '如何评论帖子', '<p style=\"line-height: 1.75em;\"><span style=\"font-size: 20px;\"><strong><span style=\"font-family: &#39;宋体&#39;;\">评论</span></strong></span></p><p style=\"line-height: 1.75em;\"><span style=\"font-family: &#39;宋体&#39;; font-size: 18px;\">&nbsp;&nbsp;&nbsp; 到指定的帖子页面找到评论的地方，如下，</span></p><p style=\"line-height: 1.75em;\"><span style=\"font-family: &#39;宋体&#39;; font-size: 18px;\"><br/></span></p><p style=\"line-height: 1.75em;\"><img style=\"width: 519px; height: 186px;\" src=\"http://cdn.potatopic.top/pinglun.png\" title=\"评论.png\"/><span style=\"font-family: &#39;Times New Roman&#39;; font-size: 18px;\">&nbsp;</span></p><p style=\"line-height: 1.75em;\"><span style=\"font-family: &#39;宋体&#39;; font-size: 18px;\"><br/></span></p><p style=\"line-height: 1.75em;\"><span style=\"font-family: &#39;宋体&#39;; font-size: 18px;\">&nbsp;&nbsp;&nbsp; 评论要求字数在<span style=\"font-size: 18px; font-family: Times New Roman;\">10</span><span style=\"font-size: 18px; font-family: 宋体;\">个以上，如果没有登录则会跳转到登录的页面。</span></span></p><p><br/></p>', '2020-10-29 10:10:49');
INSERT INTO `t_help` VALUES (5, '联系我们', '<p style=\";text-autospace: ideograph-other; text-align: left; line-height: 22px;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">联系我们：</span></p>\r\n<p style=\";text-autospace: ideograph-other; text-align: left; line-height: 22px;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">电话：15846143</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">&nbsp;&nbsp;</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">&nbsp;</span></p>\r\n<p style=\";text-autospace: ideograph-other; text-align: left; line-height: 22px;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">Email:</span><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">18775@qq.com</span></p>\r\n<p style=\";text-autospace: ideograph-other; text-align: left; line-height: 22px;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">地址：内蒙古自治区呼和浩特市内蒙古大学</span></p>\r\n<p style=\";text-autospace: ideograph-other; text-align: left; line-height: 22px;\"><span style=\";color: #000000; font-weight: normal; font-style: normal; font-size: 14px; font-family: \'宋体\';\">邮编：025450</span></p>\r\n<p><img style=\"width: 467px; height: 263px;\" src=\"http://cdn.potatopic.top/school2.jpg\" /></p>', '2021-01-17 16:05:17');

-- ----------------------------
-- Table structure for t_livemsgs
-- ----------------------------
DROP TABLE IF EXISTS `t_livemsgs`;
CREATE TABLE `t_livemsgs`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `content` varchar(800) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `newtime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `uid` int(0) NOT NULL,
  `recont` varchar(800) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_livemsgs
-- ----------------------------
INSERT INTO `t_livemsgs` VALUES (1, '留言版功能', '2020-09-09 20:21:20', 1, '546');
INSERT INTO `t_livemsgs` VALUES (2, '查询用户帖子', '2020-09-09 20:21:20', 2, '456');
INSERT INTO `t_livemsgs` VALUES (3, 'search功能', '2020-09-09 20:21:20', 3, '456');
INSERT INTO `t_livemsgs` VALUES (4, '啦啦啦啦', '2020-09-09 20:21:20', 1, '123');
INSERT INTO `t_livemsgs` VALUES (5, '阿萨大大撒旦', '2020-09-09 20:21:20', 1, '123');
INSERT INTO `t_livemsgs` VALUES (6, 'hahahahhahah,下雨了！！！！', '2020-09-09 20:25:41', 1, '123');
INSERT INTO `t_livemsgs` VALUES (7, '分页', '2020-09-17 17:59:18', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (8, '帮助和公告的内容', '2020-09-17 17:59:30', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (9, '1', '2020-12-23 15:38:17', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (10, '2', '2020-12-23 15:38:20', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (11, '3', '2020-12-23 15:38:21', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (12, '4', '2020-12-23 15:38:23', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (13, '5', '2020-12-23 15:38:25', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (14, '6', '2020-12-23 15:38:26', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (15, '7', '2020-12-23 15:38:28', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (16, '8', '2020-12-23 15:38:30', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (17, '9', '2020-12-23 15:38:32', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (18, '10', '2020-12-23 15:38:35', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (19, '11', '2020-12-23 15:38:46', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (20, '12', '2020-12-23 15:38:48', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (21, '13', '2020-12-23 15:38:50', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (22, '14', '2020-12-23 15:38:52', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (23, '15', '2020-12-23 15:38:59', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (24, '55555', '2020-12-25 10:30:36', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (25, '66666666666666666', '2021-01-03 16:42:14', 1, '请等待管理员回复');
INSERT INTO `t_livemsgs` VALUES (26, '9999999999999999999', '2021-01-03 16:42:33', 1, 'nice too meet you');
INSERT INTO `t_livemsgs` VALUES (27, '马铃薯社区', '2021-05-12 14:57:23', 1, '还在建设中');

-- ----------------------------
-- Table structure for t_managers
-- ----------------------------
DROP TABLE IF EXISTS `t_managers`;
CREATE TABLE `t_managers`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '0',
  `nickname` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '土豆',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_managers
-- ----------------------------
INSERT INTO `t_managers` VALUES (1, 'zxc', '0', '马铃薯');
INSERT INTO `t_managers` VALUES (2, '6666', '8', '土豆');
INSERT INTO `t_managers` VALUES (3, 'q', 'q', '番薯');

-- ----------------------------
-- Table structure for t_news
-- ----------------------------
DROP TABLE IF EXISTS `t_news`;
CREATE TABLE `t_news`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `tid` int(0) NOT NULL,
  `uid` int(0) NOT NULL,
  `ntime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `tname` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uname` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `upid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_news
-- ----------------------------
INSERT INTO `t_news` VALUES (2, 10, 2, '2020-09-15 19:26:27', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (3, 10, 2, '2020-09-17 17:44:10', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (4, 10, 2, '2020-11-07 15:02:39', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (5, 10, 2, '2021-01-01 15:31:13', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (6, 10, 2, '2021-01-01 15:31:24', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (7, 10, 2, '2021-01-01 15:31:27', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (8, 10, 2, '2021-01-01 15:31:29', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (9, 10, 2, '2021-01-01 15:31:31', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (10, 10, 2, '2021-01-01 15:35:23', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (11, 10, 2, '2021-01-01 15:36:27', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (12, 10, 2, '2021-01-01 15:45:44', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (13, 10, 2, '2021-01-01 15:45:55', '平台测试8', '土豆', 1);
INSERT INTO `t_news` VALUES (14, 1, 1, '2021-01-18 15:45:03', '平台测试', '西瓜', 2);
INSERT INTO `t_news` VALUES (15, 10, 2, '2021-05-12 14:54:50', '平台测试8', '土豆', 1);

-- ----------------------------
-- Table structure for t_photoLibrarys
-- ----------------------------
DROP TABLE IF EXISTS `t_photoLibrarys`;
CREATE TABLE `t_photoLibrarys`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `url` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `conDownload` int(0) NOT NULL DEFAULT 0,
  `uptime` datetime(0) NOT NULL,
  `described` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `uid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_photoLibrarys
-- ----------------------------
INSERT INTO `t_photoLibrarys` VALUES (1, '马铃薯图片', 'http://cdn.potatopic.top/4c0588f9-5c99-4f95-a64f-dcd4b6a60b84.jpg', 14, '2020-09-06 05:26:14', '马铃薯图片', 1);
INSERT INTO `t_photoLibrarys` VALUES (2, '马铃薯图片', 'http://cdn.potatopic.top/4c0588f9-5c99-4f95-a64f-dcd4b6a60b84.jpg', 7, '2020-09-06 18:26:14', '马铃薯图片', 1);
INSERT INTO `t_photoLibrarys` VALUES (3, '马铃薯图片', 'http://cdn.potatopic.top/727b359e-0016-4625-8a34-802f7423c214.jpg', 6, '2020-09-06 18:26:14', '马铃薯图片', 1);
INSERT INTO `t_photoLibrarys` VALUES (5, '马铃薯图片', 'http://cdn.potatopic.top/4c0588f9-5c99-4f95-a64f-dcd4b6a60b84.jpg', 2, '2020-09-07 08:27:44', '马铃薯图片，高含氮量', 1);
INSERT INTO `t_photoLibrarys` VALUES (6, '20200907083130_4.jpg', 'http://cdn.potatopic.top/727b359e-0016-4625-8a34-802f7423c214.jpg', 12, '2020-09-07 08:31:30', '高淀粉，高含氮量的马铃薯', 1);
INSERT INTO `t_photoLibrarys` VALUES (7, '20200907091404_图片.zip', 'http://cdn.potatopic.top/0fdb8036-1714-4195-8a02-77394040651a.zip', 14, '2020-09-07 09:14:03', '淀粉', 1);
INSERT INTO `t_photoLibrarys` VALUES (8, '马铃薯图片', 'http://cdn.potatopic.top/727b359e-0016-4625-8a34-802f7423c214.jpg', 4, '2020-09-13 20:04:55', '马铃薯，淀粉，kkkkk', 1);
INSERT INTO `t_photoLibrarys` VALUES (9, '测试图片上传接口', 'http://cdn.potatopic.top/4c0588f9-5c99-4f95-a64f-dcd4b6a60b84.jpg', 4, '2020-09-15 19:33:36', '测试图片上传接口', 1);
INSERT INTO `t_photoLibrarys` VALUES (10, '下载测试', 'http://cdn.potatopic.top/727b359e-0016-4625-8a34-802f7423c214.jpg', 2, '2020-09-15 20:37:45', '下载测试', 1);
INSERT INTO `t_photoLibrarys` VALUES (11, '马铃薯图片', 'http://cdn.potatopic.top/4c0588f9-5c99-4f95-a64f-dcd4b6a60b84.jpg', 2, '2020-09-17 17:42:25', '淀粉，高含量', 1);
INSERT INTO `t_photoLibrarys` VALUES (12, '测试马铃薯图片', 'http://cdn.potatopic.top/6e7c01f6-a5fe-4014-8ddf-91e40745e455.jpg', 1, '2020-10-19 20:38:12', '测试七牛云', 1);
INSERT INTO `t_photoLibrarys` VALUES (13, '我就试试', 'http://cdn.potatopic.top/491e6a2b-6a0c-4be3-b7ed-252d4bd62104.jpg', 1, '2020-11-07 15:06:55', '我就试试', 1);
INSERT INTO `t_photoLibrarys` VALUES (14, '123', '', 5, '2020-12-25 15:30:32', '123', 1);
INSERT INTO `t_photoLibrarys` VALUES (15, '高淀粉马铃薯图片', 'http://cdn.potatopic.top/78aa8335-480d-4166-80db-54b41f33425b.jpg', 1, '2021-05-12 14:56:29', '高淀粉', 1);
INSERT INTO `t_photoLibrarys` VALUES (16, '马铃薯图片', 'http://cdn.potatopic.top/50b32f00-8e5b-4363-a6b1-9f12012362e3.jpg', 3, '2021-05-31 14:31:52', '马铃薯图片', 1);

-- ----------------------------
-- Table structure for t_rellinks
-- ----------------------------
DROP TABLE IF EXISTS `t_rellinks`;
CREATE TABLE `t_rellinks`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `url` varchar(800) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cont` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_rellinks
-- ----------------------------
INSERT INTO `t_rellinks` VALUES (1, '马铃薯图像预处理', 'http://www.baidu.com/', NULL);
INSERT INTO `t_rellinks` VALUES (2, '特定目标检测/分割', 'https://login.bce.baidu.com/?account=', '账号：123456\r\n密码：222222');
INSERT INTO `t_rellinks` VALUES (3, '马铃薯生长评价', 'http://www.baidu.com/', NULL);

-- ----------------------------
-- Table structure for t_topic
-- ----------------------------
DROP TABLE IF EXISTS `t_topic`;
CREATE TABLE `t_topic`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` varchar(800) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `picturl` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `countnice` int(0) NOT NULL DEFAULT 0,
  `countsee` int(0) NOT NULL DEFAULT 0,
  `topicTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `uid` int(0) NOT NULL,
  `status` int(0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_topic
-- ----------------------------
INSERT INTO `t_topic` VALUES (1, '平台测试', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 4, 1, '2020-09-07 17:49:00', 1, 0);
INSERT INTO `t_topic` VALUES (2, '马铃薯图片', '这是什么啊？', 'http://cdn.potatopic.top/b2953731-c0b1-4663-b31f-b0d9ad56e50f.jpg', 151, 185, '2020-09-07 17:54:17', 1, 0);
INSERT INTO `t_topic` VALUES (3, '平台测试1', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 52, 96, '2020-09-07 17:54:17', 1, 0);
INSERT INTO `t_topic` VALUES (4, '平台测试2', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 70, 74, '2020-09-07 17:54:17', 1, 0);
INSERT INTO `t_topic` VALUES (7, '平台测试5', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 189, 192, '2020-09-07 17:54:17', 2, 0);
INSERT INTO `t_topic` VALUES (8, '平台测试6', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 66, 66, '2020-09-07 17:54:17', 2, 0);
INSERT INTO `t_topic` VALUES (9, '平台测试7', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 89, 89, '2020-09-07 17:54:17', 2, 0);
INSERT INTO `t_topic` VALUES (10, '平台测试8', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 69, 85, '2020-09-07 17:54:18', 2, 0);
INSERT INTO `t_topic` VALUES (11, '平台测试9', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 78, 78, '2020-09-07 17:54:18', 3, 0);
INSERT INTO `t_topic` VALUES (12, '平台测试10', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 0, 85, '2020-09-07 17:54:18', 4, 0);
INSERT INTO `t_topic` VALUES (13, '平台测试11', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 0, 0, '2020-09-07 17:54:18', 5, 0);
INSERT INTO `t_topic` VALUES (15, '平台测试13', '欢迎大家使用智慧马铃薯服务社区平台', NULL, 0, 0, '2020-09-07 17:54:18', 6, 0);
INSERT INTO `t_topic` VALUES (16, '马铃薯图片', '这个是马铃薯图片', 'http://cdn.potatopic.top/b2953731-c0b1-4663-b31f-b0d9ad56e50f.jpg', 0, 0, '2020-09-08 16:23:12', 1, 0);
INSERT INTO `t_topic` VALUES (17, 'kkkkkkk', 'asdasdasd', '', 0, 0, '2020-09-13 20:04:07', 1, 0);
INSERT INTO `t_topic` VALUES (18, '新帖测试一下', '新帖测试一下', '', 0, 0, '2020-09-18 21:06:33', 1, 0);
INSERT INTO `t_topic` VALUES (19, '我就试试', '啊哈哈哈哈哈哈啊哈', 'http://cdn.potatopic.top/ad7e9f7b-5d7d-4d89-ab2b-3ef34bd8e297.jpg', 0, 0, '2020-11-07 15:03:10', 1, 0);
INSERT INTO `t_topic` VALUES (20, '这是什么马铃薯', '这是什么马铃薯？？', 'http://cdn.potatopic.top/40bc9716-293e-449b-ba66-f8b60ecd9d0f.jpg', 0, 0, '2021-05-12 14:55:28', 1, 0);

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `typescategoryid` int(0) NOT NULL,
  `url` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES (1, '芽条生长期', 2, 'https://baike.baidu.com/item/%E8%8A%BD/85470?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (2, '幼苗期', 2, 'https://iask.sina.com.cn/b/10UAnKELDV2F.html', NULL);
INSERT INTO `t_type` VALUES (3, '块茎形成期', 2, 'https://baike.baidu.com/item/%E5%9D%97%E8%8C%8E%E5%BD%A2%E6%88%90/15566612?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (4, '块茎膨大期', 2, 'https://www.sohu.com/a/246775169_734701', NULL);
INSERT INTO `t_type` VALUES (5, '淀粉积累期', 2, 'https://zhidao.baidu.com/question/815252880801390452.html', NULL);
INSERT INTO `t_type` VALUES (6, '成熟收获期', 2, 'https://zhidao.baidu.com/question/256054926.html', NULL);
INSERT INTO `t_type` VALUES (7, '氮', 3, 'https://baike.baidu.com/item/%E6%B0%AE/457323?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (8, '磷', 3, 'https://baike.baidu.com/item/%E7%A3%B7/722011?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (9, '钾', 3, 'https://baike.baidu.com/item/%E9%92%BE/156200?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (10, '钙', 3, 'https://baike.baidu.com/item/%E9%92%99/720818?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (11, '镁', 3, 'https://baike.baidu.com/item/%E9%95%81/164735?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (12, '硫', 3, 'https://baike.baidu.com/item/%E7%A1%AB/721903?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (13, '晚疫病', 4, 'https://baike.baidu.com/item/%E6%99%9A%E7%96%AB%E7%97%85/235445?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (14, '粉痂病', 4, 'https://baike.baidu.com/item/%E9%A9%AC%E9%93%83%E8%96%AF%E7%B2%89%E7%97%82%E7%97%85/9381317?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (15, '黑胫病', 4, 'https://baike.baidu.com/item/%E9%BB%91%E8%83%AB%E7%97%85/333061?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (16, '疮痂病', 4, 'https://baike.baidu.com/item/%E7%96%AE%E7%97%82%E7%97%85/2274389?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (17, '干腐病', 4, 'https://baike.baidu.com/item/%E6%9E%AF%E8%90%8E%E7%97%85/7636148?fromtitle=%E5%B9%B2%E8%85%90%E7%97%85&fromid=6687848&fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (18, '软腐病', 4, 'https://baike.baidu.com/item/%E8%BD%AF%E8%85%90%E7%97%85/3629189?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (26, '其他', 7, 'https://zhidao.baidu.com/question/810586976486080972.html', NULL);
INSERT INTO `t_type` VALUES (27, '克新一号', 1, 'https://baike.baidu.com/item/%E5%85%8B%E6%96%B01%E5%8F%B7/6942549?fromtitle=%E5%85%8B%E6%96%B0%E4%B8%80%E5%8F%B7&fromid=7620700&fr=aladdin', '<div class=\"para\" style=\"font-size: 14px; overflow-wrap: break-word; color: #333333; margin-bottom: 15px; text-indent: 2em; line-height: 24px; zoom: 1; font-family: arial, 宋体, sans-serif; background-color: #ffffff;\">品种全称: 克新1号(克星1号）</div>\r\n<div class=\"para\" style=\"font-size: 14px; overflow-wrap: break-word; color: #333333; margin-bottom: 15px; text-indent: 2em; line-height: 24px; zoom: 1; font-family: arial, 宋体, sans-serif; background-color: #ffffff;\">主题关键词: 蔬菜 薯芋类&nbsp;<a style=\"color: #136ec2; text-decoration-line: none;\" href=\"https://baike.baidu.com/item/%E9%A9%AC%E9%93%83%E8%96%AF\" target=\"_blank\" rel=\"noopener\">马铃薯</a></div>\r\n<div class=\"para\" style=\"font-size: 14px; overflow-wrap: break-word; color: #333333; margin-bottom: 15px; text-indent: 2em; line-height: 24px; zoom: 1; font-family: arial, 宋体, sans-serif; background-color: #ffffff;\">品种来源：<br />　　黑龙江省农业科学院马铃薯研究所于1958年以374-128为母本、Epoka为父本，经有性杂交系统选育而成，原系谱号克5922-55。1967年经黑龙江省农作物品种审定委员会审定，在全省推广。1984年经全国农作物品种审定委员会审定为国家级品种，在全国推广。1987年获国家发明二等奖。</div>\r\n<div class=\"para\" style=\"font-size: 14px; overflow-wrap: break-word; color: #333333; margin-bottom: 15px; text-indent: 2em; line-height: 24px; zoom: 1; font-family: arial, 宋体, sans-serif; background-color: #ffffff;\">产量情况：丰产性好，亩产2000公斤左右。</div>\r\n<div class=\"para\" style=\"font-size: 14px; overflow-wrap: break-word; color: #333333; margin-bottom: 15px; text-indent: 2em; line-height: 24px; zoom: 1; font-family: arial, 宋体, sans-serif; background-color: #ffffff;\">特征特性：中熟，生育日数90天左右（由出苗到茎叶枯黄）。株型直立，株高70厘米左右。茎粗壮、绿色，复叶肥大、绿色。花淡紫色，有外重瓣，花药黄绿色，雌雄蕊均不育。块茎椭圆形，大而整齐，白皮白肉，表皮光滑，芽眼中等深。耐贮性中等，结薯集中。高抗环腐病，抗PVY和PLRV。较抗晚疫病，较耐涝,食味一般。淀粉含量13%，Vc含量14.4毫克/100克鲜薯，还原糖0.25%。</div>');
INSERT INTO `t_type` VALUES (28, '费乌瑞它', 1, 'https://baike.baidu.com/item/%E8%B4%B9%E4%B9%8C%E7%91%9E%E5%AE%83', NULL);
INSERT INTO `t_type` VALUES (29, '内薯七号', 1, 'https://baike.baidu.com/item/%E5%86%85%E8%96%AF%E4%B8%83%E5%8F%B7/5022403?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (30, '青薯九号', 1, 'https://baike.baidu.com/item/%E9%9D%92%E8%96%AF9%E5%8F%B7/6245149?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (31, '大西洋', 1, 'https://baike.baidu.com/item/%E5%A4%A7%E8%A5%BF%E6%B4%8B%EF%BC%88%E9%A9%AC%E9%93%83%E8%96%AF%EF%BC%89/17576112?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (32, '陇薯七号', 1, 'https://baike.baidu.com/item/%E9%99%87%E8%96%AF7%E5%8F%B7/5155791?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (33, '蚜虫', 6, 'https://baike.baidu.com/item/%E8%9A%9C%E8%99%AB/417019?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (34, '瓢虫', 6, 'https://baike.baidu.com/item/%E7%93%A2%E8%99%AB/416907?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (35, '潜叶蝇', 6, 'https://baike.baidu.com/item/%E6%BD%9C%E5%8F%B6%E8%9D%87/4172125?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (36, '蝼蛄', 6, 'https://baike.baidu.com/item/%E8%9D%BC%E8%9B%84/880645?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (37, '金针虫', 6, 'https://baike.baidu.com/item/%E9%87%91%E9%92%88%E8%99%AB/850922?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (38, '蛴螬', 6, 'https://baike.baidu.com/item/%E8%9B%B4%E8%9E%AC/825521?fr=aladdin', NULL);
INSERT INTO `t_type` VALUES (41, '马铃薯图片', 10, 'https://image.baidu.com/search/index?tn=baiduimage&ct=201326592&lm=-1&cl=2&ie=gb18030&word=%C2%ED%C1%E5%CA%ED%CD%BC%C6%AC&fr=ala&ala=1&alatpl=adress&pos=0&hs=2&xthttps=111111', NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nickname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `comefrom` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `introduction` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `profession` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `registerTime` datetime(0) NULL DEFAULT NULL,
  `status` int(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'zcm', '5', '土豆', '男', 'http://cdn.potatopic.top/face_default.jpg', '123456@qq.com', '内蒙古', 'lalalal', '程序员', '2020-09-24 21:00:00', 0);
INSERT INTO `t_user` VALUES (2, 'qwe', '456', '西瓜', '男', 'http://cdn.potatopic.top/face_default.jpg', '1235@qq.com', '内蒙古', '学生', '学生', '2020-09-25 07:04:57', 0);
INSERT INTO `t_user` VALUES (3, 'www', '19941013aoliao', '西红柿', '男', 'http://cdn.potatopic.top/face_default.jpg', '1236@qq.com', '内蒙古', '本人程序员一枚，爱好运动、编程，性别男，爱好女！！！', '学生', '2020-09-25 23:32:30', 0);
INSERT INTO `t_user` VALUES (4, 'zzz', '123456', '萝卜', '男', 'http://cdn.potatopic.top/face_default.jpg', '123@163.com', '内蒙古', '', '', '2020-10-26 23:57:56', 1);
INSERT INTO `t_user` VALUES (5, '123', '123456789', '菠萝', '男', 'http://cdn.potatopic.top/face_default.jpg', '123456@163.com', '内蒙古', '生活不容易，且行且珍惜', '码农', '2020-11-27 00:10:05', 0);
INSERT INTO `t_user` VALUES (6, 'gsj', '123456', '哈密瓜', '女', 'http://cdn.potatopic.top/face_default.jpg', '15148397450@qq.com', '内蒙古', '热情、大方、可爱', '学生', '2020-09-12 22:46:16', 0);
INSERT INTO `t_user` VALUES (7, '张三', '123', '小老虎', '男', 'http://localhost:8080/img/Avatar/default.jpg', '1@qq.com', '', '', '', '2020-09-11 14:55:59', 0);

SET FOREIGN_KEY_CHECKS = 1;
