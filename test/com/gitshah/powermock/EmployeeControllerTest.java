package com.gitshah.powermock;

import com.gitshah.powermock.com.gitshah.powermock.model.Employee;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

/**
 * Created by Ankit Tripathi on 07-07-2014.
 * For further queries/suggestions please mail at ankittripathi0000@gmail.com.
 */
public class EmployeeControllerTest {

    @Test
    public void shouldGetCountOfEmployees() {
        EmployeeService mock = PowerMockito.mock(EmployeeService.class);
        EmployeeController employeeController = new EmployeeController(mock);
        Employee employee = new Employee();

        employeeController.saveEmployee(employee);
        Mockito.verify(mock).saveEmployee(employee);
    }
}
