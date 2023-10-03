import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize the Factory class
        Factory factory = new Factory();

        // Ask the user which animal to create
        System.out.println("Which animal would you like to create? (Kangaroo, Cheetah, Lion)");
        String choice = scanner.nextLine();

        // Create the selected animal
        AnimalFactory animalFactory = factory.get(choice);
        if (animalFactory != null) {
            animalFactory.create();
        } else {
            System.out.println("Invalid choice. Please choose from Kangaroo, Cheetah, or Lion.");
        }
    }
}
