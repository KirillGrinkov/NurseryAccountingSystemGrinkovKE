package animals;
public class Horse extends PackAnimals {
    private String breed;

    public Horse(String name, String birthDate, String[] commands, int loadCapacity, String breed) {
        super(name, birthDate, commands, loadCapacity);
        this.breed = breed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nBreed: " + breed;
    }
}
