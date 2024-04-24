# Array Initialization LRU Program

## Introduction:
This Java program simulates array initialization in both column-major and row-major orders in the physical memory and calculates the number of page faults generated using an LRU cache replacement policy.

## Compilation and Execution:
1. **Compile the Program**:
   - Open a terminal or command prompt.
   - Navigate to the directory containing the Java file (`ArrayInitializationLRU.java`).
   - Compile the Java file using the `javac` command:
     ```
     javac ArrayInitializationLRU.java
     ```

2. **Run the Program**:
   - After successful compilation, run the compiled Java program using the `java` command:
     ```
     java ArrayInitializationLRU
     ```

3. **Enter Number of Frames**:
   - You will be prompted to enter the number of frames in the physical memory.
   - Input a valid integer greater than 0 when prompted.

4. **Results Display**:
   - The program calculates the number of page faults for both column-major and row-major array initialization using an LRU cache.
   - It displays the results indicating the number of page faults generated for each initialization order.

## Error Handling:
- The program includes input type checking to ensure that only valid integer inputs greater than 0 are accepted.
- If invalid input is provided (e.g., non-integer, negative integer, zero), the program displays an error message and prompts the user to enter a valid integer.

## Test Cases:
### Test Case 1: Valid Input
**Input: Enter a valid integer greater than 0 (e.g., 5).**
Expected Behavior: The program should accept the input without errors and proceed to calculate the number of page faults for both column-major and row-major array initialization.
![image](https://github.com/Ananyakakumanu/521_Proj4/assets/158865231/4d88d0a5-4d50-4dfc-b431-bc6f8798cdf3)

Test Case 2: Invalid Input (Non-Integer)
**Input: Enter a non-integer value (e.g., "abc").**
Expected Behavior: The program should display an error message indicating that the input is invalid and prompt the user to enter a valid integer.
![image](https://github.com/Ananyakakumanu/521_Proj4/assets/158865231/fa93b405-2212-4b52-bc0b-1913bf222c47)

Test Case 3: Invalid Input (Negative Integer)
**Input: Enter a negative integer value (e.g., -3).**
Expected Behavior: The program should display an error message indicating that the input is invalid (since the number of frames must be greater than 0) and prompt the user to enter a valid integer.
![image](https://github.com/Ananyakakumanu/521_Proj4/assets/158865231/b1cdacbd-30b7-4f97-b4aa-63e572c07a7a)

Test Case 4: Invalid Input (Zero)
Input: Enter zero.
Expected Behavior: The program should display an error message indicating that the input is invalid (since the number of frames must be greater than 0) and prompt the user to enter a valid integer.
![image](https://github.com/Ananyakakumanu/521_Proj4/assets/158865231/a5cc741d-9663-4b95-adea-e2bde0deb935)

Test Case 5: Invalid Input (Integer Overflow)
**Input: Enter a very large integer value.**
Expected Behavior: The program should handle the input gracefully and prompt the user to enter a valid integer (without crashing due to integer overflow).
![image](https://github.com/Ananyakakumanu/521_Proj4/assets/158865231/e8a67664-6c5c-47b0-9234-9c4efb6d206c)

## Contributors:


## Results Analysis:
- The program effectively demonstrates the difference in page faults generated between column-major and row-major array initialization.
- The results provide insights into the impact of memory access patterns on page faults.

