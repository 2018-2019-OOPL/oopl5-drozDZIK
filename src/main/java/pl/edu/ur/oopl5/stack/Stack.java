package pl.edu.ur.oopl5.stack;

import java.util.EmptyStackException;

/**
 */
public class Stack extends AbstractStack {

    private int[] s;
    private int l = 0;
    private int index = -1;

    public Stack(int i) {
        this.s = new int[i];
    }

    @Override
    public void push(int i) {
        if ((s.length - 1) > index) {
            index++;
            l++;
            s[index] = i;
        } else {
            throw new StackOverflowError();
        }
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int i = s[index];
            index--;
            l--;
            return i;
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean isEmpty() {
        if (index == -1) {
            return true;
        } else {
            return false;
        }
    }

}