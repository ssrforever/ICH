-- 如果表已存在则删除（方便你反复调试）
DROP TABLE IF EXISTS cultural_heritage;

-- 创建非遗项目表
CREATE TABLE cultural_heritage (
                                   id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                   name VARCHAR(100) NOT NULL,
                                   category VARCHAR(50),
                                   province VARCHAR(50),
                                   description TEXT,
                                   image_url VARCHAR(255),
                                   create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);