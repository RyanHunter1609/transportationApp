import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Transportation Application!");
        /* ## Milestone 1 - HOV using a linked list ##
        High Occupancy Vehicle (HOV) lanes, are transport lanes restricted to cars having two or more occupants.
        Create a user-defined linked list for an HOV lane. Note: randomly generate an integer [N] and fill the HOV lane with [N] cars. */
        HOVLane lane1 = new HOVLane(2);
        randNumOfCars();

        // todo Count how many cars are in the HOV lane
        // todo What are the id(s) of cars with only one occupant
        // todo How many [C] cars are in the HOV lane? [C] is a user-provided car color.


    }

    private static void randNumOfCars() {
        Random randomGenerator = new Random();
        for (int i = 1; i <= 10; ++i) {
            int num = randomGenerator.nextInt(100);
        }
    }
}