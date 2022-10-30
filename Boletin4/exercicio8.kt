fun readlnToInt():Int{
    var a: String= readLine()!!
    val b: Int= a.toInt()
    return b
}
fun main(){
    print("entero 1 por favor: ")
    val i1=readlnToInt()
    print("entero 2 por favor: ")
    val i2=readlnToInt()
    var resultado= i1*i2
    println("$i1*$i2 es $resultado")
}
