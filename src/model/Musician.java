package model;

public class Musician extends Vegetable implements Music {
    private boolean hasInstrument;

    public Musician(int age, String name, Job job, boolean hasInstrument) {
        super(age, name, job);
        this.hasInstrument = hasInstrument;
    }

    public boolean hasInstrument() {
        return hasInstrument;
    }
    public void setInstrument(MusicanInstrument violin){
            this.hasInstrument=true;
    }
    @Override
    public void work() {
        if (!hasInstrument) {
            throw new MusicianDoesntHoldAnInstrument("Musician doesn't hold an instrument!");
        }
        System.out.println(getName() + " is playing music.");
    }

    @Override
    public void play() {
        System.out.println("Playing a beautiful tune.");
    }
}