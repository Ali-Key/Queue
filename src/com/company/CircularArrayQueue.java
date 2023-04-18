package com.company;

public class CircularArrayQueue <T> {
    private final static int DEFAULT_CAPACITY = 3;
    private int front , rear , counter;
    private T[] queue;

    CircularArrayQueue(int initial_capacity){
        front=0;
        rear = 0;
        counter = 0;
        queue =(T[]) new Object[initial_capacity];
    }
    CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }
    //OPERATIONS
    //size
    int size(){
        return counter;
    }
    //isempty
    Boolean isEmpty(){
        return counter == 0;
    }
    //first
    T first(){
        if (isEmpty())
            System.out.println("EMPTY!");
        return queue[front];
    }
    //enqueue
    void enqueue(T element){
        if(size() == queue.length)
            expandCapacity();

        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        counter++;
    }
    //dequeue
    T dequeue(){
        if(isEmpty())
            System.out.println("Empty!");
        T removedElement = queue[front];
        queue[front] = null;
        front = (front +1) % queue.length;
        counter--;
        return removedElement;
    }

    //printQueue
    void printCircularQueue(){
        if(isEmpty())
            System.out.println("Empty!");
        int current = front;
        for(int i=0; i<counter; i++){
            System.out.println(queue[current] + " ");
            current = (current +1) % queue.length;
        }
    }
    //expandcapacity
    private void expandCapacity(){
        T[] largerArray =(T[]) new Object[queue.length * 2];
        for(int i=0; i<counter; i++){
            largerArray[i] = queue[front];
            front = (front+1) % queue.length;
        }
        front =0;
        rear = counter;
        queue = largerArray;
    }

    String indexs="";
    int times= 0;

    void sreach(T element ){
        if(isEmpty())
            System.out.println("Empty!");
        int index = front;
        for(int i=0; i<counter; i++){
            if(element.equals(queue[index])){
                times++;
                indexs+=index+" ";
            }
            index=(index+1)% queue.length;

    }
        if(times==0)
            System.out.println("Not Fount");
        else
            System.out.println(" Fount"+ times+"Times in array at index , ["+ index +"]");
    }
}


//public class CircularArrayQueue <T> {
//
//    private final static int DEFAULT_CAPACITY = 3;
//    private  int  front , rear , count;
//    private  T[] queue;
//
//    public CircularArrayQueue ( int  initial_capacity){
//        front= rear=count=0;
//        queue = (T[]) (new object[initial_capacity]);
//
//    }
//    public CircularArrayQueue(){
//        this(DEFAULT_CAPACITY);
//
//    }
//
//    //OPERATIONS
//    //size
//    public int size(){
//        return count;
//    }
////    isEmpty
//    public boolean isEmpty(){
//        return count==0;
//    }
////    first
//    public T first(){
//        if(isEmpty())
//            System.out.println("EMPTY...");
//        return queue[front];
//    }
//
////    equeue N
//    public void enqueue(T element){
//        if(size()== queue.length)
//            expandCapacity();
//        queue[rear]=element;
//        rear=(rear+1)%queue.length;
//        count ++;
//    }
////    dequeue
//    public T dequeue() {
//        if (isEmpty())
//            System.out.println("Empty!");
//
//        T result = queue[front];
//        queue[front]=null;
//        front=(front+1)% queue.length;
//        count --;
//        return result;
//    }
////    printCircularQueue
//     public void printCircularQueue() {
//        if (isEmpty())
//            System.out.println("Empty!");
//        int Index=front;
//        for (int i=0; i<count; i++){
//        System.out.println(queue[Index]);
//        Index=(Index+1)% queue.length;
//
//    }
//        System.out.println();
//
//    }
////    expandCapacity
//    public void expandCapacity(){
//
//        T[] largerArray = (T[]) new object[queue.length*2];
//        for (int scan=0; scan<count; scan++){
//            largerArray[scan]=queue[front];
//            front=(front+1)% queue.length;
//
//        }
//        front=0;
//        rear=count;
//        queue=largerArray;
//
//    }
//
//
//}
