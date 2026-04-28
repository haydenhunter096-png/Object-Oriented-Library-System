# Library-Data-Base

**Project Proposal**  
**Hunter Hayden CSCI 121**

---

## What is this project?

This project is a command-line library management system for a small library or personal collection. It allows a user to add books, view inventory, check out items, and return items.

The goal is to replace messy paper records or spreadsheets with a simple structured program.

---

## Why build it?

The goal of this project is to demonstrate object-oriented programming concepts in a real-world application.

This project uses:

- Classes
- Inheritance
- Encapsulation
- Abstract classes
- Method overriding
- Collections such as `HashMap`

---

## How it works

The system is built around an abstract base class:

- `LibraryItem`

From this class, specialized item types are created:

- `Book`
- `Periodical`

A central `Library` class stores and manages the collection using a `HashMap`.

The project also includes a base member class:

- `Member`

From this class, specialized member types are created:

- `Student`
- `Faculty`

These member types show inheritance and allow different borrowing limits.

---

## Current Features

- Add a new book
- Show inventory
- Check out an item
- Return an item
- Track whether an item is available
- Use different item types such as books and periodicals
- Use different member types such as students and faculty

---


## How to Compile and Run

In the terminal, compile and run all Java files:

```bash
javac *.java && java Main


classDiagram

class LibraryItem {
  -String id
  -String title
  -boolean available
  +String getId()
  +String getTitle()
  +boolean isAvailable()
  +void setAvailable(boolean available)
}

class Book {
  -String author
  +String getAuthor()
}

class Periodical {
  -int issueNumber
  +int getIssueNumber()
}

class Member {
  -String id
  -String name
  -int activeLoans
  +String getId()
  +String getName()
  +boolean canBorrow()
  +void addLoan()
  +void removeLoan()
  #int getMaxLoans()
}

class Student {
  #int getMaxLoans()
}

class Faculty {
  #int getMaxLoans()
}

class Library {
  -HashMap~String, LibraryItem~ items
  -HashMap~String, Member~ members
  +void addItem(LibraryItem item)
  +void addMember(Member member)
  +void checkout(String itemId, String memberId)
  +void returnItem(String itemId, String memberId)
  +void printInventory()
}

LibraryItem <|-- Book
LibraryItem <|-- Periodical

Member <|-- Student
Member <|-- Faculty

Library --> LibraryItem
Library --> Member
