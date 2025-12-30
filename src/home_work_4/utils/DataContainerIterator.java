package home_work_4.utils;

import java.util.Iterator;



public class DataContainerIterator<T> implements Iterator <T> {

    private int cursor = 0;
    private T [] arr;

    public DataContainerIterator(T [] arr){
        this.arr = arr;
    }
    @Override
    public boolean hasNext() {
        return cursor < arr.length;
    }

    @Override
    public T next() {
        T element = arr[cursor];
        if(hasNext()) {
            cursor++;
        }
        return element;
    }
}
