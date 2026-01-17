package com.company;

public class Developer extends Employee
{
    public Developer(String gander, String name, int age, int id,int salary)
    {
        this.set_max_salary(50000);
        this.set_gander(gander);
        this.set_name(name);
        this.set_age(age);
        this.set_id(id);
        this.set_salary(salary);
    }
    public Developer()
    {
        this.set_max_salary(50000);
        this.set_gander("unknown");
        this.set_name(" ");
        this.set_age(0);
        this.set_id(1000000000);
        this.set_salary(6000);

    }
    public Developer(Developer dev)
    {
        this.set_max_salary(50000);
        this.set_gander(dev.get_gander());
        this.set_name(dev.get_name());
        this.set_age(dev.get_age());
        this.set_id(dev.get_id());
        this.set_salary(dev.get_salary());
    }

    public String toString()
    {
        return " name: " + this.get_name() +
                "age:" + this.get_age() +
                " gander:" + this.get_gander() +
                " id:" + this.get_id() +
                " salary:" + this.get_salary();
    }
}
