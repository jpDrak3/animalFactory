public class Main {
    public static void main(String[] args) {
        //Initialize the Factory class
        Factory factory = new Factory();
        // Assign instances of AnimalFactory with new objects from the animal classes
        AnimalFactory animalFactory1 = factory.get("Kangaroo");
        animalFactory1.create();
        AnimalFactory animalFactory2 = factory.get("Cheetah");
        animalFactory2.create();
        AnimalFactory animalFactory3 = factory.get("Lion");
        animalFactory3.create();
    }
}
