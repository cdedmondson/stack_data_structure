public class PersonStack {

    private Person[] stack;
    private int top;
    private int size;

    //  Default constructor to initialize values
    public PersonStack() {
        top = -1;
        size = 50;
        stack = new Person[50];
    }

    //  Constructor if user wants to determine size of stack
    public PersonStack(int size) {
        top = -1;
        this.size = size;
        stack = new Person[this.size];
    }

    // Add item to stack
    public boolean push(Person item) {

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
    public Person pop() {
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
