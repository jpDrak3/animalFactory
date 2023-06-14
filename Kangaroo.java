public class Kangaroo implements AnimalFactory {
    @Override
    public void create() {
        System.out.println("You've just created a kangaroo!");
    }
}
