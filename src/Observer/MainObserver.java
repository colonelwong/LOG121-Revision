package Observer;

public class MainObserver {

    public static void main(String [] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(7231);
        ConcreteObserver anotherObserver = new ConcreteObserver(3218);

        concreteSubject.registerObserver(concreteObserver);
        concreteSubject.registerObserver(anotherObserver);

        while(concreteSubject.getState()) {
            concreteSubject.add();
        }

        System.out.println("\n************************");
        System.out.println("The program has finished");
        System.out.println("************************");
    }
}
