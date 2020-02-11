<h1>Insertion Sort</h1>

Insertion sort is an algorithm which iterates through an array and brings each value to the left until it is not
less than the value to its left. The pseudocode for an insertion sort can be seen below.

Pseudocode
  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

<img src="../assets/insertionsort.jpg"
     alt="White Board Picture"
     style="float: left; margin-right: 10px; width: 200px;" />

The above image shows the array and the variables at each iteration through the for loop.

On the first pass through, 4 is brought all the way to the left.

On the second pass, 23 is not moved because it is greater than 8.

On the third pass, 42 is not moved because it is greater than 23.

on the fourth pass, 16 is moved to the left until it gets to 8.

On the fifth pass, 15 is moved to the left until it gets to 8.

Now the array is sorted.

<a href="../src/main/java/codechallenges/sort">Code here</a>