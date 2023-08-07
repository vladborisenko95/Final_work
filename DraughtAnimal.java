// Класс DraughtAnimal (Дочерний класс Animal)
public class DraughtAnimal extends Animal {
    private String task;
    private String type;

    // Конструктор
    public DraughtAnimal(String name, String command, String birthDate, String task, String type) {
        super(name, command, birthDate);
        this.task = task;
        this.type = type;
    }

    // Геттер и Сеттер для task
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // Переопределение метода printDetails() для добавления информации о задании
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Задание: " + task);
        System.out.println("вид животного: " + type);
    }
}