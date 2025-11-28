package exercises;

import com.sun.source.doctree.SeeTree;
import edu.touro.mcon264.apps.collections.CollectionInterface;

/**
 * Advance Set Interface
 * @param <T>
 */
public interface AdvanceSetInterface <T> extends CollectionInterface<T> {

    public AdvanceSetInterface<T> union(AdvanceSetInterface<T> otherSet);
    public AdvanceSetInterface<T> intersection(AdvanceSetInterface<T> otherSet);
    public AdvanceSetInterface<T> difference(AdvanceSetInterface<T> otherSet);

}
