package net.biancheng.c;

/**
 * @author yunshu.ly
 * @version 1.0.0
 * @ClassName MicroServiceCloudGateway9527Application.java
 * @Description TODO
 * @createTime 2022年08月05日 15:20:00
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudGateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudGateway9527Application.class, args);
    }
}