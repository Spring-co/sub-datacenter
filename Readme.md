# Sub-Datacenter

## 一、开发过程记录

- 2024-12-31 crate project：使用微服务架构SpringBoot、SpringCloud 技术栈，引用基础依赖（sub-frame-basic）

- 2025-03-15 define service： 搭建eureka服务(sub-registry-center)做注册中心，初步定义4个微服务（sub-asset-mange/sub-service-center/sub-data-work/sub-monitor-center）并注册到注册中心。

### SpringCloud 微服务环境搭建配置
#### 注册中心-Eureka
- 服务搭建：sub-register-center
- 依赖引入：引入基础框架包中的SpringCloud中的eureka-server
- 环境配置：服务端基础配置
- 安全认证 ：通过 Spring Security 为 Eureka Server 添加登录认证，保护管理界面和 API 接口。
- 客户端：eureka.client.service-url.defaultZone: http://admin:123456@peer1:8761/eureka/

#### 统一网关-Gateway
- 服务搭建：sub-unified-gateway
- 依赖引入：引入gateway、eureka-client
- 环境配置：gateway、eureka-client
- 网关路由配置：配置各个服务的路由转发
- 过滤器配置、全局跨域处理。

#### 公共依赖模块搭建
- 模块搭建：公共基础类、FeignClient
- 依赖引入：feign、断路器、



### 应用服务搭建配置初始化
  - 各微服务职责说明

    - sub-asset-manage（资产管理）：数据资产维护（文件、库表、接口、其它），服务上下架/服务申请/需求申请审核，数据标签，数据资产检索。

    - sub-service-center（服务中心）：服务管理、调用、权限、日志、监控、告警。

    - sub-data-work（数据治理）：元数据管理、数据质检、数据血缘。

    - sub-monitor-center （监控中心）：数据运营监控中心，ELK

    - sue-data-map （数据地图）：全文检索模块

      