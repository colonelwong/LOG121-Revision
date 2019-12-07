package MethodTemplate;

public class MainMethodTemplate {

    public static void main(String[] args) {
        Drink coffee = new Coffee();
        Drink tea = new Tea();

        System.out.println("**************************************");
        System.out.println("HOW TO MAKE COFFEE");
        coffee.prepare();

        System.out.println("**************************************");
        System.out.println("HOW TO MAKE TEA");
        tea.prepare();
    }
}
