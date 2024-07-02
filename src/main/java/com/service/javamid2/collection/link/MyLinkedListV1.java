package com.service.javamid2.collection.link;

public class MyLinkedListV1 {

    private Node node;
    private int size = 0;

    public void add(Object object) {
        Node newNode = new Node(object);
        if (node == null) {
            node = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object object) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = object;
        return oldValue;
    }

    public Object get(int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object object) {
        int index = 0;
        for (Node i = node; i != null; i = i.next) {
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

    public Node getNode(int index) {
        return node.next;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
            "node=" + node +
            ", size=" + size +
            '}';
    }
}
