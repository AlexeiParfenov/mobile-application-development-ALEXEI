// Первое задание (из фото)
fun printNumber(n: Int): List<Int> {
    return if (n == 0) emptyList()
    else (n downTo 1).toList()
}

// Второе задание (пирамида)
fun pyramid(n: Int) {
    val maxSHIR = 2 * n - 1
    for (i in 1..n) {
        val numSHARP = 2 * i - 1
        val numSpaces = (maxSHIR - numSHARP) / 2
        println(" ".repeat(numSpaces) + "#".repeat(numSHARP) + " ".repeat(numSpaces))
    }
}

// Третье задание (шифр Цезаря)
fun caesarCipher(text: String, shift: Int): String {
    return text.map { char ->
        if (char.isLetter()) {
            val base = if (char.isUpperCase()) 'A' else 'a'
            val offset = (char - base + shift) % 26
            (base + if (offset < 0) offset + 26 else offset).toChar()
        } else char
    }.joinToString("")
}

// Четвертое задание (FizzBuzz)
fun fizzBuzz(n: Int): List<Any> {
    return (1..n).map {
        when {
            it % 15 == 0 -> "ВиззлБиззл"
            it % 3 == 0 -> "Физзл"
            it % 5 == 0 -> "Биззл"
            else -> it
        }
    }.toList()
}

// Общая функция main для всех заданий
fun main() {
    // Тестирование printNumber
    println(printNumber(0))
    println(printNumber(2))
    println(printNumber(5))

    println()

    // Тестирование pyramid
    pyramid(2)
    println()
    pyramid(8)
    println()
    pyramid(4)

    println()

    // Тестирование caesarCipher
    println(caesarCipher("Hello, World!", 3))
    println(caesarCipher("Khoor, Zruog!", -3))
    println(caesarCipher("ABCXYZ", 5))

    println()

    // Тестирование fizzBuzz
    println(fizzBuzz(5))
    println(fizzBuzz(16))
}