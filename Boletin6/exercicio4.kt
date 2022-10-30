fun main() {
    var y = listOf(1,1)
    while (y[0]>=0 && y[1]>=0){
        y = readLine()!!.split(" ").map {it.toInt() }
            if (y[0]<100000000 && y[1] <100000000){
                if (y[0]!=0 && y[1]!=0){
                println(y[0]*2+y[1]*2)
                }
                else{println("Non é un rectángulo")}}
    } }
