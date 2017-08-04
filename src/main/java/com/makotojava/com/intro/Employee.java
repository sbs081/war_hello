package com.makotojava.com.intro;

import java.math.BigDecimal;

/**
 * Created by aronwong on 8/4/17.
 */
public class Employee extends Person {

    private String taxpayerIdentificationNumber;
    private String employeeNumber;
    private BigDecimal salary;

    public Employee(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
        super(firstName, lastName, age, height, weight, eyeColor, gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        //if (!taxpayerIdentificationNumber.equals(employee.taxpayerIdentificationNumber)) return false;
        //if (!employeeNumber.equals(employee.employeeNumber)) return false;
        return this.getFullname().equals(employee.getFullname());

    }

    @Override
    public int hashCode() {
        int result = taxpayerIdentificationNumber.hashCode();
        result = 31 * result + employeeNumber.hashCode();
        result = 31 * result + salary.hashCode();
        return result;
    }

    @Override
    public void printAudit(StringBuilder buffer) {
        super.printAudit(buffer);
        buffer.append("TaxpayerIdentificationNumber=");
        buffer.append(getTaxpayerIdentificationNumber());
        buffer.append(","); buffer.append("EmployeeNumber=");
        buffer.append(getEmployeeNumber());
        buffer.append(","); buffer.append("Salary=");
        buffer.append(getSalary().setScale(2).toPlainString());
    }

    public String getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}
