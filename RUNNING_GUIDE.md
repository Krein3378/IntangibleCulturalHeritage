# 🚀 项目运行指南

## 问题解决

### 已修复的问题
- ✅ Gradle版本兼容性问题
- ✅ 不安全协议问题
- ✅ Android SDK版本更新

### 修复内容
1. **Gradle版本**: 从8.9降级到7.6.1
2. **Android Gradle Plugin**: 从3.6.3升级到7.4.2
3. **SDK版本**: 从API 29升级到API 33
4. **镜像源**: 使用HTTPS协议

## 运行步骤

### 1. 在Android Studio中打开项目
1. 启动Android Studio
2. 选择 "Open an existing Android Studio project"
3. 选择 `IntangibleCulturalHeritage` 文件夹
4. 点击 "OK"

### 2. 等待项目同步
- Android Studio会自动开始Gradle同步
- 等待所有依赖下载完成
- 如果同步失败，点击工具栏的同步按钮（🔄）

### 3. 配置运行设备

#### 选项A: 使用模拟器
1. 点击工具栏的 "AVD Manager" 图标
2. 点击 "Create Virtual Device"
3. 选择设备（推荐Pixel 4或Pixel 5）
4. 选择系统镜像（推荐API 33）
5. 启动模拟器

#### 选项B: 使用真机
1. 启用开发者选项和USB调试
2. 连接手机到电脑
3. 在Android Studio中选择设备

### 4. 运行应用
1. 确保选择 `app` 模块
2. 点击绿色运行按钮（▶️）
3. 选择运行设备
4. 等待应用编译和安装

## 测试新功能

运行成功后，你可以测试：

### 🎨 启动页面
- 美化的渐变背景
- 应用Logo和标语

### 🏠 主页面
- 原有的10个文化分类功能
- 新增的3D、VR、AR、学习等功能入口

### 🎯 3D展示页面
- 点击"3D体验"进入
- 6个3D文化体验项目
- 现代化的卡片设计

### 📚 文化学习页面
- 点击"文化学习"进入
- 6个学习模块
- 评分系统

## 常见问题

### 问题1: 同步失败
**解决**: 
- 检查网络连接
- 点击同步按钮重试
- 清理项目：Build → Clean Project

### 问题2: 编译错误
**解决**:
- 确保所有模块都正确导入
- 检查Android SDK是否正确安装
- 确保API 33已下载

### 问题3: 运行时崩溃
**解决**:
- 查看Logcat日志
- 确保设备API版本符合要求（API 21+）

## 技术规格

- **最低支持**: Android 5.0 (API 21)
- **目标版本**: Android 13 (API 33)
- **Gradle版本**: 7.6.1
- **Android Gradle Plugin**: 7.4.2

## 项目结构

```
IntangibleCulturalHeritage/
├── app/                    # 主应用模块
├── framework/              # 框架模块（包含新增功能）
│   ├── threeD/            # 3D功能
│   └── learning/          # 学习功能
├── cultureengine/          # 文化引擎模块
├── utilcode/               # 工具代码模块
└── gradle/                 # Gradle配置
```

现在项目应该可以正常运行了！如果还有问题，请告诉我具体的错误信息。 