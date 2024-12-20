package model;

import java.util.ArrayList;

public class Student extends Vegetable {
    private ArrayList<Vegetable> acquaintances;
    public Student(int age, String name, Job job) {
        super(age, name, job);
        this.acquaintances = new ArrayList<>();
    }
    public void newAcquaintances(Vegetable newAcquaintances) {
        this.acquaintances.add(newAcquaintances);
    }
    public int getNumberOfnewAcquaintances() {
        return acquaintances.size();
    }

    @Override
    public void work() {
        System.out.println(getName() + " is studying.");
    }
}