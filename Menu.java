import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalRegistry animalRegistry = new AnimalRegistry();

        try (Counter counter = new Counter()) {
            while (true) {
                System.out.println("Выберите действие:");
                System.out.println("1. Добавить новое животное");
                System.out.println("2. Просмотреть список домашних животных");
                System.out.println("3. Просмотреть список вьючных животных");
                System.out.println("4. Добавить новую команду для животного");
                System.out.println("5. Выйти");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Чтение символа новой строки после ввода числа

                switch (choice) {
                    case 1:
                        System.out.println("Введите имя животного:");
                        String name = scanner.nextLine();
                        System.out.println("Введите команду, которую выполняет животное:");
                        String command = scanner.nextLine();
                        System.out.println("Введите дату рождения животного (гггг-мм-дд):");
                        String birthDate = scanner.nextLine();
                        System.out.println("Введите тип животного (Домашнее или Вьючное):");
                        String type = scanner.nextLine();
                        if (Objects.equals(type, "Домашнее")){
                            System.out.println("Введите вид животного (Кошка, Собака, Хомяк или свой): ");
                        } else if (Objects.equals(type, "Вьючное")){
                            System.out.println("Введите вид животного (Осел, Лошадь, Верблюд или свой): ");
                        } else{
                            System.out.println("Введите вид животного неизвестного типа: ");
                        }
                        String species = scanner.nextLine();
                        animalRegistry.addAnimal(name, command, birthDate, type, species);
                        System.out.println("Животное успешно добавлено в реестр.");
                        break;
                    case 2:
                        animalRegistry.printDomesticAnimals();
                        break;

                    case 3:
                        animalRegistry.printDraughtAnimals();
                        break;
                    case 4:
                        System.out.println("Введите имя животного, для которого нужно добавить команду:");
                        String animalName = scanner.nextLine();
                        System.out.println("Введите новую команду для животного:");
                        String newCommand = scanner.nextLine();
                        // Код для добавления новой команды для животного
                        animalRegistry.addCommandToAnimal(animalName, newCommand);
                        System.out.println("Новая команда успешно добавлена.");
                        break;

                    case 5:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Некорректный выбор. Попробуйте ещё раз.");
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Выведет ошибку, если Счетчик был использован неправильно
        }
    }
}