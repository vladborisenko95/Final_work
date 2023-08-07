// Класс Main для тестирования кода
public class Main {
    public static void main(String[] args) {
        DomesticAnimal dog = new DomesticAnimal("Бадди", "Сидеть", "2020-05-15", "Джон", "cобака");
        DraughtAnimal horse = new DraughtAnimal("Рокки", "Тянуть повозку", "2018-08-25", "Тяга повозки", "лошадь");

        System.out.println("Информация о домашнем животном:");
        dog.printDetails();

        System.out.println("\nИнформация о вьючном животном:");
        horse.printDetails();
    }
}