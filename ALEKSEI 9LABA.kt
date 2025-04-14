fun main() {
    // 1. Генератор случайных чисел
    println("1. 10 случайных чисел от 1 до 100:")
    repeat(10) { print("${(1..100).random()} ") }
    println("\n")

    // 2. Строковый анализатор
    println("2. Введите строку для анализа гласных/согласных:")
    val inputStr = readln()
    val vowels = inputStr.count { it.lowercaseChar() in setOf('a', 'e', 'i', 'o', 'u') }
    val consonants = inputStr.count { it.isLetter() && it.lowercaseChar() !in setOf('a', 'e', 'i', 'o', 'u') }
    println("Гласных: $vowels, Согласных: $consonants\n")

    // 3. Конвертер валют
    println("3. Введите сумму и курс (например: 100(rub) и 84(курс доллара)):")
    val summ = readln().toDouble()
    val kurs = readln().toDouble()
    println("Результат конвертации: ${"%.2f".format(summ * kurs)}\n")

    // 4. Проверка на анаграмму (с вводом пользователя)
    fun isAnagram(s1: String, s2: String): Boolean {
        return s1.lowercase().filter { it.isLetter() }.toList().sorted() ==
                s2.lowercase().filter { it.isLetter() }.toList().sorted()
    }
    println("4. Введите первое слово для проверки анаграммы:")
    val word1 = readln()
    println("Введите второе слово:")
    val word2 = readln()
    println("Результат проверки: ${if (isAnagram(word1, word2)) "Это анаграммы" else "Это не анаграммы"}\n")

    // 5. Нахождение простых чисел (с вводом N)
    fun findPrimes(n: Int): List<Int> = (2..n).filter { num -> (2 until num).none { num % it == 0 } }
    println("5. Введите число N для поиска простых чисел:")
    val n = readln().toInt()
    println("Простые числа до $n: ${findPrimes(n)}\n")

    // 6. Сортировка строк (с вводом пользователя)
    println("6. Введите слова через пробел для сортировки:")
    val words = readln().split(" ").toTypedArray()
    println("До сортировки: ${words.contentToString()}")
    println("После сортировки: ${words.sortedArray().contentToString()}\n")

    // 7. Изменение регистра (с вводом пользователя)
    fun swapCase(input: String): String = input.map {
        if (it.isLowerCase()) it.uppercaseChar() else it.lowercaseChar()
    }.joinToString("")
    println("7. Введите строку для изменения регистра:")
    val caseInput = readln()
    println("Результат: ${swapCase(caseInput)}\n")

    // 8. Игра "Угадай число"
    println("8. Игра 'Угадай число' (от 1 до 100)")
    val secret = (1..100).random()
    var polz: Int
    do {
        print("Ваша догадка: ")
        polz = readln().toInt()
        when {
            polz < secret -> println("Больше")
            polz > secret -> println("Меньше")
            else -> println("Правильно!")
        }
    } while (polz != secret)
    println()

    // 9. Генератор паролей
    fun generatePassword(length: Int): String {
        val simvoli = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()"
        return (1..length).map { simvoli.random() }.joinToString("")
    }
    println("9. Сгенерированный пароль: ${generatePassword(12)}\n")

    // 10. Самое длинное слово (с вводом пользователя)
    fun longestWord(s: String): String = s.split(" ").maxByOrNull { it.length } ?: ""
    println("10. Введите строку для поиска самого длинного слова:")
    val longWordInput = readln()
    println("Самое длинное слово: '${longestWord(longWordInput)}'")
}