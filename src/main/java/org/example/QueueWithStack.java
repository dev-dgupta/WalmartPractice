package org.example;

import java.util.Stack;

public class QueueWithStack {

    int size;
    static Stack<Integer> s1 = new Stack<>();

    public QueueWithStack(Integer size) {
        this.size = size;
    }

    public boolean insertDataInQueue(Integer element) {
        if (s1.size() == size) {
            return false;
        }
        s1.add(element);
        return true;
    }

    public Integer pollDataFromQueue() {

        if (s1.isEmpty())
            return 0;
        int ele = s1.elementAt(0);
        s1.removeElementAt(0);
        return ele;
    }


}
