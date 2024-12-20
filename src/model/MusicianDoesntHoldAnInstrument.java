package model;

public class MusicianDoesntHoldAnInstrument extends RuntimeException {
    public MusicianDoesntHoldAnInstrument(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
