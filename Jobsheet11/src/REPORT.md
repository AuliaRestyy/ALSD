|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020015|
| Nama |  Aulia Resty Azizah |
| Kelas | TI - 1I |
| Repository | https://github.com/AuliaRestyy/ALSD |

# Labs #11 QUEUE

## 2.1.2 Result

![experiment1](img/experiment1-1.png)
![experiment1](img/experiment1-2.png)

**2.1.3 Question** 
1. In the Queue class, the attributes front and rear are initially set to -1 to inidcate that the queue is currently empty and has no valid front or rear position yet
2. In the enqueue method, this line is used to implement the behavior of a circular queue. This condition checks whether the rear pointer has reached the last index of the aray. If it has, it wraps around and resets rear to 0 so that the queue can use empty slots at the beginning of the array. This allows for more efficient memory usage, preventing unused space even when the array is not fully occupied linearly
3. Similarly, in the dequeue method, this line ensures that when the front pointer reaches the end of the array, it wraps back to the beginning. This behavior is essential in a circular queue because it allows the queue to continue functioning correctly after some elements have been removed from the front.
4. In the print method, the loop variable i starts from the value of front rather than 0 because front marks the current starting point of the queue.
5. This line is used to increment index i while maintaining the circular structure of the queue. by using the modulo operator, the index automatically wraps around to 0 when it reaches max.
6. A queue overflow occurs when an attempt is made to enqueue data into a queue that is already full. In the program this condition is handled in this line

![experiment1](img/experiment1-2.png)

7. I modify this method

![experiment1](img/experiment1-2.png)

## 2.2.2 Result

![experiment1](img/experiment1-1.png)
![experiment1](img/experiment1-2.png)

**2.2.3 Question** 
1. The Queue class works with primitive int values, while StudentQueue is designed to manage complex objects of type Student.
2. The enqueue and dequeue methods in StudentQueue are mostly the same in logic as those in Queue, but the difference is in the data they handle. In Queue, the methods work with numbers (int), while in StudentQueue, they work with objects of the Student class. So instead of just adding or removing a number, the methods in StudentQueue add or remove student data,
3. The front attribute is initialized to 0 which differs from the Queue class where front is initially -1. This difference is due to a design variation. The StudentQueue class assumes that the front position is always pointing to a valid index, even if the queue is empty.
4. Program:

![experiment1](img/experiment1-1.png)
![experiment1](img/experiment1-2.png)
![experiment1](img/experiment1-1.png)

## 2.3 Assignment

![experiment1](img/experiment1-1.png)
![experiment1](img/experiment1-2.png)

**Program Flow** 
1. The Queue class work

