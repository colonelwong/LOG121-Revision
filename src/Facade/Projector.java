package Facade;

public class Projector {
    private DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void tvMode() {
        System.out.println("Projector is set to TV mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector is set to WideScreen mode");
    }

    public String toString() {
        return this.toString();
    }
}
