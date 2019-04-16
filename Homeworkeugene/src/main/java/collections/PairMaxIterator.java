package collections;

import generics.Pair;

import java.util.Iterator;
import java.util.List;

public class PairMaxIterator implements Iterator<Integer> {
    private List<Pair<Integer>> list;
    private int position = 0;

    public PairMaxIterator(List<Pair<Integer>> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position < list.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer next() {
        return list.get(position++).max();
    }

}
