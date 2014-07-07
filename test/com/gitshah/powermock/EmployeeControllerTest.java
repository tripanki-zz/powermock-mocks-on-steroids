package com.gitshah.powermock;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by Ankit Tripathi on 07-07-2014.
 * For further queries/suggestions please mail at ankittripathi0000@gmail.com.
 */
public class EmployeeControllerTest {
    @Test
    public void shouldGetCountOfEmployees() {
        EmployeeController employeeController = new EmployeeController(new EmployeeService());
        assertEquals(10, employeeController.getProjectedEmployeeCount());
    }
}
