# Russo-Ukrainian-War-Timeline-Tracker
This Java application provides a timeline of events related to the war in Ukraine.  It allows users to select a year, month, and day to view relevant news snippets and information.
## Features

**Date-Based Information Retrieval:** The core functionality allows users to input a specific date (year, month, day) and retrieve corresponding event details.
* **Timeline Focus:** The application primarily focuses on events from February 2022 through parts of 2024.
* **Console Output:** All information is displayed in the console.
**Random event Generator:** The user can press the no 2 to gemerate a random date, and you could follow the instructions by typing the corresponding year, month and day, and get the random event.

## Getting Started

### Prerequisites

* Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the code:** Save the provided Java code as `Ukraine.java`.
2.  **Compile:** Open a terminal or command prompt and navigate to the directory where you saved the file.  Compile the code using the following command:

    
    javac Ukraine.java
    

3.  **Run:** Execute the compiled code with the following command:

    
    java Ukraine
 

## Usage

1.  **Year Selection:** The program will first prompt you to enter a year.  Valid years in the current dataset are 2022, 2023, or 2024.
2.  **Month Selection:** After entering the year, you will be prompted to enter a month (1-12).
3.  **Day Selection:** Finally, enter the day (1-31, depending on the month).
4.  **Event Display:** The application will display information related to the selected date, if available.  If there is no specific information for that date, it may indicate "Nothing significant to report" or a similar message.
5.  **Invalid Input:** If you enter an invalid year, month, or day, the program may display an error message or provide a default output.

## Code Structure

* `EventDate Class:`  This class is a simple data structure to hold year, month, and day. It also contains the `getValidDates()` method which initializes and returns an ArrayList of EventDate objects.
* `Ukraine Class (Main):` The `main` method in this class handles user input and the logic for retrieving and displaying event information. It uses nested `switch` statements to navigate through the timeline data.

## Limitations

* **Static Data:** The event timeline is hardcoded within the Java file.  To update the information, the code itself needs to be modified and recompiled.
* **Limited Scope:** The application covers a specific period and set of events.  It is not a comprehensive or real-time news source.
* **Console-Based:** The user interface is basic, relying solely on console input and output.
* **No Error Handling:** The code includes basic input handling but could be improved with more robust error checking and input validation.

