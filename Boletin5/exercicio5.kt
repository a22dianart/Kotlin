fun sumar2(calvos:Array<Int>){
    for (index in 0..calvos.lastIndex){
        calvos[index] = calvos[index] +2
    }
    return
}
fun main(){
    val unArray = arrayOf(7,10,3,34,13)
    sumar2(unArray)
    for (i in unArray) print("$i ")
}
