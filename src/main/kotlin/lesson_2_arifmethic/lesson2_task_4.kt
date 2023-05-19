package lesson_2_arifmethic

fun main() {
    val crystalRudeNoBuff: Byte = 7
    val ironRudeNoBuff: Byte = 11
    val totalRude: Int = crystalRudeNoBuff + ironRudeNoBuff

    val bonusBuff: Float = 20.0f   //20% к добытым материалам
    val crystalRudePlusBuff: Int = (totalRude * bonusBuff / 100.0f).toInt()
    val ironRudePlusBuff: Int = (totalRude * bonusBuff / 100.0f).toInt()
    val totalRudeInBuff: Int = totalRude + ironRudePlusBuff + crystalRudePlusBuff

    println("Общее кол-во руды без баффа: $totalRude")
    println("Общее кол-во руды с баффом в 20%: $totalRudeInBuff")
    println("Бафф даёт прибавку $crystalRudePlusBuff еденицы для кристальной руды \nИ $ironRudePlusBuff еденицы для железной руды ")

}