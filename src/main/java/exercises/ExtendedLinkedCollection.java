package exercises;

import edu.touro.mcon264.apps.collections.LinkedCollection;
import edu.touro.mcon264.support.LLNode;

public class ExtendedLinkedCollection<T> extends LinkedCollection<T> {

    //protected LLNode<T> head;
    @Override
    public String toString() {
        LLNode<T> current = head;
        StringBuilder result = new StringBuilder();
        while(current != null){
            result.append(current.getInfo());
            current = current.getLink();
        }
        return result.toString();
    }


    public int count(T target) {
        LLNode<T> current = head;
        int totalMatches = 0;
        while(current!=null){
            if(current.getInfo() == target){
                totalMatches++;
            }
            current = current.getLink();
        }
        return totalMatches;
    }

    public void removeAll(T target) {
        LLNode<T> current = head;
        LLNode<T> prev = current;
        while(current != null){
            if(head.getInfo() == target){
                head.setLink(head.getLink());
                head = head.getLink();
            }
            else if(current.getInfo() == target){
                prev.setLink(current.getLink());
            }
            prev = current;
            current = current.getLink();
        }
    }
}
