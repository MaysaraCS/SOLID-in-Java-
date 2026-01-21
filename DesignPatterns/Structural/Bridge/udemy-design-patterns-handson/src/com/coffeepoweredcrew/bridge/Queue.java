package com.coffeepoweredcrew.bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection{

    private LinkedList<T> list;

    public Queue(LinkedList<T> lsit){
        this.list = lsit;
    }
	@Override
    public void offer(T element){
        list.addLast(element);
    }

    @Override
    public T poll(){
        return list.removeFirst();
    }
}
