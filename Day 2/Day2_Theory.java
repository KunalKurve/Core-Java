// #Garbage Collection
// Mark and Sweeep concept - heap is divided into two parts - thr objects older being alive for more time - they get shifted to old space
//  and new objects together in new space and free memory on one side together

// Mark Phase
// Sweep/Compact Phase

// Arithmetic Operators
// Loops - While, Do-while, For
// Break, Continue
// Switch Case - Java Break required within cases, default not required due to use of Enums | Match CAse - Python


//Access Specifiers - private, public, protetcted, default
// Data Encapsulation is achieved using Access Specifiers

//Variables
// instance - declared within the class but not part of any method
// local - declared within a method

//this keyword - removes shadow of the local variable.
// to call the parameterized constructor in the default constructor

//can constructors be private??
//Effect: Object initialisation will not be possible. 
// We can use public, private, protetcted with constructor.
//we can't use static keyword with constructor

//Static Variable
// eg. Interest rate in Accounts
//When multiple objects of a class share an attribute 
//they are saved in sepearate memory named as Native Stack
//can be accessed within instance methods , but static methods ke andar instance fields access nahi ho sakte
//Class.field
//this is never passed to static


//Static Methods : 
// don't need class name if accessing in Same Class
// don;t require class objects to call/invoke - w invoke them by class name.


//Java doesn't have Global variable

// in python -  we should check two reasons to made a variable static:
// 1. If the variable has to be shared among all objects of a class / each object must have a copy of this variable
// 2. Utility type methods 


// Method Overloading
// same name but different parameters
// not present in Python
//compile tim polymorphism
//compiler does't look at what is being returned, thats why functions with same parameters but different return type are not possible.
//static, instance methods, constructors all these can be overloaded

// Variable argument in Java int...num
// multple variable argument not allowed in same function
// and it has to be declared in the end

// In Python, everything is an object ,
// so values passed in function is object. 
// not local Variable
/* Python's argument-passing model is neither “Pass by Value” nor “Pass by Reference” but it is “Pass by Object Reference”. 
    Depending on the type of object you pass in the function, the function behaves differently.
    Immutable objects show “pass by value” whereas mutable objects show “pass by reference”.
    https://www.geeksforgeeks.org/pass-by-reference-vs-value-in-python/#:~:text=Python's%20argument%2Dpassing%20model%20is,show%20%E2%80%9Cpass%20by%20reference%E2%80%9D. */
//  
//In Java, we have array to pass by reference.
// Java does not have concept of Pointers. It uses Reference. Because java memory model is completely different from Python and C

// in C, we have Pass by value, Pass by reference and Pass by Address


//primitive store actual values. objects are references
//primitive required when operations to perform
//objects required for to use Wrapper classes
// it doesn't make sense adding objets, dey are references

//Java 5 - autoboxing, auto unboxing - removed explicit conversion
// primitive data assigned to object - autoboxing
//wrapper to primitive - autounboxing


//String is a class in java
//it is a first class keyword. don't have to use new
//it treats as a primitive also/
//immutable
//when modified a new object is created instead of actual change in orginal

//data protection - threat safe
//but memory head can happen

//StringConstantPool is String immutable
//StringBuffer clas is string mutable. - synchronised methods threat safe
//StringBuilder not threat safe, asynchronised methods, have faster execution

// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary
//Perform Assignment 1 using this 

//unlike python lists , jva arrays don't have negative Indexes.

// python dynamically typed, java statically typed