package com.makotojava.com.intro;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by aronwong on 8/4/17.
 */
public class EmployeeTest {
    @Test
    public void test() {
        try {
            int int1 = 1;
            int int2 = 1;
            Logger l = Logger.getLogger(EmployeeTest.class.getName());

            l.info("Q: int1 == int2?           A: " + (int1 == int2));
            Integer integer1 = Integer.valueOf(int1);
            Integer integer2 = Integer.valueOf(int2);
            l.info("Q: Integer1 == Integer2?   A: " + (integer1 == integer2));
            integer1 = new Integer(int1);
            integer2 = new Integer(int2);
            l.info("Q: Integer1 == Integer2?   A: " + (integer1 == integer2));
            Employee employee1 = new Employee("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
            Employee employee2 = new Employee("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
//        employee1.equals(employee2);
            Assert.assertEquals(employee1,employee2);
            l.info("Q: Employee1 == Employee2? A: " + (employee1 == employee2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void anotherTest() {
        Logger l = Logger.getLogger(Employee.class.getName());
        Integer integer1 = Integer.valueOf(1);
        Integer integer2 = Integer.valueOf(1);
        l.info("Q: integer1 == integer2 ? A: " + (integer1 == integer2));
        l.info("Q: integer1.equals(integer2) ? A: " + integer1.equals(integer2));
        integer1 = new Integer(integer1);
        integer2 = new Integer(integer2);
        l.info("Q: integer1 == integer2 ? A: " + (integer1 == integer2));
        l.info("Q: integer1.equals(integer2) ? A: " + integer1.equals(integer2));
        Employee employee1 = new Employee("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
        Employee employee2 = new Employee("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
        l.info("Q: employee1 == employee2 ? A: " + (employee1 == employee2));
        l.info("Q: employee1.equals(employee2) ? A : " + employee1.equals(employee2));
    }

    @Test
    public void yetAnotherTest() {
        Logger l = Logger.getLogger(Employee.class.getName());
        Employee employee1 = new Employee("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
        employee1.setFirstName("J Smith");
        Employee employee2 = new Employee("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
        employee2.setFirstName("J Smith");
        l.info("Q: employee1 == employee2?      A: " + (employee1 == employee2));
        l.info("Q: employee1.equals(employee2)? A: " + employee1.equals(employee2));
    }
}
