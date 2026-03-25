public class Cat extends AbstractAnimal {

    public Cat(String name, Color color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }



}
