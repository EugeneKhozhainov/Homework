package generics;

public class First {
    public static void main(String[] args) {

        System.out.println("Max value is = " + new FirstGeneric<>(1, 2).max(1, 2));
        System.out.println("Min value is = " + new FirstGeneric<>(1, 2).min(1, 2));
        }


    static class FirstGeneric<T> {
        private T first;
        private T second;

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        FirstGeneric(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public <T extends Comparable<T>> T max(T first, T second) {
            if (first == null) {
                if (second == null) return first;
                else return second;
            }
            if (second == null)
                return first;
            return first.compareTo(second) > 0 ? first : second;
        }

        public <T extends Comparable<T>> T min(T first, T second) {
            if (first == null) {
                if (second == null) return first;
                else return second;
            }
            if (second == null)
                return first;
            return first.compareTo(second) > 0 ? second : first;
        }
    }

}
