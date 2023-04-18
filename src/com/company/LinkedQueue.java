package com.company;

public class LinkedQueue <T>{
    private Node<T> Head;
    private Node<T> Tail;
    private int Counter;

    public LinkedQueue(){
        Head=null;
        Tail=null;
        Counter=0;
    }
//    isEmpty
    public boolean isEmpty(){
      return Counter==0;

    }
//    Equeue

    public void enqueue(T element)
    {
        Node<T> node = new Node<T>(element);
        if (isEmpty())
            Head = node;
        else
            Tail.setNext(node);
        Tail = node;
        Counter++;
    }

//    dequeue
public T dequeue(){
    if (isEmpty())

        System.out.println("IsEmpty...");

    T result = Head.getElement();
    Head = Head.getNext();
    Counter--;
    if (isEmpty())
        Tail = null;
    return result;
}
    //    Size
    public int size (){
        return  Counter;
    }

//    First
    public  T first(){
        if (isEmpty())

          System.out.println("IsEmpty...");
        return Head.getElement();

    }
//    PrintQueue
    public void PrintQueue(){
        if (isEmpty())

          System.out.println("IsEmpty...");
        Node<T> Current= Head;
        while (Current!=null){
            System.out.println(Current.getElement());
        Current=Current.getNext();

    }
        System.out.println();
    }

}
