package com.lty.ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lty.ssm.mapper.EmployeeMapper;
import com.lty.ssm.pojo.Employee;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: LTY
 * @Date: 2022-09-27-17:51
 * @Description:
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {

        PageHelper.startPage(pageNum, 5);


        List<Employee> list = employeeMapper.getAllEmployee();

        //获取分页相关数据
        PageInfo<Employee> page = new PageInfo<>(list, 5);


        return page;
    }
}
