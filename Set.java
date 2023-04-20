import java.util.ArrayList;
import java.util.List;

public class Set<T> {
    private final List<SetItem<T>> items;

    public Set() {
        items = new ArrayList<>();
    }

    public void add(T value) {
        SetItem<T> item = new SetItem<>(value);
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public void remove(T value) {
        SetItem<T> item = new SetItem<>(value);
        items.remove(item);
    }

    public boolean contains(T value) {
        SetItem<T> item = new SetItem<>(value);
        return items.contains(item);
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (SetItem<T> item : items) {
            sb.append(item.getValue()).append(" ");
        }
        sb.append("}");
        return sb.toString();
    }
}
