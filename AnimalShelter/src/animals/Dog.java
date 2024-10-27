package animals;
public class Dog extends Pets {
    private String breed;

    public Dog(String name, String birthDate, String[] commands, String breed) {
        super(name, birthDate, commands, "Dog");
        this.breed = breed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nBreed: " + breed;
    }
}
