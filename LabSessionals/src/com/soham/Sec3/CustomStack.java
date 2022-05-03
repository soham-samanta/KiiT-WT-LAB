package com.soham.Sec3;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }


    public boolean push(int item) throws StackException{
        if (isFull()) {
//            System.out.println("Stack is full!!");
//            return false;
            throw new StackException("Stack is full!!");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int disp() throws StackException {
        if(isEmpty()){
            throw new StackException("Can not peek from empty Stack");
        }
        return data[ptr];
    }



    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}



class StackException extends Exception{
    public StackException(String message) {
        super(message);
    }
}

class Main{
    public static void main(String[] args) throws StackException {
        CustomStack st=new CustomStack();
        st.push(10);
        st.push(86);
        st.push(30);
        st.push(54);
        st.push(12);
        st.pop();
        st.pop();
        System.out.println(st.disp());
    }
}