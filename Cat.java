public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void displayCommands() {
        System.out.println("Команды для кошки " + name + ":");
        for (String command : commands) {
            System.out.println(command);
        }
    }
}