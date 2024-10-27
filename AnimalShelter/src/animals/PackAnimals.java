package animals;
public class PackAnimals extends Animal {
    private int loadCapacity;

    public PackAnimals(String name, String birthDate, String[] commands, int loadCapacity) {
        super(name, birthDate, commands);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nLoad Capacity: " + loadCapacity;
    }
}
