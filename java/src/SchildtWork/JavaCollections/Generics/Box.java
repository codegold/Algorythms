package JavaCollections.Generics;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */

public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
