package Facade;

public class MainFacade {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector,
                theaterLights, screen, popcornPopper);

        System.out.println("********************************************************");
        homeTheaterFacade.watchMovie("Avengers");
        System.out.println("********************************************************");
        homeTheaterFacade.endMovie();

    }
}
