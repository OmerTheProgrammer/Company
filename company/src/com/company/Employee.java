package com.company;

public class Employee extends Parson
{
    private int salary;
    private int max_salary;

    public int get_salary() {return this.salary;}
    protected int get_max_salary() { return this.max_salary; }

    public void set_max_salary(int max_salary)
    {
        if (max_salary >= 6000) {this.max_salary = max_salary;}
    }
    public void set_salary(int salary) { if (salary >= 6000 && salary <= this.get_max_salary()) this.salary = salary;
        else this.salary = -1; }
}
