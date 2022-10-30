fun main() {
    println(" ") //para que funcione
    var cantidade= readln().toInt() //para saber cantas veces vai a calcular se chega a fin de mes
    for (i in 1..cantidade){
        println(" ") //para que funcione
        var x: List<Float> = readLine()!!.split(" ").map { it.toFloat() } //le elementos da mesma liña e converteos a float
        var diferenza = x[0]+x[1]
        if (diferenza>=0){
            println("SI")
            }
            else{
                println("NO")
            }
        }
    }
