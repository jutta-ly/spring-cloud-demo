package net.biancheng.c.service;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptHystrixService.java @Description TODO
 * @createTime 2022年08月05日 09:57:00
 */
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(
    value = "MICROSERVICECLOUDPROVIDERDEPTHYSTRIX",
    fallback = DeptHystrixFallBackServiceImpl.class)
public interface DeptHystrixService {
  @RequestMapping(value = "/dept/hystrix/ok/{id}")
  public String deptInfoOk(@PathVariable("id") Integer id);

  @RequestMapping(value = "/dept/hystrix/timeout/{id}")
  public String deptInfoTimeout(@PathVariable("id") Integer id);
}
