package animals;

public class Counter implements AutoCloseable {
    private static int count = 0; // Сделать count статическим
    private boolean closed = false;

    public void add() throws IllegalStateException {
        if (closed) {
            throw new IllegalStateException("Cannot add, counter is closed.");
        }
        count++;
        System.out.println("Counter: " + count);
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Counter closed.");
    }

    public static int getCount() {
        return count;
    }
}
