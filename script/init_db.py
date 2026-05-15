import mysql.connector

# 配置你的数据库连接
config = {
    'user': 'root',
    'password': 'Ljx083495#',
    'host': '127.0.0.1',
}

try:
    conn = mysql.connector.connect(**config)
    cursor = conn.cursor()
    # 创建数据库
    cursor.execute("CREATE DATABASE IF NOT EXISTS feiyi_db DEFAULT CHARACTER SET utf8mb4")
    print("数据库 feiyi_db 创建或检查成功！")
    cursor.close()
    conn.close()
except Exception as e:
    print(f"连接失败: {e}")
