package net.biancheng.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yunshu.ly
 * @version 1.0.0
 * @ClassName MicroServiceCloudProviderDept8001Application.java
 * @Description Spring cloud Eureka 客户端，自动将本服务注册到 Eureka Server 注册中心中
 * @createTime 2022年07月25日 16:53:00
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudProviderDept8003Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderDept8003Application.class, args);
    }
}
