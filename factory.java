public class factory {
    public AnimalFactory get(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("Cheetah")) {
            return new animalFactory1();
        } else if (type.equalsIgnoreCase("Kangaroo")) {
            return new animalFactory2();
        } else if (type.equalsIgnoreCase("Lion")) {
            return new animalFactory3();
        }
        return null;
    }
}
