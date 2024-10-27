package animals;
public class Animal {
    private String name;
    private String birthDate;
    private String[] commands;

    public Animal(String name, String birthDate, String[] commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
    }

    public void addCommand(String command) {
        String[] newCommands = new String[this.commands.length + 1];
        System.arraycopy(this.commands, 0, newCommands, 0, this.commands.length);
        newCommands[this.commands.length] = command;
        this.commands = newCommands;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Name: ").append(name).append("\n");
        info.append("Birth Date: ").append(birthDate).append("\n");
        info.append("Commands: ");
        for (String command : commands) {
            info.append(command).append(" ");
        }
        return info.toString();
    }
}
