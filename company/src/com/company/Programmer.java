package com.company;

public class Programmer extends Employee
{
    public Programmer(String gander, String name, int age, int id,int salary)
    {
        this.set_max_salary(30000);
        this.set_gander(gander);
        this.set_name(name);
        this.set_age(age);
        this.set_id(id);
        this.set_salary(salary);
    }
    public Programmer()
    {
        this.set_max_salary(30000);
        this.set_gander("unknown");
        this.set_name(" ");
        this.set_age(0);
        this.set_id(1000000000);
        this.set_salary(6000);

    }
    public Programmer(Programmer prog)
    {
        this.set_max_salary(30000);
        this.set_gander(prog.get_gander());
        this.set_name(prog.get_name());
        this.set_age(prog.get_age());
        this.set_id(prog.get_id());
        this.set_salary(prog.get_salary());
    }
    public String toString()
    {
        return " name:" + this.get_name() +
                " age:" + this.get_age() +
                " gander:" + this.get_gander() +
                " id:" + this.get_id() +
                " salary:" + this.get_salary();
    }
}
