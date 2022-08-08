import java.util.List;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private List<T> elements = new ArrayList<T>();
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T element) {
        this.elements.add(element);
        this.size++;
    }

    public T pop() throws EmptyStackException {
        if (this.isEmpty())
            throw new EmptyStackException();

        T element = this.elements.remove(this.size - 1);
        this.size--;
        return element;
    }

}
