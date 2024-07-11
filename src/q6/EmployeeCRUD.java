package q6;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
    private List<Employee> employees;

    public EmployeeCRUD() {
        this.employees = new ArrayList<>();
    }

    // Create operation: Add a new employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Read operation: Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Read operation: Get employee by ID
    public Employee getEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null; // If employee with given ID is not found
    }

    // Update operation: Update employee details
    public boolean updateEmployee(Employee updatedEmployee) {
        for (Employee emp : employees) {
            if (emp.getId() == updatedEmployee.getId()) {
                // Update name and department
                emp.setName(updatedEmployee.getName());
                emp.setDepartment(updatedEmployee.getDepartment());
                return true;
            }
        }
        return false; // If employee with given ID is not found
    }

    // Delete operation: Delete employee by ID
    public boolean deleteEmployee(int id) {
        Employee empToRemove = null;
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                empToRemove = emp;
                break;
            }
        }
        if (empToRemove != null) {
            employees.remove(empToRemove);
            return true;
        }
        return false; // If employee with given ID is not found
    }

    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        // Create operation: Add new employees
        employeeCRUD.addEmployee(new Employee(1, "Priyanka", "HR"));
        employeeCRUD.addEmployee(new Employee(2, "Lohitha", "IT"));
        employeeCRUD.addEmployee(new Employee(3, "Suresh", "Finance"));

        // Read operation: Get all employees
        List<Employee> allEmployees = employeeCRUD.getAllEmployees();
        System.out.println("All Employees:");
        for (Employee emp : allEmployees) {
            System.out.println(emp);
        }

        // Read operation: Get employee by ID
        Employee employeeById = employeeCRUD.getEmployeeById(2);
        if (employeeById != null) {
            System.out.println("\nEmployee with ID 2:");
            System.out.println(employeeById);
        } else {
            System.out.println("\nEmployee with ID 2 not found.");
        }

        // Update operation: Update employee details
        Employee updatedEmployee = new Employee(2, "Lohitha Kasula", "IT");
        boolean isUpdated = employeeCRUD.updateEmployee(updatedEmployee);
        if (isUpdated) {
            System.out.println("\nEmployee with ID 2 updated successfully.");
        } else {
            System.out.println("\nEmployee with ID 2 not found for update.");
        }

        // Delete operation: Delete employee by ID
        boolean isDeleted = employeeCRUD.deleteEmployee(3);
        if (isDeleted) {
            System.out.println("\nEmployee with ID 3 deleted successfully.");
        } else {
            System.out.println("\nEmployee with ID 3 not found for deletion.");
        }

        // Display all employees after operations
        System.out.println("\nAll Employees after operations:");
        for (Employee emp : employeeCRUD.getAllEmployees()) {
            System.out.println(emp);
        }
    }
}

