package net.biancheng.c.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName Dept.java @Description TODO
 * @createTime 2022年07月25日 16:13:00
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
  private Integer deptNo;
  private String deptName;
  private String dbSource;
}
