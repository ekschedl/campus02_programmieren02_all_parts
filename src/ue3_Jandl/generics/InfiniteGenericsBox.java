package ue3_Jandl.generics;

import java.util.ArrayList;

public class InfiniteGenericsBox<T> {
    private ArrayList<T> contents;

    public InfiniteGenericsBox() {
        contents = new ArrayList<T>();
    }

    public void putItem(T item) {
        contents.add(item);
    }

    public void printContents() {
        for (T item : contents) {
            System.out.println(item);
        }
    }

}
