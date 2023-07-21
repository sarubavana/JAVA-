import java.util.*;
public class BoundedTypeExample<T extends Number> {
    private T value;

    public BoundedTypeExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isGreaterThan(BoundedTypeExample<? extends Number> other) {
        return this.value.doubleValue() > other.value.doubleValue();
    }

    public static void main(String[] args) {
        BoundedTypeExample<Integer> integerExample = new BoundedTypeExample<>(10);
        BoundedTypeExample<Double> doubleExample = new BoundedTypeExample<>(15.5);

        System.out.println(integerExample.isGreaterThan(doubleExample));  // prints "false"
    }
}
