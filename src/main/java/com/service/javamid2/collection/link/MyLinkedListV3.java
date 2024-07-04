package com.service.javamid2.collection.link;

public class MyLinkedListV3<E> {

    private Node<E> node;
    private int size = 0;

    public void add(E object) {
        Node<E> newNode = new Node<E>(object);
        if (node == null) {
            node = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, E o){
        Node newNode = new Node(o);
        if (index == 0){
            newNode.next = node;
            node = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public E set(int index, E object) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = object;
        return oldValue;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    public E remove(int index){
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            node = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }
    public int indexOf(E object) {
        int index = 0;
        for (Node<E> i = node; i != null; i = i.next) {
            if (i.equals(i.next)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public Node<E> getNode(int index) {
        Node<E> x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public String toString() {
        return "MyLinkedListV3{" +
            "node=" + node +
            ", size=" + size +
            '}';
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        public Node(E item) {
            this.item = item;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
