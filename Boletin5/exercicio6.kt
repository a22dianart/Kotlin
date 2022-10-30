fun sumarmais2(x:MutableList <Int>){
    for (i in x.indices){
        x[i]=x[i] +2
    }
    return
}
fun main(){
    val unLista = mutableListOf<Int>(7,10,3,34,13)
    sumarmais2(unLista)
    for (num in unLista) print("$num ")
}
