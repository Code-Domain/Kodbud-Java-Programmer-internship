# 📘 Student Report Management System

## 📌 Internship Project – Task 2

**Role:** Java Programmer Intern
**Organization:** Kudbud
**Developer:** Code-Domain

---

## 🚀 Project Overview

The **Student Report Management System** is a console-based Java application designed to manage and organize student academic records efficiently.

Developed as part of my Java Programmer Internship at Kudbud, this project demonstrates the practical application of Core Java, Object-Oriented Programming, and the Java Collections Framework to build a structured, menu-driven management system.

The application allows dynamic creation, retrieval, modification, and deletion of student records while automatically calculating academic performance metrics such as percentage and grade.

---

## 🎯 Project Objectives

* Design a structured console-based management system
* Apply Object-Oriented Programming principles
* Use Java Collections for dynamic data storage
* Implement menu-driven user interaction
* Manage and compute academic performance data

---

## ✨ Key Functionalities

### 🔹 Student Record Management

* Add new student reports
* Delete existing student reports
* Search student reports by unique ID
* Prevent duplicate student IDs

### 🔹 Academic Data Handling

* Store multiple subjects per student
* Prevent duplicate subject entries
* Automatically calculate percentage
* Automatically assign grade (A–F)

### 🔹 System Configuration

* Modify full marks dynamically via Settings
* Continuous menu-driven interface until user exit

---

## 🛠 Technical Implementation

### 🔹 Programming Language

* Java

### 🔹 Core Technologies

* Java Collections Framework

  * `ArrayList` → Dynamic storage of student records
  * `HashMap` → Subject–Marks mapping
* `Scanner` → Console input handling

---

## 🧠 Core Concepts Demonstrated

### 🔸 Object-Oriented Programming

* Class and Object Design
* Constructors
* Instance Variables
* Static Variables
* Encapsulation
* Method Abstraction
* Use of `this` keyword

### 🔸 Data Structures & Collections

* Dynamic data management using `ArrayList`
* Key-value mapping using `HashMap`
* Iteration using `Map.Entry`

### 🔸 Control Flow Mechanisms

* Conditional Statements (if–else)
* Looping Structures (for, while, do-while)
* Menu-driven program execution
* Logical validations

---

## 📊 Performance Calculation Logic

### Percentage Formula

```
Percentage = (Total Marks × 100) / (Number of Subjects × Full Marks)
```

### Grade Allocation Criteria

| Percentage   | Grade |
| ------------ | ----- |
| 90 and above | A     |
| 80 – 89      | B     |
| 70 – 79      | C     |
| 60 – 69      | D     |
| 50 – 59      | E     |
| Below 50     | F     |

---

## 📂 Project Structure

```
Task2/
│
├── bin/
│   └── ReportManager.class
│
└── src/
    ├── ReportManager.java
    └── task2.md
```

### Directory Explanation

* **bin/** → Contains compiled bytecode file
* **src/** → Contains source code and documentation

  * `ReportManager.java` → Main application file
  * `task2.md` → Project documentation

---

## ▶ Execution Instructions

1. Open the project in any Java IDE (Eclipse / IntelliJ / VS Code).
2. Compile `ReportManager.java`.
3. Run the application.
4. Select operations from the console menu.

---

## 📌 Available Operations

```
1 → Add Student Report  
2 → Delete Student Report  
3 → Search Student Report  
4 → Settings  
5 → Exit Application  
```

---

## 🎓 Skills Demonstrated

* Structured application design
* Practical implementation of OOP
* Efficient data management using Collections
* Logical problem-solving
* Console-based UI development
* Real-world data handling simulation

---

## 📈 Project Outcome

This project strengthened my understanding of:

* Java fundamentals
* Object-Oriented design patterns
* Collection-based data handling
* Building scalable console applications

It reflects my ability to design and implement a structured data management system using core Java concepts in a real internship environment.

---

## 👨‍💻 Author

**Code-Domain**
Java Programmer Intern
Kudbud
