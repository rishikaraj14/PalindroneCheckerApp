# 🧩 Palindrome Checker App
## Use Case 10 — Case-Insensitive & Space-Ignored Palindrome

### 📌 Objective
To validate whether a string is a palindrome while ignoring spaces, special characters, and letter case.

---

## 📖 Description

This implementation preprocesses the input string before validation.

Normalization includes:
- Removing spaces and special characters
- Converting all characters to lowercase

After preprocessing, the palindrome logic compares characters from both ends of the normalized string.

Example:
"A man a plan a canal Panama"

---

## 🔑 Key Concepts Used

- String preprocessing
- Regular expressions (replaceAll)
- Case normalization (toLowerCase)
- Symmetric character comparison

---

## ⚙️ Data Structure Used

- String (normalized string)
- Character indexing

---

## ⏱ Complexity

Time Complexity: O(n)  
Space Complexity: O(n)

---

## 🖥 Sample Output

Input : A man a plan a canal Panama  
Is Palindrome? : true

---

## ▶️ Compile & Run

Compile:
javac UseCase10PalindromeCheckerApp.java

Run:
java UseCase10PalindromeCheckerApp

---

## 👨‍💻 Author
Rishika Raj 