import java.util.Objects;

public class SetItem<T> {
    private final T value;
    public SetItem(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetItem<?> setItem = (SetItem<?>) o;
        return Objects.equals(value, setItem.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
