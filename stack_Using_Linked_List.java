package Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public class stack_Using_Linked_List {
    private NodeList top;
    private int length;

    private static class NodeList{
        NodeList next;
        private int data;

        NodeList(int data){
            this.data = data;
            next = null;
        }
    }

    public stack_Using_Linked_List(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void display(NodeList top){
        NodeList current = top;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public void push(int data){
        NodeList temp = new NodeList(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        NodeList temp = top;
        int poppedElement = top.data;
        top = top.next;
        temp.next = null;
        length--;
        return poppedElement;
    }

    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public void operations(){
        System.out.println("The operations to be performed are:");

        System.out.println("Enter 1 to display stack");
        System.out.println("Enter 2 to add element to stack");
        System.out.println("Enter 3 to remove element from stack");
        System.out.println("Enter 4 to peek into the stack");
        System.out.println("Enter 5 to exit from List");
    }

    public static void main(String[] args) {
        stack_Using_Linked_List s = new stack_Using_Linked_List();

        Scanner sc = new Scanner(System.in);

        s.operations();

        int op = sc.nextInt();

        while (op != 5){

            switch (op){
                case 1 :
                    s.display(s.top);
                    s.operations();
                    op = sc.nextInt();
                    break;

                case 2:
                    System.out.println("Enter the value to push into the stack");
                    int val = sc.nextInt();
                    s.push(val);

                    s.operations();
                    op = sc.nextInt();
                    break;

                case 3:
                    s.pop();
                    s.operations();
                    op = sc.nextInt();
                    break;

                case 4:
                    System.out.println("Peeked element is" + s.peek());
                    s.operations();
                    op = sc.nextInt();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Enter valid number to perform operation");
                    s.operations();
                    op = sc.nextInt();
                    break;
            }
        }
    }
}
