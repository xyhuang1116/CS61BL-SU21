public interface FilterCondition<T> {
/** Returns true if the item meets a certain condition (is even, etc.). */
    boolean eval(T item);
}
