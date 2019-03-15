package duilie;

import java.util.Stack;

public class QS {

        Stack<Integer>  stack1=new Stack<Integer>();
        Stack<Integer>  stack2=new Stack<Integer>();
        //stack1  入栈
        public void push (int node) {
            stack1.push(node);
        }
        public int pop() {
            //stack2为空
          if (stack2.isEmpty()) {
               while(!stack1.isEmpty()) {
                    //stack1出栈压入stack2
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

}
