import java.util.LinkedList;

public class HOVLane {
    private Car head;
    private HOVLane next;

    public HOVLane(Car head, HOVLane next) {
        this.head = head;
        this.next = next;
    }

    public Car getHead() {
        return head;
    }

    public void setHead(Car head) {
        this.head = head;
    }

    public HOVLane getNext() {
        return next;
    }

    public void setNext(HOVLane next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HOVLane)) return false;

        HOVLane hovLane = (HOVLane) o;

        if (!getHead().equals(hovLane.getHead())) return false;
        return getNext().equals(hovLane.getNext());
    }

    @Override
    public int hashCode() {
        int result = getHead().hashCode();
        result = 31 * result + getNext().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\n\t" + head + "\t" + next;
    }

    // todo Count how many cars are in the HOV lane
    public int size() {
        if (this.next == null) {
            return 1;
        } else {
            return 1 + this.next.next.size();
        }
    }
    // todo What are the id(s) of cars with only one occupant
    // todo How many [C] cars are in the HOV lane? [C] is a user-provided car color.

}

