package lesson_2_arifmethic

fun main() {
    //Оценки учеников
    val studentOne: Byte = 3
    val studentSecond: Byte = 4
    val studentThird: Byte = 3
    val studentFourth: Byte = 5
    val averageRating: Float = (studentOne + studentSecond + studentThird + studentFourth) / 4f

    println("Средний бал среди студентов: $averageRating")
}