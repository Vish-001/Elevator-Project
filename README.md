Elevator System
This Java project simulates an elevator system that services requests for floors based on a prioritized queue. The elevator moves between floors 1-6 and the ground floor (G), processing floor requests in an optimized order by serving floors in the current direction first before switching directions.

Table of Contents
Features
Project Structure
How It Works
Installation
Usage
Example
Contributing
License
Features
Allows users to specify the current floor position of the elevator.
Accepts a list of floor requests, including ground floor (G).
Prioritizes requests based on the current direction of movement (upward or downward).
Handles any combination of floor requests in an optimized manner.
Project Structure
bash
Copy code
ElevatorSystem/
│
├── src/
│   └── ElevatorSystem.java  # Main program logic
│
├── README.md                # Project documentation
└── .gitignore               # Files to ignore for version control
How It Works
The elevator operates according to the following rules:

It begins at a specified current position (cp).
Users input a set of floor requests in any order.
The elevator first visits all floors above the current position (cp) if any are requested.
Once all upward requests are fulfilled, the elevator serves floors below the current position.
The ground floor (G) is treated as floor 0.
Key Components
Upward Queue: Handles floors greater than the current position, processed in ascending order.
Downward Queue: Handles floors less than or equal to the current position, processed in descending order.
Installation

Compile the project: Ensure you have a Java Development Kit (JDK) installed. Use the following commands to compile the project:

bash
Copy code
javac src/ElevatorSystem.java
Run the project: After compiling, run the program using:

bash
Copy code
java -cp src ElevatorSystem
Usage
Input:

You will be prompted to enter the current floor position of the elevator. Floors are numbered from 1-6, and G represents the ground floor.
Next, enter the sequence of chosen floors (space-separated) where you want the elevator to go. You can also input G for the ground floor.
Output:

The program will output the sequence of floors in the order they will be visited by the elevator.
Example Usage
Input:

rust
Copy code
Enter the current position of the elevator (1-6 or G for ground): 3
Enter the chosen floors (space-separated, use G for ground): 5 2 1 4 G
Output:

css
Copy code
The elevator will visit floors in the following order: 4 5 2 1 G
Example
Here are some sample input/output sequences:

Example 1:

Current position: 3
Requested floors: 5 2 1 4 G
Output: 4 5 2 1 G

Example 2:

Current position: G
Requested floors: 1 6 3 2 5
Output: 1 2 3 5 6

Contributing
Contributions are welcome! If you have suggestions or find bugs, feel free to open an issue or submit a pull request. Make sure to fork the repository and create a new branch for your contributions.

