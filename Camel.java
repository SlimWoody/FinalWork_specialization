public class Camel extends Livestock {
    public Camel(String name) {
        super(name);
    }

    @Override
    public void displayCommands() {
        System.out.println("Команды для верблюда " + name + ":");
        for (String command : commands) {
            System.out.println(command);
        }
    }
}