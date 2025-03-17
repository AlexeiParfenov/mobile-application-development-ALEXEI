import kotlin.random.Random

// 1. Консольный калькулятор
fun calculator() {
    println("\n--- Консольный калькулятор ---")
    println("Введите первое число:")
    val num1 = readLine()!!.toDouble()

    println("Введите оператор (+, -, *, /):")
    val operator = readLine()!!

    println("Введите второе число:")
    val num2 = readLine()!!.toDouble()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> throw IllegalArgumentException("Неверный оператор")
    }

    println("Результат: $result")
}

// 2. Проверка на палиндром
fun isPalindrome(word: String): Boolean {
    return word == word.reversed()
}

fun checkPalindrome() {
    println("\n--- Проверка на палиндром ---")
    println("Введите слово:")
    val word = readLine()!!

    if (isPalindrome(word)) {
        println("$word является палиндромом")
    } else {
        println("$word не является палиндромом")
    }
}

// 3. Подсчет очков команды
fun calculatePoints(wins: Int, draws: Int, losses: Int): Int {
    return wins * 3 + draws * 1 + losses * 0
}

fun teamPoints() {
    println("\n--- Подсчет очков команды ---")
    println("Введите количество побед:")
    val wins = readLine()!!.toInt()

    println("Введите количество ничьих:")
    val draws = readLine()!!.toInt()

    println("Введите количество поражений:")
    val losses = readLine()!!.toInt()

    val points = calculatePoints(wins, draws, losses)
    println("Команда набрала $points очков")
}

// 4. Нахождение минимального числа в списке
fun findMinNumber(numbers: List<Int>): Int {
    return numbers.minOrNull() ?: throw IllegalArgumentException("Список пуст")
}

fun minNumber() {
    println("\n--- Нахождение минимального числа ---")
    println("Введите список чисел через пробел:")
    val input = readLine()!!
    val numbers = input.split(" ").map { it.toInt() }

    val minNumber = findMinNumber(numbers)
    println("Самое маленькое число: $minNumber")
}

// 5. Проверка равенства двух чисел
fun areNumbersEqual(num1: Int, num2: Int): Boolean {
    return num1 == num2
}

fun checkEquality() {
    println("\n--- Проверка равенства двух чисел ---")
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()

    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    if (areNumbersEqual(num1, num2)) {
        println("Числа равны")
    } else {
        println("Числа не равны")
    }
}

// 6. Карточная игра 21

fun drawCard(): Int {
    return Random.nextInt(1, 11) // Карты от 1 до 10
}

fun playDealer(): Int {
    var dealerTotal = 0
    while (dealerTotal < 17) { // Дилер берет карты, пока сумма меньше 17
        val card = drawCard()
        dealerTotal += card
        println("Дилер вытянул карту: $card. Сумма дилера: $dealerTotal")
    }
    return dealerTotal
}


fun playBlackjack() {
    println("\n--- Карточная игра 21 ---")
    var playerTotal = 0
    var dealerTotal = 0

    println("Добро пожаловать в игру 21!")
    while (true) {
        println("Ваш текущий счет: $playerTotal")
        println("Хотите взять карту? (да/нет)")
        val input = readLine()!!

        if (input.equals("да", ignoreCase = true)) {
            val card = drawCard()
            println("Вы вытянули карту: $card")
            playerTotal += card

            if (playerTotal > 21) {
                println("Перебор! Ваш счет: $playerTotal")
                println("Вы проиграли!")
                return
            }
        } else {
            break
        }
    }

    println("\nХод дилера:")
    dealerTotal = playDealer()


    println("\nВаш счет: $playerTotal")
    println("Счет дилера: $dealerTotal")

    when {
        playerTotal > 21 -> println("Вы проиграли! Перебор.")
        dealerTotal > 21 -> println("Дилер проиграл! Вы выиграли!")
        playerTotal == dealerTotal -> println("Ничья!")
        playerTotal == 21 -> println("Блэкджек! Вы выиграли!")
        playerTotal > dealerTotal -> println("Вы выиграли!")
        else -> println("Вы проиграли!")
    }
}
// Главное меню
fun main() {
    while (true) {
        println("\n--- Главное меню ---")
        println("1. Консольный калькулятор")
        println("2. Проверка на палиндром")
        println("3. Подсчет очков команды")
        println("4. Нахождение минимального числа")
        println("5. Проверка равенства двух чисел")
        println("6. Карточная игра 21")
        println("0. Выход")
        println("Выберите задачу:")

        when (readLine()!!.toInt()) {
            1 -> calculator()
            2 -> checkPalindrome()3 -> teamPoints()
            4 -> minNumber()
            5 -> checkEquality()
            6 -> playBlackjack()
            0 -> {
                println("Выход из программы.")
                return
            }
            else -> println("Неверный выбор. Попробуйте снова.")
        }
    }
}