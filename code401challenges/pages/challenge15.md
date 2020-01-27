# Trees
This assigment is the setup of the environment with which we will do code challenges
for the Binary Tree and Binary Search Tree data types.

## Challenge
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Create a BinaryTree class
Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

Create a BinarySearchTree class
Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
This was fairly straightforward. I used recursiomn for most of the methods as was outlined in our reading assignments.

## API
BinaryTree.java
  - preOrder(): Returns root >> left >> right
  - inOrde(): returns left >> root >> right
  - postOrder(): returns left >> right >> root

BinarySearchTree.java
  -add(value): adds a node with a value while keeping the tree balanced
  -contains(value): Returns a boolean of whether or not the BST contains the value