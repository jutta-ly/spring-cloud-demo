package net.biancheng.c.service;

import net.biancheng.c.entity.Dept;

import java.util.List;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptService.java @Description TODO
 * @createTime 2022年07月25日 16:49:00
 */
public interface DeptService {
  /**
   * 根据deptNo获取部门详情
   *
   * @param deptNo
   * @return
   */
  Dept get(Integer deptNo);

  /**
   * 获取所有部门列表
   *
   * @return
   */
  List<Dept> selectAll();
}
