# Hashtables

## Challenge
Build a HashTable from scratch that can handle collisions.

## Approach & Efficiency
I created a HashTable class that has an array of arrays. The key is stored at it's the first null index of the array stored at the index of the hashed value of the key for the higher level array. That is how it handles collisions. Another key with the same hash value will be stored at the next set of indeces. The get function returns the next index of the array at the hashed index where the key equals that index's value.

## API
add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
get: takes in the key and returns the value from the table.
contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
hash: takes in an arbitrary key and returns an index in the collection.

<a href="../src/main/java/codechallenges/hashtable">Code here</a>