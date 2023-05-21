package lesson_3_Interpolicy

fun main() {
    val womanName: String = "Татьяна Сергеевна"
    var womanFamName: String = "Андреева"
    var womanAge: Byte = 20

    println("ФИО до замужества: $womanFamName $womanName\nВозраст: $womanAge")

    womanFamName = "Сидорова"
    womanAge = 22

    println("\nФИО после замужества: $womanFamName $womanName\nВозраст: $womanAge")
}