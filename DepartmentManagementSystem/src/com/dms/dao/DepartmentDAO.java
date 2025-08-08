package com.dms.dao;

import com.dms.model.Department;
import java.util.List;

public interface DepartmentDAO {
    boolean addDepartment(Department dept);
    Department getDepartmentById(int id);
    List<Department> getAllDepartments();
    boolean updateDepartment(Department dept);
    boolean deleteDepartment(int id);
}