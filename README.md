# From PowerPoint "23-PracticeProblems"; authored by David G. Cooper
## Prompt
Imagine that someone wrote java without arrays and without the Collection
framework. Instead the only Generic Data Structure Type was a Stack with the
following methods:
• T peek(); // check to see what is on the top of the stack
• T pop(); // remove and return what is on the top of the stack
• boolean push(T item); // push an item onto the top of the stack
**Write a class called Array<T> that uses Stack objects and any primitive types
needed to implement an array of T's.**
The Array class should have the following methods:
• public boolean at(int index, T item) // put an item at the specified index (growing the array if
index is size)
• public T at(int index) // return an item from the specified index
• public int length() // return the current number of elements in the array.
