import java.util.*;

public class Main {

    // Method to return the sequence in which the floors will be visited
    public static List<Integer> getElevatorSequence(int currentPosition, List<Integer> chosenFloors) {
        List<Integer> upQueue = new ArrayList<>();
        List<Integer> downQueue = new ArrayList<>();

        // Separate the chosen floors into upward and downward based on currentPosition
        for (int floor : chosenFloors) {
            if (floor > currentPosition) {
                upQueue.add(floor);  // Going up
            } else {
                downQueue.add(floor);  // Going down or same floor
            }
        }

        // Sort the upQueue in ascending order and downQueue in descending order
        Collections.sort(upQueue);  // Upward direction: smallest to largest
        Collections.sort(downQueue, Collections.reverseOrder());  // Downward: largest to smallest

        // Combine the queues: first go up, then go down
        List<Integer> resultQueue = new ArrayList<>(upQueue);
        resultQueue.addAll(downQueue);

        return resultQueue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the floors as vector (1-6 and G as 0)
        List<Integer> floorOptions = Arrays.asList(1, 2, 3, 4, 5, 6, 0);  // G is 0

        // Get the current position of the elevator
        System.out.print("Enter the current position of the elevator (1-6 or G for ground): ");
        String currentPositionInput = scanner.nextLine();
        int currentPosition = currentPositionInput.equalsIgnoreCase("G") ? 0 : Integer.parseInt(currentPositionInput);

        // Input the sequence of chosen floors
        System.out.print("Enter the chosen floors (space-separated, use G for ground): ");
        String[] chosenFloorsInput = scanner.nextLine().split(" ");
        List<Integer> chosenFloors = new ArrayList<>();

        // Convert input to floor numbers
        for (String floor : chosenFloorsInput) {
            if (floor.equalsIgnoreCase("G")) {
                chosenFloors.add(0);  // Ground floor as 0
            } else {
                chosenFloors.add(Integer.parseInt(floor));
            }
        }

        // Get the elevator's operation sequence based on the chosen floors
        List<Integer> resultQueue = getElevatorSequence(currentPosition, chosenFloors);

        // Print the result
        System.out.print("The elevator will visit floors in the following order: ");
        for (int floor : resultQueue) {
            if (floor == 0) {
                System.out.print("G ");
            } else {
                System.out.print(floor + " ");
            }
        }
        scanner.close();
    }
}
