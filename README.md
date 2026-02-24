# 🧩 Palindrome Checker App
## Use Case 7 — Deque-Based Optimized Palindrome Checker

### 📌 Objective
To validate whether a string is a palindrome using a Deque (Double Ended Queue) for efficient front and rear comparison.

---

## 📖 Description

This implementation:

- Inserts characters into a Deque
- Removes first and last elements
- Compares them directly
- Confirms palindrome if all characters match

This approach is optimized because it avoids using separate data structures like Stack and Queue.

---

## 🔑 Key Concepts Used

- Deque (Double Ended Queue)
- Front and Rear Access
- addLast(), removeFirst(), removeLast()
- Direct symmetric comparison
- Optimized data handling

---

## ⚙️ Data Structure Used

- Deque<Character> (Implemented using LinkedList)

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