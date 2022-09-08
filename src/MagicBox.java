import java.util.Random;

public class MagicBox<T> {
    private final T[] items;
    private final Random random = new Random();

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна,осталось заполнить " + (items.length - i) + " ячеек");
            }
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
