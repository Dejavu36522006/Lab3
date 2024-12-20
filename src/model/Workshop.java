package model;

import java.util.ArrayList;

public class Workshop {
    private ArrayList<Vegetable> workers;
    private ArrayList<Vegetable> visitors;

    public Workshop() {
        this.workers = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    public int getNumberOfWorkers() {
        return workers.size();
    }

    public int getNumberOfVisitors() {
        return visitors.size();
    }
    public void newVisitor(Vegetable New){
        this.visitors.add(New);
    }
    public void newWorker(Vegetable New){
        this.workers.add(New);
    }

    public boolean areFliesThere() {
        return !visitors.isEmpty();
    }

    public boolean isWorkshopWorking() {
        return !workers.isEmpty();
    }

}