package Facade;

public class TheaterLights {
    private int intensity;

    public void on() {
        System.out.println("Lights are on");
    }

    public void off() {
        System.out.println("Lights are off");
    }

    public void dim(int intensity) {
        setIntensity(intensity);
        System.out.println("Lights are at " + getIntensity() + "% intensity");
    }

    public String toString() {
        return this.toString();
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
}
