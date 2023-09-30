public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks = 3; // Change this value to the number of disks you want to use
        solveTowerOfHanoi(numDisks, 'A', 'C', 'B');
    }

    public static void solveTowerOfHanoi(int numDisks, char source, char destination, char auxiliary) {
        // Base case: If there's only one disk, move it from source to destination
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary peg using the destination peg as
        // auxiliary
        solveTowerOfHanoi(numDisks - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + numDisks + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination peg using the source peg as
        // auxiliary
        solveTowerOfHanoi(numDisks - 1, auxiliary, destination, source);
    }
}
