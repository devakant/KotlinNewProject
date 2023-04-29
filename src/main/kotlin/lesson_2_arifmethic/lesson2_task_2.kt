package lesson_2_arifmethic

fun main() {
    val mainWorkersMoney: Short = 30000
    val mainCount: Byte = 50
    val traineeWorkersMoney: Short = 20000
    val traineeCount: Byte = 30
    val totalCountWorkers: Int = mainCount + traineeCount //80 человек
    val totalCountWorkersMoneyFund: Int = mainWorkersMoney * mainCount //Зп на постоянных
    val totalCountTraineeMoneyFund: Int = traineeWorkersMoney * traineeCount //Зп на стажеров
    val totalAverageMoneyForWorkers: Int = (totalCountWorkersMoneyFund + totalCountTraineeMoneyFund) / totalCountWorkers

    println("Зарплатный фонд на постоянных сотрудников: $totalCountWorkersMoneyFund рублей")
    println("Зарплатный фонд на содержание стажёров: $totalCountTraineeMoneyFund рублей")
    println("Средняя зарплата сотрудника: $totalAverageMoneyForWorkers рублей")
}