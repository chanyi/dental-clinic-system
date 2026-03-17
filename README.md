# Dental Clinic System

牙医管理系统测试工程脚手架，采用单仓 monorepo 结构，包含 Vue 3 前端、Spring Boot 后端、MySQL 初始化脚本，以及 GitHub 协作模板。

## 技术栈

- Frontend: Vue 3, Vite, Vue Router, Pinia, TypeScript
- Backend: Spring Boot 3, Maven, Spring Data JPA
- Database: MySQL 8
- Tooling: GitHub Issues, Pull Request template, Project board

## 目录结构

```text
dental-clinic-system/
|-- frontend/
|-- backend/
|-- db/
|   `-- init/
|-- docs/
|-- .github/
|-- docker-compose.yml
`-- README.md
```

## 业务模块规划

- auth: 登录与认证占位
- user: 用户管理
- patient: 患者管理
- appointment: 预约管理
- medical-record: 病历管理
- billing: 收费管理
- dashboard: 仪表盘

## 环境要求

- Java 17+
- Node.js 18+
- npm 9+
- MySQL 8 或 Docker Desktop

当前机器仍是 Java 8 / Node 16，后端与较新的 Vite 脚手架在该环境下无法正常运行。开始联调前请先升级 Java 与 Node。

## 快速启动

### 1. 数据库

如果本机安装了 MySQL 8，可手动创建数据库后执行 `db/init` 下的脚本。

如果你安装了 Docker Desktop，可以在项目根目录运行：

```powershell
docker compose up -d
```

### 2. 启动前端

```powershell
cd frontend
npm install
npm run dev
```

默认地址：`http://localhost:5173`

### 3. 启动后端

```powershell
cd backend
mvn spring-boot:run
```

默认地址：`http://localhost:8080`

健康检查：`GET http://localhost:8080/api/health`

默认启动为无数据库占位模式，便于先验证骨架。连接 MySQL 时请显式启用 `mysql` profile：

```powershell
cd backend
mvn spring-boot:run -Dspring-boot.run.profiles=mysql
```

## 配置说明

- 前端 API 前缀环境变量：`VITE_API_BASE_URL`
- 后端统一 API 前缀：`/api`
- 默认数据库名：`dental_clinic`
- 示例数据库账号密码仅供本地开发使用，请在真实环境改成私有值

## GitHub 管理建议

- 仓库名：`dental-clinic-system`
- 项目看板列建议：`Backlog`、`Todo`、`In Progress`、`Done`
- 初始 Issues 建议：
  - 环境初始化
  - 前端骨架
  - 后端骨架
  - 数据库脚本
  - 文档与仓库规范

## 补充文档

- 项目说明：[docs/project-guide.md](docs/project-guide.md)
- 架构说明：[docs/architecture.md](docs/architecture.md)
- GitHub 管理建议：[docs/github-management.md](docs/github-management.md)
- 决策记录：[docs/decision-log.md](docs/decision-log.md)
- 工作记录：[docs/work-log.md](docs/work-log.md)
- 实施总结：[docs/implementation-summary.md](docs/implementation-summary.md)
- 截图归档 PDF：[docs/archive/conversation-screenshots-archive.pdf](docs/archive/conversation-screenshots-archive.pdf)
