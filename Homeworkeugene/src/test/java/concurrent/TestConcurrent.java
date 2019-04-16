package concurrent;

import org.junit.Test;

public class TestConcurrent {

    @Test
    public void run() {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        producerConsumer.run();
    }

}
