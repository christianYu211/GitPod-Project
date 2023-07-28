package com.yt.Producer_consumer.method_1;

import java.util.concurrent.ArrayBlockingQueue;

public class achieveByBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Object> queue = new ArrayBlockingQueue<>(10);
        Runnable producer = () -> {
            while(true){
                queue.put(new Object());
            }
        };
        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = () -> {
            while(true){
                queue.take();
            }
        };
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
