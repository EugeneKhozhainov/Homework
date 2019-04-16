package generics;

import collections.PairMaxIterable;
import org.junit.Test;

import java.util.Arrays;

public class TestGenerics {

    @Test
    public void run() {
        Pair<Integer> p1 = new Pair<>(2, 3);
        System.out.println(p1);
        System.out.println(p1.min());
        System.out.println(p1.max());

        PairMaxIterable iterable = new PairMaxIterable(Arrays.asList(new Pair(1,2), new Pair(3,2), new Pair(1,5)));
        for (Integer max : iterable) {
            System.out.println("max: " + max);
        }

    }

}
