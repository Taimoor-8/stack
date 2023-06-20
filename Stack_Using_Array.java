package Stack;

import java.util.Scanner;

public class Stack_Using_Array {

    private int[] arr;
    private int top;
    private int capacity;
    private int size;

    public Stack_Using_Array(int capacity) {
        this.arr = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full, cannot add elements.");
            return;
        }
        arr[++top] = value;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot remove element.");
            return -1;
        }
        size--;
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void Operations() {
        System.out.println("The operations to be performed are:");
        System.out.println("Enter 1 to display stack");
        System.out.println("Enter 2 to push element to stack");
        System.out.println("Enter 3 to pop element from stack");
        System.out.println("Enter 4 to peek from stack");
        System.out.println("Enter 5 to exit from stack");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial capacity of stack");
        int capacity = sc.nextInt();

        Stack_Using_Array stack = new Stack_Using_Array(capacity);

        stack.Operations();

        int op = sc.nextInt();
        while (op != 5) {
            switch (op) {
                case 1:
                    stack.display();
                    stack.Operations();
                    op = sc.nextInt();
                    break;

                case 2:
                    System.out.println("Enter the number you want to push to stack");
                    int num = sc.nextInt();
                    stack.push(num);
                    stack.Operations();
                    op = sc.nextInt();
                    break;

                case 3:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    stack.Operations();
                    op = sc.nextInt();
                    break;

                case 4:
                    System.out.println("Peek element: " + stack.peek());
                    stack.Operations();
                    op = sc.nextInt();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Enter a valid number to perform an operation");
                    stack.Operations();
                    op = sc.nextInt();
                    break;
            }
        }
    }
}
