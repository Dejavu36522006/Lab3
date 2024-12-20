package model;

public class Master extends Vegetable {
    private boolean satisfied;

    public Master(int age, String name, Job job, boolean satisfied) {
        super(age, name, job);
        this.satisfied = satisfied;
    }

    public boolean isSatisfied() {
        return satisfied;
    }
    public void setSatisfied(boolean Fine){
        this.satisfied=Fine;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as a Master.");
    }
}