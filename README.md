## Spring Cloud 

### 项目介绍
```
功能点：
    模拟支付包口碑，完整的购物流程、后端运营平台对前端业务的支撑，和对项目的运维，有各项的监控指标和运维指标。
技术点：
    
	数据库连接池：Alibaba Druid
	日志管理：Logback	前端框架：Vue全家桶以及相关组件
	三方服务： 邮件服务、阿里云短信服务、七牛云文件服务、钉钉机器人服务、高德地图API
	核心框架：springcloud Edgware全家桶
	安全框架：Spring Security Spring Cloud Oauth2
	分布式任务调度：elastic-job
	持久层框架：MyBatis、通用Mapper4、Mybatis_PageHelper
	
```
### 平台目录结构说明


```
├─nearEat----------------------------父项目，公共依赖
│  │
│  ├─paascloud-eureka--------------------------微服务注册中心
│  │
│  ├─paascloud-discovery-----------------------微服务配置中心
│  │
│  ├─paascloud-monitor-------------------------微服务监控中心
│  │
│  ├─paascloud-zipkin--------------------------微服务日志采集中心
│  │
│  ├─paascloud-gateway--------------------------微服务网关中心
│  │
│  ├─paascloud-provider
│  │  │
│  │  ├─paascloud-provider-mdc------------------数据服务中心
│  │  │
│  │  ├─paascloud-provider-omc------------------订单服务中心
│  │  │
│  │  ├─paascloud-provider-opc------------------对接服务中心
│  │  │
│  │  ├─paascloud-provider-tpc------------------任务服务中心
│  │  │
│  │  └─paascloud-provider-uac------------------用户服务中心
│  │
│  ├─paascloud-provider-api
│  │  │
│  │  ├─paascloud-provider-mdc-api------------------数据服务中心API
│  │  │
│  │  ├─paascloud-provider-omc-api------------------订单服务中心API
│  │  │
│  │  ├─paascloud-provider-opc-api------------------对接服务中心API
│  │  │
│  │  ├─paascloud-provider-tpc-api------------------任务服务中心API
│  │  │
│  │  ├─paascloud-provider-sdk-api------------------可靠消息服务API
│  │  │
│  │  └─paascloud-provider-uac-api------------------用户服务中心API
│  │
│  ├─paascloud-common
│  │  │
│  │  ├─paascloud-common-base------------------公共POJO基础包
│  │  │
│  │  ├─paascloud-common-config------------------公共配置包
│  │  │
│  │  ├─paascloud-common-core------------------微服务核心依赖包
│  │  │
│  │  ├─paascloud-common-util------------------公共工具包
│  │  │
│  │  ├─paascloud-common-zk------------------zookeeper配置
│  │  │
│  │  ├─paascloud-security-app------------------公共无状态安全认证
│  │  │
│  │  ├─paascloud-security-core------------------安全服务核心包
│  │  │
│  │  └─paascloud-security-feign------------------基于auth2的feign配置
│  │
│  ├─paascloud-generator
│  │  │
│  │  ├─paascloud-generator-mdc------------------数据服务中心Mybatis Generator
│  │  │
│  │  ├─paascloud-generator-omc------------------数据服务中心Mybatis Generator
│  │  │
│  │  ├─paascloud-generator-opc------------------数据服务中心Mybatis Generator
│  │  │
│  │  ├─paascloud-generator-tpc------------------数据服务中心Mybatis Generator
│  │  │
│  │  └─paascloud-generator-uac------------------数据服务中心Mybatis Generator












