import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalRegistry {
    private Map<String, Animal> registry;
    private int animalCounter;

    public AnimalRegistry() {
        this.registry = new HashMap<>();
        this.animalCounter = 0;
    }

    public void addAnimal(Animal animal) {
        registry.put(animal.getName(), animal);
        animalCounter++;
    }

    public void displayCommands(String animalName) {
        Animal animal = registry.get(animalName);
        if (animal != null) {
            animal.displayCommands();
        } else {
            System.out.println("Животное с именем " + animalName + " не найдено.");
        }
    }

    public void teachCommand(String animalName, String command) {
        Animal animal = registry.get(animalName);
        if (animal != null) {
            animal.learnCommand(command);
        } else {
            System.out.println("Животное с именем " + animalName + " не найдено.");
        }
    }

    public void displayAnimalCount() {
        System.out.println("Общее количество животных: " + animalCounter);
    }

    public void displayAllDogs() {
        System.out.println("\nСписок всех собак:");
        for (Animal animal : registry.values()) {
            if (animal instanceof Dog) {
                System.out.println(animal.getName());
            }
        }
    }

    public void displayAllCats() {
        System.out.println("\nСписок всех кошек:");
        for (Animal animal : registry.values()) {
            if (animal instanceof Cat) {
                System.out.println(animal.getName());
            }
        }
    }

    public void displayAllHamsters() {
        System.out.println("\nСписок всех хомяков:");
        for (Animal animal : registry.values()) {
            if (animal instanceof Hamster) {
                System.out.println(animal.getName());
            }
        }
    }

    public void displayAllHorse() {
        System.out.println("\nСписок всех лошадей:");
        for (Animal animal : registry.values()) {
            if (animal instanceof Horse) {
                System.out.println(animal.getName());
            }
        }
    }

    public void displayAllCamel() {
        System.out.println("\nСписок всех верблюдов:");
        for (Animal animal : registry.values()) {
            if (animal instanceof Camel) {
                System.out.println(animal.getName());
            }
        }
    }

    public void displayAllDonkey() {
        System.out.println("\nСписок всех ослов:");
        for (Animal animal : registry.values()) {
            if (animal instanceof Donkey) {
                System.out.println(animal.getName());
            }
        }
    }

    public void displayAllPets() {
        System.out.println("Список всех домашних животных:");
        for (Animal animal : registry.values()) {
            if (animal instanceof Pet) {
                System.out.println(animal.getName());
            }
        }
    }

    public void displayAllLivestock() {
        System.out.println("Список всех вьючных животных:");
        for (Animal animal : registry.values()) {
            if (animal instanceof Livestock) {
                System.out.println(animal.getName());
            }
        }
    }

    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Вывести список команд животного");
            System.out.println("3. Обучить новую команду животному");
            System.out.println("4. Вывести общее количество животных");
            System.out.println("5. Вывести всех домашних животных");
            System.out.println("6. Вывести всех собак");
            System.out.println("7. Вывести всех кошек");
            System.out.println("8. Вывести всех хомяков");
            System.out.println("9. Вывести всех вьючных животных");
            System.out.println("10. Вывести всех лошадей");
            System.out.println("11. Вывести всех верблюдов");
            System.out.println("12. Вывести всех ослов");
            System.out.println("13. Выйти из программы");
            System.out.print("Выберите действие (1-13): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // считывание символа новой строки после числа

            switch (choice) {
                case 1:
                    System.out.print("Введите имя животного: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите тип животного (1.домашнее/ 2.вьючное): ");
                    String type = scanner.nextLine();
                    if ("1".equalsIgnoreCase(type)) {
                        System.out.print("Введите вид животного (1.собака/2.кошка/3.хомяк): ");
                        String petType = scanner.nextLine();
                        switch (petType.toLowerCase()) {
                            case "1":
                                registry.addAnimal(new Dog(name));
                                break;
                            case "2":
                                registry.addAnimal(new Cat(name));
                                break;
                            case "3":
                                registry.addAnimal(new Hamster(name));
                                break;
                            default:
                                System.out.println("Вид животного не распознан.");
                        }
                    } else if ("2".equalsIgnoreCase(type)) {
                        System.out.print("Введите вид животного (1.лошадь/2.верблюд/3.осел): ");
                        String livestockType = scanner.nextLine();
                        switch (livestockType.toLowerCase()) {
                            case "1":
                                registry.addAnimal(new Horse(name));
                                break;
                            case "2":
                                registry.addAnimal(new Camel(name));
                                break;
                            case "3":
                                registry.addAnimal(new Donkey(name));
                                break;
                            default:
                                System.out.println("Вид животного не распознан.");
                        }
                    } else {
                        System.out.println("Тип животного не распознан.");
                    }
                    break;
                case 2:
                    System.out.print("Введите имя животного: ");
                    String animalName = scanner.nextLine();
                    registry.displayCommands(animalName);
                    break;
                case 3:
                    System.out.print("Введите имя животного: ");
                    String animalNameForTeach = scanner.nextLine();
                    System.out.print("Введите новую команду для обучения: ");
                    String newCommand = scanner.nextLine();
                    registry.teachCommand(animalNameForTeach, newCommand);
                    break;
                case 4:
                    registry.displayAnimalCount();
                    break;
                case 5:
                    registry.displayAllPets();
                    break;
                case 6:
                    registry.displayAllDogs();
                    break;
                case 7:
                    registry.displayAllCats();
                    break;
                case 8:
                    registry.displayAllHamsters();
                    break;
                case 9:
                    registry.displayAllLivestock();
                    break;
                case 10:
                    registry.displayAllHorse();
                    break;
                case 11:
                    registry.displayAllCamel();
                    break;
                case 12:
                    registry.displayAllDonkey();
                    break;
                case 13:
                    exit = true;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
        }

        scanner.close();
    }
}