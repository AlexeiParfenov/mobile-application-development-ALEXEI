fun main() {
    // 1. Дано двузначное число
    val twoDigitNumber = 96
    val tens = twoDigitNumber / 10
    val units = twoDigitNumber % 10
    val sumTwoDigit = tens + units
    val productTwoDigit = tens * units
    println("Двузначное число: $twoDigitNumber")
    println("Число десятков: $tens")
    println("Число единиц: $units")
    println("Сумма цифр: $sumTwoDigit")
    println("Произведение цифр: $productTwoDigit")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 2. Дано трехзначное число
    val threeDigitNumber = 487
    val hundreds = threeDigitNumber / 100
    val tens3 = (threeDigitNumber / 10) % 10
    val units3 = threeDigitNumber % 10
    val sumThreeDigit = hundreds + tens3 + units3
    val productThreeDigit = hundreds * tens3 * units3
    println("\nТрехзначное число: $threeDigitNumber")
    println("Число единиц: $units3")
    println("Число десятков: $tens3")
    println("Сумма цифр: $sumThreeDigit")
    println("Произведение цифр: $productThreeDigit")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 3. Деление одного числа на другое
    val numerator = 20.0
    val denominator = 5.0
    if (denominator != 0.0) {
        val divisionResult = numerator / denominator
        println("\nРезультат деления: $divisionResult")
    } else {
        println("\nОшибка: деление на ноль!")
    }
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 4. Возведение числа в степень
    val base = 5.0
    val exponent = 3
    val powerResult = Math.pow(base, exponent.toDouble())
    println("\n$base в степени $exponent равно $powerResult")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 5. Нахождение корня числа
    val numberForRoot = 25.0
    if (numberForRoot >= 0) {
        val rootResult = Math.sqrt(numberForRoot)
        println("\nКвадратный корень из $numberForRoot равен $rootResult")
    } else {
        println("\nОшибка: нельзя извлечь корень из отрицательного числа!")
    }
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")

    // 1. A = true, B = false, C = false
    val A1 = true
    val B1 = false
    val C1 = false
    println("\nЛогические выражения (A, B, C):")
    println("A или B: ${A1 || B1}") // а)
    println("A и B: ${A1 && B1}") // б)
    println("B или C: ${B1 || C1}") // в)
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 2. X = false, Y = true, Z = false
    val X2 = false
    val Y2 = true
    val Z2 = false
    println("\nЛогические выражения (X, Y, Z):")
    println("X или Z: ${X2 || Z2}") // а)
    println("X и Y: ${X2 && Y2}") // б)
    println("X и Z: ${X2 && Z2}") // в)
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 3. A = true, B = false, C = false
    println("\nЛогические выражения (A, B, C):")
    println("не A и B: ${!A1 && B1}") // а)
    println("A или не B: ${A1 || !B1}") // б)
    println("A и B или C: ${A1 && (B1 || C1)}") // в)
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 4. X = true, Y = true, Z = false
    val X4 = true
    val Y4 = true

    println("\nЛогические выражения (X, Y, Z):")
    println("не X и Y: ${!X4 && Y4}") // а)
    println("X или не Y: ${X4 || !Y4}") // б)
    println("X и Y или Z: ${X4 && (Y4 || Z2)}") // в)
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 5. X = true, Y = true, Z = false
    println("\nЛогические выражения (X, Y, Z):")
    println("не X и Y: ${!X4 && Y4}") // а)
    println("X или не Y: ${X4 || !Y4}") // б)
    println("X или (Y и Z): ${X4 || (Y4 && Z2)}") // в)
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 6. X = false, Y = false, Z = true
    val X6 = false
    val Y6 = false
    val Z6 = true

    println("\nЛогические выражения (X, Y, Z):")
    println("X или Y и не Z: ${X6 || (Y6 && !Z6)}") // а)
    println("не X и не Y: ${!X6 && !Y6}") // б)
    println("не (X и Z) или Y: {! (X6 && Z6) || Y6}") // в)
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 7. A = true, B = false, C = false
    println("\nЛогические выражения (A, B, C):")
    println("A или не (A и B) или C: ${A1 || !(A1 && B1) || C1}") // а)
    println("не A или A и (B или C): ${!A1 || (A1 && (B1 || C1))}") // б)
    println("(A или B и не C) и C: ${(A1 || (B1 && !C1)) && C1}") // в)
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
}
