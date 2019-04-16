package concurrent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProducerConsumer {
    private static final int MAX_QUEUE = 10;

    private Queue<Integer> queue = new LinkedList();
    private Random random = new Random();

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();

    private int getSize() {
        try {
            readLock.lock();
            return queue.size();
        } finally {
            readLock.unlock();
        }
    }

    private void addValue(Integer value) {
        try {
            writeLock.lock();
            queue.add(value);
        } finally {
            writeLock.unlock();
        }
    }

    private Integer removeValue() {
        try {
            writeLock.lock();
            LinkedList list = (LinkedList)queue;
            return (Integer)list.removeFirst();
        } finally {
            writeLock.unlock();
        }
    }

    public void produce() {
        if (getSize() < MAX_QUEUE) {
            Integer value = random.nextInt();
            addValue(value);
            System.out.println(String.format("Produced: %s, %s", value, queue.size()));
        }
    }

    public void consume() {
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (getSize() > 0) {
            Integer value = removeValue();
            System.out.println(String.format("Consumed: %s, %s", value, queue.size()));
        }
    }

    public void run() {
        System.out.println("Started...");

        Thread producerThread = new Thread(){
            public void run(){
                while (true) {
                    produce();
                }
            }
        };

        producerThread.start();

        Thread consumerThread = new Thread(){
            public void run(){
                while (true) {
                    consume();
                }
            }
        };

        consumerThread.start();

        while (true);

    }



}
