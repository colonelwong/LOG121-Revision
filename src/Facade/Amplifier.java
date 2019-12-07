package Facade;

public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private int volume = 0;

    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println("Amplifier connected to CDPlayer");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Amplifier connected to DVDPlayer");
    }

    public void setStereoSound() {
        System.out.println("Amplifier set to Stereo Sound");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier set to Surround Sound");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Amplifier connected to Tuner");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return this.toString();
    }
}
