-- 创建数据库
CREATE DATABASE IF NOT EXISTS feiyi_db DEFAULT CHARACTER SET utf8mb4;
USE feiyi_db;

-- 1. 用户表
CREATE TABLE `users` (
                         `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
                         `username` VARCHAR(50) NOT NULL UNIQUE COMMENT '用户名',
                         `password` VARCHAR(255) NOT NULL COMMENT '密码',
                         `role` VARCHAR(20) DEFAULT 'USER' COMMENT '角色: USER, ADMIN, MERCHANT',
                         `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB COMMENT='用户表';

-- 2. 非遗项目表
CREATE TABLE `heritage_items` (
                                  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
                                  `title` VARCHAR(200) NOT NULL COMMENT '非遗标题',
                                  `category` VARCHAR(100) COMMENT '类别',
                                  `content` LONGTEXT COMMENT '详情内容',
                                  `image_url` VARCHAR(500) COMMENT '封面图',
                                  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB COMMENT='非遗项目表';