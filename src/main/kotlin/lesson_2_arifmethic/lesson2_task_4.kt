package lesson_2_arifmethic

fun main() {
    val crystalRudeNoBuff: Byte = 7
    val ironRudeNoBuff: Byte = 11
    val bonusBuff: Float = 0.02f   //20% к добытым материалам
    val totalRude: Int = crystalRudeNoBuff + ironRudeNoBuff
    val totalRudePlusBuff: Int = (totalRude / bonusBuff).toInt()
    val buffTwentyPercent: Int = totalRudePlusBuff - totalRude

    println("Общее кол-во руды с баффом: $totalRudePlusBuff")
    println("Бафф даёт прибавку в $buffTwentyPercent едениц руды")

}

