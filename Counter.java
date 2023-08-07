public class Counter implements AutoCloseable {
    private int count;

    public Counter() {
        count = 0;
    }

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() {
        if (count > 0) {
            throw new RuntimeException("Ошибка: Объект типа Счетчик был использован вне ресурсного try.");
        }
    }
}