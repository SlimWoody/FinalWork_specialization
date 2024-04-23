public class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void displayCommands() {
        System.out.println("Команды для хомяка " + name + ":");
        for (String command : commands) {
            System.out.println(command);
        }
    }
}