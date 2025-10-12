package org.example;

public interface MyStrackInterface<Type> {


    void push(Type item);

    Type pop();

    Type peek();

    boolean empty();

    int size();


}
