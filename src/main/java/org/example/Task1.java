package org.example;

import java.io.DataInput;
import java.io.InputStream;

public class Task1 <T extends Comparable, V extends InputStream & DataInput, K extends Number>{
    public T t;
    public V v;
    public K k;

    public Task1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
    public void getTypes(){
        System.out.println(t.getClass().getSimpleName() +
                "\n" + v.getClass().getSimpleName() +
                "\n" + k.getClass().getSimpleName());
    }
}
