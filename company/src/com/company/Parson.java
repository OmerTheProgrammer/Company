package com.company;

public class Parson extends Human
{
    private String name;
    private int id;

    public Parson(String gander,String name,String task, int age, int id)
    {
        this.set_task(task);
        this.set_gander(gander);
        this.set_name(name);
        this.set_age(age);
        this.set_id(id);
    }
    public Parson(String name, int age, int id)
    {
        this.set_task("none");
        this.set_gander("unknown");
        this.set_name(name);
        this.set_age(age);
        this.set_id(id);
    }
    public Parson(String gander, String name, int id)
    {
        this.set_task("none");
        this.set_gander(gander);
        this.set_name(name);
        this.set_age(0);
        this.set_id(id);
    }
    public Parson()
    {
        this.set_task("none");
        this.set_gander("unknown");
        this.set_name(" ");
        this.set_age(0);
        this.set_id(1000000000);
    }
    public Parson(Parson pars)
    {
        this.set_task(pars.get_task());
        this.set_gander(pars.get_gander());
        this.set_name(pars.get_name());
        this.set_age(pars.get_age());
        this.set_id(pars.get_id());
    }
    //קבלת name
    public void set_name(String name)
    {
        this.name = name;
    }
    //פליטת name
    public String get_name()
    {
        return this.name;
    }
    //קבלת id
    public void set_id(int id)
    {
        this.id = id;
    }
    //פליטת id
    public int get_id()
    {
        return this.id;
    }
    public String toString()
    {
        return " name:" + this.get_name() +
                " age:" + this.get_age() +
                " gander:" + this.get_gander() +
                " id:" + this.get_id();
    }
}
