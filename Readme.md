# Sub-Datacenter

## 一、开发过程记录

- 2024-12-31 crate project：使用微服务架构SpringBoot、SpringCloud 技术栈，引用基础依赖（sub-frame-basic）

- 2025-03-15 define service： 搭建eureka服务(sub-registry-center)做注册中心，初步定义4个微服务（sub-asset-mange/sub-service-center/sub-data-work/sub-monitor-center）并注册到注册中心。

  - 各微服务职责说明

    - sub-asset-manage（资产管理）：数据资产维护（文件、库表、接口、其它），服务上下架/服务申请/需求申请审核，数据标签，数据资产检索。

    - sub-service-center（服务中心）：服务管理、调用、权限、日志、监控、告警。

    - sub-data-work（数据治理）：元数据管理、数据质检、数据血缘。

    - sub-monitor-center （监控中心）：数据运营监控中心，ELK

      