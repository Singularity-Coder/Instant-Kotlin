# Code-Snippets-Kotlin
List of Kotlin topics and their code snippets! 

## Why Kotlin
A lot of Kotlin is about promoting immutability. Scope functions, conditional expressions, etc. So if you want to write functional style code in an Object Oriented Language then this is it.

## Kotlin Way
* Use "Data Class" to avoid creating your own getters, setters, toString, hashcode, etc.
* Use classes instead of lists for few elements.
* Field level custom getters and setters instead of creating functions.
* Named parameters to avoid builders.
* Default function parameters to avoid method overloading. 
* Create extension properties and functions to perform custom operations on typed data which you can't control like String, Int, etc. They allow to keep your classes minimal like the Utility classes. Its a good way to design APIs.
* Create local functions when they are used by any other entity. Might as well not create the function in the first place.
* Local functions, Extension functions, Top-Level functions, Default parameters make code cleaner.
* Sealed classes know all its sub-classes. So you can avoid "else" case in "when" statements.
* Repetition is ugly and error-prone. So use Scope Functions like "with", "let", etc.
* Use builder functions to construct your Data Structures. Instead of declaring a map and then assigning values, use the mapOf() builder function.
* Use inline functions for getting cheap lambda abstractions.
* Can we replace interfaces with higher order functions?
* Classes are cheap.
* Functions are top-level or local.
* Instead of method overloading use default values.
* Use properties, use delegated properties.
* Use Coroutines instead of Threads.

## Package definition and imports
```Kotlin
package my.demo

import kotlin.text.*
```

## Comments
```Kotlin
// Single line comment or End-of-line comment

/* Multi-line comment
or Inline comment 
or Block comment */

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
const val user = "Singularity Coder"; // const val means Immutable or unchangeable
val user = "Singularity Coder";	// val means Immutable or unchangeable
var user = "Singularity Coder"; // var means Mutable or changable
```

## Print to Console
```Kotlin
println("Printing this and adding a line break!");
print("Just printing this! ");
print("So i am next to the previous line.");
```

## Null Stuff
* `?` means the variable can be nullable or null.  
* `!!` means you are forcibly telling the compiler that this var is not null even if it actually is or can be null.  
* `?.` means safe call operator. If the variable is not null then execute this code.  
* **Elvis operator:** `?:` is Elvis operator. `str ?: "Empty"`. It means if the left side of the expression is `null` then evaluate the right side which is the string `"Empty"` as a default. The right hand side of the expression can even retrun something as well.
```Kotlin
fun add(num1: Int?, num2: Int?): Int = (num1 ?: 0) + (num2 ?: 0)
```
* **Assigning the null value**
```Kotlin
var value: String?
value = Nullable
val message: String? = null
log(message ?: "")
```
* **Verify if value is null**
```Kotlin
value?.let {
    val length = value.length
}
// or simply
val length = value?.length
```

## Data Types
Unlike Java, there are no primitive types in Kotlin. All of them are reference or Object types. So by-default they are null and do not contain any defaults like primitives. There are total 9 types.  
> Number Types
* **Byte**
```Kotlin
val myByte: Byte = 0;
val maxByte: Byte = Byte.MAX_VALUE; // 127
val minByte: Byte = Byte.MIN_VALUE; // -128
val byteSizeInBits: Int = Byte.SIZE_BITS; // 8 bits
val byteSizeInBytes: Int = Byte.SIZE_BYTES; // 1 byte
```
* **Short**
```Kotlin
val myShort: Short = 0;
val maxShort: Short = Short.MAX_VALUE; // 32767
val minShort: Short = Short.MIN_VALUE; // -32767
val shortSizeInBits: Int = Short.SIZE_BITS; // 16 bits
val shortSizeInBytes: Int = Short.SIZE_BYTES; // 2 bytes
```
* **Int** (Inferred by default)
```Kotlin
val myInt: Int = 0;
val maxInt: Int = Int.MAX_VALUE; // 2147483647 (~ 2.14 billion)
val minInt: Int = Int.MIN_VALUE; // -2147483648 (~ -2.14 billion)
val intSizeInBits: Int = Int.SIZE_BITS; // 32
val intSizeInBytes: Int = Int.SIZE_BYTES; // 4
```
* **Long**
```Kotlin
val myLong: Long = 0L;
val maxLong: Long = Long.MAX_VALUE; // 9223372036854775807 (~ 9.22 * 10^18) or (~ -9.2E18)
val minLong: Long = Long.MIN_VALUE; // -9223372036854775807 (~ -9.22 * 10^18) or (~ -9.2E18)
val longSizeInBits: Int = Long.SIZE_BITS; // 64
val longSizeInBytes: Int = Long.SIZE_BYTES; // 8
```
> Decimal Types
* **Float**
```Kotlin
val myFloat: Float = 0F;
val maxFloat: Float = Float.MAX_VALUE; // 3.4028235E38 (~ 3.40 * 10^38)
val minFloat: Float = Float.MIN_VALUE; // 1.4E-45 (1.4 * 10^-45)
val floatSizeInBits: Int = Float.SIZE_BITS; // 32
val floatSizeInBytes: Int = Float.SIZE_BYTES; // 4
val floatMax: Float = 1E38F; // 1.0E38, beyond this number Kotlin returns "Infinity" string. 
```
* **Double** (Inferred by default)
```Kotlin
val myDouble: Double = 0.0;
val maxDouble: Double = Double.MAX_VALUE // 1.7976931348623157E308 (~ 1.79 * 10^308)
val minDouble: Double = Double.MIN_VALUE // 4.9E-324 (4.9 * 10^-324)
val doubleSizeInBits: Int = Double.SIZE_BITS // 64
val doubleSizeInBytes: Int = Double.SIZE_BYTES // 8
val doubleMax: Double = 1.0E308 // 1.0E308, beyond this number Kotlin returns "Infinity" string.
```
> Other Types
* **Char**
```Kotlin
val myChar: Char = 'C'
val charSizeInBits: Int = Char.SIZE_BITS // 16
val charSizeInBytes: Int = Char.SIZE_BYTES // 2
val myCharAsciiValue: Int = myChar.toInt() // 67

// Valid ASCII Characters
// ASCII characters start from 0 to 127. Careful running the below snippet as this messed up my Kotlin project in IntelliJ.
val firstValidAsciiChar: Char = ' '  // 32
val lastValidAsciiChar: Char = '~'   // 126
val validAsciiCharsArray: Array<Char> = Array(95) { ' ' } // ' ' is the initializer
for (i in 0..94) validAsciiCharsArray[i] = (firstValidAsciiChar.toInt() + i).toChar()	// [ , !, ", #, $, %, &, ', (, ), *, +, ,, -, ., /, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, :, ;, <, =, >, ?, @, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, [, \, ], ^, _, `, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, {, |, }, ~]

// Extended ASCII Characters
// I could not print any extended ASCII characters as a character caps at 127. Extended ASCII characters start from 128 to 256.

// Unicode Characters
// There are a total of 143,859 characters today and growing. From spoken language characters, math symbols, etc to emojis. So I won't list them here.

// List all lowercase Characters
val lowCaseCharArray: Array<Char> = Array(26) { 'a' } // 'a' is the initializer
for (i in 0..25) lowCaseCharArray[i] = ('a'.toInt() + i).toChar() // [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]

// List all uppercase Characters
val upCaseCharArray: Array<Char> = Array(26) { 'A' } // 'A' is the initializer
for (i in 0..25) upCaseCharArray[i] = ('A'.toInt() + i).toChar() // [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
```
* **Bool**
```Kotlin
val myBoolean: Boolean = false
```
* **String**
```Kotlin
val myString: String = "I am a string!"
```
* **Any** This Type can hold any of the above mentioned data types. It cannot hold BigInteger and BigDecimal Types.
```Kotlin
val myAnyTypeByte: Any = 72
val myAnyTypeShort: Any = 32425
val myAnyTypeInt: Any = 1123456789345
val myAnyTypeLong: Any = 71234567823456734
val myAnyTypeFloat: Any = 0F
val myAnyTypeDouble: Any = 1.1
val myAnyTypeString: Any = "Singularity Coder"
val myAnyTypeChar: Any = 'C'
val myAnyTypeBool: Any = true
```

## Strings
* Concatenation of strings
```Kotlin
val name: String = "Singularity Coder"
var age: Int = 129
print("Hello World, My name is $name, and I am $age years old. In 3 years, I will be ${age + 3}. My bank balance is currently \$7.") // Hello World, My name is Singularity Coder, and I am 129 years old. In 3 years, I will be 132. My bank balance is currently $7.
```
* New line in string
```Kotlin
val text = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()
```
* Substring
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

## Math

## Booleans

## Flow Control
#### Conditional Statements
* Block Statement
```Kotlin
val price: Int = 59
if (price < 50) {
    println("Cheap")
} else if (price in 50..70) {
    println("Average")
} else {
    println("Expensive")
} // Average
```
* When Statement (Switch-Case)
```Kotlin
val price: Int = 59
when(price) {
    30, 31, 32, 33, 34, 35 -> print("Cheap")
    in 36..50 -> print("Average")
    else -> {
        println("Too much!")
        print("Expensive as hell!")
    }
} // Too much! Expensive as hell!
```
#### Conditional Expressions
* Single Line Expression (Ternary Operations)
```Kotlin
val price: Int = 59
val priceReaction: String = if (price < 100) "Cheap" else "Expensive" // Cheap
```
* Block Expression
```Kotlin
val price: Int = 59
val priceReaction2: String = if (price < 50) {
    "Cheap"
} else {
    "Expensive"
} // Expensive
```
* When Expression (Switch-Case)
```Kotlin
val price: Int = 59
val priceReaction3: String = when {
    price <= 30 -> "Cheap"
    price in 30..50 -> "Average"
    price in 50 until 70 -> "Expensive"
    else -> "Too much"
} // Expensive
```
#### For Loop
```Kotlin
for (i in 1..10) print("$i ")  // 1 2 3 4 5 6 7 8 9 10

for (i in 1 until 10) print("$i ")    // 1 2 3 4 5 6 7 8 9

for (i in 10 downTo 0) print("$i ")    // 10 9 8 7 6 5 4 3 2 1 0

for (i in 1..10 step 2) print("$i ")    // 1 3 5 7 9

for (i in 10 downTo 0 step 2) print("$i ")    // 10 8 6 4 2 0

val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
for (item in list) print("$item ")  // 1 2 3 4 5 6 7 8 9 10

val map: Map<Int, String> = mapOf(
        1 to "Air", 
        2 to "Bed", 
        3 to "Breakfast")
for ((key, value) in map) println("Key: $key and Value: $value")
// Key: 1 and Value: Air
// Key: 2 and Value: Bed
// Key: 3 and Value: Breakfast
```
#### ForEach Loop (Enhanced For loop)
```Kotlin
val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
list.forEach { it: Int ->
    print("$it ")   // 1 2 3 4 5 6 7 8 9 10
}

list.filter { it > 5 }.forEach {
    print("$it ")   // 6 7 8 9 10
}

list.stream().filter { it > 5 }.forEach {
    print("$it ")   // 6 7 8 9 10
}

list.parallelStream().filter { it > 5 }.forEach {
    print("$it ")   // 7 9 10 8 6
}
```
#### While Loop
```Kotlin
var x = 1
while (x <= 10) {
    print("$x ")  // 1 2 3 4 5 6 7 8 9 10 
    x++
}
```
#### Do-While Loop
```Kotlin
var y = 1
do {
    print("$y ")  // 1 2 3 4 5 6 7 8 9 10
    y++
} while (y <= 10)
```
#### Break
```Kotlin
for (i in 1..10) {
    print("$i ")  // 1 2 3 4 5 6 
    if (i == 6) break
}
```
#### Continue
```Kotlin
for (i in 1..10) {
    if (i == 2) continue
    if (i == 5) continue
    if (i == 8) continue
    print("$i ")  // 1 3 4 6 7 9 10 
}
```
#### Repeat
```Kotlin
// Repeats the task 10 times
repeat(10) { it: Int ->
    print("$it ")  // 0 1 2 3 4 5 6 7 8 9
}
```

## Data Structures
#### Arrays
```Kotlin
// Create
val anyArray: Array<Any> = arrayOf(1, true, 3.0, 'c', "Hithesh") // [1, true, 3.0, c, Hithesh]
val arraySizeFive: Array<Any> = Array(5) { 1 } // [1, 1, 1, 1, 1] where 1 is the initializer
val emptyArray: Array<Any> = emptyArray()   // [] Placeholder Array

// Creating arrays with Primitive values
val byteArr: ByteArray = byteArrayOf(1, 2, 3)
val shortArr: ShortArray = shortArrayOf(1, 2, 3)
val intArr: IntArray = intArrayOf(1, 2, 3)
val longArr: LongArray = longArrayOf(1, 2, 3)
val floatArr: FloatArray = floatArrayOf(1F, 2F, 3F)
val doubleArr: DoubleArray = doubleArrayOf(1.0, 2.0, 3.0)
val charArr: CharArray = charArrayOf('a', 'b', 'c')
val boolArr: BooleanArray = booleanArrayOf(true, false, true)

// Read
anyArray[3]    // c
anyArray.first()    // 1
anyArray.last()    // Hithesh
anyArray.indexOf("Hithesh") // 4
anyArray.size   // 5
anyArray.count()    // 5

// Update
anyArray[0] = 10    // [10, true, 3.0, c, Hithesh]
anyArray.set(index = 1, value = false)  // [10, false, 3.0, c, Hithesh]
arraySizeFive[0] = "Dragon Warrior"

// Sort
intArr.sort()   // [1, 2, 3]
intArr.sortDescending() // [3, 2, 1]

// Print to console
println(Arrays.toString(anyArray)) // [10, false, 3.0, c, Hithesh]
println(anyArray.contentToString())    // [10, false, 3.0, c, Hithesh]
println(arraySizeFive.contentToString())   // [Dragon Warrior, 1, 1, 1, 1]
println(emptyArray.contentToString())   // []
```
#### Lists
```Kotlin
val immutableList: List<String> = listOf("Delta", "Theta", "Alpha", "Gamma", "Beta")    // [Delta, Theta, Alpha, Gamma, Beta] Cannot bed modified but can be accessed.
val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)    // [1, 2, 3, 4, 5, 6]
val emptyList = emptyList<Int>()    // []

// Create
mutableList.add(3)  // [1, 2, 3, 4, 5, 6, 3]

// Read
immutableList.get(2)    // Alpha
immutableList[2]    // Alpha
immutableList.first()   // Delta
immutableList.last()    // Beta
immutableList.elementAtOrNull(index = 21) // returns null without throwing the IndexOutOfBoundsException
immutableList.elementAtOrElse(index = 15, defaultValue = { 99 })    // 99

// Update
mutableList.set(index = 0, element = 50)    // [50, 2, 3, 4, 5, 6, 3]
mutableList[0] = 50    // [50, 2, 3, 4, 5, 6, 3]

// Delete
mutableList.remove(element = 2)    // [50, 3, 4, 5, 6, 3]
mutableList.removeAt(index = 0)    // [3, 4, 5, 6, 3]

// Sort
mutableList.sort()  // [3, 3, 4, 5, 6]
mutableList.sortDescending()    // [6, 5, 4, 3, 3]

// Print to console
println(immutableList)  // [Delta, Theta, Alpha, Gamma, Beta]
println(mutableList)    // [6, 5, 4, 3, 3]
println(emptyList)  // []
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
Functions in Kotlin are not methods when they do not belong to a class. However they look and behave the same way. Its just the way they are accessed is different. They are also called Top-Level Functions. Methods in Kotlin are functions that are called on objects. So they have to be inside a class.
* **Unit-returning function (Void function)**
```Kotlin
fun doSomething(): Unit {
   
}
```
* **Explicit return type function**
```Kotlin
fun evenNumber(num: Int): Int {
   return 2 * num
}
```
* **Single-expression function**
```Kotlin
fun evenNumber(num: Int): Int = 2 * num
```
* **Local Function:** Part of function scope.
```Kotlin
fun myIntro(fullName: String): String {
    fun splitName(): List<String> = fullName.split(" ").map { it -> it.toUpperCase() }
    return "My first name is ${splitName()[0]} and my last name is ${splitName()[1]}"
}

myIntro("Hithesh Vurjana")  // My first name is HITHESH and my last name is VURJANA
```
* **Default Parameters/Arguments**
```Kotlin
fun evenNumber(evenPrefix: Int = 2, num: Int) = evenPrefix * num
```
* **Named Parameters/Arguments**
```Kotlin
fun evenNumber(evenPrefix: Int = 2, num: Int) = evenPrefix * num

evenNumber(num = 9)    // 18
```
* **Function/Method Overloading**
```Kotlin
fun printMyName(name: String) {
    println("My name is $name")
}

fun printMyName(firstName: String, lastName: String) {
    println("My name is $firstName $lastName")
}

printMyName("Hithesh")  // My name is Hithesh
printMyName("Hithesh", "Vurjana")   // My name is Hithesh Vurjana
```
* **Vararg Function:** Variable number of arguments
```Kotlin
fun exponentList(vararg numList: Int, exponent: Int) = numList.map { it * exponent }

exponentList(1, 2, 3, 4, 5, exponent = 3)   // [3, 6, 9, 12, 15]
exponentList(numList = intArrayOf(1, 2, 3, 4, 5,), exponent = 3)    // [3, 6, 9, 12, 15]
```
* **Infix Function Call:** Must be extension function, single parameter which cannot be a vararg and cannot have default value.
```Kotlin
infix fun Int.times(num: Int): Int = this * num

3 times 5   // 15
```

## Recursion
## Tail Recursion
## Inline Functions

## Scope Functions
These allow us to write idiomatic, functional style code and allow us to operate on immutable fields. So they promote immutability. However use them only to promote immutability and not for writing less code as they introduce code nesting. 
```Kotlin
data class Person(var name: String? = null, var age: Int? = null)

// Without Scope functions
val person = Person()
person.name = "Hithesh"
person.age = 93
```
* **apply:** If you want to initialise or configure an object. Returns context obj itself.
```Kotlin
val person = Person().apply { ->
    this.name = "Hithesh"
    age = 93
}
```
* **with:** If you want to operate on a non-null object. Returns last line value.
```Kotlin
val myIntro: String = with(person) { ->
    println(name)
    println(this.age)
    "My name is $name and I am $age years old!" // Optional return value
}
```
* **also:** If you want to do some additional object configuration or operations. Returns context obj itself.
```Kotlin
val person = Person().also { it: Person ->
    it.name = "Singularity Coder"
    it.age = 1E4.toInt()
}
```
* **let:** If you want to just execute lambda expression on a nullable object and avoid NullPointerException. Returns last line value.
```Kotlin
// Usual way
var reverseString: String? = null
if (null != person.name) {
    println(person.name?.reversed())
    reverseString = person.name?.reversed()
}

// Idiomatic way
val reverseString: String? = person.name?.let { it: String ->
    println(it.reversed())
    it.reversed()    // Optional return value
}
```
* **run:** If you want to operate on a nullable object, execute lambda expression and avoid NullPointerException. Returns last line value.
```Kotlin
val myIntro = person?.run { ->
    println(this.name)
    println(age)
    "My name is $name and I am $age years old!" // Optional return value
}
```

## Higher Order Functions
* **Functions can be stored in a variable.**
```Kotlin
val operation1 = highOrderFuncReturnValue(num1 = 8, num2 = 12) // 20
val operation2 = highOrderFuncPrintComment() // Hello World!

fun highOrderFuncReturnValue(num1: Int, num2: Int): Int = num1 + num2
fun highOrderFuncPrintComment(): Unit = print("Hello World!")
```
* **Functions can be returned from a function.**
```Kotlin
fun highOrderFuncReturnFunc(): Unit = printComment() // Hello World!

fun printComment(): Unit = print("Hello World!")
```
* **Functions can be passed to other functions as an argument.**
```Kotlin
fun highOrderFuncNoParams(unitFunc: (() -> Unit)? = null) {
    unitFunc?.invoke()
}

fun highOrderFuncWithParams(unitFunc: (() -> Unit)? = null, imgSize: Int) {
    if (imgSize > 5) unitFunc?.invoke()
    else println("Using image with default resolution!")
}

fun highOrderFuncWithParams2(dummyApiCallback: ((dummyApiResponse: String) -> Unit)? = null) {
    val movieList: List<String> = listOf(
        "Grave of the Fireflies",
        "My Neighbor Totoro",
        "Kiki's Delivery Service",
        "Princess Mononoke",
        "Spirited Away",
        "Howl's Moving Castle",
    )

    for (movie in movieList) {
        Thread.sleep(3000)
        dummyApiCallback?.invoke(movie)
    }
}

fun voidOrUnitFunc1(num1: Int = 0, num2: Int = 0) {
    println("Void or Unit function result is ${num1 + num2}")
}

fun voidOrUnitFunc2() {
    println("Reducing Image Resolution!")
    println("Compressing Image!")
}

highOrderFuncNoParams(unitFunc = { voidOrUnitFunc1(num1 = 6, num2 = 9) })    // Void or Unit function result is 15

highOrderFuncWithParams(
    unitFunc = {
        println("Reducing Image Resolution!")
        println("Compressing Image!")
    },
    imgSize = 4
)   // Using image with default resolution! 

highOrderFuncWithParams(
    unitFunc = { voidOrUnitFunc2() },
    imgSize = 11
)   // Reducing Image Resolution! Compressing Image!

highOrderFuncWithParams2(dummyApiCallback = { dummyApiResponse: String ->
    println(dummyApiResponse)
})
// Grave of the Fireflies
// My Neighbor Totoro
// Kiki's Delivery Service
// Princess Mononoke
// Spirited Away
// Howl's Moving Castle
```

## Extension Functions
```Kotlin
fun Int.factorial(): BigInteger {
    var fact = BigInteger.ONE
    for (i in 2..this) fact = fact.multiply(BigInteger.valueOf(this.toLong()))
    return fact
}

fun Double.squared(): Double = this * this

fun Char.asciiValue(): Int = this.toInt()

fun String.analyzeString() {
    when {
        this == "Singularity Coder" -> println("Definitely Neo!")
        this.length > 3 -> println("Not Neo!")
        else -> println("Could be Neo!")
    }
    println("String Length: ${this.length}")
    println("String starts with the letter: ${this[0]}")
    println("String mid value: ${if (this.length % 2 == 0) "No mid value!" else this[this.length / 2]}")
}

fun User.canWork(age: Int): Boolean = age > 18

data class User(val name: String, val age: Int)

55.factorial()   // 9540809681250034973565866501770328168700249765255186764678629884883775957860052585601806640625
12.5.squared()  // 156.25
'C'.asciiValue() // 67
User(name = "Hithesh", age = 67).canWork(myUser.age)  // true
"Singularity Coder".analyzeString()  // Definitely Neo! | String Length: 17 | String starts with the letter: S | String mid value: i
```

## Classes and Objects
#### Creating Instance
```Kotlin
class Address1 {
    private val CUSTOM_HASH_CODE = SecureRandom().nextInt()

    var city: String = ""
    var country: String = ""
    var zip: Int = 0

    override fun toString(): String {
        return "Address(City: $city, Country: $country, Zip: $zip)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (null === other) return false
        return false
    }

    override fun hashCode(): Int {
        return CUSTOM_HASH_CODE
    }
}

val address1 = Address1()
val address2 = Address1()
address1.city = "Tesla"
address1.country = "Mars Colony @#$%123"
address1.zip = 123456

println(address1.toString())	// Address(City: Tesla, Country: Mars Colony @#$%123, Zip: 123456)
println(address1.hashCode())	// 654287787
println(address1.equals(address2))	// false
```
#### Inheritance
#### Constructors
* **Primary Constructor**
```Kotlin
class User0(val name: String = "", val age: Int = 0) 

val user0: User0 = User0(name = "Hithesh", age = 199)
println("Name: ${user0.name}")  // Name: Hithesh
println("Age: ${user0.age}")    // Age: 199
```
* **Secondary Constructors**
```Kotlin
class User1 {
    var name: String? = null
    var age: Int? = null

    constructor(name: String = "Singularity Coder", age: Int = 77) {
        this.name = name
        this.age = age
    }

    constructor()
}

val user1: User1 = User1(name = "Singularity Coder", age = 6543)
println("Name: ${user1.name}")  // Name: Singularity Coder
println("Age: ${user1.age}")    // Age: 6543
```
* **Primary and Secondary Constructors**
```Kotlin
class User2(private val dob: String = "", private val profession: String = "") {
    var name: String? = null
    var age: Int? = null

    constructor(name: String = "Singularity Coder", age: Int = 77) : this(dob = "", profession = "") {
        this.name = name
        this.age = age
    }

    constructor() : this(dob = "", profession = "")

    fun printDob() = println("Date Of Birth: $dob")

    fun printProfession() = println("Profession: $profession")
}

val user2: User2 = User2(dob = "12/07/0001", profession = "Magic Caster")
user2.printDob()	// Date Of Birth: 12/07/0001
user2.printProfession()	// Profession: Magic Caster
```
* **Private Constructor:** These classes cannot be instantiated or you cannot create objects with these classes.
```Kotlin
class User3 private constructor() {
    companion object {
        const val NAME: String = "Singularity Coder"
        fun age15YearsFromNow(age: Int): Int = age + 15
    }
}

val name: String = User3.NAME   // Singularity Coder
val age: Int = User3.age15YearsFromNow(age = 15)    // 30
```
#### Getters and Setters
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
```Kotlin
data class User(var name: String, var age: Int)
```
#### Abstract Class
#### Interface
#### Sealed Classes
#### Enum Class
* **Create Enum class**
```Kotlin
enum class Direction {
    EAST,
    WEST,
    NORTH,
    SOUTH
}
```
* **Create Enum class with constructor**
```Kotlin
enum class MathConstants(val value: Double) {
    ZERO(0.0),
    ONE(1.0),
    IMAGINARY_UNIT(Math.sqrt(-1.0)),
    PI(3.14),
    EULER_NUMBER(2.71),
    GOLDEN_RATIO(1.61)
}
```
* **Access constants**
```Kotlin
val direction: Direction = Direction.EAST   // EAST
val myConstantValue: Double = MathConstants.PI.value    // 3.14
val myConstant: String = MathConstants.PI.name    // PI
val myConstantPosition: Int = MathConstants.PI.ordinal    // 3
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
In my opinion these are highly unnecessary syntactical constructs that provide very little value. So I do not recommend using or remembering them.
* Pair: Collection of 2 variables
```Kotlin
val pair = Pair<String, Int>(first = "Singularity Coder", second = 179)
pair.first 	// Singularity Coder
pair.second 	// 179

// Destructured Pair
val (name: String, age: Int) = Pair(first = "Singularity Coder", second = 179)
name 	// Singularity Coder
age 	// 179

// Converting Pair to List
val pairList: List<Any> = pair.toList()
pairList[0]	// Singularity Coder
pairList[1]	// 179
```
* Triple: Collection of 3 variables
```Kotlin
val triple = Triple<String, String, String>(first = "Singularity", second = "Coder", third = "Android Developer")
triple.first 	// Singularity
triple.second 	// Coder
triple.third 	// Android Developer

// Destructured Triple
val (firstName: String, lastName: String, profession: String) = Triple(first = "Singularity", second = "Coder", third = "Android Developer")
firstName 	// Singularity
lastName 	// Coder
profession 	// Android Developer

// Converting Triple to List
val tripleList = triple.toList()
tripleList[1]	// Singularity
tripleList[2]	// Coder
tripleList[3]	// Android Developer
```

## Large Numbers
* **BigInteger**  
> If you are working with ridiculously large numbers, use BigInteger & BigDecimal.

> BigInteger must support values in the range -2^Integer.MAX_VALUE (exclusive) to +2^Integer.MAX_VALUE (exclusive) and may support values outside of that range.  
> 
> Implementation note: BigInteger constructors and operations throw ArithmeticException when the result is out of the supported range of -2^Integer.MAX_VALUE (exclusive) to +2^Integer.MAX_VALUE (exclusive).
```Kotlin
val myBigIntegerNum1: BigInteger = BigInteger.valueOf(Long.MAX_VALUE).pow(10) // 4455508415646675013373597242420117818453694838130159772560668808816707086990958982033203334310070688731662890013605553436739351074980172000127431349940128178077122187317837794167991459381249
val myBigIntegerNum2: BigInteger = BigInteger(Long.MAX_VALUE.toString()).pow(10) // 4455508415646675013373597242420117818453694838130159772560668808816707086990958982033203334310070688731662890013605553436739351074980172000127431349940128178077122187317837794167991459381249

// Commonly used BigInteger Numbers 
val bigInt0: BigInteger = BigInteger.ZERO // 0
val bigInt1: BigInteger = BigInteger.ONE // 1
val bigInt2: BigInteger = BigInteger.TWO // 2
val bigInt10: BigInteger = BigInteger.TEN // 10
```
* **BigDecimal**
```Kotlin
val myBigDecimalNum1: BigDecimal = BigDecimal.valueOf(Double.MAX_VALUE).scaleByPowerOfTen(-Int.MAX_VALUE) // 1.7976931348623157E-2147483339
val myBigDecimalNum2: BigDecimal = BigDecimal(Double.MAX_VALUE.toString()).scaleByPowerOfTen(-Int.MAX_VALUE) // 1.7976931348623157E-2147483339
val myBigDecimalNum3: BigDecimal = BigDecimal(Double.MAX_VALUE).scaleByPowerOfTen(-Int.MAX_VALUE) // 1.79769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368E-2147483339

// Rounding Precision
val myDecimalNum1: BigDecimal = BigDecimal("1.1234567")
myDecimalNum1.setScale(3, RoundingMode.UP) // 1.124
myDecimalNum1.setScale(3, RoundingMode.DOWN) // 1.123
myDecimalNum1.setScale(3, RoundingMode.HALF_UP) // 1.123
myDecimalNum1.setScale(3, RoundingMode.HALF_DOWN) // 1.123
myDecimalNum1.setScale(3, RoundingMode.HALF_EVEN) // 1.123
myDecimalNum1.setScale(3, RoundingMode.FLOOR) // 1.123
myDecimalNum1.setScale(3, RoundingMode.CEILING) // 1.124

val myDecimalNum2: BigDecimal = BigDecimal("1.0")
myDecimalNum2.setScale(3, RoundingMode.UNNECESSARY) // 1.000

myDecimalNum2.setScale(3, RoundingMode.UNNECESSARY).movePointRight(1) // From 1.000 to 10.00
myDecimalNum2.setScale(3, RoundingMode.UNNECESSARY).movePointLeft(1) // From 1.000 to 0.1000

// Commonly used BigDecimal Numbers 
val bigDec0: BigDecimal = BigDecimal.ZERO // 0
val bigDec1: BigDecimal = BigDecimal.ONE // 1
val bigDec10: BigDecimal = BigDecimal.TEN // 10
```

## Random Numbers
* **Generate Secure Random Number:** Cryptographically strong random values using a cryptographically strong pseudo-random number generator.
```Kotling
val secureRandom = SecureRandom().nextInt(100)  // 14
```
* **Generate Pseudo Random Number**
```Kotlin
val randomNumber = Math.random()    // 0.15076138593048494
```
* **Random number in a given range:** You can access all the Array properties on this random array.
```Kotlin
val randomArray = (1..10).shuffled()	// [8, 9, 1, 2, 3, 5, 7, 10, 6, 4]
val randomArrayFirstElem = (1..10).shuffled().first()   // 10
val randomArrayLastElem = (1..10).shuffled().last()     // 5
```
* **Thread-safe Random Number** that can have positive and negative values
```Kotlin
val randomfloat1 = ThreadLocalRandom.current().nextFloat()          // 0.23447311
val randomDouble1 = ThreadLocalRandom.current().nextDouble()        // 0.3792768572850779
val randomInteger1 = ThreadLocalRandom.current().nextInt()          // -1424838063
val randomLong1 = ThreadLocalRandom.current().nextLong()            // 6186415735628776307
val randomGaussian1 = ThreadLocalRandom.current().nextGaussian()    // 1.7022158793655815
val randomBoolean1 = ThreadLocalRandom.current().nextBoolean()      // false
```
* **Thread-safe Random Number in a given range**
```Kotlin
val randomDouble2 = ThreadLocalRandom.current().nextDouble(1.0, 10.0)   // 4.842464268215246
val randomInteger2 = ThreadLocalRandom.current().nextInt(1, 10)         // 2
val randomLong2 = ThreadLocalRandom.current().nextLong(1, 10)           // 8
```

## Multi-Tasking
#### **Coroutines**
```Kotlin
GlobalScope.launch {    // Launch a coroutine in background
    myDelay(2000L)  // Suspends "coroutine" execution for 2 sec but not the thread.  Its a suspend function.
}

runBlocking<Unit> { 
    myDelay(2000L)  // Suspends "thread" execution for 2 sec until coroutine inside it finishes. This is equivalent to Thread.sleep()
}

GlobalScope.launch {
    withTimeout(2000L) {    // Cancels coroutine on timeout which is 2 sec here. Its a suspend function.
        
    }

    runInterruptible<Unit> {     // Throws CancellationException if interrupted. Its a suspend function.

    }

    launch { 
            
    }

    coroutineScope { 
        
    }

    async { 
            
    }
}

suspend fun myDelay(duration: Long) {
    delay(duration)
}
```
#### **RxJava**
#### **Executors and Handlers**
```Kotlin
val executor = Executors.newSingleThreadExecutor()
val handler = Handler(Looper.getMainLooper())

executor.execute {
    // Stuff to do on background thread. This is like AsyncTask.execute()

    handler.post {
        // Stuff to do on UI thread. This is like runOnUiThread()
    }
}
```
#### **Thread**
```Kotlin
thread {    // Launch a thread in background
    Thread.sleep(2000L)  // Suspend thread for 2 sec or 2000 milliseconds
}  

Thread.currentThread().name    // Get thread name
```
#### **AsyncTask**

## Lateinit and Lazy

## Exceptions

## Generics

## Lambda

## JvmStatic, JvmOverloads, and JvmField

## Visibility Modifiers

## Collections

## Regular Expressions

## Generate Morse Code

## Meta-Programming

## Common Vocabulary
* **Expression:** A function with return value or a variable. They are things that have values. You assign expressions to variables.
* **Statement:** Code with an assignment operator. They are things that have effects. You write statements to assign things to other things.
* **Pascal Case:** KotlinCodeSnippets  
* **Camel Case:** kotlinCodeSnippets  
* **Snake Case:** KOTLIN_CODE_SNIPPETS  
* **Main Function:** Entry point in our app.  
* **Compiler:** Translates high level language to low level language that machine can understand. Also checks for syntax errors.  
* **Run Kotlin Program:** Converts Kotlin code to Java byte code to run it on JVM. JVM further converts the Java byte code into machine code that <a href=""></a> platform like Mac or Windows can understand.  
* **Statically Typed Programming Language:** Type of a variable is known at compile-time. So once variable is declared with a type, it cannot ever be assigned to a variable of different type and doing so will result in a type error at compile-time. So you CANNOT build the app without fixing the bugs. Fast & Efficient. Ex: Kotlin, Java, C, C++, etc.  
* **Dynamically Typed Programming Language:** Type of a variable is known at run-time. Variables are bound to objects at run-time. You can assign a variable with a different an Integer type even if it was initially assigned String type. So you CAN build the app without fixing the bugs. Slow & less optimized but has its own advantages like dynamic dispatch, late binding, down-casting, reflection. Ex: JavaScript, Objective-C, PHP, Python, Ruby, Lisp, etc.  
* **Type Checking:** The process of verifying and enforcing the constraints of types.  
* **Static check:** Type check happening at compile-time.  
* **Dynamic check:** Type check happening at run-time.  
* **Strongly-typed language:** Variables are bound to specific data types, and will result in type errors if types do not match up as expected in the expression - regardless of when type checking occurs. Ex: Java, Python, etc.  
* **Weakly-typed language:** Variables are not bound to a specific data type; they still have a type, but type safety constraints are lower compared to strongly-typed languages. Ex: PHP, C, C++, etc.  
* **Top-Level function:** A function that is not enclosed in a class.  
* **Double Type:** Double-precision floating-point. More exact than Float numbers.
* **Number System:** A way of representing numbers. The value of any digit in a number can be known if we know:
	1. The Digit 
	2. Its position in the number
	3. The base/radix of the number system
* **Radix/Base:** Available numbers in a number system (or) numbers used in a system (or) number of digits used in a positional number system. Ex: base-10 numbering system or decimal numbers (0,1,2,3,4,5,6,7,8, and 9) is most common. So the radix/base for Decimal numbers is 10. Computers deal with base-2 or binary which only deals with numbers 0 and 1. So for binary numbers the radix/base is 2.
* **Types of base or Types of Number Systems:** 
	1. Base-2 (Binary): Uses only 0, 1
	2. Base-8 (Octal): Uses only 0, 1, 2, 3, 4, 5, 6, 7
	3. Base-10 (Decimal): Uses only 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
	4. Base-16 (Hexadecimal): Uses only 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
* **Signed Integer:** Whole range of integers negative, zero and positive integers. Ex: ...-3, -2, -1, 0, 1, 2, 3...
* **Unsigned Integer:** Non-negative integers including 0. Ex: 0, 1, 2, 3...
* **ASCII:** American Standard Code for Information Interchange.
* **ASCII Characters:** Start from 0 to 127. Consist of commonly used characters like upper and lower case english letters, numbers, etc. Each character is exactly 8 bits or 1 byte.
* **Extended ASCII Characters:** Start from 128 to 256. Extended set of ASCII characters that include famous currency symbols, etc.
* **Unicode Characters:** Emojis, Math symbols, Spoken Language characters, etc.
* **ISO:** International Standards Organization.
* **1 bit:** A bit is a binary digit. It can hold either a 0 value or 1 value.
* **1 byte:** 8 bits form a byte. It can store a single ASCII character like 'C'. Since each bit can hold either a 0 or 1, the character 'C' will have 01000011 values where each bit out of the 8 holds a 0 or 1.
* **1 kilobyte (KB):** 1024 bytes form a kilobyte.
* **1 megabyte (MB):** 1024 kilobytes form a megabyte.
* **1 gigabyte (GB):** 1024 megabytes form a gigabyte.
* **1 terabyte (TB):** 1024 gigabytes form a terabyte.
* **1 petabyte (PB):** 1024 terabytes form a petabyte.
* **1 exabyte (EB):** 1024 petabytes form a exabyte.
* **1 zettabyte (ZB):** 1024 exabytes form a zettabyte.
* **1 yottabyte (YB):** 1024 zettabytes form a yottabyte.
* **1 Mbps:** Lowercase 'b' means 1 megabits per second. Broadband connection terminology.
* **1 MBps:** Uppercase 'B' means 1 megabytes per second. Broadband connection terminology.
* **Operator:** A symbol that tells the compiler or interpreter to perform specific mathematical, relational or logical operation and produce a result. Ex: +, -, &&, ||, etc.
* **Operand:** The element(s) we are operating on.
* **Unary Operator:** Operate on a single operand or element. Ex: a++
* **Binary Operator:** Operate on 2 operands or elements. Ex: a + b
* **Ternary Operator:** Operate on 3 operands or elements. Ex: a ? b : c
* **Infix Operator:** Operator is inbetween 2 operands. Like the + in a + b
* **Prefix Operator:** Operator to the left of an operand. Like ++a
* **Postfix Operator:** Operator to the right of an operand. Like a++
* **Operator Overloading or ad hoc polymorphism:** A specific case of polymorphism, where different operators have different implementations depending on their arguments. Ex: + can behave like -, etc.
* **Module:** A module encapsulates complex functionality away from user, provides a well defined interface for a user and it should have a plug-and-play setup.
* **Abstract Data Type:** A set of rules on how something should behave and operate. Ex: A linked list can implement the stack abstract data type (ADT).
* **Data Structure:** A particular way of organizing data. Its a concrete implementation of an Abstract Data Type.
* **Abstract in Programming:** Set of rules that must be followed. Like an interface. No implementation. Like an idea that is not tangible until implemented.
* **Client/Server Model:** Client makes a request. Server responds to that request.
* **Proxy:** Software that makes a request on behalf of Client.
* **Application Programming Interface (API):** Mediator software that allows 2 apps to communicate. (OR) A set of publicly exposed methods that allow access to the data layer.
* **Software Development Kit (SDK):** Collection of APIs. Ex: To build Android Apps, you need an Android SDK.
* **Cache:** A quicker way of accessing something. Ex: Kitchen Pantry is a cache for the grocery store. Programs currently running on a computer are cache for all the big files saved in the hard drive. Files saved on hard drive of a computer is a cache for all the things saved on the cloud.
* **Compilation:** Converting human readable code like Java, Kotlin, Python into machine readable code.
* **Open Device:** MacBook Pro. General purpose. Its the system.
* **Embedded Device:** iPod. Specific purpose. Its a subset of the system.
* **Deeply Embedded Device:** Nest thermostat. Super specific purpose. Its a subset of another subset.
* **Middleware:** Software that acts as a bridge between an operating system or database and applications, especially on a network.
* **Serialization:** Converting object to byte stream.
* **Deserialization:** Converting byte stream to object.
* **Parse:** Process of findng the meaning of a sentence by breaking it into parts that are syntactically and grammatically correct.
* **Traversal:** Visiting each element in a data structure exactly once.
* **Fibonacci Numbers:** Each number is the sum of the 2 preceding ones, starting from 0 and 1. Ex: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... where 8 is a sum of 5 and 3, its preceding 2 numbers.
* **Palindrome:** A word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar. There are also numeric palindromes, including date/time stamps using short digits 11/11/11 11:11 and long digits 02/02/2020. Refer Wikipedia.
* **Factorial:** A function that multiplies a number by every number below it. Ex: 5!= 5 * 4 * 3 * 2 * 1 = 120. The function is used, among other things, to find the number of ways “n” objects can be arranged.
* **Armstrong Number:** A number that is equal to the sum of cubes of its digits. Ex: 0, 1, 153, 370, 371, 407, etc. If we take 153 -> 1^3 = 1, 5^3 = 125, 3^3 = 27. So 1 + 125 + 27 = 153. 
* **Natural Numbers (N):** Also called as Positive Integers, Counting Numbers. 1, 2, 3...∞
* **Whole Numbers (W) or Non-Negative Integers (Z Star):** Set of Natural Numbers, plus Zero. 0, 1, 2, 3...∞
* **Integers (Z):** Set of Negative numbers and Whole Numbers or a fraction. -∞...-3, -2, -1, 0, 1, 2, 3...∞   
* **Rational Numbers (Q):** Can be expressed as ratio of two integers. All the fractions where the top and bottom numbers are integers. The denominator cannot be 0, but the numerator can be. 1/2, 3/4, 7/2, ⁻4/3, 4/1.
* **Unit Fractions:** If numerator of a fraction is one. 1/2, 1/3, 1/4, 1/5.
* **Decimal Fractions:** Decimal numbers (such as 0.3,  0.32, -2.7) can be called decimal fractions, because they can be written in a fractional form (e.g., 3/10, 32/100, -27/10).
* **Irrational Numbers (Q' or Q Prime):**
* **Real Numbers (R):** 
* **Complex Numbers (C):**
* **Prime Numbers:**
* **Composite Numbers:**
* **Dynamic Memory Allocation:**
* **Preprocessor:**
* **Matrix:**
* **2D Matrix:**
* **3D Matrix:**
* **Numeric Characters:** 
* **Alphanumeric Characters:** Subsets of ASCII characters. Depends on the implementation and requirements. Some allow all ASCII characters while others use a subset of them. Generally Alphabets, Numbers and few Special characters. 0 to 9, A to Z(both uppercase and lowercase), @ # * & etc.
* **Enumeration:** List things one by one. To count. A synonym to the verb "list". It emphasizes the fact that things are being specifically identified and listed one at a time. In mathematics and computer science, enumeration is a complete, ordered listing of all the items in a collection. Used to refer to a listing of all of the elements of a set. 
* **Protobuf:** Protocol buffers are Google's language-neutral(any programming language), platform-neutral(any OS like Mac or Windows), extensible mechanism for serializing structured data.
* **Encoding:** Converting or Transforming (information or an instruction) into another form.
* **Decoding:** Converting or Translating (coded or encoded info) into an understandable form.
* **Cipher:** Secret or disguised way of writing; a code.
* **Callback:** You tell it to do something and it will let you know when its done.


## Next
* List of Datastructues, their definitions and possible use cases.
* Divisibility rules for 12345678910.
* runCatching { }
* suspendCancellableCoroutine { }
* suspend { }
* suspendCoroutine { }
* supervisorScope { }
* select { }
* selectUnbiased { }
* whileSelect { }
* sequence<Unit> { }
* yield()
* Joining coroutines
* sequence<Unit> { }

## References
1. https://kotlinlang.org/docs/reference
2. https://github.com/MindorksOpenSource/from-java-to-kotlin
3. https://www.youtube.com/playlist?list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8
4. https://www.youtube.com/playlist?list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2
5. https://android.jlelse.eu/magic-lies-here-statically-typed-vs-dynamically-typed-languages-d151c7f95e2b
6. https://byjus.com/maths/number-system
7. https://www.geeksforgeeks.org/biginteger-class-in-java
8. https://stackoverflow.com/questions/12693273/is-there-an-upper-bound-to-biginteger
9. https://www.baeldung.com/kotlin/kotlin-random-number
10. http://www.asciitable.com
11. https://www.youtube.com/watch?v=MHxGv4K6BsM
12. https://kb.iu.edu/d/ackw
13. https://www.eso.org/~ndelmott/ascii.html
14. https://www.youtube.com/watch?v=es4DYTFdqlg
15. https://www.youtube.com/watch?v=HtEzuAqWmoE
16. https://www.sciencedirect.com/topics/computer-science/alphanumeric-character
17. https://www.youtube.com/watch?v=6P20npkvcb8
