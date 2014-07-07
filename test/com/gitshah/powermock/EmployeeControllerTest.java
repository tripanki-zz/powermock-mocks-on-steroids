package com.gitshah.powermock;

import org.junit.Assert;
import org.junit.Test;
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

        PowerMockito.when(mock.getEmployeeCount()).thenReturn(8);

        Assert.assertEquals(10, employeeController.getProjectedEmployeeCount());
    }
}
