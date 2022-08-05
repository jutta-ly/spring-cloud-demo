package net.biancheng.c;

/**
 * @author yunshu.ly
 * @version 1.0.0
 * @ClassName MicroServiceCloudConsumerDept80Application.java
 * @Description TODO
 * @createTime 2022年07月29日 13:45:00
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudConsumerDept80Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerDept80Application.class, args);
    }
}
