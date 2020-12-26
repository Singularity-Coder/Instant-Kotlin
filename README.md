# Code-Snippets-Kotlin
List of Kotlin topics and their code snippets!

## Common Vocabulary
**Expression:** A function with return value, A variable.  
**Statement:** Code with an assignment operator.  
**Pascal Case:** KotlinCodeSnippets  
**Camel Case:** kotlinCodeSnippets  
**Snake Case:** KOTLIN_CODE_SNIPPETS  
**Main Function:** Entry point in our app.  
**Compiler:** Translates high level language to low level language that machine can understand. Also checks for syntax errors.  
**Run Kotlin Program:** Converts Kotlin code to Java byte code to run it on JVM. JVM further converts the Java byte code into machine code that the platform like Mac or Windows can understand.  
**Statically Typed Programming Language:** Type of a variable is known at compile-time. So once variable is declared with a type, it cannot ever be assigned to a variable of different type and doing so will result in a type error at compile-time. So you CANNOT build the app without fixing the bugs. Ex: Kotlin, Java, C, C++, etc.  
**Dynamically Typed Programming Language:** Type of a variable is known at run-time. You can assign a variable with a different an Integer type even if it was initially assigned String type. So you CAN build the app without fixing the bugs. Ex: JavaScript, Objective-C, PHP, Python, Ruby, Lisp, etc.  
**Type Checking:** The process of verifying and enforcing the constraints of types.  
**Static check:** Type check happening at compile-time.
**Dynamic check:** Type check happening at run-time.
**Strongly-typed language:** Variables are bound to specific data types, and will result in type errors if types do not match up as expected in the expression - regardless of when type checking occurs. Ex: Java, Python, etc.
**Weakly-typed language:** Variables are not bound to a specific data type; they still have a type, but type safety constraints are lower compared to strongly-typed languages. Ex: PHP, C, C++, etc.

## Package definition and imports
```Kotlin
package my.demo

import kotlin.text.*
```

## Comments
```Kotlin
// End-of-line comment

/* Inline comment or a block comment */

/**
* 
* Documentation comment used for explaining code
*
* @author 
* @param
* @return
*
* Refer https://kotlinlang.org/docs/reference/kotlin-doc.html
*
**/
```

## Constants and Variables
```Kotlin
const val user = "Singularity Coder"; // const val means Immutable
val user = "Singularity Coder";	// val means Immutable
var user = "Singularity Coder"; // var means Mutable
```

## Print to Console
```Kotlin
println("Printing this and adding a line break!");
print("Just printing this! ");
print("So i am next to the previous line.");
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
```Kotlin
if (object is Car) { 
   var car = object as Car
}

// if object is null
if (object is Car?) {
   var car = object as Car?
}
```

## Operators 
#### Arithmetic Operators
#### Assignment Operators
#### Comparision Operators
#### Logical Operators
#### Bitwise Operators
```Kotlin
val andResult  = a and b
val orResult   = a or b
val xorResult  = a xor b
val rightShift = a shr 2
val leftShift  = a shl 2
val unsignedRightShift = a ushr 2
```

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
```Kotlin
if (score in 0..300) { }
```
#### Conditional Expressions
Ternary Operations
```Kotlin
val text = if (x > 5) {
    "x > 5"
} else {
    "x <= 5"
}

val message: String? = null
log(message ?: "")
```
Multiple Conditions (Switch case)
```Kotlin
var score = 10
var grade = when (score) {
	9, 10 -> "Excellent"
	in 6..8 -> "Good"
	4, 5 -> "OK"
	in 1..3 -> "Fail"
	else -> "Fail"
}
```
#### For Loop
```Kotlin
for (i in 1..10) { }

for (i in 1 until 10) { }

for (i in 10 downTo 0) { }

for (i in 1..10 step 2) { }

for (i in 10 downTo 0 step 2) { }

for (item in collection) { }

for ((key, value) in map) { }
```
#### ForEach
```Kotlin
cars.forEach {
    println(it.speed)
}

cars.filter { it.speed > 100 }
      .forEach { println(it.speed)}

// kotlin 1.1+
cars.stream().filter { it.speed > 100 }.forEach { println(it.speed)}
cars.parallelStream().filter { it.speed > 100 }.forEach { println(it.speed)}
```
#### While Loop
#### Break
#### Continue

## Data Structures
#### Arrays
Splitting Arrays
```Kotlin
val (param, value) = "param=car".split("=")
```
#### Lists
Sorting List
```Kotlin
val profile = loadProfiles(context)
profile.sortedWith(Comparator({ profile1, profile2 ->
    if (profile1.age > profile2.age) return@Comparator 1
    if (profile1.age < profile2.age) return@Comparator -1
    return@Comparator 0
}))
```
#### Maps
```Kotlin
val listOfNumber = listOf(1, 2, 3, 4)
val keyValue = mapOf(1 to "Air",
                     2 to "Bed",
                     3 to "Breakfast")
```
#### Set

## Functions and Methods
#### Function
Functions in Kotlin are not methods when they do not belong to a class. However they look and behave the same way. Its just the way they are accessed is different.

Defining Function
```Kotlin
fun doSomething() {
   // logic here
}
```
Variable number of arguments
```Kotlin
fun doSomething(vararg numbers: Int) {
   // logic here
}
```
Defining function with return 
```Kotlin
fun getScore(): Int {
   // logic here
   return score
}

// as a single-expression function
fun getScore(): Int = score
```
Returning result of an operation
```Kotlin
fun getScore(value: Int): Int {
   // logic here
   return 2 * value
}

// as a single-expression function
fun getScore(value: Int): Int = 2 * value
```
#### Method
Methods in Kotlin are functions that are called on objects. So they have to be inside a class.
```Kotlin
fun Int.triple(): Int {
  return this * 3
}

var result = 3.triple()
```
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
#### Creating Instance
#### Inheritance
#### Constructors
```Kotlin
class Utils private constructor() {
}

// another way
object Utils {
}
```
#### Getters and Setters
```Kotlin
data class User(var name: String, var age: Int)
```
#### Defining uninitialized objects
```Kotlin
internal lateinit var person: Person
```
#### Initialization Block
```Kotlin
class User {
	// Initialization block
    init {
        println("Init block")
    }
}
```
#### Companion Object
#### Singleton
#### Data Class
#### Abstract Class
#### Interface
#### Sealed Classes
#### Enum Class
```Kotlin
enum class Direction(val direction: Int) {
    NORTH(1),
    SOUTH(2),
    WEST(3),
    EAST(4);
}
```
#### Anonymous Class
```Kotlin
val task = object : AsyncTask<Void, Void, Profile>() {
    override fun doInBackground(vararg voids: Void): Profile? {
        // fetch profile from API or DB
        return null
    }

    override fun onPreExecute() {
        super.onPreExecute()
        // do something
    }
}
```

## Cloning or Copying
```Kotlin
data class User(var name: String, var age: Int)

// cloning or copying
val user = User("Singularity Coder", 30)
val user2 = user.copy()
// in case you only want to copy selected properties
val user2 = user.copy(age = 25)
```

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

