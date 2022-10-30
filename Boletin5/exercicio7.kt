fun main(){
    var x: List<Int> =readLine()!!.split(" ").map{it.toInt()} //o split le por separado e o map transforma a int
    var y = x.size
    var suma =0
    while (y!=0){
        suma = suma + x[y-1]
        y = y-1
    }
    print(suma)
}
