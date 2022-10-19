fun main(){
    println("x\t\ty\t\tresultado\n----------------------------")
    val A: Boolean = true
    val B: Boolean = false
    println("$A\t$A\t"+(A&&A))
    println("$A\t$B\t"+(A&&B))
    println("$B\t$A\t"+(B&&A))
    println("$B\t$B\t"+(B&&B))
}
