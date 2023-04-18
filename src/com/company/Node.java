package com.company;

public class Node < T > {

    private T Element;
    private Node<T>  next;

    public Node(){
        Element=null;
        next=null;
    }
    public Node( T element){
        Element=element;
        next=null;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getElement() {
        return Element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}

