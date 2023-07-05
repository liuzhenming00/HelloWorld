package com.hspedu.mhl.service;

import com.hspedu.mhl.dao.EmployeeDAO;
import com.hspedu.mhl.domain.Employee;

public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    public Employee getEmployeeByIdAndPwd(String empId,String pwd){


        return employeeDAO.querySingle("select * from employee where empId=? and pwd = md5(?)",Employee.class,empId,pwd);
    }
}
