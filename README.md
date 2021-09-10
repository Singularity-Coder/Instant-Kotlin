![alt text](https://github.com/Singularity-Coder/Code-Snippets-Kotlin/blob/main/assets/banner3.png)
# Code Snippets Kotlin
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
* When you have context, you can use fewer words and be very expressive.
* Have lambdas as the last parameter to increase fluency.
* Lambdas can have a context object. You can either operate on the context object directly or pass it as a parameter.
* Use infix modifier to write more fluent functions.
* Use `.javaClass` to print the name of the class being used and learn more about it.
```Kotlin
println((3..18).javaClass)  // class kotlin.ranges.IntRange
```

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

## Null Safety
* **Nullable operator:** `?` means the variable is nullable (or) can be null.  
* **Not Null operator:**`!!` means you are forcibly telling the compiler that this variable is not null even if it actually is or can be null.  
* **If Not Null operator:**`?.` means safe call operator. If the variable is not null then execute this code.  
```Kotlin
value?.let {
    val length = value.length
}

// or simply
val length = value?.length
```
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
* **Nullable types and non-null types﻿**
```Kotlin

```
* **Checking for null in conditions﻿**
```Kotlin

```
* **Safe calls﻿**
```Kotlin

```
* **Elvis operator﻿﻿**
```Kotlin

```
* **The !! operator﻿**
```Kotlin

```
* **Safe casts**
```Kotlin

```
* **Collections of a nullable type﻿**
```Kotlin

```

## Equality﻿
* **Structural equality:** 
```Kotlin

```
* **Referential equality﻿:** 
```Kotlin

```

* **Floating-point numbers equality﻿:** 
```Kotlin

```

## This expressions
* **Qualified this﻿** 
```Kotlin

```
## This expressions
* **Qualified this﻿** 
```Kotlin

```
## This expressions
* **Qualified this﻿** 
```Kotlin

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
* **Any**
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
* **Concatenation**
```Kotlin
val a = "Hello";
val b = "World."

// plus() method : Since Strings are immutable in Java which Kotlin first compiles to, new String objects are created all the time. Inefficient for large number of strings. Use String templates or StringBuilder.
val c = a.plus(" ").plus(b).plus(" I am ").plus(a.length + b.length).plus(" characters long!")  // Hello World. I am 11 characters long!

// + Operator : Suppose we have 10 strings a + b + c + d + e + f + g + h + i + j, then each use of the + operator generates a new string object. So here just for just one string we generated 10 string objects. a + b is one, then a + b + c is another string object, etc.
val d = a + " " + b + " I am " + (a.length + b.length) + " characters long!"    // Hello World. I am 11 characters long!

// StringBuilder : Efficient when concatenating large number of strings
val stringBuilder: String = StringBuilder().append(a).append(" ").append(b).append(" I am ").append(a.length + b.length).append(" characters long!").toString() // Hello World. I am 11 characters long!

// Use StringBuffer for thread-safe concatenation instead of StringBuilder.
val stringBuffer: String = StringBuffer().append(a).append(" ").append(b).append(" I am ").append(a.length + b.length).append(" characters long!").toString()   // Hello World. I am 11 characters long!

// String Templates : This is just the Kotlin version of StringBuilder. Recommended way to concatenate.
val e = "$a $b I am ${a.length + b.length} characters long!"    // Hello World. I am 11 characters long!
```
* **Find / Read Strings**
```Kotlin
"Hello World".getOrNull(index = 8) // r (char)

"Hello World".length   // 11
"Hello World".indices  // 0..10
"Hello World".lastIndex    // 10

// Need further study on chars()
"Hello World".chars().count()  // 11 (chars() emits IntStream)
"Hello World".chars().average()  // OptionalDouble[95.63636363636364] (This is probably the average of all teh ASCII char values of Hello World)

// Need further study on codePoints()
"Hello World".codePoints().count() // 11

"Hello World".hashCode()   // -862545276 (Unique int value that will always be the same for a particular combination of chars. In this case Hello World has unique int value -862545276. Its case sensitive.)

// Need further study on Unicode points
"Hello World".codePointAt(index = 7)   // 111
"Hello World".codePointBefore(index = 7)   // 87
"Hello World".codePointCount(beginIndex = 2, endIndex = 7) // 5
```
* **String Transformations**
```Kotlin
"edoc".reversed()

"qwertyuiop".format(locale = Locale.ROOT, 2, 3, 4, "t")

"Singularity Coder".capitalize(Locale.ROOT)
"Singularity Coder".decapitalize(Locale.ROOT)

"qwertyuiop".toLowerCase(Locale.ROOT)
"qwertyuiop".toUpperCase(Locale.ROOT)

"qwerty".byteInputStream(Charsets.ISO_8859_1)
"qwerty".byteInputStream(Charsets.US_ASCII)
"qwerty".byteInputStream(Charsets.UTF_16)
"qwerty".byteInputStream(Charsets.UTF_16BE)
"qwerty".byteInputStream(Charsets.UTF_16LE)
"qwerty".byteInputStream(Charsets.UTF_32)
"qwerty".byteInputStream(Charsets.UTF_32BE)
"qwerty".byteInputStream(Charsets.UTF_32LE)
"qwerty".byteInputStream(Charsets.UTF_8)
"qwerty".byteInputStream(Charset.defaultCharset())

"qwertyuiop".toPattern(Pattern.UNIX_LINES)
"qwertyuiop".toPattern(Pattern.CANON_EQ)
"qwertyuiop".toPattern(Pattern.CASE_INSENSITIVE)
"qwertyuiop".toPattern(Pattern.COMMENTS)
"qwertyuiop".toPattern(Pattern.DOTALL)
"qwertyuiop".toPattern(Pattern.LITERAL)
"qwertyuiop".toPattern(Pattern.MULTILINE)
"qwertyuiop".toPattern(Pattern.UNICODE_CASE)
"qwertyuiop".toPattern(Pattern.UNICODE_CHARACTER_CLASS)
```
* **String Comparisons**
```Kotlin
"Hello".isEmpty()    // false
"     ".isEmpty()    // false
"Hello".isBlank()    // false
"     ".isBlank()    // true (isBlank trims and checks if it isEmpty)

"Hello".equals(other = "Hello") // true (This works on any object. Not specific to String)
"Hello" == "hello"  // false (== or equals is case sensitive)
"Hello" == "Hello"  // true
"Hello".contentEquals(charSequence = "Hello") // true (seems similar to ==)

"1234".compareTo("1234") // 0 (This means both have same number of chars)
"1234".compareTo("1234567") // -3 (This means the left side has 3 chars less than the right)
"1234567".compareTo("1234") // 3 (This means the left side has 3 chars more than the right)

"Hello".endsWith(suffix = "llo", ignoreCase = true) // true
"Hello".endsWith(char = 'o', ignoreCase = true) // true

"Hello".startsWith(prefix = "He", ignoreCase = true)    // true
"Hello World!".startsWith(prefix = "W", startIndex = 6, ignoreCase = true)  // true (We can define the starting point with startIndex)

"What A Wonderful World".regionMatches(thisOffset = 5, other = "A Wonderful", otherOffset = 0, length = 3, ignoreCase = true) // true (define start index for both strings we want to compare along with the length of the string)
```
* **Extract String**
```Kotlin
"What A Wonderful World".slice(indices = 5..15)    // A Wonderful

"Hello World".substring(range = 6..10)  // World
"Hello World".substring(startIndex = 2) // llo World
"Hello World".substring(startIndex = 0, endIndex = 4)   // Hell

"Hello World".substringAfter(delimiter = 'o', missingDelimiterValue = "NA")    // orld (Returns the right part of string at the first occurrence of "o" char in the whole string)
"Hello World".substringAfter(delimiter = 'x', missingDelimiterValue = "NA")    // NA (Since the char 'x' is missing from the string)
"Hello World".substringAfter(delimiter = "llo ", missingDelimiterValue = "NA") // World

"Hello World".substringAfterLast(delimiter = 'o', missingDelimiterValue = "NA")    // rld (Returns the last occurrence of "o" char in the whole string)
"Hello Hello".substringAfterLast(delimiter = "el", missingDelimiterValue = "NA")   // lo (Returns the last occurrence of "lo" string in the whole string)

"Hello World".substringBefore(delimiter = 'o', missingDelimiterValue = "NA")   // Hell (Returns the left part of string at the first occurrence of "o" char in the whole string)
"Hello World".substringBefore(delimiter = "rl", missingDelimiterValue = "NA")  // Hello Wo

"Hello World".substringBeforeLast(delimiter = 'o', missingDelimiterValue = "NA")   // Hello W (Returns the left part of string at the last occurrence of "o" char in the whole string)
"Hello Hello".substringBeforeLast(delimiter = "ll", missingDelimiterValue = "NA")  // Hello He

"Hello World".subSequence(startIndex = 0, endIndex = 4)    // Hell
"Hello World".subSequence(range = 1..4)    // ello

"Hello World".take(n = 8)  // Hello Wo (index starts from 1)
"Hell".take(n = 8) // Hell  (Returns entire string if string is shorter)
"Hello World".takeLast(n = 4)  // orld (Returns last 4 chars)

// Char comparisons are ASCII value comparisons. So these only seem reliable when u work with lowercase or uppercase chars exclusively. Uppercase chars have lower ASCII value than lowercase chars. Like char 'B' has ASCII value 66 while 'b' has 98.
('a'..'z').takeWhile { it: Char -> /* predicate */ it <= 'd' }   // [a, b, c, d]
('A'..'Z').takeWhile { it: Char -> it <= 'G' }   // [A, B, C, D, E, F, G]
('A'..'z').takeWhile { it: Char -> it <= 'd' }   // [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, [, \, ], ^, _, `, a, b, c, d]
('A'..'z').toList().takeLastWhile { it: Char -> it > 'o' } // [p, q, r, s, t, u, v, w, x, y, z]

// Not clear about its use.
"Hello World".takeIf { it: String -> it.length == it.length}   // Hello World
"Hello World".takeIf { it: String -> it.length == 3 }  // null (If predicate unsatisfied)

// Not clear. This is the opposite of takeIf. If predicate is satisfied it returns null else the entire string
"Hello World".takeUnless { it: String -> it.length == 3 }  // Hello World
"Hello World".takeUnless { it: String -> it.length == it.length }  // null
```
* **Modify / Update / Edit String**
```Kotlin
"wiki pedia.com".replace(oldValue = " ", newValue = "", ignoreCase = true)
"qwertyuiop".replace(oldValue = "q", newValue = "a", ignoreCase = true)
"qwertyuiop".replaceAfter(delimiter = 'q', replacement = "ss", missingDelimiterValue = "uu")
"qwertyuiop".replaceAfterLast(delimiter = 'q', replacement = "ss", missingDelimiterValue = "uu")
"qwertyuiop".replaceBefore(delimiter = 'q', replacement = "ss", missingDelimiterValue = "uu")
"qwertyuiop".replaceBeforeLast(delimiter = 'q', replacement = "ss", missingDelimiterValue = "uu")
"qwertyuiop".replace(regex = Regex(pattern = "qwe"), replacement = "asd")
"qwertyuiop".replaceFirst(oldChar = 'q', newChar = 'z', ignoreCase = true)
"qwertyuiop".replaceIndent(newIndent = "qwer")
"qwertyuiop".replaceIndentByMargin(newIndent = "qwer", marginPrefix = "|")
"qwertyuiop".replaceRange(range = 1..4, replacement = "ghjk")
"qwertyuiop".replaceRange(startIndex = 1, endIndex = 4, replacement = "hjk")

"qwertyuiop".drop(n = 3)
"qwertyuiop".dropLast(n = 3)
"qwertyuiop".dropLastWhile { it: Char -> it == 'u' }
"qwertyuiop".dropWhile { it: Char -> it == 'u' }

"qwertyuiop".removePrefix(prefix = "qwe")
"qwertyuiop".removeSurrounding(delimiter = "p")
"qwertyuiop".removeSurrounding(prefix = "qw", "ty")
"qwertyuiop".removeRange(range = 1..3)
"qwertyuiop".removeRange(startIndex = 2, endIndex = 6)
"qwertyuiop".removeSuffix(suffix = "ty")

"qwertyuiop".trim()
"qwertyuiop".trim('w', 'r')
"qwertyuiop".trim { it: Char -> false }
"qwertyuiop".trimStart()
"qwertyuiop".trimStart('w', 'r')
"qwertyuiop".trimStart { it: Char -> false }
"qwertyuiop".trimEnd()
"qwertyuiop".trimEnd('w', 'r')
"qwertyuiop".trimEnd { it: Char -> false }
"qwertyuiop".trimIndent()
"qwertyuiop".trimMargin(marginPrefix = "qwe")

"qwertyuiop".padEnd(length = 4, padChar = '-')
"qwertyuiop".padStart(length = 4, padChar = '-')

"qwertyuiop".prependIndent(indent = "asdfghjk")

"qwertyuiop".filter { it: Char -> it == 'o' }
"qwertyuiop".filterIndexed { i: Int, c: Char -> false }
"qwertyuiop".filterNot { it: Char -> it == 'u' }
```
* **String Conversions**
```Kotlin
12.toString()

"qwertyuiop".encodeToByteArray()
"qwertyuiop".encodeToByteArray(startIndex = 1, endIndex = 2, throwOnInvalidSequence = true)
"qwertyuiop".htmlEncode()

"123456789".toBigInteger()
"12345678".toBigInteger(radix = 2)
"12345678".toBigInteger(radix = 8)
"12345678".toBigInteger(radix = 16)

"123456.3456".toBigDecimal()
"123456.3456".toBigDecimal(mathContext = MathContext.UNLIMITED)
"123456.3456".toBigDecimal(mathContext = MathContext.DECIMAL128)
"123456.3456".toBigDecimal(mathContext = MathContext.DECIMAL64)
"123456.3456".toBigDecimal(mathContext = MathContext.DECIMAL32)
        
"1234567".toBigDecimalOrNull()
"1234567".toBigDecimalOrNull(mathContext = MathContext.UNLIMITED)

"1234567".toBigIntegerOrNull()
"1234567".toBigIntegerOrNull(radix = 2)

"1234567".toByte()
"1234567".toByteArray()
"1234567".toByteOrNull()
"1234567".toByteOrNull(radix = 2)

"1234567".toDouble()
"1234567".toDoubleOrNull()
"1234567".toFloat()
"1234567".toFloatOrNull()
"1234567".toInt()
"1234567".toInt(radix = 2)
"1234567".toIntOrNull()
"1234567".toIntOrNull(radix = 2)
"1234567".toLong()
"1234567".toLong(radix = 2)
"1234567".toLongOrNull()
"1234567".toLongOrNull(radix = 2)
"1234567".toShort()
"1234567".toShort(radix = 8)
"1234567".toShortOrNull()
"1234567".toShortOrNull(radix = 8)

"1234567".toUByte()
"1234567".toUByte(radix = 16)
"1234567".toUByteOrNull()
"1234567".toUByteOrNull(radix = 16)
"1234567".toUInt()
"1234567".toUInt(radix = 8)
"1234567".toUIntOrNull()
"1234567".toUIntOrNull(radix = 8)
"1234567".toULong()
"1234567".toULong(radix = 2)
"1234567".toULongOrNull()
"1234567".toULongOrNull(radix = 2)
"1234567".toUShort()
"1234567".toUShort(radix = 2)
"1234567".toUShortOrNull()
"1234567".toUShortOrNull(radix = 2)

"qwertyuiop".toCharArray()
"qwertyuiop".toCharArray(startIndex = 2, endIndex = 5)
"qwertyuiop".toCharArray(destination = charArrayOf('w', 'e'), destinationOffset = 2, startIndex = 4, endIndex = 6)

"qwertyuiop".toRegex()
"qwertyuiop".toRegex(option = RegexOption.COMMENTS)
"qwertyuiop".toRegex(setOf<RegexOption>(RegexOption.COMMENTS, RegexOption.CANON_EQ))

val myPair: Pair<String, String> = "Dark Bluish Black" to "Golden"
val splitString: Array<String> = "172.16.154.1".split(".").toTypedArray()
```
* **Other String Operations**
```Kotlin
"qwertyuiop".intern()

"qwertyuiop".offsetByCodePoints(index = 3, codePointOffset = 5)

"qwertyuiop".partition { it: Char -> false }
"qwertyuiop".reader()

//        "qwertyuiop".filterNotTo {}
//        "qwertyuiop".filterTo { }
//        "qwertyuiop".filterIndexedTo { }
//        val strBuff = StringBuffer().append("qwertyuiop")
//        stringBuilder.contentEquals(stringBuffer = strBuff)
```
* **New Line**
```Kotlin
val text = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()
```

## Type Casting or Type Conversion
```Kotlin
if (object is Car) var car = object as Car

// if object is null
if (object is Car?) var car = object as Car?
```

## Operators 
* **Arithmetic Operators**
```Kotlin
6 + 2   // 8 Addition operator (Used for string concatenation as well)
6 - 2   // 4 Subtraction Operator
6 * 2   // 12 Multiplication Operator
6 / 2   // 3 Division Operator
6 % 2   // 0 Modulus Operator (Gives remainder. Ex: 7 % 2 = 1)

a.plus(2)   // 8
a.minus(2)  // 4
a.times(2)  // 12
a.div(2)    // 3
a.rem(2)    // 0
```
* **Assignment Operators**
```Kotlin
var a = 6
a += 2  // a = a + 2
a -= 2  // a = a - 2
a *= 2  // a = a * 2
a /= 2  // a = a / 2
a %= 2  // a = a % 2
```
* **Comparision Operators**
```Kotlin
val a = 6; val b = 2
a > b   // true (greater than)
a < b   // false (less than)
a >= b  // true (greater than or equals to)
a <= b  // false (less than or equals to)
a == b  // false (is equal to)
a != b  // true (not equal to)

a.compareTo(b) > 0   // true 
a.compareTo(b) < 0   // false
a.compareTo(b) >= 0  // true 
a.compareTo(b) <= 0  // false
a.equals(b)          // false
!(a.equals(b))       // true 
```
* **Logical Operators**
```Kotlin
val a = 6; val b = 2
(a > b) || (b == 2) // true (Logical OR: true if either of the Boolean expressions is true)
(a > b) || (b == 4) // true
(a < b) || (b == 4) // false
(a > b) && (b == 2) // true (Logical AND: true if all Boolean expressions are true)
(a > b) && (b == 4) // false
```
* **Bitwise Operators:** Perfomed on Int and Long integral types through infix notation.
```Kotlin
val a = 6; val b = 2
a and b    // 2     (Bitwise AND. Performs a bitwise AND operation between "a" and "b". If both bits are "1" then it is counted as "1" else "0".)
a or b     // 6     (Bitwise OR. Performs a bitwise OR operation between "a" and "b". If either of the bits is "1" then it is counted as "1".)
a xor b    // 4     (Bitwise XOR. Performs a bitwise XOR operation between "a" and "b".)
a shr b    // 1     (Signed shift right. Shifts "a" value right by "b" value number of bits, filling the leftmost bits bits with copies of the sign bit.)
a shl b    // 24    (Signed shift left. Shifts "a" value left by "b" value number of bits.)
a ushr b   // 1     (Unsigned shift right. Shifts "a" value right by "b" value number of bits, filling the leftmost bits with zeros.)
a.inv()    // -7    (Bitwise inversion also called as Bitwise complement. Inverts the bits in "a" value. It makes every 0 to 1, and every 1 to 0.)
```
* **in Operator:** Used to check whether an object belongs to a collection.
```Kotlin
val numbers = intArrayOf(-19, -3, 1, 3)
3 in numbers    // true
3 !in numbers   // false

numbers.contains(3)     // true
!numbers.contains(3)    // false
```
* **Index access Operator**
```Kotlin
val numbers = intArrayOf(-19, -3, 1, 3)
numbers[1]          // -3
numbers[1] = -1     // -1

numbers.get(index = 1)              // -3
numbers.set(index = 2, value = 2)   // 2
```
* **Unary Prefix Operator**
```Kotlin
var a = 6
+a  // Unary plus
-a  // Unary minus (inverts sign)
++a // Increment: increases value by 1
--a // Decrement: decreases value by 1
!(a is Int) // not (inverts value)

a.unaryPlus()
a.unaryMinus()
a.inc()
a.dec()
```

## Conditionals (Flow Control)
> Conditional Statements
* **Block Statement**
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
* **When Statement** (Switch-Case)
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
> Conditional Expressions
* **Single Line Expression** (Ternary Operations)
```Kotlin
val price: Int = 59
val priceReaction: String = if (price < 100) "Cheap" else "Expensive" // Cheap
```
* **Block Expression**
```Kotlin
val price: Int = 59
val priceReaction2: String = if (price < 50) {
    "Cheap"
} else {
    "Expensive"
} // Expensive
```
* **When Expression** (Switch-Case)
```Kotlin
val price: Int = 59
val priceReaction3: String = when {
    price <= 30 -> "Cheap"
    price in 30..50 -> "Average"
    price in 50 until 70 -> "Expensive"
    else -> "Too much"
} // Expensive
```

## Loops (Flow Control)
* **For Loop**
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
* **ForEach Loop** (Enhanced For loop)
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
* **While Loop**
```Kotlin
var x = 1
while (x <= 10) {
    print("$x ")  // 1 2 3 4 5 6 7 8 9 10 
    x++
}
```
* **Do-While Loop**
```Kotlin
var y = 1
do {
    print("$y ")  // 1 2 3 4 5 6 7 8 9 10
    y++
} while (y <= 10)
```
* **Repeat**
```Kotlin
repeat(times = 10) { it: Int ->
    print("$it ")  // 0 1 2 3 4 5 6 7 8 9
}
```
* **Break**
```Kotlin
for (i in 1..10) {
    print("$i ")  // 1 2 3 4 5 6 
    if (i == 6) break
}
```
* **Continue**
```Kotlin
for (i in 1..10) {
    if (i == 2) continue
    if (i == 5) continue
    if (i == 8) continue
    print("$i ")  // 1 3 4 6 7 9 10 
}
```
* **Label**
```Kotlin
outerLoop@ for (a in 1..3) {
    innerLoop@ for (b in 6..8) {
        if (a == 1) continue@innerLoop
        if (b == 1) break@innerLoop
        if (b == 2) continue@outerLoop
        print("a = $a, b = $b | ")  // a = 2, b = 6 | a = 2, b = 7 | a = 2, b = 8 | a = 3, b = 6 | a = 3, b = 7 | a = 3, b = 8 |
    }
}
```
* **Iterator**
```Kotlin
val arr = mutableListOf(1, 2, 3, 4, 5)
val iterator = arr.iterator()	// Get iterator for the above list. Iterator obj is used to loop through collections.
while (iterator.hasNext()) {
    val i = iterator.next()	// 1 2 3 4 5. If you add "n" number of "val i = iterator.next()" then it will act as n+ increment in the iteration.
    if (i == 2) {
        iterator.remove()	// remove() doesn't work
        continue 			// continue keyword doesn't work
    }
    if (i == 3) {
        arr.remove(3)	// The only way to not make it crash and remove stuff.
        break
    }
}
```

## Collections
#### Arrays
Not part of Collections.
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
val immutableList: List<String> = listOf("Delta", "Theta", "Alpha", "Gamma", "Beta")    // [Delta, Theta, Alpha, Gamma, Beta] Cannot be modified but can be accessed.
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
val immutableMap = mapOf<Any, Char>("Subaru" to 'S', "Emilia" to 'E')   // {Subaru=S, Emilia=E} Cannot be modified but can be accessed.
val mutableMap = mutableMapOf<String, Int>()                            // {}
val emptyMap = emptyMap<Char, Int>()                                    // {}

// Create, Update
mutableMap.put(key = "Subaru", value = 19)  // {Subaru=19}
mutableMap.set(key = "Emilia", value = 18)  // {Subaru=19, Emilia=18}
mutableMap["Subaru"] = 19                   // {Subaru=19, Emilia=18}

// Read
immutableMap["Subaru"]                                          // S
immutableMap.get(key = "Subaru")                                // S
immutableMap.getOrDefault(key = "Subaru", defaultValue = 'S')   // S
immutableMap.entries                                            // [Subaru=S, Emilia=E]
immutableMap.keys                                               // [Subaru, Emilia]
immutableMap.values                                             // [S, E]
immutableMap.size                                               // 2
immutableMap.count()                                            // 2

// Check
immutableMap.containsKey("Subaru")    // true
immutableMap.containsValue('R')       // false
immutableMap.isEmpty()                // false

// Sort
mutableMap.toSortedMap()    // {Emilia=18, Subaru=19}

// Iterate
mutableMap.forEach { it: Map.Entry<String, Int> -> println("${it.key} is ${it.value}") }    // Subaru is 19 | Emilia is 18

// Print to console
println(immutableMap)   // {Subaru=S, Emilia=E}
println(mutableMap)     // {Subaru=19, Emilia=18}
println(emptyMap)       // {}

// Delete
mutableMap.remove("Subaru") // {Emilia=18}
mutableMap.clear()          // {}
```
#### Sets
Collection of unique values
```Kotlin
// Create
val immutableSet = setOf<String>("Emilia", "Subaru", "Emilia", "Subaru")    // [Emilia, Subaru]
val mutableSet = mutableSetOf<String>("Emilia", "Puck", "Emilia", "Subaru") // [Emilia, Puck, Subaru]
val emptySet = emptySet<String>()                                           // []

// Update
mutableSet.add("Echidna")   // [Emilia, Puck, Subaru, Echidna]

// Read
immutableSet.count()                        // 2
immutableSet.size                           // 2
immutableSet.first()                        // Emilia
immutableSet.last()                         // Subaru
immutableSet.elementAt(index = 1)           // Subaru
immutableSet.indexOf("Echidna")             // -1
immutableSet.lastIndexOf("Emilia")          // 0

// Check
immutableSet.isEmpty()                                      // false
immutableSet.contains("Echidna")                            // false
immutableSet.containsAll(setOf<String>("Emilia", "Subaru")) // true
immutableSet == mutableSet                                  // false

// Iterate
immutableSet.forEach { it: String -> print("$it ")} // Emilia Subaru

// Print to console
println(immutableSet)   // [Emilia, Subaru]
println(mutableSet)     // [Emilia, Puck, Subaru, Echidna]
println(emptySet)       // []

// Merge 2 sets
immutableSet union mutableSet     // returns unique values of both sets - [Emilia, Subaru, Puck, Echidna]
immutableSet intersect mutableSet // returns common values btw both sets - [Emilia, Subaru]

// Delete
mutableSet.remove("Echidna")    // [Emilia, Puck, Subaru]
mutableSet.clear()              // []
```
#### Collection Methods
```Kotlin
open class Vehicle(val name: String) {
    override fun toString(): String = name
}

class Bike(name: String) : Vehicle(name)
class Car(name: String) : Vehicle(name)

val list1 = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val list2 = mutableListOf<List<Int>>(listOf(1, 2, 3, 4), listOf(5, 6, 7, 8))
val list3 = listOf("123", "45")     // Strings are char lists
val list4 = listOf<Int?>(null, 2, null, 4, 5, null, 7, 8, null, 10)
val list5 = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val list6 = listOf<String>("abcd", "efgh", "ijkl", "mnop")
val list7 = listOf<Any>("abcd", 1, 'a', false, true, false, 3, 4, 'c', 'd')
val list8 = listOf<Vehicle>(Bike("Bang"), Car("Vroom"), Bike("Toomaha"))
val list9 = listOf<Int>(1, 1, 3, 4, 5, 5, 5, 5, 9, 10)
val map1 = mapOf("122222" to 2, "3455" to 3)

list1.filter { it: Int -> it % 2 == 0 } // [2, 4, 6, 8, 10]

list1.filter { it: Int -> it % 2 == 0 }.map { it: Int -> it - 1 }   // [1, 3, 5, 7, 9]

list2.flatMap { it: List<Int> -> it }          // [1, 2, 3, 4, 5, 6, 7, 8]
list2.flatten()                                // [1, 2, 3, 4, 5, 6, 7, 8]
list3.flatMap { it: String -> it.toList() }    // [1, 2, 3, 4, 5]
map1.flatMap { (key, value) -> key.take(value).toList() } // [1, 2, 3, 4, 5]

3 in list1          // true
list1.contains(3)   // true

list4.filterNotNull().toMutableList()   // [2, 4, 5, 7, 8, 10]

list4.first()  // null -> doesn't crash
list4.firstOrNull()  // null
list4.firstOrNull { it == 2 }  // 2
list4.firstOrNull { it == 3 }  // null
list4.firstOrNull { it == 3 } == null  // true

list4.last()   // 10
list4.lastOrNull() // 10
list4.lastOrNull { it == 2 } // 2
list4.lastOrNull { it == 3 }  // null
list4.lastOrNull { it == 3 } == null  // true

list5.removeAll { it: Int -> it % 2 == 0 } // returns true and transforms list5 into [1, 3, 5, 7, 9]
list1.remove(10) // returns true and transforms list5 into [1, 2, 3, 4, 5, 6, 7, 8, 9]
list1.removeAt(list1.lastIndex)    // returns 9 and transforms list 1 into [1, 2, 3, 4, 5, 6, 7, 8]

// 0 or "" is the initial/default value in case the list is empty and sum is the summation of all elements in the list
list5.fold(0) { initialValue, sum -> initialValue + sum }    // 25 = sum of all elements [1, 3, 5, 7, 9]
list6.fold("") { initialValue, sum -> initialValue + sum }    // abcdefghijklmnop = sum of all elements ["abcd", "efgh", "ijkl", "mnop"]

// If empty list reduce throws UnsupportedOperationException while hold handles with initial/default value
list5.reduce { initialValue, sum -> initialValue + sum }    // 25 = sum of all elements [1, 3, 5, 7, 9]
list6.reduce { initialValue, sum -> initialValue + sum }    // abcdefghijklmnop = sum of all elements ["abcd", "efgh", "ijkl", "mnop"]

list1.isEmpty()    // false
list1.isNotEmpty() // true
list1.isNullOrEmpty()  // false

list4.filterNotNull()  // [2, 4, 5, 7, 8, 10]

list7.filterIsInstance<String>()   // [abcd]
list7.filterIsInstance<Char>() // [a, c, d]
list7.filterIsInstance<Int>()  // [1, 3, 4]
list7.filterIsInstance<Boolean>()  // [false, true, false]
list8.filterIsInstance<Car>()  // [Vroom]
list8.filterIsInstance(Bike::class.java)   // [Bang, Toomaha]

list1.subList(fromIndex = 1, toIndex = 4)  // [2, 3, 4]

list9.toMutableList()  // [1, 1, 3, 4, 5, 5, 5, 5, 9, 10]
list9.toMutableSet()   // [1, 3, 4, 5, 9, 10] => Unique items only

map1.toList()  // [(122222, 2), (3455, 3)] => List of Pairs
val pair: Pair<String, Int> = map1.toList()[0]

list1.forEachIndexed { index, item ->
    print("$item at $index | ") // 1 at 0 | 2 at 1 | 3 at 2 | 4 at 3 | 5 at 4 | 6 at 5 | 7 at 6 | 8 at 7 |
}
map1.forEach { it: Map.Entry<String, Int> ->
    print("${it.key} to ${it.value} | ")    // 122222 to 2 | 3455 to 3 |
}

list1.listIterator().hasNext() // true
list1.listIterator().hasPrevious() // false
val iterator = list1.listIterator()
while (iterator.hasNext()) {
    val value = iterator.next()
    if (value == 2) continue
    if (value == 7) break
    print("$value | ")  // 1 | 3 | 4 | 5 | 6 |
}

list9.distinct()   // [null, 2, 4, 5, 7, 8, 10] => Like Set. Only Uniques.
list4.distinct()   // [1, 3, 4, 5, 9, 10] => Like Set. Only Uniques.
```

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
* **Local function:** Part of function scope.
```Kotlin
fun myIntro(fullName: String): String {
    fun splitName(): List<String> = fullName.split(" ").map { it -> it.toUpperCase() }
    return "My first name is ${splitName()[0]} and my last name is ${splitName()[1]}"
}

fun main() = myIntro("Hithesh Vurjana")  // My first name is HITHESH and my last name is VURJANA
```
* **Member function** Part of function scope. Function that is defined inside a class or object. They are called with dot notation.
```Kotlin
class Calculate {
    fun add() { print("Addition Operation") }
}

fun main() = Calculate().add() // Creates instance of class Calculate and calls add()
```
* **Default Parameters/Arguments**
```Kotlin
fun evenNumber(evenPrefix: Int = 2, num: Int) = evenPrefix * num
```
* **Named Parameters/Arguments**
```Kotlin
fun evenNumber(evenPrefix: Int = 2, num: Int) = evenPrefix * num

fun main() = evenNumber(num = 9)    // 18
```
* **Function / Method Overloading**
```Kotlin
fun printMyName(name: String) {
    println("My name is $name")
}

fun printMyName(firstName: String, lastName: String) {
    println("My name is $firstName $lastName")
}

fun main() {
    printMyName("Hithesh")  // My name is Hithesh
    printMyName("Hithesh", "Vurjana")   // My name is Hithesh Vurjana
}
```
* **Vararg function:** Variable number of arguments
```Kotlin
fun exponentList(vararg numList: Int, exponent: Int): List<Int> = numList.map { Math.pow(it.toDouble(), exponent.toDouble()).toInt() }

fun main() {
    exponentList(1, 2, 3, 4, 5, exponent = 3)   // [1, 8, 27, 64, 125]
    exponentList(numList = intArrayOf(1, 2, 3, 4, 5), exponent = 3)    // [1, 8, 27, 64, 125]
}
```
* **Infix function Call:** Must be an extension function, have only a single parameter which cannot be a vararg and cannot have a default value.
```Kotlin
infix fun Int.times(num: Int): Int = this * num

class Person(val name: String) {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) = likedPeople.add(other)
}

fun main() {
    3 times 5   // 15

    // Infix notation also works on members functions (methods). The containing class becomes the first parameter.
    val mark = Person("Mark")
    val sophia = Person("Sophia")
    mark likes sophia
} 
```
* **Operator function:**
```Kotlin
operator fun Int.times(str: String) = str.repeat(this)

operator fun String.get(range: IntRange) = substring(range)

fun main() {
    2 * "Bye "  // Bye Bye

    val str = "Always forgive your enemies; nothing annoys them so much."
    str[0..14]  // Always forgive
}
```
* **Generic function:**
```Kotlin

```
* **Tail recursive function:**
```Kotlin

```

## Operator overloading
#### Unary operations
* **Unary prefix operators:**
```Kotlin

```
* **Increments and decrements:**
```Kotlin

```
#### Binary operations﻿
* **Arithmetic operators:**
```Kotlin

```
* **in operator﻿:**
```Kotlin

```
* **Indexed access operator:**
```Kotlin

```
* **invoke operator:**
```Kotlin

```
* **Augmented assignments﻿:**
```Kotlin

```
* **Equality and inequality operators﻿:**
```Kotlin

```
* **Comparison operators:**
```Kotlin

```
* **Property delegation operators﻿:**
```Kotlin

```
* **Augmented assignments﻿:**
```Kotlin

```


## Inline Functions
* **inline:**
```Kotlin

```
* **noinline:**
```Kotlin

```
* **Non-local returns:**
```Kotlin

```
* **Reified type parameters﻿:**
```Kotlin

```
* **Inline properties:**
```Kotlin

```

## Scope Functions
These allow us to write idiomatic, functional style code and allow us to operate on immutable fields. So they promote immutability. I have changed my mind on this. Less repetiton means less errors. So use it as much as possible.
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
fun main() {
    val operation1 = highOrderFuncReturnValue(num1 = 8, num2 = 12) // 20
    val operation2 = highOrderFuncPrintComment() // Hello World!
}

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

fun main() {
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
}
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

fun main() {
    55.factorial()   // 9540809681250034973565866501770328168700249765255186764678629884883775957860052585601806640625
    12.5.squared()  // 156.25
    'C'.asciiValue() // 67
    User(name = "Hithesh", age = 67).canWork(myUser.age)  // true
    "Singularity Coder".analyzeString()  // Definitely Neo! | String Length: 17 | String starts with the letter: S | String mid value: i
}
```

## Lambdas
* **Higher-order functions﻿**
```Kotlin

```
* **Function types﻿**
```Kotlin

```
* **Anonymous functions**
```Kotlin

```
* **Closures﻿**
```Kotlin

```
* **Function literals with receiver﻿**
```Kotlin

```

## Properties
* **Declaring Properties**
```Kotlin
var name: String = "Hithesh"

val city: String = "India"

internal lateinit var person1: Person

private var person2: Person? = null

val person3: Person by lazy {
    println("Lazy variables can't be var and can't be private.")
    Person("Hithesh")
}

class Person(var name: String)
```
* **Compile-Time Constants**
```Kotlin

```
* **Late-Initialized Properties and Variables**
```Kotlin

```
* **Overriding Properties**
```Kotlin

```
* **Delegated Properties**
```Kotlin

```

## Getters and Setters
* **Default Getter & Setter**
```Kotlin
var myName1 = "Hithesh"
var myName2: String = "Hithesh"	// Same as myName1
    get() = field
    set(value) {
        field = value
    }
```
* **Custom Getter**
```Kotlin
val list = listOf(1, 2, 3, 4, 5)
val isEmpty: Boolean
    get() = list.isEmpty()
```
* **Custom Setter**
```Kotlin
var myName: String = ""
    set(value) {
        field = value
        println("myName is $value")
    }
```
* **Private Setter, Public Getter**
```Kotlin
var myName = "Hithesh"
    private set
```
* **Backing Fields**
```Kotlin

```
* **Backing Properties**
```Kotlin

```

## Creating Classes
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
```

## Creating Instance or Object
```Kotlin
val address1 = Address1()
val address2 = Address1()
address1.city = "Tesla"
address1.country = "Mars Colony @#$%123"
address1.zip = 123456

println(address1.toString())    // Address(City: Tesla, Country: Mars Colony @#$%123, Zip: 123456)
println(address1.hashCode())    // 654287787
println(address1.equals(address2))  // false
```

## Initialization Block
```Kotlin
class User(name: String) {

    val userName = name

    init {
        println("init block is like a function that's called before any other function or callback in this class. Means its called first on accessing the class")
        println("But if you are using any variables like \"userName\", then you should declare them before init block or it wont be able to access it. Ex: User's name is $userName")
    }

    fun printMe() = println("Hello World")
}

fun main() {
    val user = User("Hithesh").printMe()
    // init block is like a function that's called before any other function or callback in this class. Means its called first on class access
    // But if you are using any variables like "userName", then you should declare them before init block or it wont be able to access it. Ex: User's name is Hithesh
    // Hello World
}
```

## Companion Object (Static stuff)
```Kotlin
class Person {
    companion object {
        private const val PERSON_PREFIX = "My name is "
        val AGE_GROUPS = intArrayOf(18, 30, 35, 40, 45, 50)
        
        fun isMinor(age: Int): Boolean = age < 18
        
        enum class PersonType {
            YOUTH, MIDDLE_AGED, OLD
        }
    }
}

fun main() {
    println(Person.isMinor(17))					// true
    println(Person.AGE_GROUPS[3])				// 40
    println(Person.Companion.PersonType.OLD)	// OLD
}
```

## Constructors
* **Primary Constructor**
```Kotlin
class User0(val name: String = "", val age: Int = 0) 

fun main() {
    val user0: User0 = User0(name = "Hithesh", age = 199)
    println("Name: ${user0.name}")  // Name: Hithesh
    println("Age: ${user0.age}")    // Age: 199
}
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

fun main() {
    val user1: User1 = User1(name = "Singularity Coder", age = 6543)
    println("Name: ${user1.name}")  // Name: Singularity Coder
    println("Age: ${user1.age}")    // Age: 6543
}
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

fun main() {
    val user2: User2 = User2(dob = "12/07/0001", profession = "Magic Caster")
    user2.printDob()    // Date Of Birth: 12/07/0001
    user2.printProfession() // Profession: Magic Caster
}
```
* **Private Constructor:** These classes cannot be instantiated or you cannot create objects with these classes.
```Kotlin
class User3 private constructor() {
    companion object {
        const val NAME: String = "Singularity Coder"
        fun age15YearsFromNow(age: Int): Int = age + 15
    }
}

fun main() {
    val name: String = User3.NAME   // Singularity Coder
    val age: Int = User3.age15YearsFromNow(age = 15)    // 30
}
```

## Nested and inner classes
* **"inner" keyword**
```Kotlin
class Person(private val name: String) {

    // Can access parent class variables with "inner" keyword
    inner class Intro {
        fun myIntro(): String = "This person's name is $name"
    }

    // Cannot access parent class variables without "inner" keyword
    class Hobby(private val myName: String) {
        fun myHobby(): String = "$myName's hobby is to watch anime"
    }
}
```
* **Access Inner Class**
```Kotlin
fun introducePerson(name: String): String {
    // Nested classes without inner keyword cannot be accessed from an instance of the parent class
    val myHobby = Person.Hobby(name).myHobby()
    
    // Nested classes with inner keyword can be accessed from an instance of the parent class
    val myIntro = Person(name).Intro().myIntro()
    
    return "$myIntro & $myHobby"
}

fun main() {
    introducePerson("Hithesh")  // This person's name is Hithesh & Hithesh's hobby is to watch anime
}
```
* **Anonymous inner classes﻿**
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

## Enum Class
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
enum class MathConstants(val value: Double, val alsoKnownAs: CharSequence? = "") {
    ZERO(value = 0.0),
    ONE(value = 1.0),
    IMAGINARY_UNIT(value = sqrt(-1.0), alsoKnownAs = "i"),
    NATURAL_LOGARITHM_OF_2(value = 0.69314718055994530941, alsoKnownAs = "ln 2"),
    PI(value = 3.14159265358979323846),
    EULER_NUMBER(value = 2.71828182845904523536, alsoKnownAs = "e"),
    GOLDEN_RATIO(value = 1.61803398874989484820, alsoKnownAs = "Phi");

    companion object {
        infix fun MathConstants.withDecimalPlacesOf(decimalPlaces: Int?): Double {
            decimalPlaces ?: return this.value
            return try {
                BigDecimal(this.value.toString()).setScale(decimalPlaces, RoundingMode.CEILING).toDouble()
            } catch (e: Exception) {
                this.value
            }
        }

        infix fun <T> MathConstants.isSubsetOf(value: T?): Boolean {
            value ?: return false
            if (value !is Number) return false
            return values().firstOrNull { this.value < abs(value.toDouble()) } != null
        }

        fun Number.nearestConstants(): List<MathConstants> {
            if (abs(this.toDouble()) > PI.value) return emptyList()
            return values().filter { this.toDouble() < it.value }
        }
    }
}
```
* **Access constants**
```Kotlin
val direction: Direction = Direction.EAST                 // EAST
val myConstantValue: Double = MathConstants.PI.value      // 3.14
val myConstant: String = MathConstants.PI.name            // PI
val myConstantPosition: Int = MathConstants.PI.ordinal    // 3
val myPiWith3DecimalPlaces: Double = MathConstants.PI withDecimalPlacesOf 3   // 3.142
val isThisSubset: Boolean = MathConstants.PI isSubsetOf 4                     // true
val myNearestConstants: List<MathConstants> = 2.3456789.nearestConstants()    // [PI, EULER_NUMBER]
```
* **Anonymous classes﻿**
```Kotlin

```
* **Implementing interfaces in enum classes﻿**
```Kotlin

```
* **Anonymous classes﻿**
```Kotlin

```

## Inline classes

## Inheritance
* **Overriding Methods**
```Kotlin

```
* **Overriding Properties**
```Kotlin

```
* **Derived Class Initialization Order**
```Kotlin

```
* **Calling the Superclass Implementation﻿**
```Kotlin

```
* **Overriding rules**
```Kotlin

```

## Singleton
## Data Class
```Kotlin
data class User(var name: String, var age: Int)
```
## Abstract Class

## Interface
* **Implementing Interfaces﻿**
```Kotlin

```
* **Properties in interfaces﻿**
```Kotlin

```
* **Interfaces Inheritance﻿**
```Kotlin

```
* **Resolving Overriding Conflicts﻿**
```Kotlin

```

## Functional (SAM) interfaces﻿
* **SAM conversions**
```Kotlin

```

## Sealed Classes

## Extensions﻿
* **Extension functions**
```Kotlin

```
* **Extensions are resolved statically**
```Kotlin

```
* **Nullable receiver**
```Kotlin

```
* **Extension properties**
```Kotlin

```
* **Companion object extensions**
```Kotlin

```
* **Scope of extensions**
```Kotlin

```
* **Declaring extensions as members﻿**
```Kotlin

```

## Visibility Modifiers
Classes, objects, interfaces, constructors, functions, properties and their setters can have visibility modifiers. Getters always have the same visibility as the property.
* **private**
```Kotlin

```
* **protected**
```Kotlin

```
* **internal**
```Kotlin

```
* **public** (default)
```Kotlin

```

## Cloning or Copying
```Kotlin
data class User(var name: String, var age: Int)

fun main() {
    // cloning or copying
    val user = User("Singularity Coder", 30)
    val user2 = user.copy()
    // in case you only want to copy selected properties
    val user2 = user.copy(age = 25)
}
```

## Delegation﻿

## Delegated properties﻿

## Type aliases﻿

## Pair and Triple
* **Pair:** Collection of 2 variables
```Kotlin
val myPair = "Dark Blue" to "Golden"    // (Dark Blue, Golden)
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
* **Triple:** Collection of 3 variables
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
```Kotlin
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

## Generics: in, out, where﻿
* **Variance﻿**
```Kotlin

```
* **Declaration-site variance﻿**
```Kotlin

```
* **Type projections﻿**
```Kotlin

```
* **Star-projections**
```Kotlin

```
* **Generic functions**
```Kotlin

```
* **Generic constraints - Upper bounds**
```Kotlin

```
* **Type erasure﻿**
```Kotlin

```
* Classes can have type parameters
```Kotlin
class Person<T, E, K, V>(
    type: T? = null,
    element: E? = null,
    key: K? = null,
    value: V? = null
) {
    init {
        println("$type")
        println("$element")
        println("$key")
        println("$value")
    }
}

fun main() {
    Person<String, Int, Boolean, Any>()
    Person<Any, Boolean, Number, Char>(type = "Hithesh", element = false, key = 3, value = 'S')
}
```

## Regular Expressions
* Finding exact string
* Finding exact string with conditions
* Finding exact string and replacing it with another

## Math

## Lateinit and Lazy

## Exceptions

## Lambda

## JvmStatic, JvmOverloads, and JvmField

## Destructuring declarations

## Annotations
```Kotlin
annotation class StringMagic
```

## Reflection
* **Class references﻿**
```Kotlin

```
* **Callable references**
```Kotlin

```

## Coroutines
* **Dependencies**
```Kotlin
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2"
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2"
```
* **Sample heavy tasks**
```Kotlin
fun heavyTask(taskName: String, taskLength: Int) {
    for (i in 0..taskLength) if (i == taskLength) println("$taskName $i")
}

suspend fun heavyTask2(taskLength: Long) = delay(4000L)
```
* **Create a basic background (Asynchronous) operation**
```Kotlin
GlobalScope.launch { // launch a new coroutine in background and continue. GlobalScope means this coroutine's lifecycle == app's lifecycle
    heavyTask2(taskLength = 4000L)
    println("Task 4 done")
}
println("Task 1 done")    // This wont finish completely as JVM doesnt seem to execute a line of code for more than few millis. So we must block the main or whatever thread this code is running on at this line of code until it finishes execution
```
* Do work in background and post results on UI thread
```Kotlin
GlobalScope.launch(Dispatchers.IO) {
    val task = launch { heavyTask(taskName = "a", taskLength = 10000) }
    task.join()
    launch(Dispatchers.Main) {
        println("Done with Task")
    }
}
```
* **Structured Concurrency**  
Do work in background sequentially and then post results in UI thread
```Kotlin
// How to execute async operations sequentially while blocking thread its running on?
// If we forget to keep a reference to the newly launched coroutine, it still runs.
// The coroutines launched first finish first. Runblocking maintains order of coroutine execution
runBlocking<Unit> {
    val job2 = launch { // launch a new coroutine in the scope of runBlocking
        heavyTask2(taskLength = 4000L)
        println("Task 4 done")
    }
    println("Task 1 done")
    launch {
        heavyTask2(taskLength = 2000L)
        println("Task 5 done")
    }
    println("Task 2 done")
    launch {
        heavyTask2(taskLength = 100L)
        println("Task 6 done")
    }
    println("Task 3 done")
    job2.join() // wait till job2 is done n then execute the below code. This is non-blocking. How?
    println("Task 7 done")
}
```
* **Do work in background parallelly and then post results on UI thread**
```Kotlin
// How to execute async operations sequentially without blocking thread its running on?
runBlocking<Unit> {
    val job2 = launch { // launch a new coroutine in the scope of runBlocking
        heavyTask2(taskLength = 4000L)  // Blocking
        println("Task 2 done")
    }
    println("Task 1 done")
    job2.join() // wait till job2 is done n then execute the below code. This is non-blocking. How?
    println("Task 3 done")

    // This scope is blocking as it is inside runBlocking
    coroutineScope {
        // Non-Blocking. Whatever finishes first is shown
        launch {
            heavyTask2(taskLength = 2000L)
            println("Task 5 done")
        }
        heavyTask2(taskLength = 4000L)
        println("Task 4 done")
        heavyTask2(taskLength = 6000L)
        println("Task 6 done")
    }
    println("Task 7 done")
}
println("Task 8 done")
```
* **Do work in background and return result**
```Kotlin
// Since async are in runBlocking all the coroutine operations happen sequentially
// If all operations have to happen sequentially then use join()
runBlocking {
    println("Task 1 done")
    val value1 = GlobalScope.async {
        heavyTask2(taskLength = 6000L)
        println("--------------------------------running on thread [${Thread.currentThread().name}]")
        10
    }
    println("Task 2 done")
    val value2 = GlobalScope.async {
        heavyTask2(taskLength = 1000L)
        println("--------------------------------running on thread [${Thread.currentThread().name}]")
        20
    }
    println("Task 3 done")
    println("Task 4 done with value 1 = ${value1.await()} running on thread [${Thread.currentThread().name}]")
    println("Task 5 done value 2 = ${value2.await()} running on thread [${Thread.currentThread().name}]")
    println("Task 6 done")
}
```
* **More**
```Kotlin
GlobalScope.launch {    // Launch a coroutine in background
    myDelay(2000L)  // Suspends "coroutine" execution for 2 sec but not the thread.  Its a suspend function.
}

runBlocking<Unit> { 
    myDelay(2000L)  // Suspends "thread" execution for 2 sec until coroutine inside it finishes. This is equivalent to Thread.sleep()
}

GlobalScope.launch(Dispatchers.IO) {
    withTimeout(2000L) { }   // Cancels coroutine on timeout which is 2 sec here. Its a suspend function.
    runInterruptible<Unit> { }    // Throws CancellationException if interrupted. Its a suspend function.
    coroutineScope { }

    // Operate on background thread
    launch(Dispatchers.IO) { }
    launch(Dispatchers.Default) {  }
    launch(Dispatchers.Main) {  }
    launch(Dispatchers.Unconfined) {  }

    // Operate on background thread and return something
    GlobalScope.async(Dispatchers.IO) { }.await()   // For parallel tasks
    async(Dispatchers.IO) { }.await()  // For parallel tasks
    withContext(Dispatchers.IO) { }    // For single task
}

suspend fun myDelay(duration: Long) {
    delay(duration)
}
```
* **Scope builder﻿**
```Kotlin

```
* **Scope builder and concurrency**
```Kotlin

```
* **An explicit job**
```Kotlin

```
* **Cancelling coroutine execution**
```Kotlin

```
* **Making computation code cancellable**
```Kotlin

```
* **Closing resources with finally**
```Kotlin

```
* **Run non-cancellable block**
```Kotlin

```
* **Sequential by default﻿**
```Kotlin

```
* **Concurrent using async﻿**
```Kotlin

```
* **Lazily started async﻿**
```Kotlin

```
* **Async-style functions**
```Kotlin

```
* **Structured concurrency with async﻿**
```Kotlin

```
* **Coroutine context**
```Kotlin

```

## Coroutine Asynchronous Flow
* **Sequences﻿**
```Kotlin

```
* **Suspending functions**
```Kotlin

```
* **Flows﻿**
```Kotlin

```
* **Flows are cold**
```Kotlin

```
* **Flow cancellation basics﻿**
```Kotlin

```
* **Flow builders﻿**
```Kotlin

```
* **Transform flow operators**
```Kotlin

```
* **Size-limiting flow operators**
```Kotlin

```
* **Terminal flow operators**
```Kotlin

```
* **Flows are sequential**
```Kotlin

```
* **Flow context﻿ - flowOn operator**
```Kotlin

```
* **Buffering﻿**
```Kotlin

```
* **Composing multiple flows﻿**
```Kotlin

```
* **Flattening flows**
```Kotlin

```
* **Flow exceptions﻿**
```Kotlin

```
* **Exception transparency﻿**
```Kotlin

```
* **Flow completion**
```Kotlin

```
* **Launching flow﻿**
```Kotlin

```
* **Sequences﻿**
```Kotlin

```


## Coroutine Channels
* **Closing and iteration over channels**
```Kotlin

```
* **Building channel producers**
```Kotlin

```
* **Pipelines﻿**
```Kotlin

```
* **Prime numbers with pipeline**
```Kotlin

```
* **Fan-out**
```Kotlin

```
* **Fan-in﻿**
```Kotlin

```
* **Buffered channels﻿**
```Kotlin

```
* **Ticker channels﻿**
```Kotlin

```

## Coroutine exceptions handling﻿
* **CoroutineExceptionHandler**
```Kotlin

```
* **Cancellation and exceptions﻿**
```Kotlin

```
* **Exceptions aggregation﻿**
```Kotlin

```
* **Supervision﻿**
```Kotlin

```


## Multi-Tasking & Background Operations
#### **RxJava**
```Kotlin
Single.fromCallable {
    // Heavy operation
}.subscribeOn(Schedulers.io())                  // Set thread to run heavy operation on
    .observeOn(AndroidSchedulers.mainThread())  // Set thread to show heavy operation results
    .subscribe(Consumer<Any?> { it: Any? ->
        // Update UI
    })
```
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

## JVM Platform

## Stack Trace
* **Get map of stack traces for all threads that are alive**
```Kotlin
Thread.getAllStackTraces()	// {Thread[main,5,main]=[Ljava.lang.StackTraceElement;@e580929, Thread[Monitor Ctrl-Break,5,main]=[Ljava.lang.StackTraceElement;@1cd072a9, Thread[Finalizer,8,system]=[Ljava.lang.StackTraceElement;@7c75222b, Thread[Reference Handler,10,system]=[Ljava.lang.StackTraceElement;@4c203ea1, Thread[Signal Dispatcher,9,system]=[Ljava.lang.StackTraceElement;@27f674d, Thread[Common-Cleaner,8,InnocuousThreadGroup]=[Ljava.lang.StackTraceElement;@1d251891}
```
* **Print stack trace of current thread**
```Kotlin
fun main() { f1() }
fun f1(): String = "My ${f2()}"
fun f2() = "name ${f3()}"
fun f3() = "is ${f4()}"
fun f4(): String {
    Exception("Stack Trace")
        .printStackTrace(System.out)
    return "Hithesh"
}

// java.lang.Exception: Stack Trace
//	at MainKt.f4(main.kt:123)
//	at MainKt.f3(main.kt:121)
//	at MainKt.f2(main.kt:120)
//	at MainKt.f1(main.kt:119)
//	at MainKt.main(main.kt:118)
//	at MainKt.main(main.kt)
```
```Kotlin
fun main() {
    Thread.dumpStack()
}

// java.lang.Exception: Stack trace
//	at java.base/java.lang.Thread.dumpStack(Thread.java:1383)
//	at MainKt.main(main.kt:40)
//	at MainKt.main(main.kt)
```
```Kotlin
fun main() {
    Arrays.toString(Thread.currentThread().stackTrace).replace(',', '\n')
}

// [java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
// MainKt.main(main.kt:40)
// MainKt.main(main.kt)]
```
```Kotlin
Thread.currentThread().stackTrace[0].classLoaderName        // null
Thread.currentThread().stackTrace[0].className              // java.lang.Thread
Thread.currentThread().stackTrace[0].fileName               // Thread.java
Thread.currentThread().stackTrace[0].isNativeMethod         // false
Thread.currentThread().stackTrace[0].lineNumber             // 1602
Thread.currentThread().stackTrace[0].methodName             // getStackTrace
Thread.currentThread().stackTrace[0].moduleName             // java.base
Thread.currentThread().stackTrace[0].moduleVersion          // 11.0.12
```
* **Get stack trace from Throwable**
```Kotlin
fun main() {
    StringWriter().apply {
	Throwable("Stack Trace").printStackTrace(PrintWriter(this))
	println(this.toString())
    }
}

// java.lang.Throwable: Stack Trace
//	at MainKt.main(main.kt:40)
//	at MainKt.main(main.kt)
```
```Kotlin
fun main() {
    Throwable().printStackTrace()
	
    // OR
	
    Throwable().stackTrace
	
    // OR
	
    Throwable().printStackTrace(System.out)
}

// java.lang.Throwable
//	at MainKt.main(main.kt:40)
//	at MainKt.main(main.kt)
```
* **Find the caller method name**
```Kotlin
fun main() {
    getCallingMethodName()
    printHelloWorld()
}

fun getCallingMethodName(): String {
    val callingFrame: StackTraceElement = Thread.currentThread().stackTrace[3]
    return callingFrame.methodName 	// main
}

fun printHelloWorld() {
    println("Hello World")
    println(getCallingMethodName()) // main
}
```

## Terminology
#### Asynchronous Programming Techniques
1. Threading
2. Callbacks - With callbacks, the idea is to pass one function as a parameter to another function, and have this one invoked once the process has completed.
3. Reactive Extensions (RxJava)
4. Coroutines
#### Asynchronous Programming Vocabulary
* **Asynchronous**
* **Synchronous**
* **Suspendable function**
* **Blocking code**
* **Non-blocking code**
* **Concurrency**
* **Parallelism**
* **Long-Running operation - code with time to execute**
* **Difference btw Thread n Coroutine** What can Thread achieve that Coroutine cant n vice versa - Coroutines provide concurrency but not parallelism
* **State Machine**
* **Mutual Recursion**
* **Tail Calls**
* **Tail Call Eliminiation**
* **State**
* **Subroutine**
* **Coroutine**
* **Routine**
* **Yield**
* **Return**
* **Resume**
* **Closure**
* **Daemon Threads** Daemon Threds do not keep the process alive. Global coroutines in Android have similar behaviour.
* **Process**
* **How to keep process alive**

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
* Stream Library
* Promise Library
* Structured Concurrency
* Green threads
* Recursion
* Boolean Logic
* Meta-Programming
* Generate Morse Code

## References
1. https://kotlinlang.org/docs/home.html
2. https://github.com/MindorksOpenSource/from-java-to-kotlin
3. https://www.baeldung.com/kotlin/kotlin-random-number
4. https://www.programiz.com/kotlin-programming
5. https://www.geeksforgeeks.org/biginteger-class-in-java
6. https://stackoverflow.com/questions/12693273/is-there-an-upper-bound-to-biginteger
7. [Mindorks Youtube](https://www.youtube.com/playlist?list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8)
8. [Coding In Flow Youtube](https://www.youtube.com/playlist?list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2)
9. [Smartherd Youtube](https://www.youtube.com/watch?v=VEqhzCFmEQI&list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR)
10. https://en.wikipedia.org/wiki/Coroutine
11. [KotlinConf 2019: Error Handling Strategies for Kotlin Programs by Nat Pryce & Duncan McGregor](ttps://www.youtube.com/watch?v=pvYAQNT4o0I)
12. [How to Kotlin - from the lead Kotlin language designer (Google I/O '18)](https://youtu.be/6P20npkvcb8)
13. https://stackoverflow.com/questions/944991/is-there-a-way-to-dump-a-stack-trace-without-throwing-an-exception-in-java
