public class Horse extends Livestock {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void displayCommands() {
        System.out.println("Команды для лошади " + name + ":");
        for (String command : commands) {
            System.out.println(command);
        }
    }
}