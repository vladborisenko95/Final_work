import java.util.ArrayList;
import java.util.List;

// Класс Animal (Родительский класс)
public class Animal {
    protected String name;
    protected List<String> commands;
    protected String birthDate;

    // Конструктор
    public Animal(String name, String commandString, String birthDate) {
        this.name = name;
        this.commands = new ArrayList<>();
        String[] commandArray = commandString.split(";");
        for (String command : commandArray) {
            this.commands.add(command.trim());
        }
        this.birthDate = birthDate;
    }

    // Геттеры и Сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public List<String> getCommands() {
        return commands;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    // Метод для вывода информации о животном
    public void printDetails() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + getCommands());
        System.out.println("Дата рождения: " + birthDate);
    }


    public void setType(String домашнее) {
    }

    public void setSpecies(String species) {
    }
}