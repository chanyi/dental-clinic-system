# 项目说明

## 项目定位

这是一个牙医管理系统测试工程，当前阶段的目标是先搭建前后端和数据库的基础骨架，方便后续逐步补充真实业务功能。

当前仓库提供的是：

- Vue 3 前端管理后台基础结构
- Spring Boot 后端基础接口和模块占位
- MySQL 初始化脚本占位
- GitHub 协作模板和项目管理建议

## 当前已完成内容

### 前端

- 已集成 `Vue 3`
- 已集成 `Vite`
- 已集成 `Vue Router`
- 已集成 `Pinia`
- 已预留以下页面：
  - 登录
  - 仪表盘
  - 患者管理
  - 预约管理
  - 病历管理
  - 收费管理
  - 用户管理

### 后端

- 已集成 `Spring Boot 3`
- 已集成 `Spring Data JPA`
- 已集成 `MySQL Driver`
- 已提供接口：
  - `GET /api/health`
  - `POST /api/auth/login`
- 已预留以下模块包结构：
  - `auth`
  - `user`
  - `patient`
  - `appointment`
  - `medicalrecord`
  - `billing`

### 数据库

- 已提供初始化脚本：
  - `db/init/001_create_database.sql`
  - `db/init/002_placeholder_tables.sql`
- 已预留占位表：
  - `users`
  - `patients`
  - `appointments`
  - `medical_records`
  - `billings`

## 启动说明

### 前端

```powershell
cd frontend
npm install
npm run dev
```

### 后端

无数据库占位模式启动：

```powershell
cd backend
mvn spring-boot:run
```

连接 MySQL 模式启动：

```powershell
cd backend
mvn spring-boot:run -Dspring-boot.run.profiles=mysql
```

### 健康检查

```text
GET /api/health
```

## 下一步建议

- 接入 Spring Security 和 JWT 登录
- 完成患者、预约、病历、收费的基础 CRUD
- 为前端增加表格、表单、筛选和详情页
- 为数据库补充真实业务字段和索引
- 增加统一异常处理、日志和权限模型

## 协作建议

- 开发前先在 GitHub Issue 中建任务
- 每次改动使用独立分支
- 合并前通过前后端基本验证
- 重要设计变更同步更新 `README` 和 `docs/`
