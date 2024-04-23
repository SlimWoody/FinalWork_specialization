import java.util.ArrayList;
import java.util.List;

// Абстрактный класс Животное
public abstract class Animal {
    protected String name;
    protected List<String> commands;

    public Animal(String name) {
        this.name = name;
        this.commands = new ArrayList<>();
    }

    public abstract void displayCommands();

    public void learnCommand(String command) {
        commands.add(command);
    }

    public String getName() {
        return name;
    }

    public List<String> getCommands() {
        return commands;
    }
}