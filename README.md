# 📚 Student Grade Calculator 

A simple **Java console application** that calculates a student's grade based on the marks obtained in different subjects.
It takes input from the user for multiple subjects, computes the **total marks**, **percentage**, and assigns a **grade** according to predefined grading criteria.

---

## ✨ Features

* 📥 Accepts **marks** for multiple subjects from the user
* ➗ Calculates **total** and **average percentage**
* 🎯 Assigns a grade based on percentage:

  * **A** → 90% and above
  * **B** → 80% – 89%
  * **C** → 70% – 79%
  * **D** → 60% – 69%
  * **F** → Below 60%
* 🛡️ Handles invalid inputs (negative or above maximum marks)
* 🖥️ Simple **console-based** interface

---

## 📂 File Structure

```
StudentGradeCalculator/
│── StudentGradeCalculator.java   # Main program file
│── README.md                     # Project documentation
```

---

## 🚀 How It Works

1. The program asks the user how many subjects they have.
2. The user enters the marks for each subject.
3. The program calculates:

   * Total marks obtained
   * Percentage score
   * Grade based on percentage
4. The results are displayed in the console.

---

## 💻 Example Output

```
Enter number of subjects: 3
Enter marks for subject 1: 85
Enter marks for subject 2: 90
Enter marks for subject 3: 78

Total Marks = 253
Percentage = 84.33%
Grade = B
```

---

## 🛠️ How to Run

### 1️⃣ Compile the program

```bash
javac StudentGradeCalculator.java
```

### 2️⃣ Run the program

```bash
java StudentGradeCalculator
```

---

## 📜 Sample Code

```java
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--;
                continue;
            }
            totalMarks += marks;
        }

        double percentage = (double) totalMarks / subjects;
        char grade;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("\nTotal Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);
        
        sc.close();
    }
}


If you want, I can also make a **version of this README with emojis and a colorful markdown style** for GitHub so it pops visually. That would make it look more attractive.
