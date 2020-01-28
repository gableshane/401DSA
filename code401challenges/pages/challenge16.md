## Challenge
<p>Write a function called FizzBuzzTree which takes a tree as an argument.
Without utilizing any of the built-in methods available to your language, determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
If the value is divisible by 3, replace the value with “Fizz”
If the value is divisible by 5, replace the value with “Buzz”
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
If the value is not divisible by 3 or 5, simply turn the number into a String.
Return the new tree.</p>


## Approach & Efficiency
O(n)
I used a helper function to iterate through the array just like preOrder but instead of returning a value it sets a value to a new node on a new tree and mirrors the original tree as it goes through. And if the value is disible by 3,5, or both it sets that value to Fizz,Buzz, or FizzBuzz respectively.


## Solution
<img src="../assets/challenge14.jpg"
     alt="White Board Picture"
     style="float: left; margin-right: 10px; width: 200px;" />

<a href="../src/main/java/codechallenges/utilities">Code here</a>