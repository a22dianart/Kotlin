fun imprimirTabla(a:Int,b:Int){
    println("Tabla de multiplicar del $a hasta el $b")
    println("======================================")
    for (i in 1..b)
        println("$a*$i = ${a*i} ")
    return
}
fun main(){
    imprimirTabla(3,4)
    imprimirTabla(6,5)
}


