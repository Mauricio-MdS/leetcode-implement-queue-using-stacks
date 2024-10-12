import java.util.Stack;

class MyQueue {

    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        shiftStacksIfNeeded();

        return outputStack.pop();
    }

    public int peek() {
        shiftStacksIfNeeded();

        return outputStack.peek();
    }

    public boolean empty() {
        return inputStack.isEmpty() && outputStack.empty();
    }

    private void shiftStacksIfNeeded() {
        if (!outputStack.isEmpty()) return;

        while (!inputStack.empty()) outputStack.push(inputStack.pop());
    }
}