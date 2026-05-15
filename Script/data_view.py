import matplotlib.pyplot as plt

# 模拟报告中提到的非遗分类数据
labels = ['传统技艺', '传统美术', '民间文学', '传统医药']
sizes = [40, 30, 20, 10]

plt.figure(figsize=(8, 6))
plt.pie(sizes, labels=labels, autopct='%1.1f%%')
plt.title('非遗项目类别占比可视化')
plt.show()