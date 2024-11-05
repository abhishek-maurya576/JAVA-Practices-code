On **Day 3**, the focus is on **Operators** in Java, including various types and how they’re used in calculations and logical expressions. Here’s a breakdown of the key concepts and a few exercises to reinforce them.

### Day 3: Java Operators

#### Topics:
1. **Arithmetic Operators**
2. **Assignment Operators**
3. **Comparison (Relational) Operators**
4. **Logical Operators**

---

#### 1. Arithmetic Operators
These operators handle basic mathematical operations. They work on numeric data types like `int`, `double`, etc.

- **Addition (`+`)**: Adds two values.  
- **Subtraction (`-`)**: Subtracts the second value from the first.  
- **Multiplication (`*`)**: Multiplies two values.  
- **Division (`/`)**: Divides the first value by the second.  
- **Modulus (`%`)**: Gives the remainder after division.

**Example**:
```java
int a = 10;
int b = 3;
System.out.println("Addition: " + (a + b));   // Output: 13
System.out.println("Modulus: " + (a % b));    // Output: 1
```

---

#### 2. Assignment Operators
These operators assign values to variables. The most common assignment operator is `=`.

- **Simple Assignment (`=`)**: Assigns the right-hand value to the left-hand variable.
- **Compound Assignment (`+=`, `-=`, `*=`, `/=`, `%=`)**: Combines an arithmetic operation with assignment.

**Example**:
```java
int x = 5;
x += 3;  // Equivalent to x = x + 3, so x is now 8
```

---

#### 3. Comparison (Relational) Operators
These operators compare two values and return a boolean (`true` or `false`).

- **Equal to (`==`)**: Checks if two values are equal.
- **Not Equal to (`!=`)**: Checks if two values are not equal.
- **Greater than (`>`)**: Checks if the left value is greater.
- **Less than (`<`)**: Checks if the left value is less.
- **Greater than or Equal to (`>=`)**: Checks if the left value is greater or equal.
- **Less than or Equal to (`<=`)**: Checks if the left value is less or equal.

**Example**:
```java
int a = 5;
int b = 10;
System.out.println(a < b);  // Output: true
System.out.println(a == b); // Output: false
```

---

#### 4. Logical Operators
These operators work with boolean values and are commonly used with conditional statements.

- **Logical AND (`&&`)**: True if both conditions are true.
- **Logical OR (`||`)**: True if at least one condition is true.
- **Logical NOT (`!`)**: Reverses the value of a boolean expression.

**Example**:
```java
boolean isSunny = true;
boolean isWeekend = false;
System.out.println(isSunny && isWeekend); // Output: false
System.out.println(isSunny || isWeekend); // Output: true
```

---

### Problems

1. **Simple Calculator**  
   Write a Java program that takes two numbers and performs the following operations: addition, subtraction, multiplication, division, and modulus. Print the result for each operation.

2. **Logical Comparison**  
   Write a program that takes two integers and checks the following:
   - If the first number is greater than the second.
   - If the first number is equal to the second.
   - If the second number is not equal to the first.

3. **Even or Odd**  
   Write a Java program that checks if a given integer is even or odd using the modulus operator `%`.

4. **Grade Checker**  
   Write a program where you input a student’s score (0-100) and output:
   - `Pass` if the score is greater than or equal to 40.
   - `Fail` if the score is below 40.  

5. **Logical Operations Practice**  
   Write a program to check if:
   - A number is positive and even.
   - A number is negative or odd.
   
These exercises will reinforce your understanding of Java operators by applying them in various scenarios. Let me know if you need help with any of the solutions!