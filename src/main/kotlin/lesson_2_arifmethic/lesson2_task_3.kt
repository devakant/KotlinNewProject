package lesson_2_arifmethic

fun main() {
    val startTrainTimeHour: Byte = 9
    val startTrainTimeMinute: Byte = 39
    val travelTimeMinute: Short = 457
    val travelTime: Int = travelTimeMinute / 60
    val travelTimeHour: Int = travelTimeMinute / (60 / 7)

    println("Время отбытия поезда: $startTrainTimeHour:$startTrainTimeMinute")
    println("Время в пути: $travelTime:$travelTimeHour")
}