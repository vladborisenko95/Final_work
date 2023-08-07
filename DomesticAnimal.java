// Класс DomesticAnimal (Дочерний класс Animal)
public class DomesticAnimal extends Animal {
    private String owner;
    private String type;

    // Конструктор
    public DomesticAnimal(String name, String command, String birthDate, String owner, String type) {
        super(name, command, birthDate);
        this.owner = owner;
        this.type = type;
    }

    // Геттер и Сеттер для owner
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Переопределение метода printDetails() для добавления информации о владельце
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Владелец: " + owner);
        System.out.println("вид животного: " + type);
    }

}