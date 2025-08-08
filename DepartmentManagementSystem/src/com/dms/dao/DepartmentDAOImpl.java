package com.dms.dao;

import com.dms.model.Department;
import com.dms.util.DBConnectionUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {

    public boolean addDepartment(Department dept) {
        try (Connection conn = DBConnectionUtil.getConnection()) {
            String sql = "INSERT INTO department (deptId, deptName, location) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dept.getDeptId());
            ps.setString(2, dept.getDeptName());
            ps.setString(3, dept.getLocation());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Department getDepartmentById(int id) {
        Department dept = null;
        try (Connection conn = DBConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM department WHERE deptId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dept = new Department();
                dept.setDeptId(rs.getInt("deptId"));
                dept.setDeptName(rs.getString("deptName"));
                dept.setLocation(rs.getString("location"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dept;
    }

    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<>();
        try (Connection conn = DBConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM department";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Department dept = new Department();
                dept.setDeptId(rs.getInt("deptId"));
                dept.setDeptName(rs.getString("deptName"));
                dept.setLocation(rs.getString("location"));
                departments.add(dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }

    public boolean updateDepartment(Department dept) {
        try (Connection conn = DBConnectionUtil.getConnection()) {
            String sql = "UPDATE department SET deptName = ?, location = ? WHERE deptId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dept.getDeptName());
            ps.setString(2, dept.getLocation());
            ps.setInt(3, dept.getDeptId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteDepartment(int id) {
        try (Connection conn = DBConnectionUtil.getConnection()) {
            String sql = "DELETE FROM department WHERE deptId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}