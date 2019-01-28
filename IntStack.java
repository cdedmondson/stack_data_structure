/*

     This program demonstrates a stack data structure of integers.
     A stack data structure is LIFO or "last in first out". To make
     a stack we need:

     1. An array of integers that will act as the stack
     2. A top function to keep track of index
     3. A size function
     4. A function to push a value
     5. A function to pop a value
     6. A boolean function to check if stack is empty
     7. A boolean function to check if stack is full

 */

public class IntStack {

    private int[] stack;
    private int top;
    private int size;

    //  Default constructor to initialize values
    public IntStack() {
        top = -1;
        size = 50;
        stack = new int[50];
    }

    //  Constructor if user wants to determine size of stack
    public IntStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    // Add item to stack
    public boolean push(int item) {

        //  First check if stack is full
        if (!isFull()) {    //  If stack is not full
            top++;  //  Counter act default value of -1 in constructor
            stack[top] = item;  //  Set item to index of stack array
            return true;
        } else {    //  Stack is full
            return false;
        }
    }

    //  Take item off stack
    public int pop() {
        return stack[top--];    //  Go back 1 index to point to next item in stack
    }

    //  Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    //  Check if stack is full
    public boolean isFull() {
        return (top == stack.length - 1);
    }
}
