package com.hr.personnel;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception{
    employee = new Employee("sang", LocalDate.of(2020, 01, 03));
  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate(){


    Employee employee = new Employee("sang",
        LocalDate.of(2020, 01, 03));
    String employeeInfo = employee.getEmployeeInfo();
    Assert.assertEquals("name = sang, hireDate = 2020-01-03", employeeInfo);
    Assertions.assertThat(employeeInfo).isEqualTO("name = sang, hireDate = 2020-01-03");


  }
  @Test
  public void work_should_return_name_worked_string(){
    String work = employee.work();
    Assertions.assertThat(work).isEqualTO("sang worked");
  }

  private static class Assertions {

  }
}
