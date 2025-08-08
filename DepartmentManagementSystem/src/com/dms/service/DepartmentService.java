package com.dms.service;

import com.dms.model.Department;
import java.util.List;

public interface DepartmentService {
    boolean addDepartment(Department dept);
    Department getDepartmentById(int id) throws Exception;
    List<Department> getAllDepartments();
    boolean updateDepartment(Department dept);
    boolean deleteDepartment(int id) throws Exception;
}
