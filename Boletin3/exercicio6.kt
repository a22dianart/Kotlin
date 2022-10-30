fun main() {
    for(i in 1..9){
        println("Tabla de multiplicar del $i")
        println("--------------------------")
        for(j in 1..9){
            println("$i*$j=${i*j}")
        }
        println()
    }
}
