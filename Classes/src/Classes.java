public class Classes {
    public static void main(String[] args) {
        System.out.println("We've learning about Classes today!");

        Mammal someMammal = new Mammal();
        System.out.println(someMammal + " says " + someMammal.speak());

        Cat kitty = new Cat("Garfield");
        System.out.println(kitty.speak());

        Lion simba = new Lion("Simba");
        System.out.println(simba.speak());
    }
}