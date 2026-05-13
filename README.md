# CodeAlpha_StudentGradeManager
# Student Grade Management System

## Overview

The Student Grade Management System is a console-based Java application used to manage student records and grades. The program allows users to add student details, view all students, calculate statistics, and generate a complete performance report.

This project is designed for beginners to practice Java programming concepts such as:

* Classes and Objects
* ArrayList
* Methods
* Loops
* Conditional Statements
* Object-Oriented Programming (OOP)
* User Input using Scanner

---

# Features

* Add Student Details
* View All Students
* Calculate Average Marks
* Find Highest Marks
* Find Lowest Marks
* Generate Full Student Report
* Assign Grades Automatically

---

# Technologies Used

* Java
* ArrayList
* Scanner Class
* Object-Oriented Programming Concepts

---

# Project Structure

```text
StudentGradeManager/
│
└── src/
    │
    ├── Main.java
    ├── Student.java
    ├── GradeManager.java
    └── ReportGenerator.java
```

---

# File Description

## Main.java

* Entry point of the application
* Displays menu
* Handles user input
* Controls program flow

## Student.java

* Stores student data
* Contains:

  * Student name
  * Marks
  * Grade calculation method

## GradeManager.java

* Stores all students using ArrayList
* Handles all calculations and operations

## ReportGenerator.java

* Displays formatted student reports

---

# Grade Criteria

| Marks        | Grade |
| ------------ | ----- |
| 90 and above | A     |
| 75 - 89      | B     |
| 50 - 74      | C     |
| Below 50     | Fail  |

---

# How to Run the Project

## Step 1

Open terminal inside the `src` folder.

## Step 2

Compile all Java files.

```bash
javac *.java
```

## Step 3

Run the program.

```bash
java Main
```

---

# Sample Output

```text
==== Student Grade Management System ====

1. Add Student
2. View Students
3. Generate Report
4. Exit
```

---

# Concepts Learned

This project helps in understanding:

* Java Basics
* ArrayList Operations
* User Input Handling
* Method Creation
* Data Management
* OOP Principles
* Console Application Development

---

# Future Improvements

* GUI Version using Swing or JavaFX
* File Handling
* Database Integration
* Student Search Feature
* Update/Delete Student Records
* Export Report to PDF or Excel

---

# Author

Ashok Cherukuri
