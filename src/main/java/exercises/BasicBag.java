package exercises;

import edu.touro.mcon264.apps.collections.ArrayCollection;
import edu.touro.mcon264.apps.collections.BagInterface;
import edu.touro.mcon264.apps.collections.SortedArrayCollection;

import java.util.Random;

public class BasicBag<T> extends ArrayCollection<T> implements BagInterface<T> {

    @Override
    public T grab() {
        // If this bag is not empty, removes and returns a random element of the
        // bag; otherwise returns null.
        if(isEmpty()){
            return null;
        }
        else{
            Random random = new Random();
            int index = random.nextInt(0,numElements);
            T randomElement = elements[index];
            remove(randomElement);
            return randomElement;
        }

    }

    @Override
    public int count(T target) {
        int totalMatches = 0;
        for(T element: elements){
            if(element == target){
                totalMatches++;
            }
        }
        return totalMatches;
    }

    @Override
    public int removeAll(T target) {
        int totalRemoved = 0;
        int index= 0;
        while(index!= size()){
            if(elements[index] == target){
                totalRemoved++;
                remove(elements[index]);
            }
            else{
                index++; //only move if element was not replaced with last element
            }
        }
        return totalRemoved;
    }

    @Override
    public void clear() {
        while(size()!=0){
            remove(elements[0]);
        }
    }
}
