package Stack;

import java.util.Scanner;

public class TwoWayStackUsingArray {

    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public TwoWayStackUsingArray(int capacity) {
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = size;
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

    public void pushFront(int value) {
        if (isFull()) {
            System.out.println("Stack is full, cannot add elements.");
            return;
        }
        arr[++front] = value;
        size++;
    }

    public void pushRear(int value) {
        if (isFull()) {
            System.out.println("Stack is full, cannot add elements.");
            return;
        }
        arr[++rear] = value;
        size++;
    }

    public int popFront() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot remove element.");
            return -1; // or throw an exception
        }
        int value = arr[front];
        for (int i = 0; i < arr.length-1; i++){
            arr[i] = arr [i+1];
        }
        size--;
        return value;
    }

    public int popRear() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot remove element.");
            return -1;
        }
        int value = arr[rear-1];
        arr[rear-1] = 0;
        size--;
        return value;
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[front];
    }

    public int peekRear() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i < capacity; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void operations() {
        System.out.println("The operations to be performed are:");
        System.out.println("Enter 1 to display the stack");
        System.out.println("Enter 2 to push element to the front of the stack");
        System.out.println("Enter 3 to push element to the rear of the stack");
        System.out.println("Enter 4 to pop element from the front of the stack");
        System.out.println("Enter 5 to pop element from the rear of the stack");
        System.out.println("Enter 6 to peek at the front of the stack");
        System.out.println("Enter 7 to peek at the rear of the stack");
        System.out.println("Enter 8 to exit the stack");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial capacity of the stack");
        int capacity = sc.nextInt();

        TwoWayStackUsingArray stack = new TwoWayStackUsingArray(capacity);

        stack.operations();

        int op = sc.nextInt();
        while (op != 8) {
            switch (op) {
                case 1:
                    stack.display();

                    stack.operations();

                    op = sc.nextInt();
                    break;

                case 2:
                    System.out.println("Enter the value to be pushed");
                    int value = sc.nextInt();
                    stack.pushFront(value);

                    stack.operations();

                    op = sc.nextInt();
                    break;

                case 3:
                    System.out.println("Enter the value to be pushed");
                    value = sc.nextInt();
                    stack.pushRear(value);

                    stack.operations();

                    op = sc.nextInt();
                    break;

                case 4:
                    System.out.println("Removed element is " + stack.popFront());

                    stack.operations();

                    op = sc.nextInt();
                    break;

                case 5:
                    System.out.println("Removed element is " + stack.popRear());

                    stack.operations();

                    op = sc.nextInt();
                    break;

                case 6:
                    System.out.println("Peeked element is " + stack.peekFront());

                    stack.operations();

                    op = sc.nextInt();
                    break;

                case 7:
                    System.out.println("Peeked element is " + stack.peekRear());

                    stack.operations();

                    op = sc.nextInt();
                    break;

                case 8:
                    break;

                default:
                    System.out.println("Enter valid number to perform operation");

                    stack.operations();

                    op = sc.nextInt();
                    break;
            }
        }
    }
}