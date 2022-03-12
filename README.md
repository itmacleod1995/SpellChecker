# SpellChecker
This small project acts as a spellchecker, where the user enters a word or sentence and the program states which words are spelled incorrectly. 

The project involves a repository of roughly 100,000 English words contained in a file. The program reads the file in, inserting each word efficiently O(log n) into a tree data structure. The user is then asked to enter their phrase. Each word is then looked up in the tree, and if it is not found, the program notifies the user that their word is misspelled.

The program continues until the user types END.


<img width="331" alt="Screen Shot 2022-03-12 at 12 04 24 PM" src="https://user-images.githubusercontent.com/54502182/158027512-1439bc8e-014c-42e6-aa98-0652837820a1.png">
