import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Transportation Application!");
        /* ## Milestone 1 - HOV using a linked list ##
        High Occupancy Vehicle (HOV) lanes, are transport lanes restricted to cars having two or more occupants.
        Create a user-defined linked list for an HOV lane. Note: randomly generate an integer [N] and fill the HOV lane with [N] cars. */
        Car c1 = new Car(1, "red", 10001); // occupant is 1, color is red, 3 id
        Car c2 = new Car(1, "red", 10002);
        Car c3 = new Car(4, "red", 10003);

        HOVLane lane = new HOVLane(c1);
        // output the lane
        System.out.println("HOV Lane 1: " + lane);
        // output the size/length of the lane
        System.out.println("HOV Lane 1 size: " + lane.size());

        HOVLane lane2 = lane.prepend(c2); // write an HOVLane.prepend() method
        // output the lane
        System.out.println("\nHOV Lane 2: " + lane2);
        // output the size/length of the lane
        System.out.println("HOV Lane 2 size: " + lane2.size());

        HOVLane lane3 = lane2.prepend(c3);// output the lane
        System.out.println("\nHOV Lane 3: " + lane3);
        // output the size/length of the lane
        System.out.println("HOV Lane 3 size: " + lane3.size());

        //output id with one occupant
        System.out.println("\n Car(s) I.D (1 occupant): " + lane3.idWithOnePerson());

        //output How many [Color] cars are in the HOV lane
        String color = "red";
        System.out.println("There are  " + lane3.colorNum(color) + " " + color + " car(s).");


    }


}
