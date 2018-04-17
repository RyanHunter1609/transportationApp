
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
        return "head: " + head + "next: " + next;
    }
}
