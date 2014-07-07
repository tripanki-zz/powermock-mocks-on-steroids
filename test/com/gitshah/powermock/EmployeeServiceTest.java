package com.gitshah.powermock;

import com.gitshah.powermock.com.gitshah.powermock.model.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Employee.class)
/*
    The @PrepareForTest is required when we want to mock final classes or classes with final,
    private, static, or native methods.
 */
public class EmployeeServiceTest {

    @Test
    public void testGetEmployeeCount() throws Exception {
        PowerMockito.mockStatic(Employee.class);
        // The above statement tells PowerMockito that we want to mock all the static methods of Employee class.
        PowerMockito.when(Employee.count()).thenReturn(900);
        EmployeeService employeeService = new EmployeeService();
        Assert.assertEquals(900, employeeService.getEmployeeCount());
    }

    @Test
    public void shouldReturnTrueWhenIncrementOf10PercentageIsGivenSuccessfully() {
        PowerMockito.mockStatic(Employee.class);
        PowerMockito.doNothing().when(Employee.class);

        Employee.giveIncrementOf(10);
        EmployeeService employeeService = new EmployeeService();
        Assert.assertTrue(employeeService.giveIncrementToAllEmployeesOf(10));
    }

    @Test
    public void shouldReturnFalseWhenIncrementOf10PercentageIsNotGivenSuccessfully() {
        PowerMockito.mockStatic(Employee.class);
        PowerMockito.doThrow(new IllegalStateException()).when(Employee.class);

        Employee.giveIncrementOf(10);
        EmployeeService employeeService = new EmployeeService();
        Assert.assertFalse(employeeService.giveIncrementToAllEmployeesOf(10));
    }

}