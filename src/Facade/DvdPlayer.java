package Facade;

public class DvdPlayer {
    private Amplifier amplifier;
    private String movie = "";
    private boolean playing = false;

    public void on() {
        System.out.println("DVDPlayer is on");
    }

    public void off() {
        System.out.println("DVDPlayer is off");
    }

    public void eject() {
        System.out.println("DVDPlayer eject");
    }

    public void play(String movie) {
        setMovie(movie);
        playing = true;
        System.out.println("DVDPlayer started movie: " + getMovie());
    }

    public void play() {
        playing = true;
        System.out.println("DVDPlayer resumed movie");
    }

    public void pause() {
        playing = false;
        System.out.println("DVDPlayer paused movie");
    }

    public void setSurroundAudio() {
        System.out.println("DVDPlayer is on Surround Audio");
    }

    public void setTwoChannelAudio() {
        System.out.println("DVDPlayer is on Two Channel Audio");
    }

    public void stop() {
        setMovie("");
        playing = false;
        System.out.println("DVDPlayer stopped movie");
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String toString() {
        return this.toString();
    }
}
