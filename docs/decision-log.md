# 决策记录

## 2026-03-17 初始脚手架决策

### 仓库结构

- 采用单仓 `monorepo`
- 根目录统一管理 `frontend`、`backend`、`db`、`docs`
- 单独初始化独立 Git 仓库，并推送到 GitHub

### 技术栈

- 前端采用 `Vue 3 + Vite + Vue Router + Pinia + TypeScript`
- 后端采用 `Spring Boot 3 + Maven + Spring Data JPA`
- 数据库采用 `MySQL 8`

### 当前阶段目标

- 先搭建一个可扩展的测试工程空架子
- 不实现真实业务逻辑
- 预留登录、患者、预约、病历、收费、用户管理等模块

### 运行策略

- 后端默认使用无数据库占位模式，便于先验证骨架可运行
- 连接 MySQL 时通过 `mysql` profile 启动
- 前端通过 `VITE_API_BASE_URL` 访问后端

### 项目管理方式

- 使用 GitHub 仓库作为远程代码托管
- 使用 `README`、Issue 模板、PR 模板沉淀协作规范
- 推荐使用 GitHub Project 管理开发任务

## 2026-03-17 环境适配决策

- 由于本机默认环境为 `Java 8` 与 `Node 16`
- 工程实现仍按现代栈搭建
- 为本地验证临时引入便携版 `Java 17` 与 `Node 20`
- `.tools/` 和 `.m2/` 仅作为本地运行缓存，不纳入 Git 版本管理
