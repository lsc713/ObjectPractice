package com.service.javamid2.collection.link;

public class MyLinkedListV2 {

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

    public void add(int index, Object o){
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

    public Object set(int index, Object object) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = object;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    public Object remove(int index){
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
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
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
            "node=" + node +
            ", size=" + size +
            '}';
    }
}
