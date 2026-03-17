# 架构说明

## 总体结构

- `frontend`: 管理后台前端
- `backend`: REST API 服务
- `db`: 数据库初始化与占位建表脚本
- `docs`: 说明文档

## 前后端约定

- 前端通过 `VITE_API_BASE_URL` 指向后端
- 后端统一挂载在 `/api`
- 当前阶段仅提供健康检查和登录占位接口

## 模块拆分

- `dashboard`
- `auth`
- `user`
- `patient`
- `appointment`
- `medical-record`
- `billing`

## 后续扩展建议

- 接入 Spring Security 和 JWT
- 为前端补充表格、表单、权限控制
- 为后端引入统一异常处理、审计字段和分页查询规范
