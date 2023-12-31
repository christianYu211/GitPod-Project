package com.yt.volatiles;
import com.yt.volatiles.Consumer;
import java.util.concurrent.ArrayBlockingQueue;

public class Cp_test {
    public static void main(String[] args) throws InterruptedException{
        ArrayBlockingQueue storage = new ArrayBlockingQueue(8);
        Producer producer = new Producer(storage);
        Thread pThread = new Thread(producer);
        pThread.start();
        Thread.sleep(500);
        Consumer consumer = new Consumer(storage);
        while(consumer.needMoreNums()){
            System.out.println(consumer.storage.take() + "被消费了");
            Thread.sleep(100);
        }
        System.out.println("消费者不需要更多数据了");
        producer.canceled = true;
        System.out.println(producer.canceled);
    }
    
}
