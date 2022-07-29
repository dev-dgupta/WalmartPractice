package org.example;

public class Solution {
    public static void main(String[] args) {
        QueueWithStack queueWithStack = new QueueWithStack(5);


        queueWithStack.insertDataInQueue(1);
        queueWithStack.insertDataInQueue(4);
        queueWithStack.insertDataInQueue(3);
        queueWithStack.insertDataInQueue(2);
        System.out.println(queueWithStack.pollDataFromQueue());
        System.out.println(queueWithStack.pollDataFromQueue());
        queueWithStack.insertDataInQueue(5);
        System.out.println(queueWithStack.pollDataFromQueue());
        queueWithStack.insertDataInQueue(6);
        System.out.println(queueWithStack.pollDataFromQueue());

        //1,4,3,2
        // 1        2,3,4
        // 4        3,4
        // 3,4,5
        // 3             4,5
        // 4,5,6
        // 2               5,6

    }
}
