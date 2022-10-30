fun repartir(x:Int, y:Int): Int{
    var resultado = x/y
    return resultado
}
fun main(){
    print("Tengo 20 caramelos y 3 amigos, a cada uno le tocan: " +repartir(20,3)+ " caramelos")
}
