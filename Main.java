import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Transportation Application!");
        /* ## Milestone 1 - HOV using a linked list ##
        High Occupancy Vehicle (HOV) lanes, are transport lanes restricted to cars having two or more occupants.
        Create a user-defined linked list for an HOV lane. Note: randomly generate an integer [N] and fill the HOV lane with [N] cars. */
        Car c1 = new Car(1, "red", 3); // id is 1, color is red, 3 passengers
        Car c2 = new Car(2, "blue", 1);
        Car c3 = new Car(3, "red", 2);

        System.out.println(" hello " + c1 + c2 + c3);
        // todo Count how many cars are in the HOV lane
        // todo What are the id(s) of cars with only one occupant
        // todo How many [C] cars are in the HOV lane? [C] is a user-provided car color.


    }


}
