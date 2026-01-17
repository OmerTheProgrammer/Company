package com.company;

public class Human
{
    private String gander;
    private int age;
    private String task;

    public Human(String gander, int age,String task)
    {
        this.set_task(task);
        this.set_gander(gander);
        this.set_age(age);
    }
    public Human()
    {
        this.set_task("none");
        this.set_gander("unknown");
        this.set_age(0);
    }
    public Human(Human human)
    {
        this.set_task(human.get_task());
        this.set_gander(human.get_gander());
        this.set_age(human.get_age());
    }
    //פליטת gander
    public String get_gander()
    {
        return this.gander;
    }
    //gander קליטת
    public void set_gander(String gander)
    {
        if (gander.equals("male") || gander.equals("female") || gander.equals("unknown")) { this.gander = gander; }
        else
        {
            System.out.println("error");
            this.gander = "unknown";
        }
    }
    public int get_age()
    {
        return this.age;
    }
    public void set_age(int age)
    {
        this.age = age;
    }

    public String get_task()
    {
        return this.task;
    }
    public void set_task(String task)
    {
        this.task = task;
    }
    public String toString()
    {
        return  " age:" + this.get_age() + " gander:" + this.get_gander();
    }
}
