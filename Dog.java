public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void displayCommands() {
        System.out.println("Команды для собаки " + name + ":");
        for (String command : commands) {
            System.out.println(command);
        }
    }
}