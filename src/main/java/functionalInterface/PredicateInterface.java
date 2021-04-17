package functionalInterface;

@FunctionalInterface
public interface PredicateInterface<T> {

    boolean test(T t);
}
