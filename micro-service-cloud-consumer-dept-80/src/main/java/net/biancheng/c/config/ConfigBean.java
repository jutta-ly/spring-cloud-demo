package net.biancheng.c.config;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName ConfigBean.java @Description TODO
 * @createTime 2022年07月29日 13:41:00
 */
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/** 配置类注解 */
@Configuration
public class ConfigBean {

  @Bean // 将 RestTemplate 注入到容器中
  @LoadBalanced // 在客户端使用 RestTemplate 请求服务端时，开启负载均衡（Ribbon）
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  @Bean
  public IRule myRule() {
    // RandomRule 为随机策略
    return new RandomRule();
  }
}
