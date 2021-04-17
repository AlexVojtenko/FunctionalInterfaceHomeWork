package functionalInterface;

@FunctionalInterface
public interface ConsumerInterface<T> {

    void accept(T t);
}