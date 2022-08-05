package net.biancheng.c.mapper;

import net.biancheng.c.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptMapper.java @Description TODO
 * @createTime 2022年07月25日 16:41:00
 */
@Mapper
public interface DeptMapper {
  /**
   * 根据主键获取数据
   *
   * @param deptNo
   * @return Dept
   */
  Dept selectByPrimaryKey(@Param("deptNo") Integer deptNo);

  /**
   * 获取表中的全部数据
   *
   * @return
   */
  List<Dept> getAll();
}
