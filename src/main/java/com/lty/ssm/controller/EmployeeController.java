package com.lty.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.lty.ssm.pojo.Employee;
import com.lty.ssm.service.EmployeeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: LTY
 * @Date: 2022-09-27-17:41
 * @Description:
 * 根据查询所有员工信息
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/page/{pageNum}")
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        //获取员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);

        //将分页数据共享到请求页中
        model.addAttribute("page", page);

        return "employee_list";

    }

    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        List<Employee> list = employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("list",list);
        //跳转页面
        return "employee_list";
    }
}
