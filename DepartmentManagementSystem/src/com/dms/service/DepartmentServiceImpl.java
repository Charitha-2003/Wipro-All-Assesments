package com.dms.service;

import com.dms.dao.DepartmentDAO;
import com.dms.dao.DepartmentDAOImpl;
import com.dms.exception.DepartmentNotFoundException;
import com.dms.model.Department;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentDAO departmentDAO = new DepartmentDAOImpl();

    public boolean addDepartment(Department dept) {
        return departmentDAO.addDepartment(dept);
    }

    public Department getDepartmentById(int id) throws DepartmentNotFoundException {
        Department dept = departmentDAO.getDepartmentById(id);
        if (dept == null) {
            throw new DepartmentNotFoundException("Department with ID " + id + " not found");
        }
        return dept;
    }

    public List<Department> getAllDepartments() {
        return departmentDAO.getAllDepartments();
    }

    public boolean updateDepartment(Department dept) {
        return departmentDAO.updateDepartment(dept);
    }

    public boolean deleteDepartment(int id) throws DepartmentNotFoundException {
        Department dept = departmentDAO.getDepartmentById(id);
        if (dept == null) {
            throw new DepartmentNotFoundException("Department with ID " + id + " not found");
        }
        return departmentDAO.deleteDepartment(id);
    }
}