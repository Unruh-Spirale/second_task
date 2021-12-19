import stack.NewStack;

public class Main {
    public static void main(String[] args) {

        NewStack s = new NewStack();
        s.peekMin();
        s.push(3);
        s.peekMin();
        s.push(2);
        s.peekMin();
        s.push(5);
        s.peekMin();
        s.push(6);
        s.peekMin();
        s.push(1);
        s.peekMin();
        s.pop();
        s.peekMin();
        s.pop();
        s.peekMin();
        s.pop();
        s.peekMin();
        s.pop();
        s.peekMin();
        s.pop();
        s.peekMin();
        s.pop();
        s.pop();

    }
}
