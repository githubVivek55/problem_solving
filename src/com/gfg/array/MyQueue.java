package com.gfg.array;

public class MyQueue {
    static int front, rear;
    static int[] arr = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    //Function to push an element x in a queue.
    static void push(int x) {
        // Your code here
        arr[front] = x;
        if (front == arr.length - 1)
            front = 0;
        else
            front++;

    }

    //Function to pop an element from queue and return that element.
    static int pop() {
        // Your code here
        if(front==rear){
            return -1;
        }
        int t = arr[rear];
        if (rear == arr.length - 1)
            rear = 0;
        else
            rear++;
        return t;
    }

    public static void main(String[] args) {

    }
}
