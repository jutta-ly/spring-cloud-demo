package net.biancheng.c.service;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptService.java @Description TODO
 * @createTime 2022年08月04日 15:51:00
 */
public interface DeptService {
  /**
   * hystrix 熔断器示例 ok
   *
   * @param id
   * @return
   */
  String deptInfoOk(Integer id);

  /**
   * hystrix 熔断器超时案例
   *
   * @param id
   * @return
   */
  String deptInfoTimeout(Integer id);
}
