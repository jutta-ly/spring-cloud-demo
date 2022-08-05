package net.biancheng.c.controller;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptControllerConsumer.java @Description TODO
 * @createTime 2022年08月04日 14:26:00
 */
import net.biancheng.c.entity.Dept;
import net.biancheng.c.service.DeptFeignService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptControllerConsumer {

  @Resource private DeptFeignService deptFeignService;

  @RequestMapping(value = "/consumer/dept/get/{id}")
  public Dept get(@PathVariable("id") Integer id) {
    return deptFeignService.get(id);
  }

  @RequestMapping(value = "/consumer/dept/list")
  public List<Dept> list() {
    return deptFeignService.list();
  }
  @RequestMapping(value = "/consumer/dept/feign/timeout")
  public String DeptFeignTimeout() {
    // openFeign-ribbon 客户端一般默认等待一秒钟，超过该时间就会报错
    return deptFeignService.DeptFeignTimeout();
  }
}
