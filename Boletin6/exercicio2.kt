fun main(){
    var x: Int= readLine()!!.toInt()
    while(x!= 0) {
        if (x % 2 == 0) {
            println("DEREITA")
        }
        else {println("ESQUERDA")}
        var y: Int=readLine()!!.toInt()
        if (y!= 0) {
            x=y
        }
        else{x=0}

    }

}
