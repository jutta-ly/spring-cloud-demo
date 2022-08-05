package net.biancheng.c.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import net.biancheng.c.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptServiceImpl.java @Description TODO
 * @createTime 2022年08月04日 15:52:00
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
  @Override
  public String deptInfoOk(Integer id) {
    return "线程池：" + Thread.currentThread().getName() + "  deptInfo_Ok,id:   " + id;
  }

  // 一旦该方法失败并抛出了异常信息后，会自动调用  @HystrixCommand 注解标注的 fallbackMethod 指定的方法
  @HystrixCommand(
      fallbackMethod = "dept_TimeoutHandler",
      commandProperties =
      // 规定 5 秒钟以内就不报错，正常运行，超过 5 秒就报错，调用指定的方法
      {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
  @Override
  public String deptInfoTimeout(Integer id) {
    int outTime = 3;
    try {
      TimeUnit.SECONDS.sleep(outTime);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "线程池："
        + Thread.currentThread().getName()
        + "  deptInfo_Timeout,id:   "
        + id
        + "  耗时: "
        + outTime;
  }
  // 当服务出现故障后，调用该方法给出友好提示
  public String dept_TimeoutHandler(Integer id) {
    return "C语言中文网提醒您，系统繁忙请稍后再试！"
        + "线程池："
        + Thread.currentThread().getName()
        + "  deptInfo_Timeout,id:   "
        + id;
  }
}
