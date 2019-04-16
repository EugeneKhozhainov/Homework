package generics;

public class Pair<T extends Comparable<T>>  {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T max() {
        if (first == null) {
            if (second == null) return first;
            else return second;
        }
        if (second == null)
            return first;
        return first.compareTo(second) > 0 ? first : second;
    }

    public T min() {
        if (first == null) {
            if (second == null) return first;
            else return second;
        }
        if (second == null)
            return first;
        return first.compareTo(second) > 0 ? second : first;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

}
