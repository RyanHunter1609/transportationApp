import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Transportation Application!");
        /* ## Milestone 1 - HOV using a linked list ##
        High Occupancy Vehicle (HOV) lanes, are transport lanes restricted to cars having two or more occupants.
        Create a user-defined linked list for an HOV lane. Note: randomly generate an integer [N] and fill the HOV lane with [N] cars. */
        Car c1 = new Car(1, "red", 10001); // occupant is 1, color is red, 3 id
        Car c2 = new Car(8, "blue", 10002);
        Car c3 = new Car(4, "red", 10003);

        HOVLane lane = new HOVLane(c1);
        // output the lane
        System.out.println("HOV Lane: " + lane);

        // output the size/length of the lane

        System.out.println("lane size: " + lane.size());
        lane = lane.prepend(); // write an HOVLane.prepend() method
// output the lane
        System.out.println("Lane2: " + lane);
// output the size/length of the lane

        lane = lane.prepend();
// output the lane
// output the size/length of the lane

    }


}
