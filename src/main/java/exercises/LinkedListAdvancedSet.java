package exercises;

public class   LinkedListAdvancedSet <T> implements AdvanceSetInterface <T> {
    @Override
    public AdvanceSetInterface<T> union(AdvanceSetInterface<T> otherSet) {
        return null;
    }

    @Override
    public AdvanceSetInterface<T> intersection(AdvanceSetInterface<T> otherSet) {
        return null;
    }

    @Override
    public AdvanceSetInterface<T> difference(AdvanceSetInterface<T> otherSet) {
        return null;
    }

    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public T get(T target) {
        return null;
    }

    @Override
    public boolean contains(T target) {
        return false;
    }

    @Override
    public boolean remove(T target) {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
    //TODO: implement the methods in the AdvanceSetInterface using a linked list as the underlying data structure
}
