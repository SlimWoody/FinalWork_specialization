public class Donkey extends Livestock {
    public Donkey(String name) {
        super(name);
    }

    @Override
    public void displayCommands() {
        System.out.println("Команды для осла " + name + ":");
        for (String command : commands) {
            System.out.println(command);
        }
    }
}