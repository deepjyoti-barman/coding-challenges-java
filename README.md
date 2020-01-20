# Coding Challenges in Java

Includes problems and source code of solutions to many different general, intermediate and advanced level coding challenges given in exams (online/offline) or competitive programming round of interviews.


## Table of Contents

- [Prerequisite](#prerequisite)
- [Directory Structure](#directory-structure)
- [Index](#index)
- [List of Problems](#list-of-problems)
- [Creators](#creators)


## Prerequisite

All the problems are solved in Java. So, before you to go through and work with the given solution a prior knowledge to different chapters in Java like - Data types, Operators, Control statements, Looping statements, Methods, Arrays, Strings, Classes and Objects, Collection framework, Exceptions and a basic understanding of Data Structures is required.


## Directory Structure

```text
coding-challenges-java/
├── 1D Arrays/
├── 2D Arrays/
├── Algorithms/
│   ├── Searching Algorithms/
│   └── Sorting Algorithms/
├── Basic Programming/
├── Data Structures/
│   ├── Linked List/
│   ├── Queue/
│   └── Stack/
├── Patterns/
├── Recursion/
└── Strings/
```

## Index

1. [1D Arrays](#1d-arrays)
2. [2D Arrays](#2d-arrays)
3. [Algorithms](#algorithms)
   - [Searching Algorithms](#searching-algorithms)
   - [Sorting Algorithms](#sorting-algorithms)
4. [Basic Programs](#basic-programs)
5. [Data Structures](#data-structures)
   - [Linked List](#linked-lists)
   - [Queue](#queue)
   - [Stack](#stack)
6. [Patterns](#patterns)
7. [Recursion](#recursion)
8. [Strings](#strings)


## List of Problems

### 1D Arrays

```text
- 001_Write a program to initialize an array and display all its elements.

- 002_Write a program to find the maximum element of an array.
     Input: 20 40 30 50 10
    Output: 50

- 003_Write a program to find the second maximum element of an array.
     Input: 20 50 30 10 40
    Output: 40
```

### 2D Arrays

```text
- 001_Write a program to initialize a 2D array and display all its elements.

- 002_Write a program to verify couple of given 2D arrays are identical (i.e. same) or different.
     Input-1: 10 20 30 40
              10 20 30 40
    Output-1: Given 2D arrays are identical

     Input-2: 10 20 40 30
              10 20 30 40
    Output-2: Given 2D arrays are different

     Input-3: 10 20 40 30
              10 20
    Output-3: Given 2D arrays are different

```

### Algorithms

#### Searching Algorithms

```text
- 001_Write a program to find an element and its position in the array using Linear Search algorithm.
     Input-1: 50 10 30 40 20
              30
    Output-1: Element is found at index = 2

     Input-2: 50 40 30 20 10
              70
    Output-2: Element is not found

- 002_Write a program to find an element and its position in the array using Binary Search algorithm.
  [Note: Binary Search algorithm works only with sorted arrays, so if the given array is not sorted
  remember to sort the elements of the array before searching for the desired element]
     Input-1: 11 22 33 44 55
              33
    Output-1: Element is found at index = 2

     Input-2: 77 55 33 22 11
              55
    Output-2: Element is found at index = 3

     Input-3: 77 55 33 22 11
              99
    Output-3: Element is not found
```

#### Sorting Algorithms

```text
- 001_Write a program to sort an unsorted array in ascending and descending order using Bubble Sort
  algorithm.
     Input: 33 22 11 55 44
    Output: 11 22 33 44 55
            55 44 33 22 11

- 002_Write a program to sort an unsorted array in ascending and descending order using Selection Sort
  algorithm.
     Input: 33 22 11 55 44
    Output: 11 22 33 44 55
            55 44 33 22 11

- 003_Write a program to sort an unsorted array in ascending and descending order using Selection Sort
  algorithm.
  [Note: In this case call the method to sort the array in ascending or descending order through method
  chaining.
   e.g - obj_ref.selectionSortAsc().displayArray();
         obj_ref.selectionSortDesc().displayArray();]
     Input: 33 22 11 55 44
    Output: 11 22 33 44 55
            55 44 33 22 11
```

### Basic Programs

```text
- 001_Write a program to validate whether a given number is even or odd.
     Input-1: 2
    Output-1: The number is even

     Input-2: 7
    Output-2: The number is odd

- 002_Write a program to print the maximum digit of a given number N.
  [Note: N > 0 and N is of type int]

     Input: 1234
    Output: 4

- 003_Write a program to split a given number N in between into two parts, reverse both parts then
  concatenate them to form a new number and print the new number as output.
  [Note: N > 0 and N is of type int]
     Input-1: 1234
    Output-1: 2143

     Input-2: 54321
    Output-2: 45123
```

## Creators

**Deepjyoti Barman**

- <https://github.com/defiant-dj04>
- <https://www.linkedin.com/in/deepjyoti-barman/>