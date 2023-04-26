package lesson_1_varType

fun main() {
    val yearOfFlightGagarin: Int = 1961
    var gagarinHour: String = "09"
    var gagarinMinute: String = "07"

    println("Юрий Гагарин полетел в космос в $yearOfFlightGagarin году в 0$gagarinHour:0$gagarinMinute")
    println("Юрий Гагарин полетел в космос в $yearOfFlightGagarin году в $gagarinHour:$gagarinMinute")

    gagarinHour = "10"
    gagarinMinute = "55"

    println("А вернулся на землю в корабле Восток-1 в $gagarinHour:$gagarinMinute")
}