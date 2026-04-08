public abstract class AbstractAnimal implements Animal {

    private final String name;

    private final Color color;

    public AbstractAnimal(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    public final Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
