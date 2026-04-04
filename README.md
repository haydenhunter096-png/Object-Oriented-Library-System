# Library-Data-Base
**Project Proposal**
**Hunter Hayden CSCI 121**

---

## What is this project?
This is a command-line tool designed to help small libraries or personal collectors get away from using messy spreadsheets or paper notes. It’s an automated system that handles everything from adding new books to tracking who has borrowed what.

## Why build it?
The main goal is to show how to use Object-Oriented Programming (OOP) to solve a real-world problem. Instead of writing long, complicated "if-else" statements, I’m using inheritance and polymorphism to let the code handle different rules for different items automatically.

## How it works (The Data Stuff)

### The Setup (Classes)
I'm breaking the data down into a few main "buckets":

1. **Library Items:** I’ll have a base class called `LibraryItem`. From there, I’ll create specific types like `Book` and `Periodical`. 
   * **The Trick:** Since a book can be kept longer than a magazine, I’ll use a polymorphic method to calculate the due date. The system will "just know" which rule to apply based on the item type.

2. **Members:** I’ll have a `Member` class with subclasses for `Student` and `Faculty`. 
   * **The Logic:** Students might only be allowed to check out 10 items, while Faculty can take 50. The code will check these limits automatically before allowing a checkout.

### Storage & Speed
* **Fast Searching:** I’ll store everything in a `HashMap`. This way, if a library has 10,000 books, finding one by its ISBN is nearly instant.
* **Saving Progress:** I’m using a simple CSV file (`library_data.csv`) to save everything. When the program starts, it reads the file to pick up where it left off. When you exit, it saves all the current changes.

---

## Use Case: Checking Out a Book
* **Step 1:** The user enters the Member ID and the Book ID.
* **Step 2:** The system checks the "Member Map" to see if the person exists and hasn't hit their borrowing limit.
* **Step 3:** The system checks the "Inventory Map" to see if the book is actually on the shelf.
* **Step 4:** If everything is good, it links the book to the member and marks it as unavailable.

---

## The Game Plan (Milestones)

1. **Week 1:** Get the basic classes and the UML diagram finished and approved.
2. **Week 2:** Build the "Children" classes (Book, Periodical, Student) and make sure the different borrowing rules work.
3. **Week 3:** Build the main Library controller and get the HashMap searching working.
4. **Week 4:** Set up the File I/O so the data actually saves to the computer.
5. **Final Step:** Build the menu, clean up the text, and squash any bugs.

---

## The Elevator Pitch
"I’m building a Library Management System that uses smart object-oriented design to handle the heavy lifting of inventory tracking. Instead of a basic list, my project uses inheritance to automatically manage different rules—like shorter loan times for magazines or higher checkout limits for faculty members. It’s fast, it saves your data to a file so you never lose track of a book, and it’s built to scale easily as the collection grows."
