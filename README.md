# Library-Data-Base
**Project Proposal**
**Hunter Hayden CSCI 121**


---

## What is this project?

This project is a command-line library management system designed for small libraries or personal collections. It replaces messy spreadsheets or paper records with a structured system that allows users to add, search, and manage library items efficiently.

---

## Why build it?

The goal of this project is to demonstrate object-oriented programming (OOP) concepts in a real-world application. Instead of relying on long conditional statements, the program uses classes, inheritance, and polymorphism to manage different types of library items and user rules automatically.

---

## How it works

### Main Classes

The system is built around a base class:

- `LibraryItem` (base class)

From this class, specialized item types are created:

- `Book`
- `Periodical`

Each subclass can define its own behavior, such as different loan periods, using polymorphism.

A central `Library` class manages the collection, searching, and file operations.

---

## UML Diagram

```mermaid
classDiagram

class LibraryItem {
  +String id
  +String title
  +boolean isAvailable
  +int getLoanPeriod()
}

class Book {
  +String author
  +int getLoanPeriod()
}

class Periodical {
  +int issueNumber
  +int getLoanPeriod()
}

class Member {
  +String memberId
  +String name
  +int currentLoans
  +int maxLoans
  +boolean canBorrow()
}

class Student {
  +int maxLoans = 10
}

class Faculty {
  +int maxLoans = 50
}

class Library {
  +HashMap items
  +HashMap members
  +addItem()
  +removeItem()
  +checkoutItem()
  +returnItem()
  +loadCSV()
  +saveCSV()
}

LibraryItem <|-- Book
LibraryItem <|-- Periodical

Member <|-- Student
Member <|-- Faculty

Library --> LibraryItem
Library --> Member
