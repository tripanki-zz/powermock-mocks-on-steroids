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

    public void saveEmployee(Employee employee) { }

}
