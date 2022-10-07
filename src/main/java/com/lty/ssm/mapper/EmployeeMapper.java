package com.lty.ssm.mapper;

import com.lty.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: LTY
 * @Date: 2022-09-27-19:10
 * @Description:
 */
@Mapper
public interface EmployeeMapper {

    /**
     * 查询所有员工信息
     */
    List<Employee> getAllEmployee();
}
