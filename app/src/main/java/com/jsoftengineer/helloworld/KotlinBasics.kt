package com.jsoftengineer.helloworld

fun main(){
    // immutable variable
    //TODO: Add new functionality

    /*
    This is a
    multiline
    comment
     */
    // type string
    val myName = "Jared"
    // type int
    /*
    Integer types: Byte (8 bit), short (16 bit),
    Int (32 bit) and Long (64 bit)
     */
    // type inference finds out the type from the context
    var myAge = 20
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 1203981230948712039
    println(myAge)
    println(myByte)
    println(myShort)
    println(myInt)
    println(myLong)

    // Floating point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.145926538979323846
    println(myFloat)
    println(myDouble)

    //Boolean is a type that is used to represent logical values.
    // It can have two possible values; true and false
    var isSunny = true
    isSunny = false

    // character
    val letterChar = 'A'
    val digitChar = 'i'
    println(digitChar)
    println(letterChar)

    // String is a collection of multiple char
    val myString = "Hello world"
    var firstCharStr = myString[0]
    var lastCharStr = myString[myString.length - 1]

    println("first character " + firstCharStr)
    println("last character " + lastCharStr)
    println("Hello " + myName)

    // Ariyhmetic operators (+, -, *, /, %)
    var result = 5+3
    //result /= 2
    //result *= 2
    result = 15%2
    println(result)
    val a = 5.0
    val b = 3.0
    var resultDouble: Double
    resultDouble = a / b
    println(resultDouble)

    // Comparison operators are (==, !=, <, >, <=, >=)
    val isEqual = 5==5
    println("isEqual is $isEqual")

    val isnotEqual = 5!=5
    println("isNotEqual is $isnotEqual")
    //string interpolation
    println("is-5greater3 ${-5>3}")
    println("is%5LowerEqual3 ${5 <= 3}")
    println("is%5GreaterEqual3 ${5 >= 3}")
}