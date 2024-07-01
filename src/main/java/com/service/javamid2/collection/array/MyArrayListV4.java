package com.service.javamid2.collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int capacity) {
        elementData = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(E object) {
        if (size == elementData.length) {
            grow();
        }

        elementData[size] = object;
        size ++;
    }

    public void add(int idx, E o){
        if (size == elementData.length) {
            grow();
        }

        shiftRightFrom(idx);
        elementData[idx] = o;
        size++;
    }

    private void shiftRightFrom(int idx) {

        for (int i = size; i > idx; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int idx) {
        return (E) elementData[idx];
    }

    public E set(int idx, E element) {
        E old = get(idx);
        elementData[idx] = element;
        return old;
    }

    public int indexOf(E object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData,size)) + " size = " + size
            + ", capacity = " + elementData.length;
    }

    public E remove(int idx) {
        E o = get(idx);
        shiftLeftFrom(idx);
        size --;
        elementData[size] = null;
        return o;
    }

    private void shiftLeftFrom(int idx) {
        for (int i = idx; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

}
