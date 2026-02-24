# 🧩 Palindrome Checker App
## Use Case 8 — LinkedList Based Palindrome Checker

### 📌 Objective
To validate whether a string is a palindrome using a LinkedList data structure and double-ended comparison.

---

## 📖 Description

This implementation:

- Converts the input string into a LinkedList of characters
- Removes elements from both ends using:
    - removeFirst()
    - removeLast()
- Compares characters until the list size becomes 0 or 1
- Determines whether the string is a palindrome

This demonstrates how LinkedList supports symmetric validation using built-in double-ended operations.

---

## 🔑 Key Concepts Used

- Singly Linked List
- Node traversal
- Double-ended operations
- removeFirst() and removeLast()
- Symmetric comparison logic

---

## ⚙️ Data Structure Used

- LinkedList<Character>

---

## ⏱ Complexity

Time Complexity: O(n)  
Space Complexity: O(n)

---

## 🖥 Sample Output

Input : level  
Is Palindrome? : true

---

## ▶️ Compile & Run

Compile:
javac App/src/PalindromeCheckerApp.java

Run:
java -cp App/src PalindromeCheckerApp

---

## 👨‍💻 Author
Rishika Raj 