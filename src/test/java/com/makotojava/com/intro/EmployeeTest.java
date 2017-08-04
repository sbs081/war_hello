package com.makotojava.com.intro;

import java.util.logging.Logger;
import org.junit.Test;
/**
 * Created by aronwong on 8/4/17.
 */
public class EmployeeTest {
    @Test
    public void test() {
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
        l.info("Q: Employee1 == Employee2? A: " + (employee1 == employee2));
    }
}