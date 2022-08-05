package net.biancheng.c.service;

import org.springframework.stereotype.Component;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptHystrixFallBackService.java @Description TODO
 * @createTime 2022年08月05日 10:25:00
 */
@Component
public class DeptHystrixFallBackServiceImpl implements DeptHystrixService {
  @Override
  public String deptInfoOk(Integer id) {
    return "--------------------C语言中文网提醒您，系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
  }

  @Override
  public String deptInfoTimeout(Integer id) {
    return "--------------------C语言中文网提醒您，系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
  }
}
