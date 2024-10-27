package animals;

public class Pets extends Animal {
    private String type;

    public Pets(String name, String birthDate, String[] commands, String type) {
        super(name, birthDate, commands);
        this.type = type;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nType: " + type;
    }
}
