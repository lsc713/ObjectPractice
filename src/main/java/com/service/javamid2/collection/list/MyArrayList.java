package com.service.javamid2.collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elementData = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        if (size == elementData.length) {
            grow();
        }

        elementData[size] = e;
        size ++;
    }

    @Override
    public void add(int index, E o){
        if (size == elementData.length) {
            grow();
        }

        shiftRightFrom(index);
        elementData[index] = o;
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

    @Override    @SuppressWarnings("unchecked")
    public E get(int idx) {
        return (E) elementData[idx];
    }

    @Override
    public E set(int idx, E element) {
        E old = get(idx);
        elementData[idx] = element;
        return old;
    }
    @Override
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
