|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020015|
| Nama |  Aulia Resty Azizah |
| Kelas | TI - 1I |
| Repository | https://github.com/AuliaRestyy/ALSD |

# Labs #10 Stack

## 2.1.2 Result

![experiment1](img/experiment1-1.png)
![experiment1](img/experiment1-2.png)
![experiment1](img/experiment1-3.png)


**2.1.3 Question** 
1. The stack is used because it follows the LIFO (Last-In-First-Out) behavior. The last assignment submitted is the first one to be graded.
2. The different between push() and pop() is push() adds a new assignment (student) to the top of the stack. Meanwhile pop() removes and returns the top assignment (most recent one submitted).
3. The program check !isFull() before calling push() to prevent adding a new element when the stack is already full. Without this check an ArrayIndexOutOfBoundsException may occur because you would write outside the bounds of the array.
4. The program can hold a maximum of 5 student assignment, this limitation is defined in this line of code

![stack size](img/size.png)

5. To allow the system to display the first submitted assignment, I add a new method name getFirstAssignment to the StudentAssignmentStack class. This method returns the element at index 0 of the stack array, which represent the first student who submit the assignment. In StudentDemo class, I add a new menu option to allow users to choose to view the first student assignment. When selected, this option calls the new method and displays the student's name. I also change the loop condition to choice >= 1 && choice <= 5.
6. To determine how many assignment are currently stored in the stack, a method named totAssignment() was implemented in the StudentAssignmentStack class. This method returns the value of top + 1. A new menu option added to StudentDemo class to allow users to choose to view the total assignment submitted
7. From this experiment I learned about stack behavior, namely lifo, which can be implemented in specific situations. Because it is lifo, stack makes it easy for us to see and delete the most recent data. For example, a trolley in a supermarket, the trolley we take is the last trolley added to the trolley queue.

## 2.2.2 Result

![experiment2](img/experiment2.png)

**2.2.3 Question** 
1. The workflow 
- A new ConversionStack object is created to temporarily hold the binary digits
- As long as the grade is greater than 0, the grade will be continuously modulated by 2 and the result stored in the stack
- After the grade is updated, the grade variable is updated to grade / 2
- After the grade becomes 0, the loop stops and returns a binary string
2. If we change the loop condition to while (grade != 0) functionally there is no difference in the output as long as grade is a positive integer. Both conditions will terminate the loop when grade reaches 0. However, a negative grade could cause an infinite loop or produce incorrect results. The best practice is to use grade > 0.

## 2.4 Assignment

![assignment](img/assignment-1.png)
![assignment](img/assignment-2.png)
![assignment](img/assignment-3.png)

**Class and Method**
1. ExcuseLetter4()
This class represents the structure of an excuse letter. It stores id, name, className, typeOfExcuse, duration (how many days absent)
2. ExcuseLetterStack()
Implements the stack logic
- boolean isFull() returns true if the stack is full (size-1)
- boolean isEmpty() returns true if the stack is empty (top = -1)
- void push() addds a letter to the top of the stack, if full it prints a warning
- pop() removes (top--) and returns the top letter from the stack, if empty returns null
- peek() returns the top letter without removing it, if empty returns null
- searchLetter() searches the stack from bottom to top for a letter where the name matches(ignoring case). If found, returns the leter. If not, prints message and returns null

**The workflow**
- The program shows a menu and asks for the user input
- Based on the choice, the program forms actions using the stack (ExcuseLetterStack object)
- Option 1: user inputs details: name, ID, class, excuse type, and duration
- A new ExcuseLetter4 object is created and push this object into the stack using stack.push()
- Option 2: the latest letter is popped using stack.pop()
- If a letter is found, the user asks whether to accept it (y/n)
- The system displays a message confirming whether the letter was accepted
- Option 3: the program uses stack.peek() to look at the most recent letter without removing it, if found then it displays the name of the last student who submitted
- Option 4: the user input a name
- The program uses stack.searchLette() to find a letter in the stack matching that name
- If found, it displays the full letter info
