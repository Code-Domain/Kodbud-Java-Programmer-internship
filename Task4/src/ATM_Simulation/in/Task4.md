# 🏦 ATM Simulation System (Java)

## 📖 Project Description

The **ATM Simulation System** is a console-based banking application developed using Java.
This project was built as part of **Task 4** during my **Java Programmer Internship at KodBud**.

The application simulates real-world ATM operations, including account authentication, account management, balance transactions, and strict validation rules. The system is designed using Object-Oriented Programming principles and demonstrates structured programming, clean UI formatting, and logical flow control.

This project helped strengthen my understanding of Java fundamentals and real-world problem-solving in banking-based systems.

---

# 🎯 Project Objectives

* To simulate a real ATM interface using Java
* To implement secure login functionality
* To apply input validation using Regular Expressions
* To design a role-based access system (Manager & Customer)
* To practice OOP concepts like Inheritance and Encapsulation
* To manage dynamic data using ArrayList
* To create a clean and professional console UI

---

# 🧩 System Architecture

The system is divided into three main classes:

```
ATM_Simulation/
│
├── MainSystemScreen.java   → Contains main() method (Program entry point)
├── MainSystem.java         → Base class with shared properties
└── AccSettings.java        → Core logic & account operations
```

### 🔹 MainSystemScreen

* Starts the application
* Handles initial login input
* Connects user to account access method

### 🔹 MainSystem

* Stores account properties:

  * Account Name
  * Account Number
  * PIN
  * Balance
* Contains getter and setter methods

### 🔹 AccSettings

* Contains complete ATM logic
* Handles:

  * Manager Panel
  * Customer Panel
  * Deposit & Withdrawal
  * CRUD operations
  * Validation methods

---

# 👨‍💼 Manager Panel Features

The system provides a dedicated Manager Login with administrative access.

### Manager Capabilities:

* ➕ Add new account
* 🔍 Search existing account
* ✏ Edit account holder name
* ❌ Delete account
* 🔐 Secure manager authentication

### Default Manager Credentials:

```
Account Number: 44440000
PIN: 4040
```

---

# 👤 Customer Panel Features

Customers can log in using their Account Number and PIN.

### Customer Operations:

* 📄 View account details
* 💰 Deposit amount
* 💸 Withdraw amount
* 🚪 Exit safely

The system ensures secure transaction handling and prevents overdraft withdrawals.

---

# 🔐 Input Validation System

A strong validation mechanism is implemented to ensure system stability and prevent invalid input.

### Validation Rules:

| Field            | Rule                                     |
| ---------------- | ---------------------------------------- |
| Name             | Only alphabets and single spaces allowed |
| Account Number   | Exactly 8 digits                         |
| PIN              | Exactly 4 digits                         |
| Balance          | Positive numbers only                    |
| Deposit/Withdraw | No negative values                       |
| Leading Zeros    | Not allowed                              |
| Decimals         | Allowed for monetary values              |
| Invalid Formats  | Prevented using Regex                    |

This ensures the system does not crash and maintains data integrity.

---

# 💡 Key Concepts Used

* Object-Oriented Programming (OOP)
* Inheritance
* Encapsulation
* Method Overriding
* ArrayList for dynamic data storage
* Regular Expressions (Regex)
* Looping and Conditional Logic
* Console UI Formatting using printf

---

# 🖥 User Interface Design

The console interface is structured using:

* Proper separators
* Aligned text formatting
* Clear role-based panels
* Professional ATM-style layout

Example UI Structure:

```
========================================
              USER PANEL
========================================
1. Show Account
2. Deposit Amount
3. Withdraw Amount
4. Exit
----------------------------------------
Enter choice:
```

---

# ▶ How to Run the Project

1. Clone or download the project.
2. Open it in your preferred IDE (Eclipse / IntelliJ / VS Code).
3. Run `MainSystemScreen.java`.
4. Enter credentials to log in.
5. Use the menu options to perform operations.

---

# 🧠 Learning Outcomes

This project helped me improve:

* Logical thinking and program structuring
* Writing clean and modular Java code
* Designing role-based authentication systems
* Implementing real-world validation techniques
* Managing dynamic collections
* Creating user-friendly console interfaces

It strengthened my foundation in backend logic development and real-world application design.

---

# 🚀 Future Enhancements

* 📜 Transaction history feature
* 💾 File handling for data persistence
* 🔐 PIN encryption for security
* 🗄 Database integration (MySQL)
* 🖥 GUI version using JavaFX or Swing
* 🌐 Web-based version using Spring Boot

---

# 👨‍💻 Author

Developed by Code Domain as part of:

**Java Programmer Internship – Task 4**


