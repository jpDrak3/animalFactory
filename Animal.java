public class Animal {
    public static void main(String[] args) {
        factory factory = new factory();
        AnimalFactory animalFactory1 = factory.get("Kangaroo");
        animalFactory1.create();
        AnimalFactory animalFactory2 = factory.get("Cheetah");
        animalFactory2.create();
        AnimalFactory animalFactory3 = factory.get("Lion");
        animalFactory3.create();
    }
}
