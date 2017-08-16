package com.makotojava.com.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * Created by aronwong on 8/16/17.
 */
public class HumanResourcesApplication {
    private static final Logger log = Logger.getLogger(HumanResourcesApplication.class.getName());

    public static void main(String[] args) {
        Employee e = new Employee("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
        e.setFirstName("J Smith");
        e.setEmployeeNumber("0001");
        e.setTaxpayerIdentificationNumber("123-45-6789");
        e.setSalary(BigDecimal.valueOf(45000.0));
        e.printAudit(log);
    }
}
