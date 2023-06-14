public class Cheetah implements AnimalFactory {
    @Override
    public void create() {
        System.out.println("You've just created a cheetah!");
    }
}
