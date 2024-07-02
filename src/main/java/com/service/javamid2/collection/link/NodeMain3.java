package com.service.javamid2.collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        printAll(first);
        Node lastNode = getLastNode(first);
        System.out.println(lastNode);
        


        add(first, "D");
        add(first,"E");
        System.out.println(getLastNode(first).item);

        int index=3;
        Node index2Node = getNode(first, index);
        System.out.println(index2Node.item);
    }

    private static void add(Node node, String string) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(string);
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node first) {
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node first) {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

}
