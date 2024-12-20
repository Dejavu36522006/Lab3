package model;

public abstract class Vegetable {
    private int age;
    private String name;
    private Job job;

    public Vegetable(int age, String name, Job job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    public abstract void work();
}

