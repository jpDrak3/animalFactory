public interface AnimalFactory {
    void create();
}

public class animal1 implements AnimalFactory {
    @Override
    public void create() {
        System.out.println("You've just created a cheetah!");
    }
}

public class animal2 implements AnimalFactory {
    @Override
    public void create() {
        System.out.println("You've just created a kangaroo!");
    }
}

public class animal3 implements AnimalFactory {
    @Override
    public void create() {
        System.out.println("You've just created a lion!");
    }
}
public class factory {
    public AnimalFactory get(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("Cheetah")) {
            return new animal1();
        } else if (type.equalsIgnoreCase("Kangaroo")) {
            return new animal2();
        } else if (type.equalsIgnoreCase("Lion")) {
            return new animal3();
        }
        return null;
    }
}
public class Animal {
    public static void main(String[] args) {
        factory factory = new factory();
        AnimalFactory animal1 = factory.get("Kangaroo");
        animal1.create();
        AnimalFactory animal2 = factory.get("Cheetah");
        animal2.create();
        AnimalFactory animal3 = factory.get("Lion");
        animal3.create();
    }
}