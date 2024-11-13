
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World");
        StackUsingArrays stack = new StackUsingArrays();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(90);
        stack.display();
        stack.pop();
        System.out.println(stack.peek());
        stack.display();
    }
}
