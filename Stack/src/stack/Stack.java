/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Stack implements Stacks {

    int maxSize;
    int top;
    String arr[];

    public Stack(int n) {
        maxSize = n;
        arr = new String[maxSize];
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
        Arrays.asList(arr).clear();
    }

    @Override
    public void push(String str) {
        if (top < maxSize) {
            arr[top] = str;
            top++;
        } else {
            System.out.println("Stack is FULL!");
        }

    }

    @Override
    public String pop() {
        if (!this.isEmpty()) {
            String temp = this.peek();
            arr[top - 1] = null;
            top--;
            return temp;
        } else {
            return null;
        }
    }

    @Override
    public String peek() {
        if (top > 0) {
            return arr[top - 1];
        } else {
            return null;
        }
    }

    @Override
    public void contain(String number) {
        boolean test = false;
        for (String num : arr) {
            if (num.equals(number)) {
                test = true;
                break;
            }
            System.out.println("Contain");
        }

    }

    public static void main(String[] args) {

        Stack s = new Stack(4);
        System.out.println(s.isEmpty());
        s.push("1");
        System.out.println(s.isEmpty());      
        s.push("2");
        System.out.println(s.peek());
        s.push("3");
        System.out.println(s.peek());
        s.push("4");
        System.out.println(s.peek());
        s.push("5");
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.contain("2");
        s.clear();
        
    }
}
