fun main() {
    print("mes: ")
    val mes: Int = readLine()!!.toInt()
    when (mes) {
        in 3..5 -> print("Primavera")
        0, 1,12 -> print("Inverno")
        in 6..8 -> print("Veran")
        in 7..11 -> print("Outono")
    }
}
