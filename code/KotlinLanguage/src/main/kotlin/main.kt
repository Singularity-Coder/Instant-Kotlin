import java.math.MathContext
import java.nio.charset.Charset
import java.util.*
import java.util.regex.Pattern

fun main(args: Array<String>) {

}

fun kotlinStrings() {
    concatenateStrings()

    val myPair: Pair<String, String> = "Dark Bluish Black" to "Golden"
    val splitString: Array<String> = "172.16.154.1".split(".").toTypedArray()
    val areTheyEqual: Boolean = "qwerty".equals(other = "qwertyy")
    val areTheyEqual2: Boolean = "qwerty" == "qwertyy"

    "edoc".reversed()

    "Singularity Coder".capitalize(Locale.ROOT)
    "Singularity Coder".decapitalize(Locale.ROOT)

    "qwerty".compareTo("qwerty")

    "qwerty".get(index = 8)

    "qwerty".length

    "qwerty".chars()

    "qwerty".codePoints()

    "qwerty".hashCode()

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

    12.toString()

    "qwertyuiop".codePointAt(index = 7)
    "qwertyuiop".codePointBefore(index = 7)
    "qwertyuiop".codePointCount(beginIndex = 2, endIndex = 7)

    "qwertyuiop".contentEquals(charSequence = "qwertyuiop")

    "qwertyuiop".drop(n = 3)
    "qwertyuiop".dropLast(n = 3)
    "qwertyuiop".dropLastWhile { it: Char -> it == 'u' }
    "qwertyuiop".dropWhile { it: Char -> it == 'u' }

    "qwertyuiop".encodeToByteArray()
    "qwertyuiop".encodeToByteArray(startIndex = 1, endIndex = 2, throwOnInvalidSequence = true)
//    "qwertyuiop".htmlEncode()

    "qwertyuiop".endsWith(suffix = "cao", ignoreCase = true)

    "qwertyuiop".filter { it: Char -> it == 'o' }
    "qwertyuiop".filterIndexed { i: Int, c: Char -> false }
    "qwertyuiop".filterNot { it: Char -> it == 'u' }

    "qwertyuiop".format(locale = Locale.ROOT, 2, 3, 4, "t")

    "qwertyuiop".intern()

    "qwertyuiop".toLowerCase(Locale.ROOT)
    "qwertyuiop".toUpperCase(Locale.ROOT)

    "qwertyuiop".offsetByCodePoints(index = 3, codePointOffset = 5)

    "qwertyuiop".padEnd(length = 4, padChar = '-')
    "qwertyuiop".padStart(length = 4, padChar = '-')

    "qwertyuiop".partition { it: Char -> false }
    "qwertyuiop".prependIndent(indent = "asdfghjk")
    "qwertyuiop".reader()
    "qwertyuiop".regionMatches(thisOffset = 2, other = "rwtw", otherOffset = 7, length = 3, ignoreCase = true)

    "qwertyuiop".removePrefix(prefix = "qwe")
    "qwertyuiop".removeSurrounding(delimiter = "p")
    "qwertyuiop".removeSurrounding(prefix = "qw", "ty")
    "qwertyuiop".removeRange(range = 1..3)
    "qwertyuiop".removeRange(startIndex = 2, endIndex = 6)
    "qwertyuiop".removeSuffix(suffix = "ty")

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

    "qwertyuiop".slice(indices = 1..4)
    "qwertyuiop".startsWith(prefix = "qw", ignoreCase = true)
    "qwertyuiop".startsWith(prefix = "qw", startIndex = 3, ignoreCase = true)

    "qwertyuiop".substring(range = 1..4)
    "qwertyuiop".substring(startIndex = 2)
    "qwertyuiop".substring(startIndex = 2, endIndex = 5)
    "qwertyuiop".substringAfter(delimiter = 'w', missingDelimiterValue = "sdm")
    "qwertyuiop".substringAfter(delimiter = "we", missingDelimiterValue = "sdm")
    "qwertyuiop".substringAfterLast(delimiter = 'w', missingDelimiterValue = "sdm")
    "qwertyuiop".substringAfterLast(delimiter = "we", missingDelimiterValue = "sdm")
    "qwertyuiop".substringBefore(delimiter = 'w', missingDelimiterValue = "sdm")
    "qwertyuiop".substringBefore(delimiter = "we", missingDelimiterValue = "sdm")
    "qwertyuiop".substringBeforeLast(delimiter = 'w', missingDelimiterValue = "sdm")
    "qwertyuiop".substringBeforeLast(delimiter = "we", missingDelimiterValue = "sdm")

    "qwertyuiop".subSequence(startIndex = 1, endIndex = 4)
    "qwertyuiop".subSequence(range = 1..4)

    "qwertyuiop".take(n = 5)
    "qwertyuiop".takeLast(n = 6)
    "qwertyuiop".takeLastWhile { it: Char -> false }
    "qwertyuiop".takeWhile { it: Char -> false }
    "qwertyuiop".takeIf { it: String -> false }
    "qwertyuiop".takeUnless { it: String -> false }

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

    "qwertyuiop".toPattern(Pattern.UNIX_LINES)
    "qwertyuiop".toPattern(Pattern.CANON_EQ)
    "qwertyuiop".toPattern(Pattern.CASE_INSENSITIVE)
    "qwertyuiop".toPattern(Pattern.COMMENTS)
    "qwertyuiop".toPattern(Pattern.DOTALL)
    "qwertyuiop".toPattern(Pattern.LITERAL)
    "qwertyuiop".toPattern(Pattern.MULTILINE)
    "qwertyuiop".toPattern(Pattern.UNICODE_CASE)
    "qwertyuiop".toPattern(Pattern.UNICODE_CHARACTER_CLASS)

    "qwertyuiop".toRegex()
    "qwertyuiop".toRegex(option = RegexOption.COMMENTS)
    "qwertyuiop".toRegex(setOf<RegexOption>(RegexOption.COMMENTS, RegexOption.CANON_EQ))

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

    "qwertyuiop".indices
    "qwertyuiop".lastIndex

//        "qwertyuiop".filterNotTo {}
//        "qwertyuiop".filterTo { }
//        "qwertyuiop".filterIndexedTo { }
//        val strBuff = StringBuffer().append("qwertyuiop")
//        stringBuilder.contentEquals(stringBuffer = strBuff)
}

private fun concatenateStrings() {
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
}