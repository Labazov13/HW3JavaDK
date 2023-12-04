package org.example;

import java.util.Iterator;

public class Task2 <E> implements Iterable<E>{
    private E [] array;
    private int size;

    public Task2(E[] array) {
        this.array = array;
        size = array.length;
    }

    public <T extends E> void addElement(T element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[size] = element;
            array =(E[]) newArray;
        } else {
            array[size] = element;
        }
        size++;
    }
    public void printList(){
        for (E element: array){
            System.out.println(element);
        }
    }
    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
    }

    class MyListIterator implements Iterator<E>{
        int index;
        E[] iterArray;

        public MyListIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            return array[index++];
        }
    }

}
