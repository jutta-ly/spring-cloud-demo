package net.biancheng.c.config;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName ConfigBean.java @Description TODO
 * @createTime 2022年08月04日 14:48:00
 */
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
  /** OpenFeign 日志增强 配置 OpenFeign 记录哪些内容 */
  @Bean
  Logger.Level feginLoggerLevel() {
    return Logger.Level.FULL;
  }
}
