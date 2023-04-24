package lesson_1_varType

fun main() {
    val yearOfFlightGagarin: Int = 1961
    var gagarinHour: Int = 9
    var gagarinMinute: Int = 7

    println("Юрий Гагарин полетел в космос в $yearOfFlightGagarin году в 0$gagarinHour:0$gagarinMinute")

    gagarinHour = 10
    gagarinMinute = 55

    println("А вернулся на землю в корабле Восток-1 в $gagarinHour:$gagarinMinute")
}