# Data Structures Lab Sheet 3

## How to Run the Code

1. **Clone the repository**:
    On the terminal, copy and paste the following command

   ```bash
   git clone https://github.com/harmanjeet183/dsa-labsheet-3-harman
   ```

2. **Go to the DSA-Lab Sheet 1 directory**
    Navigate to ```DSA-Lab-Sheet-3 ```
    ```
    cd .\DSA-Lab-Sheet-3
    ```
   
3. **Compile the Code**:
    Use javac to create Class Files for all Java files.
    All the code is compiled in out/src and out/test directories
    ```bash
    javac -d out src/ArrayQueue.java test/ArrayQueueTest.java
    javac -d out src/ArrayStack.java test/ArrayStackTest.java
    javac -d out src/LinkedListQueue.java test/LinkedListQueueTest.java
    javac -d out src/LinkedListStack.java test/LinkedListStackTest.java
    javac -d out src/PrintQueue.java test/PrintQueueTest.java
    javac -d out src/ReverseData.java test/ReverseDataTest.java
    javac -d out src/SystemStack.java src/SystemStack.java
    ```

4. **Run the Code**:
    Use java command to run files individually.
    ```bash
    java -cp out test.ArrayQueueTest
    java -cp out test.ArrayStackTest
    java -cp out test.LinkedListQueueTest
    java -cp out test.LinkedListStackTest
    java -cp out test.PrintQueueTest
    java -cp out test.ReverseDataTest
    java -cp out src.SystemStack  
    ```

## Repository Overview

1.  All the Java Class files are stored in the ```src``` directory

2. All the TestFiles which will be used to run the program to check test-cases are stored in ```test``` directory

3. After all the javac commands have been executed, all new files will be stored in ```out/src``` and ```out/test``` directory, and will be used to execute the program.
