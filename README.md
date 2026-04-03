# Library-Data-Base
# Library Management System

**CSCI 121 Final Project Proposal**  
**Hunter Hayden**

## Purpose

This project is intended to demonstrate mastery of concepts learned in CSCI 121, especially object-oriented programming, data structures, and basic file storage.

## Overview

The **Library Management System** is a command-line application that helps manage a collection of books and library members. The program will allow the user to add books, search for books, register members, borrow and return books, and view which books are currently available. It will also store data in a file so that the library collection and member information can be saved between sessions.

This project models a real-world library system in a simple way and gives the user a practical tool for organizing books and borrowing activity.

## Intended Users

The main users of this system would be:
- a person managing a small library
- a student building a simple book-tracking program
- anyone who wants a clean way to organize books and borrowing records

## Problems the Project Solves

This project is meant to solve the problem of keeping track of books manually. Instead of using paper notes or memory, the system will store books, members, and borrowing status in an organized structure. It will make it easier to:
- find books quickly
- see which books are available
- keep track of who borrowed what
- maintain records over time

## Data Design

The program will manage two main types of data:

### Book
A book will store:
- title
- author
- ISBN
- availability status

### Member
A member will store:
- member ID
- name
- list of borrowed books

### Main Data Structure
The program will likely use:
- an `ArrayList<Book>` or `vector<Book>` for storing books
- an `ArrayList<Member>` or `vector<Member>` for storing members

These collections will be stored inside a main `Library` class.

## Basic Structure

```text
Library
├── books
├── members
├── addBook()
├── removeBook()
├── searchBook()
├── registerMember()
├── borrowBook()
├── returnBook()
├── saveData()
└── loadData()

Book
├── title
├── author
├── ISBN
└── available

Member
├── memberID
├── name
└── borrowedBooks
