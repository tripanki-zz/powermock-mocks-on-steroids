package com.gitshah.powermock;

import com.gitshah.powermock.com.gitshah.powermock.model.Employee;

/**
 * Created by Ankit Tripathi on 07-07-2014.
 * For further queries/suggestions please mail at ankittripathi0000@gmail.com.
 */
public class EmployeeService {

    public int getEmployeeCount() {
        return Employee.count();
    }

    public void saveEmployee(Employee employee) {
        if(employee.isNew()) {
            employee.create();
            return;
        }
        employee.update();
    }

    public boolean giveIncrementToAllEmployeesOf(int percentage) {
        try{
            Employee.giveIncrementOf(percentage);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

}
