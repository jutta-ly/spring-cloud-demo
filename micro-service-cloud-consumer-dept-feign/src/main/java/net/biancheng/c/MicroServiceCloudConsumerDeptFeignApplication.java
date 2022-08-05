package net.biancheng.c;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName MicroServiceCloudConsumerDeptFeignApplication.java @Description TODO
 * @createTime 2022年08月04日 14:27:00
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // 开启 OpenFeign 功能
@EnableHystrix // 启用 Hystrix
public class MicroServiceCloudConsumerDeptFeignApplication {
  public static void main(String[] args) {
    SpringApplication.run(MicroServiceCloudConsumerDeptFeignApplication.class, args);
  }
}
