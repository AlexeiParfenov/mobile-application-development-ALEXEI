fun main() {
    // 1. Создайте пустой список строк и добавьте в него пять элементов с помощью метода add
    val stringList = mutableListOf<String>()
    stringList.add("Привет")
    stringList.add("Алекбер")
    stringList.add("Как")
    stringList.add("Дела")
    stringList.add("Пока")
    println("Список строк: $stringList")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 2. Проверьте, содержится ли заданное значение в списке строк, и выведите результат
    val searchValue = "Алекбер"
    val containsValue = stringList.contains(searchValue)
    println("Список содержит элемент '$searchValue'? $containsValue")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 3. Переберите все элементы списка целых чисел с помощью цикла for и выведите каждый элемент
    val intList = listOf(4, 1, 8, 5, 10)
    println("Элементы списка целых чисел:")
    for (number in intList) {
        println(number)
    }
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 4. Отсортируйте список целых чисел в порядке возрастания и выведите отсортированный список
    val sortedList = intList.sorted()
    println("Отсортированный список: $sortedList")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 5. Создайте новый список, содержащий только четные числа из исходного списка целых чисел
    val evenNumbersList = intList.filter { it % 2 == 0 }
    println("Список четных чисел: $evenNumbersList")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 6. Подсчитайте количество элементов в списке строк, которые начинаются с заданной буквы
    val startLetter = 'C'
    val count = stringList.count { it.startsWith(startLetter, ignoreCase = true) }
    println("Количество строк, начинающихся с '$startLetter': $count")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 7. Изменить знак для всех положительных элементов списка
    val modifiedIntList = intList.map { if (it > 0) -it else it }
    println("Список с измененными знаками: $modifiedIntList")
    println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨")
    // 8. Из имеющегося списка целых чисел, сформировать список их квадратов
    val squaredList = intList.map { it * it }
    println("Список квадратов: $squaredList")
}