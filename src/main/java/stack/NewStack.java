package stack;

import lombok.extern.java.Log;

import java.util.Stack;

@Log
public class NewStack {

    private Stack<Integer> stack;
    private Integer minElement;

    public NewStack() {
        stack = new Stack<Integer>();
    }

    public Integer peekMin() {
        if (stack.isEmpty()){
            log.info("Stack is empty.");
            return null;
        } else {
            log.info("peekMin: minimum element in the stack is: " + minElement);
            return minElement;
        }
    }

    public void push(Integer newElement) {
        if (stack.isEmpty()) {
            minElement = newElement;
            stack.push(newElement);
            log.info("push: element inserted: " + newElement);
            return;
        }
        if (newElement < minElement) {
            stack.push(2 * newElement - minElement);
            minElement = newElement;
        } else {
            stack.push(newElement);
        }
        log.info("push: element inserted: " + newElement);
    }

    public void pop() {
        if (stack.isEmpty()){
            log.info("Stack is empty.");
            return;
        }
        Integer removedElement = stack.pop();
        if (removedElement < minElement) {
            log.info("pop: top most element removed: "+minElement);
            minElement = 2 * minElement - removedElement;
        } else {
            log.info("pop: top most element removed: "+removedElement);
        }
    }
}
