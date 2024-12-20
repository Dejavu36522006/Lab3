package model;

public class Cavalier extends Vegetable {
    private String mood;

    public Cavalier(int age, String name, Job job, String mood) {
        super(age, name, job);
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as a Cavalier in a " + mood + " mood.");
    }
}
