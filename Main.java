public class Main {

    public static void main(String[] args) {


        PersonStack stack = new PersonStack();

        Person person1 = new Person("Cameron", "123");
        Person person2 = new Person("Shannon", "69");

        stack.push(person1);
        stack.push(person2);

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
    }
}
