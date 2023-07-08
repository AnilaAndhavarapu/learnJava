package com.learning.practice.vo.interfaces;

public interface ListInterface<T> {

    void add(T value);
    void addAtIndex(int index, T value);
    void remove(T value);
    void removeAtIndex(int index) throws Exception;
    int getSize();
    T getAtIndex(int index) throws Exception;

}
