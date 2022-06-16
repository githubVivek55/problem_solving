@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);

    public default Predicate<T> and(Predicate<T> p2){
        return t->test(t) && p2.test(t);
    }

    public default Predicate<T> or(Predicate<T> p2){
        return (t)->test(t)|| p2.test(t);
    }
    static <U> Predicate<U> isEqual(U s) {
        return t->t.equals(s);
    }
}
