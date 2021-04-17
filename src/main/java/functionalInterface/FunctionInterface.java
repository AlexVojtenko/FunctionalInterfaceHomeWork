package functionalInterface;

@FunctionalInterface
public interface FunctionInterface<T, R> {

    R apply(T t);

}