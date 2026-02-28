
# 📚 Library Management System

### 🚀 Task 5 – Java Programmer Internship

### 👨‍💻 Developed by: Code Domain

### 🏢 Organization: Kodbud

---

## 📌 Project Description

The **Library Management System** is a console-based Java application developed as part of **Task 5** during my **Java Programmer Internship at Kodbud**.

This project is designed to manage library books efficiently using Object-Oriented Programming principles. It allows users to add, search, display, and remove books through a structured and interactive menu-driven interface.

The application focuses on clean architecture, proper validation, and structured backend logic implementation.

---

## 🎯 Objectives of This Project

* Apply Object-Oriented Programming concepts in a real-world scenario
* Practice Abstraction and Inheritance using abstract classes
* Implement data storage using Java Collections (ArrayList)
* Create a structured and user-friendly console UI
* Perform proper input validation using Regular Expressions
* Build a mini real-world management system

---

## ✨ Key Features

✅ Add New Books with validation
✅ Display All Books in formatted output
✅ Search Book by Title or Serial Number
✅ Remove Book by Title or Serial Number
✅ Prevent Duplicate Serial Numbers
✅ Input Validation (String & Numeric)
✅ Menu-driven Console Interface
✅ Clean and Structured Code Design

---

## 🛠️ Technologies Used

* Java (Core Java)
* Eclipse IDE
* OOP Concepts
* Java Collections Framework (ArrayList)
* Regular Expressions (Regex)

---

## 🏗️ Project Structure

```id="structure01"
libraryfolder/
│
├── MainSystemScreen.java   → Contains main() method (Program Entry Point)
├── Main.java               → Abstract Class (Blueprint for Book)
└── BackSystem.java         → Implements Core Functionalities
```

---

## 🧠 OOP Concepts Applied

This project strongly demonstrates:

* 🔹 Abstraction
* 🔹 Inheritance
* 🔹 Encapsulation
* 🔹 Method Overriding
* 🔹 Constructor Usage
* 🔹 Data Hiding using Private Variables
* 🔹 Use of Getter Methods

---

## 📖 System Workflow

### 1️⃣ Application Start

The program begins execution from `MainSystemScreen.java`, where the main menu is displayed.

### 2️⃣ User Chooses an Option

User selects from:

```id="menu01"
1. Add new books
2. Display all books
3. Search a book by title
4. Remove a book
5. Exit/Close
```

### 3️⃣ Backend Processing

All operations are handled in `BackSystem.java`, which extends the abstract class `Main`.

### 4️⃣ Data Storage

Books are stored dynamically using:

```id="arraylist01"
ArrayList<Main> arraylist
```

---

## 🔍 Validation Rules Implemented

| Field            | Validation Rule                   |
| ---------------- | --------------------------------- |
| Book Title       | Only alphabets and spaces allowed |
| Author Name      | Only alphabets and spaces allowed |
| Serial Number    | Only positive numeric values      |
| Price            | Accepts valid decimal values      |
| Duplicate Serial | Prevented using loop check        |

This ensures clean and secure data entry without runtime errors.

---

## 📷 Sample Console Output

```id="ui01"
===============================================================
        LIBRARY MANAGEMENT SYSTEM
===============================================================
 1. Add new books
 2. Display all books
 3. Search a book by title
 4. Remove a book
 5. Exit/Close
---------------------------------------------------------------
 Enter your Choosen option no. :
```

---

## 🎓 Internship Information

* **Role:** Java Programmer Intern
* **Organization:** Kodbud
* **Task Number:** Task 5
* **Project Type:** Console-Based Application
* **Developer GitHub:** Code Domain

This task helped strengthen my understanding of backend system logic and practical OOP implementation.

---

## 🚀 Learning Outcomes

Through this project, I improved my:

* Java programming skills
* Logical thinking ability
* Backend structure planning
* Clean coding practices
* Debugging and validation handling
* Understanding of abstract classes and inheritance

---

## 🔗 Repository Link

📌 GitHub Repository:
[https://github.com/Code-Domain/Kodbud-Java-Programmer-internship.git](https://github.com/Code-Domain/Kodbud-Java-Programmer-internship.git)

---

## 👨‍💻 Author

**Code Domain**
Java Programmer Intern – Kodbud
Passionate about Backend Development & Clean Code


Just tell me 😎
