/**
 * Author: Demetrius Semanko
 * 
 * Purpose: Assuming we do not have access to any arrays or Collections,
 * let's represent a generic Array data structure using only the Stack
 * object.
 * 
 * Prompt (from David G. Cooper): Imagine that someone wrote java 
 * without arrays and without the Collection framework. 
 * Instead the only Generic Data Structure Type was a Stack.
 * 
 * Write a class called Array<T> that uses Stack objects 
 * and any primitive types needed to implement an array of T's.
 */

import java.util.Stack;

public class Array<T> {
    private int length = 0;
    private Stack<T> stack = new Stack<>();

    public int length() {
        return length;
    }

    public boolean at(int index, T item) {
        if (index >= 0 && index <= length) {
            Stack<T> temp = new Stack<>();
            for (int i = 1; i <= length - index; ++i) {
                temp.push(stack.pop());
            }
            stack.push(item);
            for (int i = 1; i <= length - index; ++i) {
                stack.push(temp.pop());
            }
            length++;
            return true;
        }
        return false;
    }

    public T at(int index) {
        if (index >= 0 && index < length) {
            Stack<T> temp = new Stack<>();
            for (int i = 1; i <= length - index - 1; ++i) {
                temp.push(stack.pop());
            }
            T item = stack.peek();
            for (int i = 1; i <= length - index - 1; ++i) {
                stack.push(temp.pop());
            }
            return item;
        }
        return null;
    }
}