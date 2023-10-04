package com.amey.dsa.stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.println("Elements present in stack :");
        s.printStack();
    }
}

class Stack{

    int top=-1;

    int[] stackArray = new int[10];

    public boolean push(int element){
        if(stackArray.length == top){
            System.out.println("Stack is full..");
            return false;
        }else{
            stackArray[++top] = element;
            System.out.println(element + " pushed into stack");
            return true;
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty..");
            return -1;
        }else{
            int x = stackArray[top];
            top--;
            return x;
        }
    }

    public void printStack(){
        for (int i= top; i > -1; i--){
            System.out.println(" "+ stackArray[i]);
        }
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty..");
            return -1;
        }
        return stackArray[top];
    }

}
