package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Animal> animalRegistry = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nAnimal Shelter Management System");
            System.out.println("1. Add a new animal");
            System.out.println("2. Show all animals");
            System.out.println("3. Show commands for an animal");
            System.out.println("4. Train an animal with a new command");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addNewAnimal();
                    break;
                case 2:
                    showAllAnimals();
                    break;
                case 3:
                    showAnimalCommands();
                    break;
                case 4:
                    trainAnimal();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the system.");
    }

    private static void addNewAnimal() {
        try {
            System.out.print("Enter animal type (Dog, Cat, Horse, Camel): ");
            String type = scanner.nextLine().toLowerCase();
    
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
    
            System.out.print("Enter birth date (YYYY-MM-DD): ");
            String birthDate = scanner.nextLine();
    
            System.out.print("Enter commands (comma-separated): ");
            String[] commands = scanner.nextLine().split(",");
    
            switch (type) {
                case "dog":
                    System.out.print("Enter breed: ");
                    String dogBreed = scanner.nextLine();
                    Dog dog = new Dog(name, birthDate, commands, dogBreed);
                    animalRegistry.add(dog);
                    break;
                case "cat":
                    System.out.print("Enter breed: ");
                    String catBreed = scanner.nextLine();
                    Cat cat = new Cat(name, birthDate, commands, catBreed);
                    animalRegistry.add(cat);
                    break;
                case "horse":
                    System.out.print("Enter load capacity: ");
                    int horseCapacity = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter breed: ");
                    String horseBreed = scanner.nextLine();
                    Horse horse = new Horse(name, birthDate, commands, horseCapacity, horseBreed);
                    animalRegistry.add(horse);
                    break;
                case "camel":
                    System.out.print("Enter load capacity: ");
                    int camelCapacity = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Camel camel = new Camel(name, birthDate, commands, camelCapacity);
                    animalRegistry.add(camel);
                    break;
                default:
                    System.out.println("Unknown animal type.");
                    return;
            }
            counter.add(); // Использовать глобальный счетчик
            System.out.println("Animal added successfully.");
        } catch (IllegalStateException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static void showAllAnimals() {
        if (animalRegistry.isEmpty()) {
            System.out.println("No animals in the registry.");
        } else {
            for (Animal animal : animalRegistry) {
                System.out.println(animal.getInfo());
                System.out.println("-----------");
            }
        }
    }

    private static void showAnimalCommands() {
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        Animal found = findAnimalByName(name);
        if (found != null) {
            System.out.println("Commands: " + found.getInfo());
        } else {
            System.out.println("Animal not found.");
        }
    }

    private static void trainAnimal() {
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        Animal found = findAnimalByName(name);
        if (found != null) {
            System.out.print("Enter new command: ");
            String newCommand = scanner.nextLine();
            found.addCommand(newCommand);
            System.out.println("Animal trained successfully.");
        } else {
            System.out.println("Animal not found.");
        }
    }

    private static Animal findAnimalByName(String name) {
        for (Animal animal : animalRegistry) {
            if (animal.getInfo().contains(name)) {
                return animal;
            }
        }
        return null;
    }

    private static Counter counter = new Counter();
}
