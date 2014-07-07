package com.gitshah.powermock;

/**
 * Created by Ankit Tripathi on 07-07-2014.
 * For further queries/suggestions please mail at ankittripathi0000@gmail.com.
 */
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public int getProjectedEmployeeCount() {
        final int actualEmployeeCount = employeeService.getEmployeeCount();
        return (int) Math.ceil(actualEmployeeCount * 1.2);
    }
}
