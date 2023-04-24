package lesson_1_varType

//e-shop logic

fun main () {
    val totalNumbersOfOrders: Int = 75
    val textWithThanks: String = "Спасибо за покупку в нашем магазине. Ждём вас снова!\n"
    var totalWorkers: Int = 2000

    println("Общее количество заказов на сегодня: $totalNumbersOfOrders")
    println(textWithThanks)
//    println("Общее количество сотрудников работающих сегодня: $totalWorkers человек")

    totalWorkers = 1999
    println("**ВНИМАНИЕ ПЕРСОНАЛУ**\n**СЕГОДНЯ УВОЛИЛСЯ ОДИН СОТРУДНИК**\n**ФОРМИРУЙТЕ СМЕНЫ СОГЛАСНО КОРРЕКТИРОВКАМ**\n**ОБЩЕЕ КОЛ-ВО СОТРУДНИКОВ $totalWorkers")
}