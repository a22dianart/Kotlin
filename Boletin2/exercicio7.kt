fun main() {
    print(" ")
    val mes: String = readLine()!!
    when (mes) {
        "Xaneiro", "xaneiro" -> println("o mes de $mes e o numero 1") //pilla Xaneiro ou xaneiro
        "Febreiro" -> println("o me de $mes e o numero 2")
        "Marzo" -> println("o mes de $mes e o numero 3")
        "Abril" -> println("o mes de $mes e o numero 4")
        "Maio" -> println("o mes de $mes e o numero 5")
        "Xuño" -> println("o mes de $mes e o numero 6")
        "Xullo" -> println("o mes de $mes e o numero 7")
        "Agosto" -> println("o mes de $mes e o numero 8")
        "Setembro" -> println("o mes de $mes e o numero 9")
        "Outubro" -> println("o mes de $mes e o numero 10")
        "Novembro" -> println("o mes de $mes e o numero 11")
        "Decembro" -> println("o mes de $mes e o numero 12")
        else -> println("Invalid month.")
    }
}
