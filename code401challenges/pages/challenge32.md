## Challenge
<p>Write a function called tree_intersection that takes two binary tree parameters.
Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.</p>


## Approach & Efficiency
I iterated through the first binary tree adding everything in it to a hash set. I then iterate through the second array and add each value in that array to an array list if it is contained in the hashset. I then returned the array.


## Solution
<img src="../assets/intersectingtrees.jpg"
     alt="White Board Picture"
     style="float: left; margin-right: 10px; width: 200px;" />

<a href="../src/main/java/codechallenges/treeintersection">Code here</a>