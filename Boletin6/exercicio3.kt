fun main() {
    var parar: Int = readLine()!!.toInt()
    while (parar!=0){
        var y = readLine()!!.split(" ").map {it.toInt() }
        if (y[0] == 25 && y[1] == 12) {
            println("SI")
        }
        if (y.size == 2) {
            if (y[0] != 25 || y[1] != 12) {
                println("NON")
            }
        }
    }
}
