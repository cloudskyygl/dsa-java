package com.csygl.dsa.queue;

import org.junit.Test;

public class ArrayQueueTest {

    @Test
    public void test() throws Exception {
        ArrayQueue<String> q = new ArrayQueue<>(3);
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());

        q.enqueue("a");
        q.enqueue("b");
        System.out.println(q.front());
        q.traversal();
        System.out.println(q.dequeue());
        q.traversal();
        System.out.println(q.dequeue());
        //q.traversal();

    }
}