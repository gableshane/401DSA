## Challenge
<p>Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.
The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.</p>


## Approach & Efficiency
I used two while loops to swap the the order of the stack.


## Solution
<img src="../assets/challenge11.jpg"
     alt="White Board Picture"
     style="float: left; margin-right: 10px; width: 200px;" />

<a href="../../stack-and-queue/src/main/java/stackandqueues/PseudoQueue.java">Code here</a>