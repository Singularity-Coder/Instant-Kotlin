# Code-Snippets-Kotlin
List of Kotlin topics and their code snippets!

## Common Vocabulary
Expression
Statement

## Print to Console
```Kotlin
print("Singularity Coder")
println("Singularity Coder")
```

## Comments
```Kotlin
// Single line comment

/* Inline comment */

/**
* 
* Multi-line
* comment
*
**/
```

## Constants and Variables
```Kotlin
const val user = "Singularity Coder"
val user = "Singularity Coder"
var user = "Singularity Coder"
```

## Nullable
Assigning the null value
```Kotlin
var value: String?
value = Nullable
```
Verify if value is null
```Kotlin
value?.let {
    val length = value.length
}
// or simply
val length = value?.length
```

## Data Types

## Type Casting or Type Conversion

## Operators 
#### Arithmetic Operators
#### Assignment Operators
#### Comparision Operators
#### Logical Operators
#### Bitwise Operators

## Strings
Concatenation of strings
```Kotlin
var firstName = "Hithesh"
var lastName = "Vurjana"
val message = "My name is: $firstName $lastName"
```
New line in string
```Kotlin
val text = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()
```
Substring
```Kotlin
var str = "Kotlin Programming Language"
var substr = ""

// print Kotlin
substr = str.substring(0..5)
println("substring $substr")

// print Language
substr = str.substring(18..26)
println("substring $substr")
```

## Math

## Booleans

## Flow Control
#### Conditional Statements
#### Conditional Expressions
#### For Loop
#### While Loop
#### ForEach
#### Break
#### Continue

## Functions

## Data Structures
#### Arrays
#### Lists
#### Maps
#### Set

## Functions and Methods
#### Function
#### Method
#### Default Parameters/Arguments
#### Named Parameters/Arguments
#### Function/Method Overloading
#### Scope
#### Recursion
#### Tail Recursion
#### Scope Functions
#### Higher Order Functions
#### Extension Functions
#### Infix Function Call

## Classes and Objects
#### Inheritance
#### Constructors
#### Init Block
#### Companion Object
#### Singleton
#### Data Class
#### Abstract Class
#### Interface
#### Sealed Classes
#### Enum Class

## Pair and Triple

## Lateinit and Lazy

## Exceptions

## Generics

## Lambda

## JvmStatic, JvmOverloads, and JvmField

## Very Large Numbers

## References
1. https://github.com/MindorksOpenSource/from-java-to-kotlin
2. https://www.youtube.com/playlist?list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8
3. https://www.youtube.com/playlist?list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2

