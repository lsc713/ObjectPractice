package com.service.javamid2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerLast(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);

        deque.offerFirst(4);
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        deque.pollFirst();
        deque.pollFirst();
        deque.pollLast();
        deque.pollLast();
        System.out.println(deque);
    }

}
