# Spring Data Jdbc

一个简单的Spring Data Jdbc样例，集成mybatis扩展

Data Repository解决基本的CRUD操作，Mybatis Mapper则带来动态SQL的能力，但两者分开到两个接口定义，整合不尽人意。
网上有改进的[单一接口混合使用方案](https://github.com/neil4dong/spring-data-jdbc)，未深入研究。

Spring Data Jdbc，官方文档介绍支持[Querydsl Extension](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/#core.extensions.querydsl)，
实际测试未得到期望结果。

按文档的指引：

```java
interface UserRepository extends CrudRepository<User, Long>, QuerydslPredicateExecutor<User> {
}
```

报错：

```
JdbcRepositoryFactory does not support Querydsl!
```

由此引致Spring Data Web Support, Spring Data Rest未能充分试用

Spring Data Jdbc似乎还不完善，比不上JPA亮点的增值功能，连Mybatis Plus也有所不及，
只是方便应用在一些简单的查询场景，如集成ClickHouse，等待它的成熟。
