package com.lty.ssm.service;

import com.github.pagehelper.PageInfo;
import com.lty.ssm.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LTY
 * @Date: 2022-09-27-17:51
 * @Description:
 */
public interface EmployeeService {

    /**
     * 查询所有员工信息
     */

    List<Employee> getAllEmployee();


    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
