package com.dms.client;
import com.dms.model.Department;
import com.dms.service.DepartmentService;
import com.dms.service.DepartmentServiceImpl;

import java.util.*;

public class DepartmentClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepartmentService service = new DepartmentServiceImpl();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Department Management System =====");
            System.out.println("1. Add Department");
            System.out.println("2. Get Department by ID");
            System.out.println("3. Get All Departments");
            System.out.println("4. Update Department");
            System.out.println("5. Delete Department");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Department ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Department Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Location: ");
                    String location = scanner.nextLine();
                    Department newDept = new Department(id, name, location);
                    if (service.addDepartment(newDept)) {
                        System.out.println("Department added successfully.");
                    } else {
                        System.out.println("Failed to add department.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Department ID: ");
                    int searchId = scanner.nextInt();
                    try {
                        Department dept = service.getDepartmentById(searchId);
                        System.out.println(dept);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    List<Department> departments = service.getAllDepartments();
                    if (departments.isEmpty()) {
                        System.out.println("No departments found.");
                    } else {
                        for (Department d : departments) {
                            System.out.println(d);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Department ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Department Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Location: ");
                    String newLoc = scanner.nextLine();
                    Department updateDept = new Department(updateId, newName, newLoc);
                    if (service.updateDepartment(updateDept)) {
                        System.out.println("Department updated.");
                    } else {
                        System.out.println("Update failed. Check if the department exists.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Department ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    try {
                        if (service.deleteDepartment(deleteId)) {
                            System.out.println("Department deleted.");
                        } else {
                            System.out.println("Delete failed.");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the system.");
    }
}
