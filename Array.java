import java.util.Stack;

public class Array<T> {
    private int length;
    private Stack<T> stack;

    public Array<T>() {
        stack = new Stack<>();
    }

    public int length() {
        return length;
    }

    public boolean at(int index, T item) {
        if (index >= 0 && index <= size) {
            Stack<T> temp = new Stack<>();
            for (int i = 1; i <= length - index; ++i) {
                temp.push(stack.pop());
            }
            stack.push(item);
            size++;
            for (int i = 1; i <= length - index; ++i) {
                stack.push(temp.pop());
            }
            return true;
        }
        return false;
    }

    public T at(int index) {
        if (index >= 0 && index < size) {
            Stack<T> temp = new Stack<>();
            for (int i = 1; i <= size - index; ++i) {
                temp.push(stack.pop());
            }
            T item = stack.peek();
            for (int i = 1; i <= size - index; ++i) {
                stack.push(temp.pop());
            }
            return item;
        }
        return null;
    }
}
