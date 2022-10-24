fun main() {
    print(" ")
    val mes: Int = readLine()!!.toInt()
    when (mes) {
        1 -> println("Xaneiro")
        2 -> println("Febreiro")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Xuño")
        7 -> println("Xullo")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Decembro")
        else -> println("Invalid month.")
    }
}
