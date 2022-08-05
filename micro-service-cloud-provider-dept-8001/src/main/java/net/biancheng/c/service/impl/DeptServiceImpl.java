package net.biancheng.c.service.impl;

import net.biancheng.c.entity.Dept;
import net.biancheng.c.mapper.DeptMapper;
import net.biancheng.c.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptServiceImpl.java @Description TODO
 * @createTime 2022年07月25日 16:50:00
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
  @Autowired private DeptMapper deptMapper;

  @Override
  public Dept get(Integer deptNo) {
    return deptMapper.selectByPrimaryKey(deptNo);
  }

  @Override
  public List<Dept> selectAll() {
    return deptMapper.getAll();
  }
}
