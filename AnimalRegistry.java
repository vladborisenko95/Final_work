import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> domesticAnimals;
    private List<Animal> draughtAnimals;

    public AnimalRegistry() {
        domesticAnimals = new ArrayList<>();
        draughtAnimals = new ArrayList<>();
    }

    public void addAnimal(String name, String command, String birthDate, String type, String species) {
        Animal animal = new Animal(name, command, birthDate);
        if ("Домашнее".equals(type)) {
            animal.setType("Домашнее");
            animal.setSpecies(species);
            domesticAnimals.add(animal);
        } else if ("Вьючное".equals(type)) {
            animal.setType("Вьючное");
            animal.setSpecies(species);
            draughtAnimals.add(animal);
        } else {
            System.out.println("Ошибка: Некорректный тип животного.");
        }
    }

    public void printDomesticAnimals() {
        System.out.println("Домашние животные:");
        for (Animal animal : domesticAnimals) {
            animal.printDetails();
        }
    }

    public void printDraughtAnimals() {
        System.out.println("Вьючные животные:");
        for (Animal animal : draughtAnimals) {
            animal.printDetails();
        }
    }

    public void addCommandToAnimal(String animalName, String newCommand) {
        boolean found = false;
        for (Animal animal : domesticAnimals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                animal.getCommands().add(newCommand);
                found = true;
                break;
            }
        }

        if (!found) {
            for (Animal animal : draughtAnimals) {
                if (animal.getName().equalsIgnoreCase(animalName)) {
                    animal.getCommands().add(newCommand);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Животное с именем '" + animalName + "' не найдено.");
        }
    }
}