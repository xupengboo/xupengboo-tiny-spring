# spring-beans

**spring-beans 模块是 Spring 框架的核心之一，负责提供对 Bean 的支持，包括 Bean 的定义、创建、管理以及与依赖注入相关的功能**。

以下是 spring-beans 模块的一些主要功能：

- BeanDefinition 接口：用于描述 Spring 容器中的 Bean。包含了 Bean 的各种元数据信息，如类名、作用域、构造函数参数、属性等。

- BeanFactory 接口：定义了从容器中获取 Bean 的各种方法，如通过 Bean 的名称、类型等。

- ApplicationContext 接口：ApplicationContext 是 BeanFactory 的子接口，提供了更丰富的功能，包括事件发布、国际化支持、AOP 等。ApplicationContext 在 spring-beans 模块中定义了许多与应用上下文相关的类和接口。

- FactoryBean 接口：允许用户定义自己的 Bean 工厂，通过实现 FactoryBean 接口，可以自定义 Bean 的创建逻辑。

- 依赖注入（DI）：通过构造函数注入、Setter 方法注入以及字段注入等方式，spring-beans 实现了将 Bean 之间的依赖关系自动管理的功能。







Bean 的作用域管理：

- spring-beans 模块定义了 Bean 的作用域（Scope）的概念，例如 Singleton、Prototype 等。这通过 Scope 接口和相应的实现类来实现。

Bean 的生命周期管理：

- spring-beans 模块包含了与 Bean 生命周期相关的功能，例如初始化方法、销毁方法等。这通过 InitializingBean 和 DisposableBean 接口、@PostConstruct 和 @PreDestroy 注解以及配置文件中的 init-method 和 destroy-method 属性来实现。
