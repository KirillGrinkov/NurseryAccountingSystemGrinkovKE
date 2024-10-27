package animals;
public class Cat extends Pets {
    private String breed;

    public Cat(String name, String birthDate, String[] commands, String breed) {
        super(name, birthDate, commands, "Cat");
        this.breed = breed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nBreed: " + breed;
    }
}
