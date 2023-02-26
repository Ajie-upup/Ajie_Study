package class05_Quene;

import java.util.Stack;

/**
 * @Author: ajie
 * @Date: 2023/2/26
 * @Description: https://leetcode.cn/problems/implement-queue-using-stacks/
 */
public class code01_用栈实现队列 {
    class MyQueue {
        private Stack<Integer> inStack;
        private Stack<Integer> outStack;

        public MyQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            checkOutStack();
            return outStack.pop();
        }

        public int peek() {
            checkOutStack();
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }

        private void checkOutStack() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
        }
    }
}
