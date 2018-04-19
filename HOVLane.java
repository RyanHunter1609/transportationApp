import java.util.LinkedList;

public class HOVLane {
    private Car head;
    private HOVLane next;

    public HOVLane(Car head) {
        this.head = head;
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

    //create a prepend method
    public HOVLane prepend(Car car) {
        HOVLane head = new HOVLane(car);
        head.next = this;
        return head;
    }

    // Count how many cars are in the HOV lane
    public int size() {
        if (this.next == null) {
            return 1;
        } else {
            return 1 + this.next.size();
        }
    }

    // What are the id(s) of cars with only one occupant
    public Integer idWithOnePerson() {
        if (this.head == null) {
            return 0;
        }
        if (this.head.getOccupant() == 1) {
            return this.head.getId();
        } else {
            return this.next.idWithOnePerson();
        }
    }

    // todo How many [Color] cars are in the HOV lane? [Color] is a user-provided car color.
    public int colorNum(String userColor) {
        if (this.next == null) {
            return 0;
        }
        if (this.head.getColor().equals(userColor)) {
            return this.next.colorNum(userColor);
        } else {
            return 1 + this.next.colorNum(userColor);
        }

    }
}

