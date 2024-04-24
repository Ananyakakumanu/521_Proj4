import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayInitializationLRU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFrames = 0;
        boolean validInput = false;

        // Prompt user for input until valid input is provided
        while (!validInput) {
            System.out.print("Please enter the number of frames: ");
            if (scanner.hasNextInt()) {
                numFrames = scanner.nextInt();
                if (numFrames > 0) {
                    validInput = true;
                } else {
                    System.out.println("Number of frames must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        scanner.close();

        // Calculate the number of page faults for both column-major and row-major orders.
        int columnFaults = calculatePageFaults(numFrames, "column");
        int rowFaults = calculatePageFaults(numFrames, "row");

        System.out.println(columnFaults + "-page faults are generated for the column-major order array-initialization");
        System.out.println(rowFaults + "-page faults are generated for the row-major order array-initialization");
    }

    private static int calculatePageFaults(int numFrames, String majorOrder) {
        int pageFaults = 0;

        // Queue to keep track of the order of page accesses.
        Queue<Integer> pageQueue = new LinkedList<>();
        // Map to keep track of which pages are in memory.
        HashMap<Integer, Boolean> pageMap = new HashMap<>();
        int pageSize = 100;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                int page;
                if ("column".equals(majorOrder)) {
                    // For column-major order, calculate page number based on column access pattern.
                    page = (j * 100 + i) / pageSize;
                } else {
                    // For row-major order, calculate page number based on row access pattern.
                    page = (i * 100 + j) / pageSize;
                }

                // Check if the page is not already in memory.
                if (!pageMap.containsKey(page)) {
                    pageFaults++;
                    // If the number of frames is full, remove the oldest page.
                    if (pageQueue.size() == numFrames) {
                        int oldestPage = pageQueue.poll();
                        pageMap.remove(oldestPage);
                    }
                    pageQueue.add(page);
                    pageMap.put(page, true);
                }
            }
        }

        return pageFaults;
    }
}
