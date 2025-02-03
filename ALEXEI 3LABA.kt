fun main() {
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Первое
    val numbers = arrayOf(40, 4, 70)
    val max = numbers.maxOrNull() ?: 0
    println("Максимальное число: $max")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Второе
    val venom = arrayOf(24, 23, 34)
    if (venom.distinct().size < venom.size) {
        println("Ошибка: среди чисел есть равные.")
    } else {
        val average = venom.average()
        println("Среднее значение: $average")
    }
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Третье
    print("Введите два числа: ")
    val numbersInput = readln().split(" ").map { it.toInt() }
    val oddNumber = numbersInput.firstOrNull { it % 2 != 0 } ?: "Ошибка"
    println("Нечетное число: $oddNumber")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Четвертое
    print("Введите два числа: ")
    val (x, y) = readln().split(" ").map { it.toInt() }
    println(if (x % y == 0) "$x кратно $y" else "$x не кратно $y, остаток: ${x % y}")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Пятое
    print("Введите три стороны: ")
    val sides = readln().split(" ").map { it.toDouble() }.sorted()
    println(if (sides[0] + sides[1] > sides[2]) "Треугольник возможен" else "Треугольник невозможен")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Шестое
    print("Введите год: ")
    val year = readln().toInt()
    val isLeap = when {
        year % 400 == 0 -> true
        year % 100 == 0 -> false
        year % 4 == 0 -> true
        else -> false
    }
    println("Год ${if (isLeap) "високосный (366 дней)" else "не високосный (365 дней)"}")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Седьмое
    print("Введите два числа: ")
    val (a, b) = readln().split(" ").map { it.toDouble() }
    println("Большее: ${a.takeIf { it > b } ?: b}")
    println("Меньшее: ${a.takeIf { it < b } ?: b}")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Восьмое
    print("Введите расстояния (в км и футах): ")
    val (km, ft) = readln().split(" ").map { it.toDouble() }
    println(if (km * 1000 < ft * 0.305) "Км меньше" else "Футы меньше")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Девятое
    print("Введите два числа: ")
    val (m, n) = readln().split(" ").map { it.toInt() }
    println(m.takeIf { it % n == 0 }?.let { "Частное: ${m / n}" } ?: "m на n не делится")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Десятое
    print("Введите два числа: ")
    val (q, e) = readln().split(" ").map { it.toInt() }
    println(if (e % q == 0) "$q делитель $e" else "$q не делитель $e")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Одиннадцатое
    print("Введите число: ")
    val num1 = readln().toInt()
    println(listOf(
        "Четное".takeIf { num1 % 2 == 0 },
        "Оканчивается на 7".takeIf { num1 % 10 == 7 }
    ).filterNotNull().joinToString())
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Двенадцатое
    print("Введите двузначное число: ")
    val num2 = readln().toInt()
    val (p, d) = Pair(num2 / 10, num2 % 10)
    println(if (p == d) "Цифры одинаковы" else "Первая цифра ${if (p > d) "больше" else "меньше"}")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // Тринадцатое
    print("Введите четырехзначное число: ")
    val num = readln().toInt()
    val digits = num.toString().map { it.digitToInt() }

    val sumFirst = digits[0] + digits[1]
    val sumLast = digits[2] + digits[3]
    val sumAll = digits.sum()
    val productAll = digits.reduce { acc, i -> acc * i }

    println("Суммы равны: ${sumFirst == sumLast}")
    println("Сумма кратна 3: ${sumAll % 3 == 0}")
    println("Произведение кратно 4: ${productAll % 4 == 0}")

    print("Введите число a: ")
    val i = readln().toInt()
    println("Произведение кратно $i: ${productAll % i == 0}")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
}
