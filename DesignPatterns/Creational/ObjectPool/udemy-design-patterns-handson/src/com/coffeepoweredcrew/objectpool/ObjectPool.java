package com.coffeepoweredcrew.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable>{
    // pool implementation details
    private  BlockingQueue<T> availablePool;
    public ObjectPool(Supplier<T> creator, int count){ {
        // initialize the pool
        availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            availablePool.add(creator.get());
        }
    }
    }
    public T get(){
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println("Failed to get object from pool take() was interrupted.");
        }
        return null;
    }
    public void release(T obj){
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("Failed to release object to pool put() was interrupted.");
        }
    }
}
