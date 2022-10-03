package com.hr.personnel;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception{
     employee = new Employee("Julian",
        LocalDate.of(2022, 07, 05));
  }

  @Test
  public void getEmployeeInfo() {
    // arrange

    // act
    String employeeInfo = employee.getEmployeeInfo();

    // assert
    Assert.assertEquals("name = Julian, hireDate = 2022-07-05",
        employeeInfo);

    Assertions.assertThat(employeeInfo).isEqualTo("name = Julian, hireDate = 2022-07-05");
  }

  @Test
  public void work() {

    String work = employee.work();
    Assertions.assertThat(work).isEqualTo("Julian worked");
  }
}